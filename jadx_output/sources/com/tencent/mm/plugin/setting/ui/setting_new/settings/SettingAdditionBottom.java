package com.tencent.mm.plugin.setting.ui.setting_new.settings;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/setting/ui/setting_new/settings/SettingAdditionBottom;", "Ls24/b;", "Landroidx/appcompat/app/AppCompatActivity;", com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME, "<init>", "(Landroidx/appcompat/app/AppCompatActivity;)V", "plugin-setting_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class SettingAdditionBottom extends s24.b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingAdditionBottom(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // a24.i
    public java.lang.String a7() {
        return "SettingGroup_Main_Bottom";
    }

    @Override // a24.i
    public a24.u b7() {
        return new a24.u(com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingGroupMain.class, com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingButtonExitAccount.class);
    }

    @Override // s24.b, a24.i
    public java.lang.Object clone() {
        return super.clone();
    }

    @Override // a24.i
    public java.lang.Class e7() {
        return com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingGroupMain.class;
    }

    @Override // a24.i
    public int m7() {
        return 1;
    }

    @Override // s24.b
    public void x7(in5.s0 holder, int i17, int i18) {
        kotlin.jvm.internal.o.g(holder, "holder");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) holder.p(i17);
        if (viewGroup != null && viewGroup.findViewById(com.tencent.mm.R.id.v3l) == null) {
            android.view.LayoutInflater.from(holder.f293121e).inflate(com.tencent.mm.R.layout.ens, viewGroup, true);
        }
        android.widget.TextView textView = (android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.v3v);
        if (textView != null) {
            textView.setOnClickListener(new d24.b(this, holder));
        }
        android.widget.TextView textView2 = (android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.v3w);
        if (textView2 != null) {
            textView2.setOnClickListener(new d24.c(this, holder));
        }
    }

    public final void y7(android.content.Context context, java.lang.String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        com.tencent.mm.plugin.report.service.b1.f158148a.c();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("showShare", false);
        intent.putExtra("rawUrl", str);
        intent.putExtra("show_feedback", false);
        intent.putExtra("show_bottom", false);
        intent.putExtra("needRedirect", false);
        intent.putExtra("neverGetA8Key", false);
        j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
    }
}
