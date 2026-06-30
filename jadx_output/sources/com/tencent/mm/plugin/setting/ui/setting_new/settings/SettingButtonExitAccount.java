package com.tencent.mm.plugin.setting.ui.setting_new.settings;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/setting/ui/setting_new/settings/SettingButtonExitAccount;", "Ls24/d;", "Landroidx/appcompat/app/AppCompatActivity;", com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME, "<init>", "(Landroidx/appcompat/app/AppCompatActivity;)V", "plugin-setting_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class SettingButtonExitAccount extends s24.d {

    /* renamed from: g, reason: collision with root package name */
    public android.view.ViewGroup f161842g;

    /* renamed from: h, reason: collision with root package name */
    public final int f161843h;

    /* renamed from: i, reason: collision with root package name */
    public final int f161844i;

    /* renamed from: m, reason: collision with root package name */
    public final int f161845m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.b4 f161846n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f161847o;

    /* renamed from: p, reason: collision with root package name */
    public android.app.ProgressDialog f161848p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f161849q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.b4 f161850r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingButtonExitAccount(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f161843h = 5;
        this.f161844i = 6;
        this.f161845m = 7;
    }

    @Override // a24.i
    public java.lang.Integer Y6() {
        return 0;
    }

    @Override // a24.i
    public java.lang.String a7() {
        return "SettingGroup_Main_ExitAccount";
    }

    @Override // a24.i
    public a24.u b7() {
        return new a24.u(com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingGroupMain.class, com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingButtonLogoutAccount.class);
    }

    @Override // s24.d, a24.i
    public java.lang.Object clone() {
        return super.clone();
    }

    @Override // a24.i
    public int d7() {
        return com.tencent.mm.R.string.gis;
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
    /* renamed from: q7 */
    public boolean getF161948p() {
        js.r0 r0Var = (js.r0) i95.n0.c(js.r0.class);
        java.lang.String r17 = c01.z1.r();
        kotlin.jvm.internal.o.f(r17, "getUsernameFromUserInfo(...)");
        if (!((is.f) r0Var).bj(r17)) {
            js.r0 r0Var2 = (js.r0) i95.n0.c(js.r0.class);
            java.lang.String r18 = c01.z1.r();
            kotlin.jvm.internal.o.f(r18, "getUsernameFromUserInfo(...)");
            if (!((is.f) r0Var2).Zi(r18)) {
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
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.enk, (android.view.ViewGroup) null);
        kotlin.jvm.internal.o.e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) inflate;
        this.f161842g = viewGroup;
        android.view.View findViewById = viewGroup.findViewById(com.tencent.mm.R.id.f486873mq3);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        ((android.widget.CheckBox) findViewById).setChecked(true);
        com.tencent.mm.ui.widget.dialog.z2 z2Var = new com.tencent.mm.ui.widget.dialog.z2(context, 1, 0, true);
        z2Var.m(context.getResources().getString(com.tencent.mm.R.string.f490347sg), context.getResources().getString(com.tencent.mm.R.string.gis));
        z2Var.o(2);
        z2Var.v(context.getResources().getColor(com.tencent.mm.R.color.a0c));
        d24.l lVar = new d24.l(this, z2Var);
        d24.m mVar = new d24.m(this, z2Var);
        z2Var.D = lVar;
        z2Var.E = mVar;
        z2Var.j(this.f161842g);
        z2Var.C();
    }

    public final void x7(boolean z17) {
        com.tencent.mm.sdk.platformtools.c3.b("welcome_page_show");
        if (z17) {
            ((com.tencent.mm.booter.notification.x) ((mo3.g) ((oo3.j) i95.n0.c(oo3.j.class))).f330407d).i();
        } else {
            ((com.tencent.mm.booter.notification.x) ((mo3.g) ((oo3.j) i95.n0.c(oo3.j.class))).f330407d).getClass();
            com.tencent.mm.booter.notification.l0.f63501a.c(-1, null);
        }
        com.tencent.mm.autogen.events.BackupProcessMgrExitEvent backupProcessMgrExitEvent = new com.tencent.mm.autogen.events.BackupProcessMgrExitEvent();
        backupProcessMgrExitEvent.f53993g.f6990a = false;
        backupProcessMgrExitEvent.e();
        ((com.tencent.mm.app.o7) f14.g.a()).getClass();
        com.tencent.mm.ui.vb.e();
        ((com.tencent.mm.booter.notification.x) ((mo3.g) ((oo3.j) i95.n0.c(oo3.j.class))).f330407d).g();
        getActivity().finish();
        if (k35.p.f303943a != null) {
            com.tencent.mm.ui.vb.d(getContext(), z17, 2);
        }
    }

    public final void y7() {
        if (c01.z1.x()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BaseSettingItem", "setPwdOrexit: skip QueryHasPasswd for ex-device, exit directly");
            x7(true);
            return;
        }
        com.tencent.mm.modelbase.r1 d17 = gm0.j1.d();
        d24.i iVar = new d24.i(this);
        this.f161849q = iVar;
        d17.a(255, iVar);
        com.tencent.mm.modelsimple.w0 w0Var = new com.tencent.mm.modelsimple.w0(2);
        w0Var.f71444f = 1;
        gm0.j1.d().g(w0Var);
        com.tencent.mm.sdk.platformtools.b4 b4Var = new com.tencent.mm.sdk.platformtools.b4(android.os.Looper.getMainLooper(), (com.tencent.mm.sdk.platformtools.a4) new d24.j(w0Var, this), false);
        this.f161850r = b4Var;
        b4Var.c(3000L, 3000L);
        this.f161848p = db5.e1.Q(getContext(), getString(com.tencent.mm.R.string.f490573yv), getString(com.tencent.mm.R.string.lbd), true, false, new d24.k(w0Var, this));
    }
}
