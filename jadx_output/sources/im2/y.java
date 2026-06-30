package im2;

/* loaded from: classes3.dex */
public final class y implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ im2.z3 f292614d;

    public y(im2.z3 z3Var) {
        this.f292614d = z3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.Integer num;
        java.lang.Object obj;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/viewmodel/component/FinderLiveNoticeUIC$bindItemsRow$2$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        im2.z3 z3Var = this.f292614d;
        z3Var.getClass();
        i95.m c17 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        ml2.y2 y2Var = ml2.y2.f328267w;
        cl0.g gVar = new cl0.g();
        ml2.x2[] x2VarArr = ml2.x2.f328221d;
        gVar.o("type", 8);
        zy2.zb.qg(zbVar, y2Var, gVar.toString(), null, null, 12, null);
        if (z3Var.E1.size() == 1) {
            z3Var.n7((r45.d32) kz5.n0.z0(z3Var.E1));
        } else {
            im2.s sVar = z3Var.f292672z1;
            if (sVar != null) {
                if (sVar instanceof im2.r) {
                    num = 1;
                } else {
                    if (!(sVar instanceof im2.u)) {
                        throw new jz5.j();
                    }
                    num = 2;
                }
                java.util.Iterator it = z3Var.E1.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (num != null && ((r45.d32) obj).f372032d == num.intValue()) {
                            break;
                        }
                    }
                }
                r45.d32 d32Var = (r45.d32) obj;
                com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) z3Var.getContext(), 1, true);
                k0Var.f211872n = new im2.p2(d32Var, z3Var, 1, 0);
                k0Var.f211881s = new im2.q2(0, d32Var, 1, z3Var);
                k0Var.v();
            } else {
                i95.m c18 = i95.n0.c(ml2.j0.class);
                kotlin.jvm.internal.o.f(c18, "getService(...)");
                zy2.zb zbVar2 = (zy2.zb) c18;
                cl0.g gVar2 = new cl0.g();
                gVar2.o("type", 9);
                zy2.zb.qg(zbVar2, y2Var, gVar2.toString(), null, null, 12, null);
                com.tencent.mm.ui.widget.dialog.k0 k0Var2 = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) z3Var.getContext(), 1, true);
                k0Var2.f211872n = new im2.r2(z3Var);
                k0Var2.f211881s = new im2.s2(z3Var);
                k0Var2.v();
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/viewmodel/component/FinderLiveNoticeUIC$bindItemsRow$2$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
