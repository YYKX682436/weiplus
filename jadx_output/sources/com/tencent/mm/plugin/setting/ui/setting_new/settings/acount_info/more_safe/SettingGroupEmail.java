package com.tencent.mm.plugin.setting.ui.setting_new.settings.acount_info.more_safe;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/setting/ui/setting_new/settings/acount_info/more_safe/SettingGroupEmail;", "Ls24/f;", "Landroidx/appcompat/app/AppCompatActivity;", com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME, "<init>", "(Landroidx/appcompat/app/AppCompatActivity;)V", "plugin-setting_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class SettingGroupEmail extends s24.f {

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f161897p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f161898q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.Integer f161899r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.Integer f161900s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.Integer f161901t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingGroupEmail(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f161897p = "sec_bind_email";
        rn3.i.Di().k(this);
    }

    @Override // s24.f
    /* renamed from: A7, reason: from getter */
    public java.lang.String getF161897p() {
        return this.f161897p;
    }

    @Override // s24.f
    /* renamed from: B7, reason: from getter */
    public android.view.View getF161898q() {
        return this.f161898q;
    }

    @Override // s24.f
    /* renamed from: D7, reason: from getter */
    public java.lang.Integer getF161901t() {
        return this.f161901t;
    }

    @Override // s24.f
    /* renamed from: E7, reason: from getter */
    public java.lang.Integer getF161899r() {
        return this.f161899r;
    }

    @Override // s24.f
    /* renamed from: F7, reason: from getter */
    public java.lang.Integer getF161900s() {
        return this.f161900s;
    }

    @Override // s24.f
    public void H7(android.view.View view) {
        this.f161898q = view;
    }

    @Override // s24.f
    public void I7(java.lang.Integer num) {
        this.f161901t = num;
    }

    @Override // s24.f
    public void J7(java.lang.Integer num) {
        this.f161899r = num;
    }

    @Override // s24.f
    public void K7(java.lang.Integer num) {
        this.f161900s = num;
    }

    @Override // a24.i
    public java.lang.String a7() {
        return "SettingGroup_Main_AccountInfo_MoreSafe_Email";
    }

    @Override // a24.i
    public a24.u b7() {
        return new a24.u(com.tencent.mm.plugin.setting.ui.setting_new.settings.acount_info.SettingGroupMoreSafe.class, com.tencent.mm.plugin.setting.ui.setting_new.settings.acount_info.more_safe.SettingGroupQQAccount.class);
    }

    @Override // s24.f, a24.i
    public java.lang.Object clone() {
        return super.clone();
    }

    @Override // a24.i
    public int d7() {
        return com.tencent.mm.R.string.f493827p85;
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
        java.lang.String str = (java.lang.String) gm0.j1.u().c().l(5, null);
        java.lang.Integer num = (java.lang.Integer) gm0.j1.u().c().l(7, null);
        if (num == null || (num.intValue() & 2) == 0 || com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return com.tencent.mm.sdk.platformtools.t8.K0(str) ? getString(com.tencent.mm.R.string.inp) : getString(com.tencent.mm.R.string.iqj);
        }
        w14.a aVar = w14.a.f442225a;
        if (str == null) {
            str = "";
        }
        return aVar.a(str);
    }

    @Override // a24.i
    public void r7(android.content.Context context, android.view.View itemView, int i17) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(itemView, "itemView");
        t7(getActivity().getIntent());
        this.f161901t = null;
        this.f161900s = null;
        this.f161899r = null;
        ((vd0.o3) ((wd0.z1) i95.n0.c(wd0.z1.class))).cj(context);
        com.tencent.mm.plugin.newtips.model.p Di = rn3.i.Di();
        if (Di != null) {
            Di.a(53);
        }
    }

    @Override // s24.f, com.tencent.mm.plugin.newtips.model.a
    public boolean y(boolean z17) {
        super.y(z17);
        w7();
        return true;
    }
}
