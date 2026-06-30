package com.tencent.mm.plugin.setting.ui.setting_new.settings;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/setting/ui/setting_new/settings/SettingGroupHelpItem;", "Ls24/a;", "Landroidx/appcompat/app/AppCompatActivity;", com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME, "<init>", "(Landroidx/appcompat/app/AppCompatActivity;)V", "plugin-setting_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class SettingGroupHelpItem extends s24.a {

    /* renamed from: p, reason: collision with root package name */
    public final int f161884p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingGroupHelpItem(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f161884p = com.tencent.mm.R.string.p9v;
    }

    @Override // s24.f
    public void G7(android.content.Context context, android.content.Intent intent) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(intent, "intent");
        if (c01.e2.a0()) {
            java.lang.String string = (com.tencent.mm.sdk.platformtools.a0.f192448k || !(com.tencent.mm.sdk.platformtools.m2.d().equals("zh_CN") || com.tencent.mm.sdk.platformtools.m2.d().equals("zh_HK") || com.tencent.mm.sdk.platformtools.m2.d().equals("zh_TW"))) ? context.getString(com.tencent.mm.R.string.l8h) : context.getString(com.tencent.mm.R.string.l8g);
            kotlin.jvm.internal.o.d(string);
            intent.putExtra("showShare", false);
            intent.putExtra("rawUrl", string);
            intent.putExtra("show_feedback", false);
            intent.putExtra("KShowFixToolsBtn", true);
            return;
        }
        com.tencent.mm.app.j3.b();
        java.lang.String string2 = context.getString(com.tencent.mm.R.string.f493688la4);
        kotlin.jvm.internal.o.f(string2, "getString(...)");
        intent.putExtra("showShare", false);
        intent.putExtra("rawUrl", string2);
        intent.putExtra("show_feedback", false);
        intent.putExtra("KShowFixToolsBtn", true);
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
        return java.lang.Integer.valueOf(this.f161884p);
    }

    @Override // a24.i
    public java.lang.String a7() {
        return "SettingGroup_Main_Help";
    }

    @Override // a24.i
    public a24.u b7() {
        return new a24.u(com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingGroupMain.class, com.tencent.mm.plugin.setting.ui.setting_new.settings.other.SettingGroupPlugin.class);
    }

    @Override // s24.a, s24.f, a24.i
    public java.lang.Object clone() {
        return super.clone();
    }

    @Override // a24.i
    public int d7() {
        return com.tencent.mm.R.string.f493039ir3;
    }

    @Override // a24.i
    public java.lang.Class e7() {
        return com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingGroupMain.class;
    }

    @Override // a24.i
    /* renamed from: m7 */
    public int getF161972p() {
        return 1;
    }
}
