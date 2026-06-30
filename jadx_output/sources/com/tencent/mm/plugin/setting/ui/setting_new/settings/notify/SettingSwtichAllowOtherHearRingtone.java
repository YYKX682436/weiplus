package com.tencent.mm.plugin.setting.ui.setting_new.settings.notify;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/setting/ui/setting_new/settings/notify/SettingSwtichAllowOtherHearRingtone;", "Ls24/g;", "Landroidx/appcompat/app/AppCompatActivity;", com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME, "<init>", "(Landroidx/appcompat/app/AppCompatActivity;)V", "plugin-setting_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class SettingSwtichAllowOtherHearRingtone extends s24.g {

    /* renamed from: h, reason: collision with root package name */
    public int f161958h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.HashMap f161959i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingSwtichAllowOtherHearRingtone(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f161958h = c01.z1.p();
        this.f161959i = new java.util.HashMap();
    }

    @Override // a24.i
    public java.lang.String a7() {
        return "SettingGroup_Main_Notify_AllowOtherHearRingtone";
    }

    @Override // a24.i
    public a24.u b7() {
        return new a24.u(com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingGroupNotify.class, com.tencent.mm.plugin.setting.ui.setting_new.settings.notify.SettingActivityItemRingtone.class);
    }

    @Override // s24.g, a24.a, a24.i
    public java.lang.Object clone() {
        return super.clone();
    }

    @Override // a24.i
    public int d7() {
        return com.tencent.mm.R.string.iug;
    }

    @Override // a24.i
    public java.lang.Class e7() {
        return com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingGroupNotify.class;
    }

    @Override // a24.i
    /* renamed from: m7 */
    public int getF161972p() {
        return 2;
    }

    @Override // a24.i
    /* renamed from: q7 */
    public boolean getF161948p() {
        ((dd0.s0) ((ed0.b1) i95.n0.c(ed0.b1.class))).getClass();
        if (!((java.util.ArrayList) mx3.i0.g()).isEmpty()) {
            return true;
        }
        ((dd0.s0) ((ed0.b1) i95.n0.c(ed0.b1.class))).getClass();
        if (xx3.h.a()) {
            return true;
        }
        ((dd0.s0) ((ed0.b1) i95.n0.c(ed0.b1.class))).getClass();
        mx3.i0.n();
        com.tencent.mm.sdk.platformtools.o4 keyParamsMMKv = mx3.i0.f332581e;
        kotlin.jvm.internal.o.f(keyParamsMMKv, "keyParamsMMKv");
        return keyParamsMMKv.getBoolean("show_enable_caller_listen_my_ringback", false);
    }

    @Override // s24.g
    /* renamed from: x7 */
    public al5.c2 getF161961h() {
        return new k24.o(this);
    }

    @Override // s24.g
    /* renamed from: y7 */
    public boolean getF161950h() {
        return ip.b.v().getBoolean("settings_ringtone_allow_hear", true);
    }
}
