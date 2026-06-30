package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class ey extends fc2.d {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.fy f134306g;

    public ey(com.tencent.mm.plugin.finder.viewmodel.component.fy fyVar) {
        this.f134306g = fyVar;
    }

    @Override // fc2.d
    public boolean E0() {
        return false;
    }

    @Override // fc2.d
    public boolean F0(fc2.c dispatcher, fc2.a event) {
        kotlin.jvm.internal.o.g(dispatcher, "dispatcher");
        kotlin.jvm.internal.o.g(event, "event");
        return ((event instanceof ec2.f) && ((ec2.f) event).f250959d == 3) || ((event instanceof fc2.t) && ((fc2.t) event).f260985d == 6);
    }

    @Override // fc2.d
    public void G0(fc2.a ev6) {
        java.lang.Object obj;
        java.lang.Object obj2;
        kotlin.jvm.internal.o.g(ev6, "ev");
        boolean z17 = ev6 instanceof ec2.f;
        com.tencent.mm.plugin.finder.viewmodel.component.fy fyVar = this.f134306g;
        jz5.f0 f0Var = null;
        if (z17) {
            ec2.f fVar = (ec2.f) ev6;
            if (fVar.f250959d == 3) {
                androidx.recyclerview.widget.RecyclerView O6 = com.tencent.mm.plugin.finder.viewmodel.component.fy.O6(fyVar);
                androidx.recyclerview.widget.f2 adapter = O6 != null ? O6.getAdapter() : null;
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = adapter instanceof com.tencent.mm.view.recyclerview.WxRecyclerAdapter ? (com.tencent.mm.view.recyclerview.WxRecyclerAdapter) adapter : null;
                if (wxRecyclerAdapter != null) {
                    java.util.Iterator it = wxRecyclerAdapter.getData().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj2 = null;
                            break;
                        } else {
                            obj2 = it.next();
                            if (((in5.c) obj2).getItemId() == fVar.f250965j) {
                                break;
                            }
                        }
                    }
                    in5.c cVar = (in5.c) obj2;
                    so2.u1 u1Var = cVar instanceof so2.u1 ? (so2.u1) cVar : null;
                    if (u1Var != null) {
                        kd2.j0 j0Var = fyVar.f134444f;
                        long j17 = fVar.f250963h;
                        j0Var.getClass();
                        if (u1Var.h() == 4 && !hc2.o0.E(u1Var.getFeedObject().getFeedObject(), false, 1, null)) {
                            kd2.i0 i0Var = j0Var.f306763b;
                            if (i0Var != null) {
                                if (!(i0Var.f306756a.getItemId() == u1Var.getItemId())) {
                                    i0Var = null;
                                }
                                if (i0Var != null) {
                                    i0Var.f306757b = j17;
                                    if (!i0Var.f306758c && j17 > 1) {
                                        ((q04.y) ((xs.k1) i95.n0.c(xs.k1.class))).Di(j0Var.f306762a, 2, j0Var.b(j0Var.f306763b));
                                        i0Var.f306758c = true;
                                    }
                                    f0Var = jz5.f0.f302826a;
                                }
                            }
                            if (f0Var == null) {
                                j0Var.f306763b = new kd2.i0(u1Var, j17, false);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
        }
        if (ev6 instanceof fc2.t) {
            fc2.t tVar = (fc2.t) ev6;
            if (tVar.f260985d == 6) {
                androidx.recyclerview.widget.RecyclerView O62 = com.tencent.mm.plugin.finder.viewmodel.component.fy.O6(fyVar);
                androidx.recyclerview.widget.f2 adapter2 = O62 != null ? O62.getAdapter() : null;
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter2 = adapter2 instanceof com.tencent.mm.view.recyclerview.WxRecyclerAdapter ? (com.tencent.mm.view.recyclerview.WxRecyclerAdapter) adapter2 : null;
                if (wxRecyclerAdapter2 != null) {
                    java.util.Iterator it6 = wxRecyclerAdapter2.getData().iterator();
                    while (true) {
                        if (!it6.hasNext()) {
                            obj = null;
                            break;
                        } else {
                            obj = it6.next();
                            if (((in5.c) obj).getItemId() == tVar.f260992k) {
                                break;
                            }
                        }
                    }
                    com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = obj instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) obj : null;
                    if (baseFinderFeed != null) {
                        fyVar.f134442d = baseFinderFeed;
                        kd2.j0 j0Var2 = fyVar.f134444f;
                        j0Var2.getClass();
                        eo2.f fVar2 = eo2.f.f255565a;
                        ya2.b2 contact = baseFinderFeed.getContact();
                        eo2.d c17 = fVar2.c(contact != null ? contact.D0() : "");
                        boolean d17 = fVar2.d(c17 != null ? java.lang.Integer.valueOf(c17.f255561c) : null);
                        if (baseFinderFeed.h() == 4 && !hc2.o0.E(baseFinderFeed.getFeedObject().getFeedObject(), false, 1, null) && d17) {
                            return;
                        }
                        j0Var2.c();
                    }
                }
            }
        }
    }
}
