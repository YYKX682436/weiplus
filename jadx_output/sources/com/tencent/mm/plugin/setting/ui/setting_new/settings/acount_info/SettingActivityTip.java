package com.tencent.mm.plugin.setting.ui.setting_new.settings.acount_info;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/setting/ui/setting_new/settings/acount_info/SettingActivityTip;", "Ls24/b;", "Landroidx/appcompat/app/AppCompatActivity;", com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME, "<init>", "(Landroidx/appcompat/app/AppCompatActivity;)V", "plugin-setting_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class SettingActivityTip extends s24.b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingActivityTip(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // a24.i
    public java.lang.String a7() {
        return "SettingGroup_Main_AccountInfo_Tip";
    }

    @Override // a24.i
    public a24.u b7() {
        return new a24.u(com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingGroupAccountInfo.class, com.tencent.mm.plugin.setting.ui.setting_new.settings.acount_info.SettingGroupSecurityCenterItem.class);
    }

    @Override // s24.b, a24.i
    public java.lang.Object clone() {
        return super.clone();
    }

    @Override // a24.i
    public java.lang.Class e7() {
        return com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingGroupAccountInfo.class;
    }

    @Override // a24.i
    /* renamed from: m7 */
    public int getF161972p() {
        return 2;
    }

    @Override // s24.b
    public void x7(in5.s0 holder, int i17, int i18) {
        kotlin.jvm.internal.o.g(holder, "holder");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) holder.p(i17);
        android.widget.TextView textView = viewGroup != null ? (android.widget.TextView) viewGroup.findViewById(android.R.id.title) : null;
        if (viewGroup == null || textView != null) {
            return;
        }
        android.content.Context context = holder.f293121e;
        android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.c0d, viewGroup, true);
        android.widget.TextView textView2 = (android.widget.TextView) viewGroup.findViewById(android.R.id.title);
        if (textView2 != null) {
            textView2.setText(context.getString(com.tencent.mm.R.string.ixy));
        }
    }
}
