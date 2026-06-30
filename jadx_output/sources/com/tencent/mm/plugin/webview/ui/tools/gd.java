package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes4.dex */
public class gd implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f184778a;

    public gd(com.tencent.mm.plugin.webview.ui.tools.ld ldVar, java.lang.String str) {
        this.f184778a = str;
    }

    @Override // ly1.a
    public java.util.Map b(java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("live_enter_status", 1);
        ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).getClass();
        hashMap.put("finder_context_id", b52.b.b());
        hashMap.put("share_username", "");
        ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).getClass();
        hashMap.put("finder_tab_context_id", b52.b.c());
        hashMap.put("session_buffer", "");
        hashMap.put("finder_feed_export_id", this.f184778a);
        return hashMap;
    }
}
