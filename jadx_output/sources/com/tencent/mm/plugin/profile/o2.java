package com.tencent.mm.plugin.profile;

/* loaded from: classes11.dex */
public class o2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f153568d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f153569e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f153570f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f153571g;

    public o2(android.content.Intent intent, int i17, int i18, java.lang.String str) {
        this.f153568d = intent;
        this.f153569e = i17;
        this.f153570f = i18;
        this.f153571g = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.autogen.mmdata.rpt.UserProfileItemClickLogStruct userProfileItemClickLogStruct = new com.tencent.mm.autogen.mmdata.rpt.UserProfileItemClickLogStruct();
        android.content.Intent intent = this.f153568d;
        userProfileItemClickLogStruct.f61529d = com.tencent.mm.plugin.profile.p2.wi(intent);
        userProfileItemClickLogStruct.f61535j = intent.getIntExtra("CONTACT_INFO_UI_SUB_SOURCE", 0);
        userProfileItemClickLogStruct.f61530e = this.f153569e;
        userProfileItemClickLogStruct.f61531f = this.f153570f;
        java.lang.String str = this.f153571g;
        userProfileItemClickLogStruct.f61532g = userProfileItemClickLogStruct.b(dm.i4.COL_USERNAME, str, true);
        userProfileItemClickLogStruct.f61534i = userProfileItemClickLogStruct.b("TextStatusID", ((we0.j1) ((xe0.l0) i95.n0.c(xe0.l0.class))).Vi(str), true);
        if (intent.getIntExtra("key_label_click_source", 0) > 0) {
            userProfileItemClickLogStruct.f61529d = 22L;
        }
        if (com.tencent.mm.plugin.profile.p2.wi(intent) == 60) {
            java.lang.String stringExtra = intent.getStringExtra("key_text_status_comment_id");
            if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
                try {
                    cl0.g gVar = new cl0.g();
                    gVar.h("from_status_comment", stringExtra);
                    userProfileItemClickLogStruct.f61540o = userProfileItemClickLogStruct.b("ExtraSourceInfo", gVar.toString(), true);
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.SubCoreProfile", "report16055, exp=" + e17.toString());
                }
            }
        }
        com.tencent.mm.storage.z3 z3Var = com.tencent.mm.plugin.profile.p2.f153578e;
        if (z3Var != null && z3Var.d1().equals(str)) {
            java.lang.Boolean bool = com.tencent.mm.plugin.profile.p2.f153579f;
            if (bool == null) {
                userProfileItemClickLogStruct.f61536k = 0L;
            } else {
                userProfileItemClickLogStruct.f61536k = bool.booleanValue() ? 1L : 2L;
            }
            java.lang.Boolean bool2 = com.tencent.mm.plugin.profile.p2.f153580g;
            if (bool2 == null) {
                userProfileItemClickLogStruct.f61537l = 0L;
            } else {
                userProfileItemClickLogStruct.f61537l = bool2.booleanValue() ? 1L : 2L;
            }
            userProfileItemClickLogStruct.f61538m = com.tencent.mm.sdk.platformtools.t8.K0(com.tencent.mm.plugin.profile.p2.f153578e.V) ? 2L : 1L;
            com.tencent.mm.storage.z3 z3Var2 = com.tencent.mm.plugin.profile.p2.f153578e;
            int i17 = z3Var2.I;
            if (i17 == 0) {
                userProfileItemClickLogStruct.f61539n = 0L;
            } else {
                userProfileItemClickLogStruct.f61539n = i17 == 1 ? 1L : 2L;
            }
            userProfileItemClickLogStruct.f61538m = com.tencent.mm.sdk.platformtools.t8.K0(z3Var2.V) ? 2L : 1L;
        }
        userProfileItemClickLogStruct.k();
    }
}
