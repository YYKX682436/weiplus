package com.tencent.mm.plugin.teenmode.ui;

/* loaded from: classes.dex */
public class k3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeIntro f173050d;

    public k3(com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeIntro settingsTeenModeIntro) {
        this.f173050d = settingsTeenModeIntro;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeIntro$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yz5.l lVar = new yz5.l() { // from class: com.tencent.mm.plugin.teenmode.ui.k3$$a
            @Override // yz5.l
            public final java.lang.Object invoke(java.lang.Object obj) {
                com.tencent.mm.plugin.teenmode.ui.k3 k3Var = com.tencent.mm.plugin.teenmode.ui.k3.this;
                k3Var.getClass();
                if (((java.lang.Boolean) obj).booleanValue()) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(20917, 5, 1, 1, "", "", "", "");
                    ku5.u0 u0Var = ku5.t0.f312615d;
                    com.tencent.mm.plugin.teenmode.ui.l3 l3Var = new com.tencent.mm.plugin.teenmode.ui.l3(k3Var);
                    ku5.t0 t0Var = (ku5.t0) u0Var;
                    t0Var.getClass();
                    t0Var.t(l3Var, 200L, null);
                }
                return jz5.f0.f302826a;
            }
        };
        com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeIntro context = this.f173050d;
        kotlin.jvm.internal.o.g(context, "context");
        kotlinx.coroutines.l.d(v65.m.b(context), null, null, new xh4.u(context, lVar, null), 3, null);
        yj0.a.h(this, "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeIntro$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
