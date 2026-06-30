package com.tencent.mm.plugin.game.ui;

/* loaded from: classes4.dex */
public class m6 implements android.view.View.OnClickListener, com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f141476d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.game.model.b f141477e = null;

    /* renamed from: f, reason: collision with root package name */
    public android.content.DialogInterface.OnClickListener f141478f = null;

    /* renamed from: g, reason: collision with root package name */
    public int f141479g;

    public m6(android.content.Context context) {
        this.f141476d = context;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/ui/GameSubscriptionClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (!(view.getTag() instanceof com.tencent.mm.plugin.game.model.b)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GameSubscriptionClickListener", "No GameAppInfo");
            yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameSubscriptionClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        this.f141477e = (com.tencent.mm.plugin.game.model.b) view.getTag();
        com.tencent.mars.xlog.Log.i("MicroMsg.GameSubscriptionClickListener", "Clicked appid = " + this.f141477e.field_appId);
        gm0.j1.d().a(1219, this);
        java.lang.String d17 = com.tencent.mm.sdk.platformtools.m2.d();
        com.tencent.mm.plugin.game.model.b bVar = this.f141477e;
        gm0.j1.d().g(new com.tencent.mm.plugin.game.model.k3(bVar.field_appId, d17, bVar.f140210m2, bVar.f140218u2));
        yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameSubscriptionClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.plugin.game.ui.l6 l6Var;
        android.content.Context context = this.f141476d;
        if (i17 != 0 || i18 != 0 || m1Var.getType() != 1219) {
            com.tencent.mm.ui.widget.dialog.i0 i0Var = new com.tencent.mm.ui.widget.dialog.i0(context);
            i0Var.d(com.tencent.mm.R.string.fpl);
            i0Var.f(com.tencent.mm.R.string.fpk);
            i0Var.h();
            return;
        }
        gm0.j1.d().q(1219, this);
        com.tencent.mm.protobuf.f fVar = ((com.tencent.mm.plugin.game.model.k3) m1Var).f140354e.f70711b.f70700a;
        m53.k5 k5Var = fVar == null ? new m53.k5() : (m53.k5) fVar;
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(k5Var.f323850d);
        java.lang.String str2 = k5Var.f323851e;
        java.lang.String str3 = k5Var.f323852f;
        m53.s sVar = k5Var.f323853g;
        if (sVar != null) {
            l6Var = new com.tencent.mm.plugin.game.ui.l6();
            l6Var.f141459a = sVar.f324034d;
            l6Var.f141460b = sVar.f324035e;
            l6Var.f141461c = sVar.f324036f;
            l6Var.f141462d = sVar.f324037g;
        } else {
            l6Var = null;
        }
        this.f141477e.f140211n2 = valueOf.booleanValue();
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            return;
        }
        if (l6Var == null) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
                return;
            }
            com.tencent.mm.ui.widget.dialog.a aVar = new com.tencent.mm.ui.widget.dialog.a();
            aVar.f211709a = str2;
            aVar.f211729s = str3;
            aVar.A = false;
            aVar.f211732v = of5.b.a(context).getString(com.tencent.mm.R.string.fpk);
            aVar.E = this.f141478f;
            com.tencent.mm.ui.widget.dialog.j0 j0Var = new com.tencent.mm.ui.widget.dialog.j0(context, com.tencent.mm.R.style.f494791wd);
            j0Var.e(aVar);
            com.tencent.mm.ui.widget.dialog.d0 d0Var = aVar.f211723m;
            if (d0Var != null) {
                d0Var.a(j0Var.f211837r);
            }
            j0Var.show();
            return;
        }
        java.lang.String str4 = l6Var.f141462d;
        com.tencent.mm.ui.widget.dialog.a aVar2 = new com.tencent.mm.ui.widget.dialog.a();
        aVar2.f211709a = str2;
        aVar2.f211729s = l6Var.f141459a;
        aVar2.A = false;
        aVar2.f211732v = l6Var.f141460b;
        aVar2.E = new com.tencent.mm.plugin.game.ui.k6(this, str4);
        aVar2.Z = true;
        aVar2.f211733w = l6Var.f141461c;
        aVar2.F = this.f141478f;
        com.tencent.mm.ui.widget.dialog.j0 j0Var2 = new com.tencent.mm.ui.widget.dialog.j0(context, com.tencent.mm.R.style.f494791wd);
        j0Var2.e(aVar2);
        com.tencent.mm.ui.widget.dialog.d0 d0Var2 = aVar2.f211723m;
        if (d0Var2 != null) {
            d0Var2.a(j0Var2.f211837r);
        }
        j0Var2.show();
    }
}
