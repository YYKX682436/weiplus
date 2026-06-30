package com.tencent.mm.plugin.setting.ui.setting_new.settings;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/setting/ui/setting_new/settings/SettingGroupAboutItem;", "Ls24/a;", "Landroidx/appcompat/app/AppCompatActivity;", com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME, "<init>", "(Landroidx/appcompat/app/AppCompatActivity;)V", "plugin-setting_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class SettingGroupAboutItem extends s24.a {

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f161868p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f161869q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.Integer f161870r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.Integer f161871s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.Integer f161872t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingGroupAboutItem(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f161868p = "about";
        ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
        boolean m17 = com.tencent.mm.sdk.platformtools.t8.m1(java.lang.Boolean.valueOf(bk0.a.g().e(262145, 266243)), false);
        ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
        boolean b17 = bk0.a.g().b(262157, 266262);
        ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
        boolean b18 = bk0.a.g().b(262164, 266269);
        ((ua0.o) ((va0.m) i95.n0.c(va0.m.class))).getClass();
        com.tencent.mm.plugin.newtips.model.i.a(this);
        if (!m17) {
            rn3.i.Di().k(this);
        }
        if (o0(m17 || b17 || b18)) {
            return;
        }
        if (b17 || ((tn4.o) ((un4.e) i95.n0.c(un4.e.class))).mj() || b18) {
            e5(com.tencent.mm.plugin.newtips.model.r.MMNEWTIPS_SHOWTYPE_REDPOINT, true);
            this.f161872t = java.lang.Integer.valueOf(com.tencent.mm.R.drawable.b8i);
        } else {
            this.f161872t = null;
        }
        if (m17) {
            this.f161870r = java.lang.Integer.valueOf(com.tencent.mm.R.string.f490501wv);
            this.f161871s = java.lang.Integer.valueOf(com.tencent.mm.R.drawable.asx);
            e5(com.tencent.mm.plugin.newtips.model.r.MMNEWTIPS_SHOWTYPE_NEW, true);
        }
    }

    @Override // s24.f
    /* renamed from: A7, reason: from getter */
    public java.lang.String getF161868p() {
        return this.f161868p;
    }

    @Override // s24.f
    /* renamed from: B7, reason: from getter */
    public android.view.View getF161869q() {
        return this.f161869q;
    }

    @Override // s24.f
    /* renamed from: D7, reason: from getter */
    public java.lang.Integer getF161872t() {
        return this.f161872t;
    }

    @Override // s24.f
    /* renamed from: E7, reason: from getter */
    public java.lang.Integer getF161870r() {
        return this.f161870r;
    }

    @Override // s24.f
    /* renamed from: F7, reason: from getter */
    public java.lang.Integer getF161871s() {
        return this.f161871s;
    }

    @Override // s24.f
    public void H7(android.view.View view) {
        this.f161869q = view;
    }

    @Override // s24.f
    public void I7(java.lang.Integer num) {
        this.f161872t = num;
    }

    @Override // s24.f
    public void J7(java.lang.Integer num) {
        this.f161870r = num;
    }

    @Override // s24.f
    public void K7(java.lang.Integer num) {
        this.f161871s = num;
    }

    @Override // s24.a
    public java.lang.String L7() {
        return ".ui.setting.SettingsAboutMicroMsgUI";
    }

    @Override // s24.a
    public java.lang.String M7() {
        return "setting";
    }

    @Override // a24.i
    public java.lang.String a7() {
        return "SettingGroup_Main_About";
    }

    @Override // a24.i
    public a24.u b7() {
        return new a24.u(com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingGroupMain.class, com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingGroupHelpItem.class);
    }

    @Override // s24.a, s24.f, a24.i
    public java.lang.Object clone() {
        return super.clone();
    }

    @Override // a24.i
    public int d7() {
        return com.tencent.mm.R.string.iox;
    }

    @Override // a24.i
    public java.lang.Class e7() {
        return com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingGroupMain.class;
    }

    @Override // a24.i
    /* renamed from: m7 */
    public int getF161972p() {
        return 1;
    }

    @Override // a24.i
    /* renamed from: n7 */
    public java.lang.String getF161965p() {
        return getContext().getString(com.tencent.mm.R.string.p_l, com.tencent.mm.sdk.platformtools.a0.a(getContext(), o45.wf.f343029g));
    }

    @Override // s24.a, a24.i
    public void r7(android.content.Context context, android.view.View itemView, int i17) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(itemView, "itemView");
        ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
        bk0.a.g().h(262145, 266243);
        ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
        bk0.a.g().h(262157, 266262);
        ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
        bk0.a.g().h(262164, 266269);
        rn3.i.Di().a(38);
        ((tn4.o) ((un4.e) i95.n0.c(un4.e.class))).aj();
        this.f161872t = null;
        this.f161871s = null;
        this.f161870r = null;
        w7();
        super.r7(context, itemView, i17);
    }

    @Override // s24.f, com.tencent.mm.plugin.newtips.model.a
    public boolean y(boolean z17) {
        super.y(z17);
        w7();
        return true;
    }
}
