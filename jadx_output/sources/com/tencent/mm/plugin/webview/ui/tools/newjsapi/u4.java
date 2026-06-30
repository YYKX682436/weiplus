package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class u4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.ui.tools.newjsapi.u4 f186557d = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.u4();

    public u4() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("PrefechLocalData");
        kotlin.jvm.internal.o.f(M, "getMMKV(...)");
        return new com.tencent.mm.sdk.platformtools.v3(M, 2592000L);
    }
}
