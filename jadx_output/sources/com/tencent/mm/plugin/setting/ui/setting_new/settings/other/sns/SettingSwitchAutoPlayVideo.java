package com.tencent.mm.plugin.setting.ui.setting_new.settings.other.sns;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/setting/ui/setting_new/settings/other/sns/SettingSwitchAutoPlayVideo;", "Ls24/g;", "Landroidx/appcompat/app/AppCompatActivity;", com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME, "<init>", "(Landroidx/appcompat/app/AppCompatActivity;)V", "plugin-setting_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class SettingSwitchAutoPlayVideo extends s24.g {

    /* renamed from: h, reason: collision with root package name */
    public boolean f161973h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingSwitchAutoPlayVideo(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        java.lang.Object m17 = gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WEIXIN_SNSAUTOPLAY_AUTOSYNC_BOOLEAN, java.lang.Boolean.TRUE);
        kotlin.jvm.internal.o.e(m17, "null cannot be cast to non-null type kotlin.Boolean");
        this.f161973h = ((java.lang.Boolean) m17).booleanValue();
    }

    @Override // a24.i
    public java.lang.String a7() {
        return "SettingGroup_Main_Other_Plugin_AutoPlayVideo";
    }

    @Override // a24.i
    public a24.u b7() {
        return new a24.u(com.tencent.mm.plugin.setting.ui.setting_new.settings.other.SettingGroupSNS.class, null);
    }

    @Override // s24.g, a24.a, a24.i
    public java.lang.Object clone() {
        return super.clone();
    }

    @Override // a24.i
    public int d7() {
        return com.tencent.mm.R.string.p8b;
    }

    @Override // a24.i
    public java.lang.Class e7() {
        return com.tencent.mm.plugin.setting.ui.setting_new.settings.other.SettingGroupSNS.class;
    }

    @Override // a24.i
    /* renamed from: m7 */
    public int getF161972p() {
        return 3;
    }

    @Override // a24.i
    /* renamed from: p7 */
    public java.lang.Integer getF161949q() {
        return java.lang.Integer.valueOf(com.tencent.mm.R.string.p8c);
    }

    @Override // a24.i
    /* renamed from: q7 */
    public boolean getF161948p() {
        if (getActivity().getIntent().getIntExtra("activity_caller_params", 0) == 1) {
            return false;
        }
        boolean z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_sns_video_autoplay, 0) == 1;
        java.lang.String m17 = wo.w0.m();
        java.util.Locale locale = java.util.Locale.getDefault();
        kotlin.jvm.internal.o.f(locale, "getDefault(...)");
        java.lang.String lowerCase = m17.toLowerCase(locale);
        kotlin.jvm.internal.o.f(lowerCase, "toLowerCase(...)");
        java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_sns_video_autoplay_disable_device, "", true);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(Zi)) {
            if (Zi != null && r26.n0.B(Zi, lowerCase, false)) {
                z17 = false;
            }
        }
        return z17;
    }

    @Override // s24.g
    /* renamed from: x7 */
    public al5.c2 getF161961h() {
        return new n24.a(this);
    }

    @Override // s24.g
    /* renamed from: y7, reason: from getter */
    public boolean getF161973h() {
        return this.f161973h;
    }
}
