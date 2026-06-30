package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class z60 extends fc2.d {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.c70 f136660g;

    public z60(com.tencent.mm.plugin.finder.viewmodel.component.c70 c70Var) {
        this.f136660g = c70Var;
    }

    @Override // fc2.d
    public boolean E0() {
        return false;
    }

    @Override // fc2.d
    public boolean F0(fc2.c dispatcher, fc2.a event) {
        kotlin.jvm.internal.o.g(dispatcher, "dispatcher");
        kotlin.jvm.internal.o.g(event, "event");
        return event instanceof fc2.t;
    }

    @Override // fc2.d
    public void G0(fc2.a ev6) {
        int y17;
        kotlin.jvm.internal.o.g(ev6, "ev");
        if (ev6 instanceof fc2.t) {
            com.tencent.mm.plugin.finder.viewmodel.component.c70 c70Var = this.f136660g;
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = c70Var.O6().getLayoutManager();
            if ((layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager) && (y17 = ((androidx.recyclerview.widget.LinearLayoutManager) layoutManager).y()) > c70Var.f133977f) {
                androidx.recyclerview.widget.k3 p07 = c70Var.O6().p0(y17);
                if (p07 instanceof in5.s0) {
                    java.lang.Object obj = ((in5.s0) p07).f293125i;
                    if (obj instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) {
                        long id6 = ((com.tencent.mm.plugin.finder.model.BaseFinderFeed) obj).getFeedObject().getId();
                        fc2.t tVar = (fc2.t) ev6;
                        if (tVar.f260992k != id6) {
                            com.tencent.mm.plugin.finder.viewmodel.component.c70.f133974g.put(java.lang.Integer.valueOf(c70Var.P6()), java.lang.Long.valueOf(id6));
                            com.tencent.mars.xlog.Log.i("Finder.StreamPartialExposeUIC", "[onScrollStateChanged] tabType=" + c70Var.P6() + " lastId=" + id6 + ' ' + tVar.f260992k + " position=" + y17);
                            c70Var.f133977f = y17;
                        }
                    }
                }
            }
            java.util.HashMap hashMap = com.tencent.mm.plugin.finder.viewmodel.component.c70.f133974g;
            java.lang.Long l17 = (java.lang.Long) hashMap.get(java.lang.Integer.valueOf(c70Var.P6()));
            long j17 = ((fc2.t) ev6).f260992k;
            if (l17 != null && l17.longValue() == j17) {
                hashMap.put(java.lang.Integer.valueOf(c70Var.P6()), 0L);
                com.tencent.mars.xlog.Log.i("Finder.StreamPartialExposeUIC", "[onScrollStateChanged] tabType=" + c70Var.P6() + " reset");
            }
        }
    }
}
