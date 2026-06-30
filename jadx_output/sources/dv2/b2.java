package dv2;

/* loaded from: classes2.dex */
public final class b2 extends fc2.d {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ dv2.e2 f243818g;

    public b2(dv2.e2 e2Var) {
        this.f243818g = e2Var;
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object] */
    @Override // fc2.d
    public void G0(fc2.a ev6) {
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed2;
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(ev6, "ev");
        boolean z17 = ev6 instanceof ec2.f;
        boolean z18 = true;
        dv2.e2 e2Var = this.f243818g;
        if (z17) {
            ec2.f fVar = (ec2.f) ev6;
            if (fVar.f250959d == 3) {
                androidx.recyclerview.widget.RecyclerView O6 = dv2.e2.O6(e2Var);
                androidx.recyclerview.widget.f2 adapter = O6 != null ? O6.getAdapter() : null;
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = adapter instanceof com.tencent.mm.view.recyclerview.WxRecyclerAdapter ? (com.tencent.mm.view.recyclerview.WxRecyclerAdapter) adapter : null;
                if (wxRecyclerAdapter != null) {
                    java.util.Iterator it = wxRecyclerAdapter.getData().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        } else {
                            obj = it.next();
                            if (((in5.c) obj).getItemId() == fVar.f250965j) {
                                break;
                            }
                        }
                    }
                    in5.c cVar = (in5.c) obj;
                    so2.u1 u1Var = cVar instanceof so2.u1 ? (so2.u1) cVar : null;
                    if (u1Var != null) {
                        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed3 = e2Var.f243847g;
                        baseFinderFeed2 = baseFinderFeed3 != null && (baseFinderFeed3.getItemId() > ((so2.u1) cVar).getItemId() ? 1 : (baseFinderFeed3.getItemId() == ((so2.u1) cVar).getItemId() ? 0 : -1)) == 0 ? u1Var : null;
                        if (baseFinderFeed2 != null) {
                            dv2.y1 y1Var = new dv2.y1(baseFinderFeed2.getItemId(), fVar.f250963h, ((java.lang.Number) ((jz5.n) e2Var.f243845e).getValue()).intValue(), ((java.lang.Number) ((jz5.n) e2Var.f243846f).getValue()).intValue(), 0L, 16, null);
                            if (((java.lang.Boolean) ((jz5.n) e2Var.f243844d).getValue()).booleanValue()) {
                                int i17 = dv2.e2.f243842i;
                                int i18 = y1Var.f243979c;
                                int i19 = y1Var.f243980d;
                                if ((i18 != 25 || (i19 != 1 && i19 != 2 && i19 != 3 && i19 != 11)) && (i18 != 38 || i19 != 3)) {
                                    z18 = false;
                                }
                                if (z18) {
                                    java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = dv2.e2.f243843m;
                                    copyOnWriteArrayList.removeIf(new dv2.d2(y1Var));
                                    com.tencent.mars.xlog.Log.i("FinderWatchHistoryUIC", "saveOrUpdateWatchItem: " + y1Var + " size: " + copyOnWriteArrayList.size());
                                    copyOnWriteArrayList.add(y1Var);
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
                return;
            }
        }
        if (ev6 instanceof fc2.t) {
            fc2.t tVar = (fc2.t) ev6;
            if (tVar.f260985d == 6) {
                androidx.recyclerview.widget.RecyclerView O62 = dv2.e2.O6(e2Var);
                androidx.recyclerview.widget.f2 adapter2 = O62 != null ? O62.getAdapter() : null;
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter2 = adapter2 instanceof com.tencent.mm.view.recyclerview.WxRecyclerAdapter ? (com.tencent.mm.view.recyclerview.WxRecyclerAdapter) adapter2 : null;
                if (wxRecyclerAdapter2 != null) {
                    java.util.Iterator it6 = wxRecyclerAdapter2.getData().iterator();
                    while (true) {
                        if (!it6.hasNext()) {
                            baseFinderFeed = 0;
                            break;
                        } else {
                            baseFinderFeed = it6.next();
                            if (((in5.c) baseFinderFeed).getItemId() == tVar.f260992k && tVar.f260994m > 0) {
                                break;
                            }
                        }
                    }
                    baseFinderFeed2 = baseFinderFeed instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? baseFinderFeed : null;
                    if (baseFinderFeed2 != null) {
                        e2Var.f243847g = baseFinderFeed2;
                    }
                }
            }
        }
    }
}
