package com.tencent.mm.plugin.wallet_core.utils;

/* loaded from: classes7.dex */
public final class t0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.wallet_core.utils.t0 f180987d = new com.tencent.mm.plugin.wallet_core.utils.t0();

    public t0() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.StackTraceElement stackTraceElement = (java.lang.StackTraceElement) obj;
        return stackTraceElement.getFileName() + ':' + stackTraceElement.getLineNumber() + '/' + stackTraceElement.getClassName() + '.' + stackTraceElement.getMethodName();
    }
}
