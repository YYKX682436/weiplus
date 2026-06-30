package ir1;

/* loaded from: classes11.dex */
public final class z1 implements com.tencent.mm.modelbase.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f294078d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.brandservice.conversation.ui.BizFansSettingUI f294079e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f294080f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f294081g;

    public z1(kotlin.jvm.internal.c0 c0Var, com.tencent.mm.plugin.brandservice.conversation.ui.BizFansSettingUI bizFansSettingUI, java.lang.ref.WeakReference weakReference, java.lang.String str) {
        this.f294078d = c0Var;
        this.f294079e = bizFansSettingUI;
        this.f294080f = weakReference;
        this.f294081g = str;
    }

    @Override // com.tencent.mm.modelbase.e3
    public final int callback(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o rr6, com.tencent.mm.modelbase.m1 m1Var) {
        boolean z17;
        int i19;
        com.tencent.mm.ui.widget.dialog.u3 u3Var;
        kotlin.jvm.internal.o.g(rr6, "rr");
        kotlin.jvm.internal.o.g(m1Var, "<anonymous parameter 4>");
        com.tencent.mars.xlog.Log.i("BizFans.BizFansSettingUI", "setTimelineSetting callback " + i17 + ", " + i18 + ", " + str);
        kotlin.jvm.internal.c0 c0Var = this.f294078d;
        if (c0Var.f310112d) {
            return 0;
        }
        com.tencent.mm.plugin.brandservice.conversation.ui.BizFansSettingUI bizFansSettingUI = this.f294079e;
        bizFansSettingUI.f93971t = false;
        java.lang.ref.WeakReference weakReference = this.f294080f;
        com.tencent.mm.plugin.brandservice.conversation.ui.BizFansSettingUI bizFansSettingUI2 = (com.tencent.mm.plugin.brandservice.conversation.ui.BizFansSettingUI) weakReference.get();
        if (bizFansSettingUI2 != null && (u3Var = bizFansSettingUI2.f93972u) != null) {
            u3Var.dismiss();
            bizFansSettingUI2.f93972u = null;
        }
        boolean z18 = true;
        c0Var.f310112d = true;
        if (!(rr6.f70711b.f70700a instanceof r45.t26)) {
            com.tencent.mars.xlog.Log.w("BizFans.BizFansSettingUI", "not my resp");
            return 0;
        }
        if (i17 == 0 && i18 == 0) {
            rk.e wi6 = ((gr1.n) ((rk.g) i95.n0.c(rk.g.class))).wi();
            boolean a76 = bizFansSettingUI.a7();
            int i27 = bizFansSettingUI.f93958d;
            ((gr1.h) wi6).getClass();
            if (i27 == 5) {
                tk.s[] sVarArr = tk.s.f419870d;
                i19 = 2;
            } else {
                tk.s[] sVarArr2 = tk.s.f419870d;
                i19 = 1;
            }
            ((ox.r) ((rm.d0) i95.n0.c(rm.d0.class))).Ni(i19).f(com.tencent.wechat.mm.biz.m4.IAM_BIZ_PERSONAL_CENTER_RED_DOT_SCENE_NOTIFY, a76);
            if (bizFansSettingUI.f93960f != bizFansSettingUI.a7()) {
                bizFansSettingUI.f93963i = true;
            }
            return 0;
        }
        com.tencent.mm.plugin.brandservice.conversation.ui.BizFansSettingUI bizFansSettingUI3 = (com.tencent.mm.plugin.brandservice.conversation.ui.BizFansSettingUI) weakReference.get();
        if (bizFansSettingUI3 != null) {
            java.lang.String str2 = this.f294081g;
            if (r26.i0.n("biz_fans_msg_hide_disturb_pref", str2, false)) {
                ((com.tencent.mm.ui.base.preference.CheckBoxPreference) ((jz5.n) bizFansSettingUI3.f93964m).getValue()).S(!bizFansSettingUI3.Z6());
            } else if (r26.i0.n("biz_fans_remind_pref", str2, false)) {
                ((com.tencent.mm.ui.base.preference.CheckBoxPreference) ((jz5.n) bizFansSettingUI3.f93965n).getValue()).S(!bizFansSettingUI3.a7());
            } else if (r26.i0.n("biz_fans_receive_on_msg_limited_pref", str2, false)) {
                com.tencent.mm.ui.base.preference.CheckBoxPreference X6 = bizFansSettingUI3.X6();
                java.util.LinkedList list = bizFansSettingUI3.Y6().f385448e;
                kotlin.jvm.internal.o.f(list, "list");
                java.util.Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z17 = true;
                        break;
                    }
                    r45.k36 k36Var = (r45.k36) it.next();
                    if (kotlin.jvm.internal.o.b(k36Var.f378341d, "is_one_msg_before_reply")) {
                        z17 = kotlin.jvm.internal.o.b(k36Var.f378342e, "0");
                        break;
                    }
                }
                X6.S(!z17);
            }
            if (str != null && !r26.n0.N(str)) {
                z18 = false;
            }
            java.lang.String string = z18 ? bizFansSettingUI3.getString(com.tencent.mm.R.string.f490755an5) : str;
            kotlin.jvm.internal.o.d(string);
            db5.e1.A(bizFansSettingUI3, "", string, bizFansSettingUI3.getString(com.tencent.mm.R.string.f490544y3), bizFansSettingUI3.getString(com.tencent.mm.R.string.f490347sg), new ir1.h2(bizFansSettingUI3, str2), new ir1.i2(bizFansSettingUI3));
        }
        return 0;
    }
}
