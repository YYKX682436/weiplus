package com.tencent.mm.plugin.multitalk.model;

/* loaded from: classes5.dex */
public final class s2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.multitalk.model.s2 f150130d = new com.tencent.mm.plugin.multitalk.model.s2();

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M(com.tencent.mm.plugin.multitalk.model.t2.f150137b);
        kotlin.jvm.internal.o.f(M, "getMMKV(...)");
        java.lang.String string = M.getString("mmkv_multitalk_status", "");
        if (kotlin.jvm.internal.o.b(string, "")) {
            return;
        }
        com.tencent.mm.sdk.platformtools.o4 M2 = com.tencent.mm.sdk.platformtools.o4.M(com.tencent.mm.plugin.multitalk.model.t2.f150137b);
        kotlin.jvm.internal.o.f(M2, "getMMKV(...)");
        M2.remove("mmkv_multitalk_status");
        com.tencent.mm.sdk.platformtools.o4 M3 = com.tencent.mm.sdk.platformtools.o4.M(com.tencent.mm.plugin.multitalk.model.t2.f150137b);
        kotlin.jvm.internal.o.f(M3, "getMMKV(...)");
        M3.remove("mmkv_multitalk_status_notAllowRecovery");
        com.tencent.mm.sdk.platformtools.o4 M4 = com.tencent.mm.sdk.platformtools.o4.M(com.tencent.mm.plugin.multitalk.model.t2.f150137b);
        kotlin.jvm.internal.o.f(M4, "getMMKV(...)");
        M4.remove("mmkv_multitalk_member_list");
        org.json.JSONObject jSONObject = new org.json.JSONObject(string);
        java.lang.String optString = jSONObject.optString("wxGroupId");
        com.tencent.mm.sdk.platformtools.o4 M5 = com.tencent.mm.sdk.platformtools.o4.M(com.tencent.mm.plugin.multitalk.model.t2.f150137b);
        kotlin.jvm.internal.o.f(M5, "getMMKV(...)");
        M5.putString("mmkv_last_crash_roomId", jSONObject.optString("roomId"));
        boolean z17 = jSONObject.optInt("mmkv_multitalk_member_list") == 1;
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_multitalk_show_exit_reason_tips, true)) {
            com.tencent.mm.storage.f9 f9Var = new com.tencent.mm.storage.f9();
            f9Var.setType(64);
            f9Var.e1(java.lang.System.currentTimeMillis());
            f9Var.r1(6);
            f9Var.d1(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(z17 ? com.tencent.mm.R.string.lrn : com.tencent.mm.R.string.lro));
            ((py.a) ((qy.i) i95.n0.c(qy.i.class))).getClass();
            if (c01.v1.x(optString, false)) {
                f9Var.u1(optString);
                f9Var.d1(f9Var.j());
                ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().M9(f9Var);
            }
        }
    }
}
