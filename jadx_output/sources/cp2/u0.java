package cp2;

/* loaded from: classes2.dex */
public final class u0 implements ym5.q1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cp2.v0 f220919d;

    public u0(cp2.v0 v0Var) {
        this.f220919d = v0Var;
    }

    public final com.tencent.mm.view.recyclerview.WxRecyclerAdapter a() {
        com.tencent.mm.view.recyclerview.WxRecyclerView g17 = ((cp2.q1) this.f220919d.z()).g();
        androidx.recyclerview.widget.f2 adapter = g17 != null ? g17.getAdapter() : null;
        if (adapter instanceof com.tencent.mm.view.recyclerview.WxRecyclerAdapter) {
            return (com.tencent.mm.view.recyclerview.WxRecyclerAdapter) adapter;
        }
        return null;
    }

    @Override // ym5.m1
    public void onChanged() {
        cp2.v0 v0Var = this.f220919d;
        ((cp2.q1) v0Var.z()).f220898w.onChanged();
        nq2.d.f338980a.f(v0Var.f220928e, v0Var.f220934n);
        tq2.c.f421220i.a(v0Var.v()).f421228g = java.lang.System.currentTimeMillis();
        tq2.d.f421230a.c("recyclerOnChange");
    }

    @Override // ym5.m1
    public void onItemRangeChanged(int i17, int i18) {
        cp2.q1 q1Var = (cp2.q1) this.f220919d.z();
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter a17 = a();
        q1Var.f220898w.onItemRangeChanged(i17 + (a17 != null ? a17.a0() : 0), i18);
    }

    @Override // ym5.m1
    public void onItemRangeInserted(int i17, int i18) {
        int i19;
        cp2.p1 p1Var = ((cp2.q1) this.f220919d.z()).f220898w;
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter a17 = a();
        p1Var.onItemRangeInserted(i17 + (a17 != null ? a17.a0() : 0), i18);
        nq2.d dVar = nq2.d.f338980a;
        cp2.v0 v0Var = this.f220919d;
        dVar.f(v0Var.f220928e, v0Var.f220934n);
        tq2.c.f421220i.a(this.f220919d.v()).f421228g = java.lang.System.currentTimeMillis();
        rq2.s sVar = rq2.s.f398879a;
        int y17 = this.f220919d.y();
        rq2.q b17 = sVar.b(y17);
        if (b17 != null) {
            b17.f398866g = c01.id.c();
            com.tencent.mars.xlog.Log.i("FinderNearbyLiveLoadingReporter", "onUIShowEnd tabType: " + y17);
            rq2.q b18 = sVar.b(y17);
            if (b18 != null) {
                long j17 = b18.f398861b;
                long j18 = b18.f398860a;
                long j19 = j17 - j18;
                b18.f398871l = j19;
                long j27 = b18.f398862c - j17;
                b18.f398872m = j27;
                long j28 = b18.f398864e - b18.f398863d;
                b18.f398874o = j28;
                long j29 = b18.f398866g - b18.f398865f;
                b18.f398873n = j29;
                if (rq2.s.f398882d) {
                    long j37 = rq2.s.f398881c;
                    b18.f398875p = j37 - j18;
                    b18.f398876q = j17 - j37;
                }
                b18.f398871l = j19;
                b18.f398872m = j27;
                b18.f398874o = j28;
                b18.f398873n = j29;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("add to report list: pullType = ");
                sb6.append(b18.f398868i);
                sb6.append(", tabType = ");
                i19 = y17;
                sb6.append(i19);
                sb6.append(", enterCost = ");
                sb6.append(b18.f398871l);
                sb6.append(", cgiCost = ");
                sb6.append(b18.f398872m);
                sb6.append(",dbCost = ");
                sb6.append(b18.f398874o);
                sb6.append(",uiCost = ");
                sb6.append(b18.f398873n);
                com.tencent.mars.xlog.Log.i("FinderNearbyLiveLoadingReporter", sb6.toString());
                java.util.HashSet hashSet = rq2.s.f398886h;
                synchronized (hashSet) {
                    long j38 = b18.f398871l;
                    if (j38 >= 0 && j38 <= 60000 && b18.f398872m >= 0 && b18.f398873n >= 0 && b18.f398874o >= 0) {
                        hashSet.add(b18);
                    }
                }
            } else {
                i19 = y17;
            }
            if (rq2.s.f398883e) {
                rq2.s.f398886h.clear();
            }
            if (!rq2.s.f398886h.isEmpty()) {
                if (i19 == 10000) {
                    new rq2.y().l();
                } else {
                    new rq2.t().l();
                }
            }
        }
        tq2.d.f421230a.c("recyclerOnInsert");
    }

    @Override // ym5.m1
    public void onItemRangeMoved(int i17, int i18, int i19) {
        cp2.q1 q1Var = (cp2.q1) this.f220919d.z();
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter a17 = a();
        int a07 = i17 + (a17 != null ? a17.a0() : 0);
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter a18 = a();
        q1Var.f220898w.onItemRangeMoved(a07, i18 + (a18 != null ? a18.a0() : 0), i19);
    }

    @Override // ym5.m1
    public void onItemRangeRemoved(int i17, int i18) {
        cp2.q1 q1Var = (cp2.q1) this.f220919d.z();
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter a17 = a();
        q1Var.f220898w.onItemRangeRemoved(i17 + (a17 != null ? a17.a0() : 0), i18);
    }

    @Override // ym5.p1
    public void onPreFinishLoadMore(ym5.s3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        ((cp2.q1) this.f220919d.z()).f220898w.onPreFinishLoadMore(reason);
    }

    @Override // ym5.p1
    public void onPreFinishLoadMoreSmooth(ym5.s3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        cp2.v0 v0Var = this.f220919d;
        ((cp2.q1) v0Var.z()).f220898w.onPreFinishLoadMoreSmooth(reason);
        qq2.b bVar = v0Var.f220938r;
        if (bVar != null) {
            bVar.a(reason.f463521f);
        }
    }

    @Override // ym5.p1
    public void onPreFinishRefresh(ym5.s3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        ((cp2.q1) this.f220919d.z()).f220898w.onPreFinishRefresh(reason);
    }

    @Override // ym5.m1
    public void onItemRangeChanged(int i17, int i18, java.lang.Object obj) {
        cp2.q1 q1Var = (cp2.q1) this.f220919d.z();
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter a17 = a();
        q1Var.f220898w.onItemRangeChanged(i17 + (a17 != null ? a17.a0() : 0), i18, obj);
    }
}
