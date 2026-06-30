package com.tencent.mm.plugin.voip.ui;

/* loaded from: classes.dex */
public final class n0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.voip.ui.n0 f176972d = new com.tencent.mm.plugin.voip.ui.n0();

    public n0() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            c75.c.d(new org.json.JSONArray(gm0.j1.u().c().v(com.tencent.mm.storage.u3.USERINFO_VOIP_QOS_CUSTOM_STRING, "")), new com.tencent.mm.plugin.voip.ui.m0(arrayList));
        } catch (java.lang.Exception unused) {
        }
        return arrayList;
    }
}
