package com.tencent.mm.plugin.game.luggage.ui.circle;

/* loaded from: classes15.dex */
public class AtSomeoneView extends com.tencent.mm.plugin.appbrand.widget.recyclerview.MRecyclerView implements im5.b {

    /* renamed from: f2, reason: collision with root package name */
    public final im5.c f139973f2;

    /* renamed from: g2, reason: collision with root package name */
    public android.content.Context f139974g2;

    /* renamed from: h2, reason: collision with root package name */
    public f53.m f139975h2;

    /* renamed from: i2, reason: collision with root package name */
    public androidx.recyclerview.widget.LinearLayoutManager f139976i2;

    /* renamed from: j2, reason: collision with root package name */
    public kk.j f139977j2;

    /* renamed from: k2, reason: collision with root package name */
    public final java.util.List f139978k2;

    /* renamed from: l2, reason: collision with root package name */
    public final java.util.List f139979l2;

    /* renamed from: m2, reason: collision with root package name */
    public final java.util.List f139980m2;

    /* renamed from: n2, reason: collision with root package name */
    public java.util.List f139981n2;

    /* renamed from: o2, reason: collision with root package name */
    public android.os.Bundle f139982o2;

    /* renamed from: p2, reason: collision with root package name */
    public int f139983p2;

    /* renamed from: q2, reason: collision with root package name */
    public boolean f139984q2;

    public AtSomeoneView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f139973f2 = new im5.c();
        this.f139978k2 = new java.util.LinkedList();
        this.f139979l2 = new java.util.LinkedList();
        this.f139980m2 = new java.util.LinkedList();
        this.f139981n2 = new java.util.LinkedList();
        this.f139983p2 = -1;
        this.f139984q2 = false;
        h1();
    }

    public f53.m getmAdapter() {
        return this.f139975h2;
    }

    public final void h1() {
        this.f139974g2 = getContext();
        this.f139977j2 = new jt0.i(30, getClass());
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = new androidx.recyclerview.widget.LinearLayoutManager(this.f139974g2);
        this.f139976i2 = linearLayoutManager;
        linearLayoutManager.Q(0);
        setLayoutManager(this.f139976i2);
        f53.m mVar = new f53.m(this);
        this.f139975h2 = mVar;
        setAdapter(mVar);
    }

    @Override // im5.b
    public void keep(im5.a aVar) {
        this.f139973f2.keep(aVar);
    }

    public void l1(int i17) {
        android.view.View findViewByPosition = this.f139976i2.findViewByPosition(i17);
        if (findViewByPosition == null) {
            return;
        }
        android.view.View findViewById = findViewByPosition.findViewById(com.tencent.mm.R.id.a5w);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/game/luggage/ui/circle/AtSomeoneView", "cancelAt", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/game/luggage/ui/circle/AtSomeoneView", "cancelAt", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public void m1(f53.n nVar) {
        t43.a aVar = new t43.a(this.f139982o2);
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            pq5.g l17 = aVar.l();
            l17.f(this);
            l17.h(new f53.g(this, nVar));
        } else {
            ((h80.i) ((com.tencent.mm.ipcinvoker.wx_extension.x) i95.n0.c(com.tencent.mm.ipcinvoker.wx_extension.x.class))).Ai(aVar.f70646f, new f53.h(this, nVar), this);
        }
    }

    public void n1(java.lang.String str) {
        java.util.List list;
        if (java.util.Objects.equals(str, "")) {
            list = this.f139978k2;
            this.f139984q2 = false;
        } else {
            this.f139984q2 = true;
            this.f139983p2 = -1;
            java.util.LinkedList linkedList = new java.util.LinkedList();
            for (o33.f fVar : this.f139978k2) {
                if (fVar.f342738e.contains(str)) {
                    if (((java.util.LinkedList) this.f139979l2).contains(fVar)) {
                        this.f139983p2++;
                    }
                    linkedList.add(fVar);
                }
            }
            list = linkedList;
        }
        ((ku5.t0) ku5.t0.f312615d).B(new f53.j(this, list));
    }

    public void o1(java.util.List list, java.util.List list2) {
        boolean z17;
        ((java.util.LinkedList) this.f139978k2).clear();
        ((java.util.LinkedList) this.f139978k2).addAll(list);
        if (list.size() != 0) {
            this.f139983p2 = list.size() - 1;
        } else {
            this.f139983p2 = -1;
        }
        java.util.Iterator it = list2.iterator();
        while (it.hasNext()) {
            o33.f fVar = (o33.f) it.next();
            java.util.Iterator it6 = list.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    z17 = true;
                    break;
                } else if (((o33.f) it6.next()).f342737d.equals(fVar.f342737d)) {
                    z17 = false;
                    break;
                }
            }
            if (z17) {
                ((java.util.LinkedList) this.f139978k2).add(fVar);
            }
        }
        ((ku5.t0) ku5.t0.f312615d).B(new f53.i(this));
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        java.util.Iterator it = ((jt0.i) this.f139977j2).values().iterator();
        while (it.hasNext()) {
            ((android.graphics.Bitmap) it.next()).recycle();
        }
        ((lt0.f) this.f139977j2).clear();
        this.f139973f2.dead();
    }

    public void setSelectedDatas(java.util.List<java.lang.String> list) {
        this.f139981n2 = list;
    }

    public AtSomeoneView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f139973f2 = new im5.c();
        this.f139978k2 = new java.util.LinkedList();
        this.f139979l2 = new java.util.LinkedList();
        this.f139980m2 = new java.util.LinkedList();
        this.f139981n2 = new java.util.LinkedList();
        this.f139983p2 = -1;
        this.f139984q2 = false;
        h1();
    }
}
