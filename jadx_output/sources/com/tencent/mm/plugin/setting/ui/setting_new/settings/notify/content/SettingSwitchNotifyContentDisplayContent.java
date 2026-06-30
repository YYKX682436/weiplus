package com.tencent.mm.plugin.setting.ui.setting_new.settings.notify.content;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/setting/ui/setting_new/settings/notify/content/SettingSwitchNotifyContentDisplayContent;", "Ls24/g;", "Landroidx/appcompat/app/AppCompatActivity;", com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME, "<init>", "(Landroidx/appcompat/app/AppCompatActivity;)V", "plugin-setting_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class SettingSwitchNotifyContentDisplayContent extends s24.g {

    /* renamed from: h, reason: collision with root package name */
    public final al5.c2 f161961h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingSwitchNotifyContentDisplayContent(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f161961h = l24.b.f315207a;
    }

    @Override // a24.i
    public java.lang.String a7() {
        return "SettingGroup_Main_Notify_Content_Content";
    }

    @Override // a24.i
    public a24.u b7() {
        return new a24.u(com.tencent.mm.plugin.setting.ui.setting_new.settings.notify.SettingGroupNotifyContent.class, com.tencent.mm.plugin.setting.ui.setting_new.settings.notify.content.SettingSwitchNotifyContentDisplayAvatar.class);
    }

    @Override // s24.g, a24.a, a24.i
    public java.lang.Object clone() {
        return super.clone();
    }

    @Override // a24.i
    public int d7() {
        return com.tencent.mm.R.string.p_b;
    }

    @Override // a24.i
    public java.lang.Class e7() {
        return com.tencent.mm.plugin.setting.ui.setting_new.settings.notify.SettingGroupNotifyContent.class;
    }

    @Override // a24.i
    /* renamed from: m7 */
    public int getF161972p() {
        return 3;
    }

    @Override // a24.i
    /* renamed from: q7 */
    public boolean getF161948p() {
        w14.d dVar = w14.d.f442234d;
        return dVar.e() || dVar.f();
    }

    @Override // s24.g
    /* renamed from: x7, reason: from getter */
    public al5.c2 getF161961h() {
        return this.f161961h;
    }

    @Override // s24.g
    /* renamed from: y7 */
    public boolean getF161990i() {
        return w14.d.f442234d.e();
    }

    @Override // s24.g
    public boolean z7() {
        return true;
    }
}
