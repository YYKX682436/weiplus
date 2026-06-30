package wv0;

/* loaded from: classes5.dex */
public final class q extends qv0.f {
    public yz5.a I;

    /* renamed from: J, reason: collision with root package name */
    public yz5.l f449928J;
    public yz5.p K;
    public yz5.l L;
    public yz5.l M;
    public final jz5.g N;
    public final jz5.g P;
    public final androidx.recyclerview.widget.g1 Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.N = jz5.h.b(new wv0.p(this));
        this.P = jz5.h.b(new wv0.o(this));
        this.Q = new androidx.recyclerview.widget.g1(new rv0.e7(12, 0, new wv0.l(this), wv0.m.f449924d));
    }

    public static final void L(wv0.q qVar, int i17, int i18) {
        sv0.j sortAdapter = qVar.getSortAdapter();
        java.util.ArrayList arrayList = sortAdapter.f275970d;
        vv0.n nVar = (vv0.n) kz5.n0.a0(arrayList, i17);
        if (nVar != null) {
            arrayList.remove(nVar);
            try {
                arrayList.add(i18, nVar);
            } catch (java.lang.IndexOutOfBoundsException e17) {
                com.tencent.mars.xlog.Log.e("SortSegmentsPanel", java.lang.String.valueOf(e17.getStackTrace()));
            }
        }
        sortAdapter.notifyItemMoved(i17, i18);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final sv0.j getSortAdapter() {
        return (sv0.j) ((jz5.n) this.P).getValue();
    }

    private final androidx.recyclerview.widget.RecyclerView getSortRv() {
        java.lang.Object value = ((jz5.n) this.N).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (androidx.recyclerview.widget.RecyclerView) value;
    }

    @Override // qv0.f
    public boolean D() {
        return false;
    }

    public final void M(com.tencent.maas.base.MJID segmentID) {
        kotlin.jvm.internal.o.g(segmentID, "segmentID");
        java.util.Iterator it = getSortAdapter().f275970d.iterator();
        int i17 = 0;
        while (true) {
            if (!it.hasNext()) {
                i17 = -1;
                break;
            } else if (kotlin.jvm.internal.o.b(((vv0.n) it.next()).f440398a, segmentID)) {
                break;
            } else {
                i17++;
            }
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        if (!(valueOf.intValue() != -1)) {
            valueOf = null;
        }
        if (valueOf != null) {
            getSortAdapter().z(valueOf.intValue(), null);
        }
    }

    public final void N(java.util.List list) {
        kotlin.jvm.internal.o.g(list, "list");
        getSortAdapter().y(list);
    }

    public final void O(dx0.g coverThumbnailProvider) {
        kotlin.jvm.internal.o.g(coverThumbnailProvider, "coverThumbnailProvider");
        int i17 = 0;
        for (java.lang.Object obj : getSortAdapter().f275970d) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            vv0.n nVar = (vv0.n) obj;
            if (nVar.f440399b == null) {
                getSortAdapter().x(i17, vv0.n.a(nVar, null, coverThumbnailProvider.d(nVar.f440398a), 0, false, false, 29, null));
            }
            i17 = i18;
        }
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.q
    public void c(android.content.Context context, android.widget.FrameLayout bodyContainerLayout) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(bodyContainerLayout, "bodyContainerLayout");
        com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.f489266dg2, bodyContainerLayout);
    }

    public final yz5.a getOnAttached() {
        return this.I;
    }

    public final yz5.l getOnItemGrabbed() {
        return this.L;
    }

    public final yz5.l getOnItemReleased() {
        return this.M;
    }

    public final yz5.l getOnSegmentClicked() {
        return this.f449928J;
    }

    public final yz5.p getOnSegmentSwitch() {
        return this.K;
    }

    @Override // qv0.f
    public java.lang.String getToolbarTitle() {
        java.lang.String string = j65.q.a(getContext()).getString(com.tencent.mm.R.string.lla);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return string;
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel
    public void p() {
        yz5.a aVar = this.I;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public final void setOnAttached(yz5.a aVar) {
        this.I = aVar;
    }

    public final void setOnItemGrabbed(yz5.l lVar) {
        this.L = lVar;
    }

    public final void setOnItemReleased(yz5.l lVar) {
        this.M = lVar;
    }

    public final void setOnSegmentClicked(yz5.l lVar) {
        this.f449928J = lVar;
    }

    public final void setOnSegmentSwitch(yz5.p pVar) {
        this.K = pVar;
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel
    public void u(com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.q panel) {
        kotlin.jvm.internal.o.g(panel, "panel");
        android.content.res.Resources a17 = j65.q.a(getContext());
        androidx.recyclerview.widget.RecyclerView sortRv = getSortRv();
        sortRv.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(sortRv.getContext(), 0, false));
        androidx.recyclerview.widget.n2 itemAnimator = sortRv.getItemAnimator();
        androidx.recyclerview.widget.o3 o3Var = itemAnimator instanceof androidx.recyclerview.widget.o3 ? (androidx.recyclerview.widget.o3) itemAnimator : null;
        if (o3Var != null) {
            o3Var.f12182g = false;
        }
        sortRv.N(new lv0.c(a17.getDimensionPixelSize(com.tencent.mm.R.dimen.f479738dv), a17.getDimensionPixelSize(com.tencent.mm.R.dimen.f479704cz), a17.getDimensionPixelSize(com.tencent.mm.R.dimen.f479704cz), 0, 0, lv0.f.f321489f, 24, null));
        sortRv.setAdapter(getSortAdapter());
        this.Q.d(getSortRv());
    }
}
