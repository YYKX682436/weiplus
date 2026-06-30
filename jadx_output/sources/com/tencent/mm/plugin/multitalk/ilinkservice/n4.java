package com.tencent.mm.plugin.multitalk.ilinkservice;

/* loaded from: classes14.dex */
public class n4 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f149733a = new java.util.concurrent.ConcurrentHashMap(1);

    public final void a(int i17, int i18, java.lang.String str, com.tencent.mm.plugin.multitalk.ilinkservice.j4 j4Var, boolean z17, com.tencent.mm.plugin.multitalk.ilinkservice.m4 m4Var) {
        com.tencent.mm.plugin.multitalk.ilinkservice.i4.INSTANCE.J(new com.tencent.mm.plugin.multitalk.ilinkservice.k4(this, m4Var, i17, i18, str, j4Var, z17));
    }

    public void b(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkSessionMgr", "hy: on exit");
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        ((java.util.concurrent.ConcurrentHashMap) this.f149733a).remove(str);
    }
}
