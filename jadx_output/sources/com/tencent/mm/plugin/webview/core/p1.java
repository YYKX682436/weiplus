package com.tencent.mm.plugin.webview.core;

/* loaded from: classes.dex */
public final class p1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.core.p1 f181906d = new com.tencent.mm.plugin.webview.core.p1();

    public p1() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.webview.core.q1 q1Var = com.tencent.mm.plugin.webview.core.s1.f181972a;
        if (qk.ka.a()) {
            return java.lang.Boolean.valueOf(com.tencent.mm.plugin.webview.core.t1.a().getInt("disablewxjscodecache", -1) == 1);
        }
        return java.lang.Boolean.FALSE;
    }
}
