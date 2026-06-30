package com.tencent.mm.plugin.setting.ui.setting_new.settings.video;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/setting/ui/setting_new/settings/video/SettingGroupUseMobileData;", "Ls24/g;", "Landroidx/appcompat/app/AppCompatActivity;", com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME, "<init>", "(Landroidx/appcompat/app/AppCompatActivity;)V", "plugin-setting_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class SettingGroupUseMobileData extends s24.g {

    /* renamed from: h, reason: collision with root package name */
    public long f161989h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f161990i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingGroupUseMobileData(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        long j17 = c01.z1.j();
        this.f161989h = j17;
        this.f161990i = !((j17 & 137438953472L) != 0);
    }

    @Override // a24.i
    public java.lang.String a7() {
        return "SettingGroup_Main_Video_UseMobileData";
    }

    @Override // a24.i
    public a24.u b7() {
        return new a24.u(com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingGroupVideo.class, null);
    }

    @Override // s24.g, a24.a, a24.i
    public java.lang.Object clone() {
        return super.clone();
    }

    @Override // a24.i
    public int d7() {
        return com.tencent.mm.R.string.f493828p90;
    }

    @Override // a24.i
    public java.lang.Class e7() {
        return com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingGroupVideo.class;
    }

    @Override // a24.i
    /* renamed from: m7 */
    public int getF161972p() {
        return 2;
    }

    @Override // a24.i
    /* renamed from: p7 */
    public java.lang.Integer getF161949q() {
        return java.lang.Integer.valueOf(com.tencent.mm.R.string.f493829p91);
    }

    @Override // s24.g
    /* renamed from: x7 */
    public al5.c2 getF161962h() {
        return new q24.a(this);
    }

    @Override // s24.g
    /* renamed from: y7, reason: from getter */
    public boolean getF161990i() {
        return this.f161990i;
    }
}
