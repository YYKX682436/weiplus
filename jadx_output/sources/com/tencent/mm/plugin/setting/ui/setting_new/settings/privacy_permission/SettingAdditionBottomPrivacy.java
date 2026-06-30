package com.tencent.mm.plugin.setting.ui.setting_new.settings.privacy_permission;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/setting/ui/setting_new/settings/privacy_permission/SettingAdditionBottomPrivacy;", "Ls24/b;", "Landroidx/appcompat/app/AppCompatActivity;", com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME, "<init>", "(Landroidx/appcompat/app/AppCompatActivity;)V", "plugin-setting_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class SettingAdditionBottomPrivacy extends s24.b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingAdditionBottomPrivacy(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    public static final void y7(com.tencent.mm.plugin.setting.ui.setting_new.settings.privacy_permission.SettingAdditionBottomPrivacy settingAdditionBottomPrivacy, java.lang.String str) {
        settingAdditionBottomPrivacy.getClass();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", str);
        intent.putExtra("showShare", false);
        intent.putExtra("show_bottom", false);
        intent.putExtra("needRedirect", false);
        intent.putExtra("neverGetA8Key", true);
        intent.putExtra("hardcode_jspermission", com.tencent.mm.protocal.JsapiPermissionWrapper.f192178h);
        intent.putExtra("hardcode_general_ctrl", com.tencent.mm.protocal.GeneralControlWrapper.f192175e);
        j45.l.j(settingAdditionBottomPrivacy.getContext(), "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", intent, null);
    }

    @Override // a24.i
    public java.lang.String a7() {
        return "SettingGroup_Main_PrivacyPermission_BottomPrivacy";
    }

    @Override // a24.i
    public a24.u b7() {
        return new a24.u(com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingGroupPrivacyPermission.class, com.tencent.mm.plugin.setting.ui.setting_new.settings.privacy_permission.SettingActivityItemWechatInfo.class);
    }

    @Override // s24.b, a24.i
    public java.lang.Object clone() {
        return super.clone();
    }

    @Override // a24.i
    public java.lang.Class e7() {
        return com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingGroupPrivacyPermission.class;
    }

    @Override // a24.i
    public int m7() {
        return 2;
    }

    @Override // s24.b
    public void x7(in5.s0 holder, int i17, int i18) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        java.lang.String obj = gm0.j1.u().c().l(274436, "").toString();
        h0Var.f310123d = obj;
        if (com.tencent.mm.sdk.platformtools.t8.K0(obj)) {
            h0Var.f310123d = com.tencent.mm.sdk.platformtools.m2.e();
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0((java.lang.String) h0Var.f310123d) && !com.tencent.mm.sdk.platformtools.t8.x0((java.lang.String) h0Var.f310123d)) {
            h0Var.f310123d = "";
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) holder.p(i17);
        if (viewGroup != null && viewGroup.findViewById(com.tencent.mm.R.id.v3l) == null) {
            android.view.LayoutInflater.from(holder.f293121e).inflate(com.tencent.mm.R.layout.ent, viewGroup, true);
        }
        android.widget.TextView textView = (android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.f486875mq5);
        if (textView != null) {
            textView.setOnClickListener(new p24.c(this, h0Var));
        }
        if (r26.i0.p((java.lang.String) h0Var.f310123d, "cn", true)) {
            ((android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.f486875mq5)).setVisibility(0);
        } else {
            ((android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.f486875mq5)).setVisibility(8);
        }
        android.widget.TextView textView2 = (android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.f486874mq4);
        if (textView2 != null) {
            textView2.setOnClickListener(new p24.d(this, h0Var));
        }
        android.view.View itemView = holder.itemView;
        kotlin.jvm.internal.o.f(itemView, "itemView");
        itemView.setMinimumHeight(0);
        itemView.getLayoutParams().height = -2;
        itemView.post(new p24.e(itemView, i18));
    }
}
