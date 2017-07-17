// This class was generated on Mon, 17 Jul 2017 10:51:10 PDT by version 0.01 of Braintree SDK Generator
// PaymentListRequest.java
// DO NOT EDIT
// @type request
// @json {"Name":"payment.list","Description":"Lists payments that were created by the [create payment](#payment_create) call and that are in any state. The list shows the payments that are made to the merchant who makes the call. To filter the payments that appear in the response, you can specify one or more optional query and pagination parameters. See [Filtering and pagination](/docs/api/overview/#filtering-and-pagination).","Parameters":[{"Type":"integer","VariableName":"count","Description":"The number of items to list in the response.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null,"Location":"query"},{"Type":"string","VariableName":"end_time","Description":"The end date and time for the range to show in the response, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6). For example, `start_time=2016-03-06T11:00:00Z`.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null,"Location":"query"},{"Type":"string","VariableName":"payee_id","Description":"Filters the response by a PayPal-assigned merchant ID that identifies the payee.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null,"Location":"query"},{"Type":"string","VariableName":"sort_by","Description":"Sorts the response by the create time or update time.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null,"Location":"query"},{"Type":"string","VariableName":"sort_order","Description":"Sorts the response in ascending or descending order.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null,"Location":"query"},{"Type":"string","VariableName":"start_id","Description":"The ID of the starting resource in the response. When results are paged, you can use the `next_id` value as the `start_id` to continue with the next set of results.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null,"Location":"query"},{"Type":"integer","VariableName":"start_index","Description":"The start index of the payments to list. Typically, you use the `start_index` to jump to a specific position in the resource history based on its cart. For example, to start at the second item in a list of results, specify `?start_index=2`.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null,"Location":"query"},{"Type":"string","VariableName":"start_time","Description":"The start date and time for the  range to show in the response, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6). For example, `start_time=2016-03-06T11:00:00Z`.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null,"Location":"query"}],"RequestType":null,"ResponseType":{"Type":"Payment History ","VariableName":"","Description":"The list of payments that the seller made.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},"ContentType":"application/json","HttpMethod":"GET","Path":"/v1/payments/payment","ExpectedStatusCode":200}

package com.paypal.sdk.payments.request;

import com.braintreepayments.http.*;
import com.paypal.sdk.payments.object.*;
import java.util.List;


/**
 * Lists payments that were created by the [create payment](#payment_create) call and that are in any state. The list shows the payments that are made to the merchant who makes the call. To filter the payments that appear in the response, you can specify one or more optional query and pagination parameters. See [Filtering and pagination](/docs/api/overview/#filtering-and-pagination).
 */
public class PaymentListRequest extends HttpRequest<PaymentHistory> {

    public PaymentListRequest() {
        super("/v1/payments/payment?", "GET", PaymentHistory.class);
    }

    public PaymentListRequest count(Integer count) {
		path(path() + "count=" + String.valueOf(count) + "&");
        return this;
    }

    public PaymentListRequest endTime(String endTime) {
		path(path() + "end_time=" + String.valueOf(endTime) + "&");
        return this;
    }

    public PaymentListRequest payeeId(String payeeId) {
		path(path() + "payee_id=" + String.valueOf(payeeId) + "&");
        return this;
    }

    public PaymentListRequest sortBy(String sortBy) {
		path(path() + "sort_by=" + String.valueOf(sortBy) + "&");
        return this;
    }

    public PaymentListRequest sortOrder(String sortOrder) {
		path(path() + "sort_order=" + String.valueOf(sortOrder) + "&");
        return this;
    }

    public PaymentListRequest startId(String startId) {
		path(path() + "start_id=" + String.valueOf(startId) + "&");
        return this;
    }

    public PaymentListRequest startIndex(Integer startIndex) {
		path(path() + "start_index=" + String.valueOf(startIndex) + "&");
        return this;
    }

    public PaymentListRequest startTime(String startTime) {
		path(path() + "start_time=" + String.valueOf(startTime) + "&");
        return this;
    }
}