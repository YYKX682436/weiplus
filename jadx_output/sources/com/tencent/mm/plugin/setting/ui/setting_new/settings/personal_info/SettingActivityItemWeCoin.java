package com.tencent.mm.plugin.setting.ui.setting_new.settings.personal_info;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/setting/ui/setting_new/settings/personal_info/SettingActivityItemWeCoin;", "Ls24/a;", "Landroidx/appcompat/app/AppCompatActivity;", com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME, "<init>", "(Landroidx/appcompat/app/AppCompatActivity;)V", "plugin-setting_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class SettingActivityItemWeCoin extends s24.a {

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f161986p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f161987q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingActivityItemWeCoin(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f161986p = "MicroMsg.SettingActivityWeCoin";
        this.f161987q = "";
    }

    @Override // s24.a
    public java.lang.String L7() {
        return ".ui.setting.SettingsModifyNameUI";
    }

    @Override // s24.a
    public java.lang.String M7() {
        return "setting";
    }

    @Override // a24.i
    public java.lang.Integer Y6() {
        return 0;
    }

    @Override // a24.i
    public java.lang.String a7() {
        return "SettingGroup_Main_PersonalInfo_WeCoin";
    }

    @Override // a24.i
    public a24.u b7() {
        return new a24.u(com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingGroupPersonalInfo.class, com.tencent.mm.plugin.setting.ui.setting_new.settings.personal_info.SettingActivityItemInvoice.class);
    }

    @Override // s24.a, s24.f, a24.i
    public java.lang.Object clone() {
        return super.clone();
    }

    @Override // a24.i
    public int d7() {
        return com.tencent.mm.R.string.p8r;
    }

    @Override // a24.i
    public java.lang.Class e7() {
        return com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingGroupPersonalInfo.class;
    }

    @Override // a24.i
    public int m7() {
        return 2;
    }

    @Override // a24.i
    /* renamed from: n7 */
    public java.lang.String getF161878p() {
        java.lang.String str;
        if (!((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode()) {
            ((ms4.z) ((js4.i) gm0.j1.s(js4.i.class))).getClass();
            java.lang.Long valueOf = java.lang.Long.valueOf(os4.h.i());
            kotlin.jvm.internal.o.d(valueOf);
            if (valueOf.longValue() > 0) {
                str = valueOf.longValue() + ' ' + getString(com.tencent.mm.R.string.j1_);
            } else {
                str = "";
            }
            java.lang.String str2 = !kotlin.jvm.internal.o.b(this.f161987q, "") ? this.f161987q : "";
            if (!kotlin.jvm.internal.o.b(str2, "")) {
                str = str2;
            }
            com.tencent.mars.xlog.Log.i(this.f161986p, "updateWeCoinEntry balance catch: %s", str);
            if (!kotlin.jvm.internal.o.b(str, "")) {
                return str;
            }
        }
        return null;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        com.tencent.mars.xlog.Log.i(this.f161986p, "updateWeCoinEntry CGI");
        ((ms4.z) ((js4.i) gm0.j1.s(js4.i.class))).b(new o24.i(this));
    }

    @Override // a24.i
    public boolean q7() {
        return !((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode();
    }

    @Override // s24.a, a24.i
    public void r7(android.content.Context context, android.view.View itemView, int i17) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(itemView, "itemView");
        t7(getActivity().getIntent());
        if (!((ms4.z) ((js4.i) gm0.j1.s(js4.i.class))).c()) {
            v24.o0.b(context, 8L, true, new o24.h(context));
            return;
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(21650, 0);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("launch_from_webview", false);
        j45.l.k(context, "wallet", ".wecoin.ui.WeCoinRechargeView", intent, true);
    }
}
