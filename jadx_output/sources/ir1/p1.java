package ir1;

/* loaded from: classes11.dex */
public final class p1 implements com.tencent.mm.modelbase.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f294032d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f294033e;

    public p1(kotlin.jvm.internal.c0 c0Var, java.lang.ref.WeakReference weakReference) {
        this.f294032d = c0Var;
        this.f294033e = weakReference;
    }

    @Override // com.tencent.mm.modelbase.e3
    public final int callback(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o rr6, com.tencent.mm.modelbase.m1 m1Var) {
        kotlin.jvm.internal.o.g(rr6, "rr");
        kotlin.jvm.internal.o.g(m1Var, "<anonymous parameter 4>");
        com.tencent.mars.xlog.Log.i("BizFans.BizFansSettingUI", "cgiGetBizFansSetting callback " + i17 + ", " + i18);
        kotlin.jvm.internal.c0 c0Var = this.f294032d;
        if (c0Var.f310112d) {
            return 0;
        }
        boolean z17 = true;
        c0Var.f310112d = true;
        java.lang.ref.WeakReference weakReference = this.f294033e;
        if (i17 != 0 || i18 != 0) {
            com.tencent.mm.plugin.brandservice.conversation.ui.BizFansSettingUI bizFansSettingUI = (com.tencent.mm.plugin.brandservice.conversation.ui.BizFansSettingUI) weakReference.get();
            if (bizFansSettingUI != null) {
                int i19 = com.tencent.mm.plugin.brandservice.conversation.ui.BizFansSettingUI.f93957v;
                if (str != null && !r26.n0.N(str)) {
                    z17 = false;
                }
                if (z17) {
                    str = bizFansSettingUI.getString(com.tencent.mm.R.string.amc);
                }
                java.lang.String str2 = str;
                kotlin.jvm.internal.o.d(str2);
                db5.e1.A(bizFansSettingUI, "", str2, bizFansSettingUI.getString(com.tencent.mm.R.string.f490544y3), bizFansSettingUI.getString(com.tencent.mm.R.string.f490347sg), new ir1.b2(bizFansSettingUI), new ir1.c2(bizFansSettingUI));
            }
            return 0;
        }
        com.tencent.mm.protobuf.f fVar = rr6.f70711b.f70700a;
        if (!(fVar instanceof r45.wn3)) {
            com.tencent.mars.xlog.Log.w("BizFans.BizFansSettingUI", "not my resp");
            return 0;
        }
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.GetSettingResp");
        r45.wn3 wn3Var = (r45.wn3) fVar;
        com.tencent.mm.plugin.brandservice.conversation.ui.BizFansSettingUI bizFansSettingUI2 = (com.tencent.mm.plugin.brandservice.conversation.ui.BizFansSettingUI) weakReference.get();
        if (bizFansSettingUI2 != null) {
            kotlinx.coroutines.p2.a(bizFansSettingUI2.f93969r, null, 1, null);
            com.tencent.mm.ui.base.preference.r preferenceScreen = bizFansSettingUI2.getPreferenceScreen();
            kotlin.jvm.internal.o.d(preferenceScreen);
            ((com.tencent.mm.ui.base.preference.h0) preferenceScreen).m("biz_fans_msg_loading_pref", true);
            java.util.LinkedList<r45.k36> list = wn3Var.f389310d;
            kotlin.jvm.internal.o.f(list, "list");
            for (r45.k36 k36Var : list) {
                if (kotlin.jvm.internal.o.b(k36Var.f378341d, "filter_spam_fansmsg")) {
                    bizFansSettingUI2.f93959e = kotlin.jvm.internal.o.b(k36Var.f378342e, "0");
                }
                if (kotlin.jvm.internal.o.b(k36Var.f378341d, "close_notice_fansmsg")) {
                    bizFansSettingUI2.f93960f = kotlin.jvm.internal.o.b(k36Var.f378342e, "0");
                }
                if (kotlin.jvm.internal.o.b(k36Var.f378341d, "private_msg_scope")) {
                    java.lang.String value = k36Var.f378342e;
                    kotlin.jvm.internal.o.f(value, "value");
                    bizFansSettingUI2.d7(java.lang.Integer.parseInt(value));
                }
                if (kotlin.jvm.internal.o.b(k36Var.f378341d, "is_one_msg_before_reply")) {
                    bizFansSettingUI2.f93962h = kotlin.jvm.internal.o.b(k36Var.f378342e, "1");
                }
            }
            ((com.tencent.mm.ui.base.preference.CheckBoxPreference) ((jz5.n) bizFansSettingUI2.f93964m).getValue()).O(bizFansSettingUI2.f93959e);
            ((com.tencent.mm.ui.base.preference.CheckBoxPreference) ((jz5.n) bizFansSettingUI2.f93965n).getValue()).O(bizFansSettingUI2.f93960f);
            bizFansSettingUI2.X6().O(bizFansSettingUI2.f93962h);
        }
        return 0;
    }
}
