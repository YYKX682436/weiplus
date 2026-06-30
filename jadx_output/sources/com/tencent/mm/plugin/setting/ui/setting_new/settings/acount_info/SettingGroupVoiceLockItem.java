package com.tencent.mm.plugin.setting.ui.setting_new.settings.acount_info;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/setting/ui/setting_new/settings/acount_info/SettingGroupVoiceLockItem;", "Ls24/a;", "Landroidx/appcompat/app/AppCompatActivity;", com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME, "<init>", "(Landroidx/appcompat/app/AppCompatActivity;)V", "plugin-setting_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class SettingGroupVoiceLockItem extends s24.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingGroupVoiceLockItem(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // s24.a
    public java.lang.String L7() {
        return ".ui.VoicePrintStateSettingUI";
    }

    @Override // s24.a
    public java.lang.String M7() {
        return "voiceprint";
    }

    @Override // a24.i
    public java.lang.String a7() {
        return "SettingGroup_Main_AccountInfo_VoiceLock";
    }

    @Override // a24.i
    public a24.u b7() {
        return new a24.u(com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingGroupAccountInfo.class, com.tencent.mm.plugin.setting.ui.setting_new.settings.acount_info.SettingGroupFingerprintItem.class);
    }

    @Override // s24.a, s24.f, a24.i
    public java.lang.Object clone() {
        return super.clone();
    }

    @Override // a24.i
    public int d7() {
        return com.tencent.mm.R.string.p86;
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

    @Override // a24.i
    /* renamed from: n7 */
    public java.lang.String getF161878p() {
        return (c01.z1.o() & 131072) != 0 ? getString(com.tencent.mm.R.string.p9n) : getString(com.tencent.mm.R.string.p9m);
    }

    @Override // a24.i
    /* renamed from: q7 */
    public boolean getF161948p() {
        ((is.f) ((js.r0) i95.n0.c(js.r0.class))).getClass();
        return com.tencent.mm.sdk.platformtools.t8.P(((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("VoiceprintEntry"), 0) != 0;
    }
}
