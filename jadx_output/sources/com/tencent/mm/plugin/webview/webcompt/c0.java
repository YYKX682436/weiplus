package com.tencent.mm.plugin.webview.webcompt;

/* loaded from: classes7.dex */
public final class c0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.webcompt.c0 f187769d = new com.tencent.mm.plugin.webview.webcompt.c0();

    public c0() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.webview.webcompt.h0 h0Var = com.tencent.mm.plugin.webview.webcompt.f1.f187797e;
        cl0.e jSONArray = ((cl0.g) ((jz5.n) com.tencent.mm.plugin.webview.webcompt.f1.f187798f).getValue()).getJSONArray("matrix");
        kotlin.jvm.internal.o.f(jSONArray, "getJSONArray(...)");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        int length = jSONArray.length();
        for (int i17 = 0; i17 < length; i17++) {
            linkedList.add(java.lang.Integer.valueOf(jSONArray.getInt(i17)));
        }
        return linkedList;
    }
}
