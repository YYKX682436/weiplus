package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class yy implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.az f115242d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cm2.x f115243e;

    public yy(com.tencent.mm.plugin.finder.live.plugin.az azVar, cm2.x xVar) {
        this.f115242d = azVar;
        this.f115243e = xVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        xu2.u uVar;
        xu2.v vVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveMpArticleBubble$refreshView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.plugin.az azVar = this.f115242d;
        java.lang.String str = azVar.f111951i;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("click to mp article,url:");
        cm2.x xVar = this.f115243e;
        sb6.append(xVar.f43407v.getString(3));
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        yz5.l lVar = azVar.f111949g;
        if (lVar != null) {
            lVar.invoke(xVar);
        }
        bf2.c cVar = bf2.c.f19598a;
        gk2.e eVar = azVar.f111947e;
        java.lang.String string = xVar.f43407v.getString(3);
        if (string == null) {
            string = "";
        }
        bf2.c.c(cVar, eVar, 5, 2, string, 0, null, 0, 0, null, 0, 1008, null);
        if (((mm2.c1) azVar.f111947e.a(mm2.c1.class)).M7()) {
            qo0.c cVar2 = azVar.f111948f;
            com.tencent.mm.plugin.finder.live.view.k0 k0Var = cVar2 instanceof com.tencent.mm.plugin.finder.live.view.k0 ? (com.tencent.mm.plugin.finder.live.view.k0) cVar2 : null;
            if (k0Var != null && (uVar = (xu2.u) k0Var.getPlugin(xu2.u.class)) != null && (vVar = uVar.f457232r) != null) {
                vVar.b();
            }
        }
        kotlinx.coroutines.r2 r2Var = azVar.f111954o;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        com.tencent.mm.ui.widget.dialog.u3 u3Var = azVar.f111953n;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        if (xVar.f43388g) {
            azVar.f111954o = kotlinx.coroutines.l.d(kotlinx.coroutines.i2.f310477d, null, null, new com.tencent.mm.plugin.finder.live.plugin.vy(azVar, null), 3, null);
            mm2.e1 e1Var = (mm2.e1) azVar.f111947e.a(mm2.e1.class);
            new ke2.v(e1Var.f328983m, e1Var.f328988r.getLong(0), 2, xy2.c.e(azVar.f111946d), ((mm2.e1) azVar.f111947e.a(mm2.e1.class)).f328985o, xVar.f43387f, new com.tencent.mm.protobuf.g(xVar.f43407v.toByteArray()), null, null, null, 512, null).l().K(new com.tencent.mm.plugin.finder.live.plugin.xy(azVar, xVar));
        } else {
            java.lang.String string2 = xVar.f43407v.getString(3);
            if (string2 != null) {
                com.tencent.mm.plugin.finder.live.plugin.az.a(azVar, string2);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveMpArticleBubble$refreshView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
