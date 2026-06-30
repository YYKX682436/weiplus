package com.tencent.mm.plugin.setting.ui.setting_new.settings.personal_info;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/setting/ui/setting_new/settings/personal_info/SettingActivityItemFinderRecentLike;", "Ls24/a;", "Landroidx/appcompat/app/AppCompatActivity;", com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME, "<init>", "(Landroidx/appcompat/app/AppCompatActivity;)V", "plugin-setting_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class SettingActivityItemFinderRecentLike extends s24.a {

    /* renamed from: p, reason: collision with root package name */
    public java.lang.Boolean f161979p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingActivityItemFinderRecentLike(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // s24.a
    public java.lang.String L7() {
        return ".ui.setting.SettingMessageRingtoneUI";
    }

    @Override // s24.a
    public java.lang.String M7() {
        return "setting";
    }

    @Override // a24.i
    public java.lang.String a7() {
        return "SettingGroup_Main_PersonalInfo_FinderRecentLike";
    }

    @Override // a24.i
    public a24.u b7() {
        return new a24.u(com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingGroupPersonalInfo.class, com.tencent.mm.plugin.setting.ui.setting_new.settings.personal_info.SettingActivityItemSignature.class);
    }

    @Override // s24.a, s24.f, a24.i
    public java.lang.Object clone() {
        return super.clone();
    }

    @Override // a24.i
    public int d7() {
        return com.tencent.mm.R.string.ir9;
    }

    @Override // a24.i
    public java.lang.Class e7() {
        return com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingGroupPersonalInfo.class;
    }

    @Override // a24.i
    /* renamed from: m7 */
    public int getF161972p() {
        return 2;
    }

    @Override // a24.i
    /* renamed from: q7 */
    public boolean getF161948p() {
        if (((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode()) {
            return false;
        }
        java.lang.Boolean bool = this.f161979p;
        if (bool != null) {
            return kotlin.jvm.internal.o.b(bool, java.lang.Boolean.TRUE);
        }
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        com.tencent.mm.plugin.finder.assist.s7.f102538a.d(new o24.f(this), null);
        return false;
    }

    @Override // s24.a, a24.i
    public void r7(android.content.Context context, android.view.View itemView, int i17) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(itemView, "itemView");
        t7(getActivity().getIntent());
        java.lang.String str = (java.lang.String) gm0.j1.u().c().l(4, null);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            str = "";
        }
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
        vd2.t3.f435921a.a(context, c01.z1.r(), str, 92);
    }
}
