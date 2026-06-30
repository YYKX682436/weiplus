package com.tencent.mm.plugin.setting.ui.setting_new.settings;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/setting/ui/setting_new/settings/SettingButtonSwitchAccount;", "Ls24/d;", "Landroidx/appcompat/app/AppCompatActivity;", com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME, "<init>", "(Landroidx/appcompat/app/AppCompatActivity;)V", "plugin-setting_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class SettingButtonSwitchAccount extends s24.d {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingButtonSwitchAccount(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // a24.i
    public java.lang.Integer Y6() {
        return 0;
    }

    @Override // a24.i
    public java.lang.String a7() {
        return "SettingGroup_Main_SwitchAccount";
    }

    @Override // a24.i
    public a24.u b7() {
        return new a24.u(com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingGroupMain.class, com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingGroupAboutItem.class);
    }

    @Override // s24.d, a24.i
    public java.lang.Object clone() {
        return super.clone();
    }

    @Override // a24.i
    public int d7() {
        return com.tencent.mm.R.string.iyv;
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
    public void r7(android.content.Context context, android.view.View itemView, int i17) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(itemView, "itemView");
        t7(getActivity().getIntent());
        c01.uc ucVar = c01.uc.f37514c;
        if (((java.util.HashSet) ucVar.d()).size() > 1) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14978, 1, 6, ucVar.f(), ucVar.e(), wo.w0.k());
        } else {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14978, 0, 6, ucVar.f(), ucVar.e(), wo.w0.k());
        }
        java.lang.String str = (java.lang.String) gm0.j1.u().c().l(6, null);
        java.lang.String r17 = c01.z1.r();
        if ((r17 != null ? r26.i0.y(r17, "wxid", false) : false) && com.tencent.mm.sdk.platformtools.t8.K0(c01.z1.c()) && com.tencent.mm.sdk.platformtools.t8.K0(str) && !c01.z1.x() && ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("EnableModAlias", 0) != 0) {
            com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(context);
            u1Var.g(context.getString(com.tencent.mm.R.string.f493045is3));
            u1Var.n(context.getString(com.tencent.mm.R.string.f493044is2));
            u1Var.l(new u24.b(context));
            u1Var.a(true);
            u1Var.q(false);
            return;
        }
        if (((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("EnableModAlias", 0) != 0 && c01.z1.t() && com.tencent.mm.sdk.platformtools.t8.K0(c01.z1.c()) && com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            db5.e1.C(context, context.getString(com.tencent.mm.R.string.giw), null, context.getString(com.tencent.mm.R.string.bln), context.getString(com.tencent.mm.R.string.f490347sg), true, new u24.a(context), null);
            return;
        }
        com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
        com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_SETTING_SWITCH_ACCOUNT_FIRST_CLICK_BOOLEAN_SYNC;
        if (!c17.o(u3Var, true)) {
            u24.c.f424118a.a(context);
        } else {
            gm0.j1.u().c().x(u3Var, java.lang.Boolean.FALSE);
            db5.e1.E(context, context.getString(com.tencent.mm.R.string.iyx), context.getString(com.tencent.mm.R.string.iyy), context.getString(com.tencent.mm.R.string.f490455vj), false, new d24.s0(context));
        }
    }
}
