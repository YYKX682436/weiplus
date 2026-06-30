package xn2;

/* loaded from: classes2.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xn2.p0 f455532d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.FeedDeleteEvent f455533e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(xn2.p0 p0Var, com.tencent.mm.autogen.events.FeedDeleteEvent feedDeleteEvent) {
        super(0);
        this.f455532d = p0Var;
        this.f455533e = feedDeleteEvent;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17;
        xn2.b bVar;
        java.lang.Object obj;
        if (!this.f455532d.i()) {
            java.util.ArrayList dataListJustForAdapter = this.f455532d.j().getDataListJustForAdapter();
            com.tencent.mm.autogen.events.FeedDeleteEvent feedDeleteEvent = this.f455533e;
            java.util.Iterator it = dataListJustForAdapter.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                so2.j5 j5Var = (so2.j5) obj;
                if ((j5Var instanceof zn2.a) && j5Var.getItemId() == feedDeleteEvent.f54247g.f6437a) {
                    break;
                }
            }
            so2.j5 j5Var2 = (so2.j5) obj;
            if (j5Var2 != null) {
                xn2.p0.b(this.f455532d, j5Var2, true);
            }
        } else if (this.f455533e.f54247g.f6437a != 0) {
            java.util.ArrayList dataListJustForAdapter2 = this.f455532d.j().getDataListJustForAdapter();
            com.tencent.mm.autogen.events.FeedDeleteEvent feedDeleteEvent2 = this.f455533e;
            synchronized (dataListJustForAdapter2) {
                java.util.Iterator it6 = dataListJustForAdapter2.iterator();
                i17 = 0;
                while (true) {
                    if (!it6.hasNext()) {
                        i17 = -1;
                        break;
                    }
                    if (((so2.j5) it6.next()).getItemId() == feedDeleteEvent2.f54247g.f6437a) {
                        break;
                    }
                    i17++;
                }
            }
            vn2.u0.f438387a.m(this.f455532d.f455545c, "feedDeleteListener delete = " + pm0.v.u(this.f455533e.f54247g.f6437a) + ",index=" + i17);
            pm0.v.I(this.f455532d.j().getDataListJustForAdapter(), new xn2.m(this.f455533e));
            if (i17 >= 0 && (bVar = this.f455532d.f455547e) != null) {
                ((com.tencent.mm.plugin.finder.view.mj) ((xn2.f1) bVar).a()).onItemRangeRemoved(i17, 1);
            }
        }
        return jz5.f0.f302826a;
    }
}
