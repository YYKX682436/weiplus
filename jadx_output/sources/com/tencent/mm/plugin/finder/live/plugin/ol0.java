package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class ol0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.pl0 f113765d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cm2.z f113766e;

    public ol0(com.tencent.mm.plugin.finder.live.plugin.pl0 pl0Var, cm2.z zVar) {
        this.f113765d = pl0Var;
        this.f113766e = zVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        xu2.u uVar;
        xu2.v vVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveWecomBubble$refreshView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.plugin.pl0 pl0Var = this.f113765d;
        yz5.l lVar = pl0Var.f113910g;
        cm2.z zVar = this.f113766e;
        if (lVar != null) {
            lVar.invoke(zVar);
        }
        gm0.j1.d().a(vb1.e.CTRL_INDEX, pl0Var);
        java.lang.String string = zVar.f43409v.getString(3);
        com.tencent.mars.xlog.Log.i(pl0Var.f113912i, "click to see wecom : " + string);
        if (zl2.q4.f473933a.E()) {
            android.view.ViewGroup viewGroup = pl0Var.f113913m;
            if (viewGroup == null) {
                kotlin.jvm.internal.o.o("root");
                throw null;
            }
            db5.t7.makeText(viewGroup.getContext(), "contactid:" + string, 0).show();
        }
        com.tencent.mars.xlog.Log.i(pl0Var.f113912i, "wecomBubble clicke joinLiveTraceBuff = " + ((mm2.c1) pl0Var.f113908e.a(mm2.c1.class)).C1);
        com.tencent.mm.modelbase.r1 d17 = gm0.j1.d();
        ab0.b0 b0Var = (ab0.b0) i95.n0.c(ab0.b0.class);
        r45.g05 g05Var = new r45.g05();
        g05Var.f374785e = ((mm2.c1) pl0Var.f113908e.a(mm2.c1.class)).f328852o;
        g05Var.f374784d = 2;
        gk2.e eVar = pl0Var.f113908e;
        g05Var.f374786f = ((mm2.c1) eVar.a(mm2.c1.class)).C1;
        r45.ly1 ly1Var = new r45.ly1();
        ly1Var.set(0, ((mm2.c1) eVar.a(mm2.c1.class)).C1);
        ly1Var.set(1, zVar.f43398t);
        byte[] encode = android.util.Base64.encode(ly1Var.toByteArray(), 2);
        kotlin.jvm.internal.o.f(encode, "encode(...)");
        g05Var.f374787g = new java.lang.String(encode, r26.c.f368865a);
        ((za0.k) b0Var).getClass();
        d17.g(new l41.e0(string, true, g05Var));
        android.content.Context context = pl0Var.f113907d;
        pl0Var.f113914n = com.tencent.mm.ui.widget.dialog.u3.f(context, context.getString(com.tencent.mm.R.string.ggd), true, 3, null);
        bf2.c cVar = bf2.c.f19598a;
        gk2.e eVar2 = pl0Var.f113908e;
        java.lang.String string2 = zVar.f43409v.getString(3);
        if (string2 == null) {
            string2 = "";
        }
        bf2.c.c(cVar, eVar2, 5, 3, string2, 0, null, 0, 0, null, 0, 1008, null);
        if (((mm2.c1) pl0Var.f113908e.a(mm2.c1.class)).M7()) {
            qo0.c cVar2 = pl0Var.f113909f;
            com.tencent.mm.plugin.finder.live.view.k0 k0Var = cVar2 instanceof com.tencent.mm.plugin.finder.live.view.k0 ? (com.tencent.mm.plugin.finder.live.view.k0) cVar2 : null;
            if (k0Var != null && (uVar = (xu2.u) k0Var.getPlugin(xu2.u.class)) != null && (vVar = uVar.f457232r) != null) {
                vVar.b();
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveWecomBubble$refreshView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
