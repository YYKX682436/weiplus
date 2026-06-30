package com.tencent.mm.plugin.setting.ui.setting_new.settings.acount_info;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/setting/ui/setting_new/settings/acount_info/SettingGroupSecurityCenterItem;", "Ls24/a;", "Landroidx/appcompat/app/AppCompatActivity;", com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME, "<init>", "(Landroidx/appcompat/app/AppCompatActivity;)V", "plugin-setting_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class SettingGroupSecurityCenterItem extends s24.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingGroupSecurityCenterItem(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // s24.f
    public void G7(android.content.Context context, android.content.Intent intent) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(intent, "intent");
        java.lang.String d17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("WeChatSafeCenterUrl");
        com.tencent.mars.xlog.Log.i("MircoMsg.SettingGroupSecurityCenter", "safe center url %s", d17);
        if (com.tencent.mm.sdk.platformtools.t8.K0(d17)) {
            d17 = context.getString(com.tencent.mm.R.string.l8n) + com.tencent.mm.sdk.platformtools.m2.d();
        }
        intent.putExtra("rawUrl", d17);
        intent.putExtra("showShare", true);
        intent.putExtra("show_bottom", false);
        intent.putExtra("needRedirect", false);
        intent.putExtra("hardcode_jspermission", com.tencent.mm.protocal.JsapiPermissionWrapper.f192178h);
        intent.putExtra("hardcode_general_ctrl", com.tencent.mm.protocal.GeneralControlWrapper.f192175e);
    }

    @Override // s24.a
    public java.lang.String L7() {
        return ".ui.tools.WebViewUI";
    }

    @Override // s24.a
    public java.lang.String M7() {
        return "webview";
    }

    @Override // a24.i
    public java.lang.Integer Y6() {
        return 0;
    }

    @Override // a24.i
    public java.lang.String a7() {
        return "SettingGroup_Main_AccountInfo_SecurityCenter";
    }

    @Override // a24.i
    public a24.u b7() {
        return new a24.u(com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingGroupAccountInfo.class, com.tencent.mm.plugin.setting.ui.setting_new.settings.acount_info.SettingGroupFreezeFriend.class);
    }

    @Override // s24.a, s24.f, a24.i
    public java.lang.Object clone() {
        return super.clone();
    }

    @Override // a24.i
    public int d7() {
        return com.tencent.mm.R.string.ixx;
    }

    @Override // a24.i
    public java.lang.Class e7() {
        return com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingGroupAccountInfo.class;
    }

    @Override // a24.i
    public boolean l7() {
        return false;
    }

    @Override // a24.i
    /* renamed from: m7 */
    public int getF161972p() {
        return 2;
    }
}
