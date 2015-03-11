package com.google.common.eventbus;

/**
 *
 * Created by Habib Okanla on 3/11/15.
 */
public interface EventCallBack {

    void onEventExecuted(String classCanonicalName, String methodName, Object event);
}
