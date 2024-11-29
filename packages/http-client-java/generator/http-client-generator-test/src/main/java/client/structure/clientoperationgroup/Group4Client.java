// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package client.structure.clientoperationgroup;

import client.structure.clientoperationgroup.implementation.Group4sImpl;
import com.azure.core.annotation.Generated;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.exception.ClientAuthenticationException;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.exception.ResourceModifiedException;
import com.azure.core.exception.ResourceNotFoundException;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;

/**
 * Initializes a new instance of the synchronous FirstClient type.
 */
@ServiceClient(builder = FirstClientBuilder.class)
public final class Group4Client {
    @Generated
    private final Group4sImpl serviceClient;

    /**
     * Initializes an instance of Group4Client class.
     * 
     * @param serviceClient the service client implementation.
     */
    @Generated
    Group4Client(Group4sImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * The four operation.
     * 
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> fourWithResponse(RequestOptions requestOptions) {
        return this.serviceClient.fourWithResponse(requestOptions);
    }

    /**
     * The four operation.
     * 
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void four() {
        // Generated convenience method for fourWithResponse
        RequestOptions requestOptions = new RequestOptions();
        fourWithResponse(requestOptions).getValue();
    }
}