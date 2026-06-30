package com.tencent.tmsqmsp.oaid2;

/* loaded from: classes7.dex */
public final class x0 implements java.util.concurrent.ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final java.lang.Thread newThread(java.lang.Runnable runnable) {
        return new java.lang.Thread(runnable, "oaid2-thread");
    }
}
