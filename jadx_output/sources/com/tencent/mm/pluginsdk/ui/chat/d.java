package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes9.dex */
public class d implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f190251a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f190252b;

    public d(com.tencent.mm.pluginsdk.ui.chat.c cVar, boolean z17, java.lang.String str) {
        this.f190251a = z17;
        this.f190252b = str;
    }

    @Override // ly1.a
    public java.util.Map b(java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        if (u46.l.c(str, "view_exp")) {
            j00.d2 d2Var = (j00.d2) ((c00.m3) i95.n0.c(c00.m3.class));
            d2Var.getClass();
            java.lang.String talkerUsername = this.f190252b;
            kotlin.jvm.internal.o.g(talkerUsername, "talkerUsername");
            pm0.v.L("checkPreloadWithSex", true, new j00.a2(d2Var, this.f190251a, talkerUsername));
            ((j00.o1) ((c00.f3) i95.n0.c(c00.f3.class))).getClass();
            hashMap.put("chat_session_id", n00.g.f333821a.a());
        }
        if (u46.l.c(str, "view_clk")) {
            ((j00.o1) ((c00.f3) i95.n0.c(c00.f3.class))).getClass();
            hashMap.put("chat_session_id", n00.g.f333821a.a());
        }
        return hashMap;
    }
}
