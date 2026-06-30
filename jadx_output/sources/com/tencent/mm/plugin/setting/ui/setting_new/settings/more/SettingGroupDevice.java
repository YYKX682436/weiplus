package com.tencent.mm.plugin.setting.ui.setting_new.settings.more;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/setting/ui/setting_new/settings/more/SettingGroupDevice;", "Ls24/f;", "Landroidx/appcompat/app/AppCompatActivity;", com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME, "<init>", "(Landroidx/appcompat/app/AppCompatActivity;)V", "plugin-setting_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class SettingGroupDevice extends s24.f {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingGroupDevice(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // a24.i
    public java.lang.String a7() {
        return "SettingGroup_Main_More_Device";
    }

    @Override // a24.i
    public a24.u b7() {
        return new a24.u(com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingGroupMore.class, com.tencent.mm.plugin.setting.ui.setting_new.settings.more.SettingGroupEmojiItem.class);
    }

    @Override // s24.f, a24.i
    public java.lang.Object clone() {
        return super.clone();
    }

    @Override // a24.i
    public int d7() {
        return com.tencent.mm.R.string.p_8;
    }

    @Override // a24.i
    public java.lang.Class e7() {
        return com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingGroupMore.class;
    }

    @Override // a24.i
    /* renamed from: m7 */
    public int getF161972p() {
        return 2;
    }

    @Override // a24.i
    /* renamed from: q7 */
    public boolean getF161948p() {
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_settings_device_entry, 0) != 1) {
            com.tencent.mm.autogen.events.ExDeviceSettingShowEvent exDeviceSettingShowEvent = new com.tencent.mm.autogen.events.ExDeviceSettingShowEvent();
            exDeviceSettingShowEvent.e();
            if (!exDeviceSettingShowEvent.f54168g.f6337a) {
                return false;
            }
        }
        return true;
    }

    @Override // a24.i
    public void r7(android.content.Context context, android.view.View itemView, int i17) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(itemView, "itemView");
        t7(getActivity().getIntent());
        l81.b1 b1Var = new l81.b1();
        b1Var.f317014b = "wxd930c3b7cf7c92e6";
        b1Var.f317022f = "pages/device-list/device-list.html";
        b1Var.f317018d = 0;
        b1Var.f317016c = 0;
        b1Var.f317032k = 1112;
        ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).bj(context, b1Var);
    }
}
