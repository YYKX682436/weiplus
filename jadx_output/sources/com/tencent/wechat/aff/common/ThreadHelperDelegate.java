package com.tencent.wechat.aff.common;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&¨\u0006\n"}, d2 = {"Lcom/tencent/wechat/aff/common/ThreadHelperDelegate;", "", "isMainThread", "", "runInMainThread", "", "runnable", "Lcom/tencent/wechat/aff/common/FunctionRunnable;", "delayMs", "", "products-all_java"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface ThreadHelperDelegate {
    boolean isMainThread();

    void runInMainThread(com.tencent.wechat.aff.common.FunctionRunnable runnable, long delayMs);
}
