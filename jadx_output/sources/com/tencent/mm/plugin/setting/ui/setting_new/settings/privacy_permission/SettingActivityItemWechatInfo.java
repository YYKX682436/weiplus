package com.tencent.mm.plugin.setting.ui.setting_new.settings.privacy_permission;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/setting/ui/setting_new/settings/privacy_permission/SettingActivityItemWechatInfo;", "Ls24/a;", "Landroidx/appcompat/app/AppCompatActivity;", com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME, "<init>", "(Landroidx/appcompat/app/AppCompatActivity;)V", "plugin-setting_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class SettingActivityItemWechatInfo extends s24.a {

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f161988p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingActivityItemWechatInfo(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f161988p = jz5.h.b(p24.b.f351430d);
    }

    @Override // s24.a
    public java.lang.String L7() {
        return ".ui.setting.SettingsPersonalInfoPreviewUI";
    }

    @Override // s24.a
    public java.lang.String M7() {
        return "setting";
    }

    @Override // a24.i
    public java.lang.String a7() {
        return "SettingGroup_Main_PrivacyPermission_WechatInfo";
    }

    @Override // a24.i
    public a24.u b7() {
        return new a24.u(com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingGroupPrivacyPermission.class, com.tencent.mm.plugin.setting.ui.setting_new.settings.privacy_permission.SettingActivityItemPersonalInfo.class);
    }

    @Override // s24.a, s24.f, a24.i
    public java.lang.Object clone() {
        return super.clone();
    }

    @Override // a24.i
    public int d7() {
        return com.tencent.mm.R.string.iqh;
    }

    @Override // a24.i
    public java.lang.Class e7() {
        return com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingGroupPrivacyPermission.class;
    }

    @Override // a24.i
    /* renamed from: m7 */
    public int getF161972p() {
        return 2;
    }

    @Override // a24.i
    /* renamed from: q7 */
    public boolean getF161948p() {
        java.lang.String str = (java.lang.String) ((jz5.n) this.f161988p).getValue();
        return !(str == null || str.length() == 0) && gm0.j1.b().d() == gm0.j.WeChat;
    }

    @Override // s24.a, a24.i
    public void r7(android.content.Context context, android.view.View itemView, int i17) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(itemView, "itemView");
        t7(getActivity().getIntent());
        if (!(c01.e2.a0() && kotlin.jvm.internal.o.b("1", j62.e.g().a("clicfg_enable_export_data_with_liteapp_android", "0", false, true)))) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("showShare", false);
            intent.putExtra("rawUrl", (java.lang.String) ((jz5.n) this.f161988p).getValue());
            intent.putExtra("show_feedback", false);
            intent.putExtra("show_bottom", false);
            intent.putExtra("needRedirect", false);
            intent.putExtra("neverGetA8Key", false);
            j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
            return;
        }
        if (((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).Jj("wxalite370e38d2889f0baed2e23185d9706e3f")) {
            ((k30.a) ((l30.h) i95.n0.c(l30.h.class))).wi();
            if (((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).Bj("wxalite370e38d2889f0baed2e23185d9706e3f") == null) {
                if (((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).vj() == null) {
                    ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).getClass();
                    com.tencent.mm.plugin.lite.logic.g1.s().h(null);
                }
                ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).cj("wxalite370e38d2889f0baed2e23185d9706e3f", null);
                return;
            }
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("appId", "wxalite370e38d2889f0baed2e23185d9706e3f");
            com.tencent.mars.xlog.Log.i(com.tencent.mm.ui.base.preference.MMPreference.TAG, "open liteapp:wxalite370e38d2889f0baed2e23185d9706e3f,page:pages/home");
            ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).kk(context, bundle, true, false, new p24.a());
        }
    }
}
