package com.tencent.mm.plugin.setting.ui.setting_new.settings.acount_info.more_safe;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/setting/ui/setting_new/settings/acount_info/more_safe/SettingGroupQQAccount;", "Ls24/f;", "Landroidx/appcompat/app/AppCompatActivity;", com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME, "<init>", "(Landroidx/appcompat/app/AppCompatActivity;)V", "plugin-setting_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class SettingGroupQQAccount extends s24.f {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingGroupQQAccount(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // a24.i
    public java.lang.String a7() {
        return "SettingGroup_Main_AccountInfo_MoreSafe_QQAccount";
    }

    @Override // a24.i
    public a24.u b7() {
        return new a24.u(com.tencent.mm.plugin.setting.ui.setting_new.settings.acount_info.SettingGroupMoreSafe.class, null);
    }

    @Override // s24.f, a24.i
    public java.lang.Object clone() {
        return super.clone();
    }

    @Override // a24.i
    public int d7() {
        return com.tencent.mm.R.string.f493826p84;
    }

    @Override // a24.i
    public java.lang.Class e7() {
        return com.tencent.mm.plugin.setting.ui.setting_new.settings.acount_info.SettingGroupMoreSafe.class;
    }

    @Override // a24.i
    /* renamed from: m7 */
    public int getF161972p() {
        return 3;
    }

    @Override // a24.i
    /* renamed from: n7 */
    public java.lang.String getF161965p() {
        java.lang.Object l17 = gm0.j1.u().c().l(9, 0);
        kotlin.jvm.internal.o.e(l17, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((java.lang.Integer) l17).intValue();
        if (intValue == 0) {
            return getString(com.tencent.mm.R.string.ipy);
        }
        return "" + new kk.v(intValue);
    }

    @Override // a24.i
    /* renamed from: q7 */
    public boolean getF161948p() {
        return !com.tencent.mm.sdk.platformtools.f9.MeSetSecurityQQ.h();
    }

    @Override // a24.i
    public void r7(android.content.Context context, android.view.View itemView, int i17) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(itemView, "itemView");
        t7(getActivity().getIntent());
        if (com.tencent.mm.sdk.platformtools.f9.MeSetSecurityQQ.k(context, null)) {
            ((com.tencent.mm.app.y7) f14.g.b()).i(new android.content.Intent(), context);
        }
    }
}
