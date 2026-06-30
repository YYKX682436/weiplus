package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes8.dex */
public final class a2 extends fc2.d {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.f2 f133707g;

    public a2(com.tencent.mm.plugin.finder.viewmodel.component.f2 f2Var) {
        this.f133707g = f2Var;
    }

    @Override // fc2.d
    public boolean E0() {
        return false;
    }

    @Override // fc2.d
    public boolean F0(fc2.c dispatcher, fc2.a event) {
        kotlin.jvm.internal.o.g(dispatcher, "dispatcher");
        kotlin.jvm.internal.o.g(event, "event");
        return (event instanceof ec2.f) && ((ec2.f) event).f250959d == 3;
    }

    @Override // fc2.d
    public void G0(fc2.a ev6) {
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(ev6, "ev");
        if (ev6 instanceof ec2.f) {
            ec2.f fVar = (ec2.f) ev6;
            if (fVar.f250959d == 3) {
                com.tencent.mm.plugin.finder.viewmodel.component.f2 f2Var = this.f133707g;
                androidx.recyclerview.widget.RecyclerView R6 = f2Var.R6();
                androidx.recyclerview.widget.f2 adapter = R6 != null ? R6.getAdapter() : null;
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = adapter instanceof com.tencent.mm.view.recyclerview.WxRecyclerAdapter ? (com.tencent.mm.view.recyclerview.WxRecyclerAdapter) adapter : null;
                if (wxRecyclerAdapter != null) {
                    java.util.Iterator it = wxRecyclerAdapter.getData().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        } else {
                            obj = it.next();
                            if (((so2.j5) obj).getItemId() == fVar.f250965j) {
                                break;
                            }
                        }
                    }
                    so2.j5 j5Var = (so2.j5) obj;
                    so2.u1 u1Var = j5Var instanceof so2.u1 ? (so2.u1) j5Var : null;
                    if (u1Var == null || !u1Var.getFeedObject().isLongVideo()) {
                        return;
                    }
                    int intValue = ((java.lang.Number) ((jz5.n) f2Var.f134318f).getValue()).intValue();
                    int i17 = fVar.f250964i;
                    jz5.g gVar = f2Var.f134319g;
                    int intValue2 = i17 - ((java.lang.Number) ((jz5.n) gVar).getValue()).intValue();
                    int i18 = fVar.f250963h;
                    if (intValue <= i18 && i18 <= intValue2) {
                        u1Var.f410631e = false;
                        pm0.v.X(new com.tencent.mm.plugin.finder.viewmodel.component.y1(f2Var));
                    }
                    if (fVar.f250963h < fVar.f250964i - ((java.lang.Number) ((jz5.n) gVar).getValue()).intValue() || u1Var.f410631e) {
                        return;
                    }
                    com.tencent.mars.xlog.Log.i("FinderAddHistoryUIC", "onEventHappen: delete from history, offset = " + fVar.f250963h + ", total = " + fVar.f250964i + ", feedId = " + fVar.f250965j);
                    u1Var.f410631e = true;
                    pm0.v.X(new com.tencent.mm.plugin.finder.viewmodel.component.z1(f2Var, ev6));
                }
            }
        }
    }
}
