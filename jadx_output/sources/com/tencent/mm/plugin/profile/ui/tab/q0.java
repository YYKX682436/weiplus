package com.tencent.mm.plugin.profile.ui.tab;

/* loaded from: classes8.dex */
public class q0 implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.tab.m0 f154517a;

    public q0(com.tencent.mm.plugin.profile.ui.tab.m0 m0Var) {
        this.f154517a = m0Var;
    }

    @Override // ly1.a
    public java.util.Map b(java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        com.tencent.mm.plugin.profile.ui.tab.m0 m0Var = this.f154517a;
        hashMap.put("wx_username", m0Var.f154463r);
        hashMap.put("live_enter_status", 1);
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        hashMap.put("finder_context_id", b52.b.b());
        hashMap.put("share_username", "");
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        hashMap.put("finder_tab_context_id", b52.b.c());
        hashMap.put("session_buffer", "");
        hashMap.put("finder_feed_export_id", ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).i(m0Var.f154463r));
        return hashMap;
    }
}
