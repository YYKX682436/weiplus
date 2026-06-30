package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes3.dex */
public final class l8 extends com.tencent.mm.ui.component.UIComponent implements zy2.p8 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView f117222d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ProgressBar f117223e;

    /* renamed from: f, reason: collision with root package name */
    public r45.a73 f117224f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f117225g;

    /* renamed from: h, reason: collision with root package name */
    public long f117226h;

    /* renamed from: i, reason: collision with root package name */
    public long f117227i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f117228m;

    /* renamed from: n, reason: collision with root package name */
    public final yz5.p f117229n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l8(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f117225g = new java.util.ArrayList();
        this.f117229n = new com.tencent.mm.plugin.finder.live.viewmodel.k8(this, activity);
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        java.util.ArrayList arrayList;
        java.util.LinkedList list;
        java.util.LinkedList<r45.z63> list2;
        this.f117228m = getActivity() instanceof com.tencent.mm.plugin.finder.feed.ui.FinderLiveVisitorRoleUI;
        r45.a73 a73Var = (r45.a73) g92.b.f269769e.k2().e().getCustom(11);
        java.lang.String l17 = com.tencent.mm.sdk.platformtools.t8.l(a73Var != null ? a73Var.toByteArray() : null);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(l17)) {
            r45.a73 a73Var2 = new r45.a73();
            try {
                a73Var2.parseFrom(com.tencent.mm.sdk.platformtools.t8.h(l17));
            } catch (java.lang.Exception e17) {
                com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
                a73Var2 = null;
            }
            this.f117224f = a73Var2;
            if (a73Var2 != null && (list2 = a73Var2.getList(0)) != null) {
                for (r45.z63 z63Var : list2) {
                    if (z63Var != null) {
                        zl2.r.f473938a.a(z63Var, "SimpleUIComponent_get");
                    }
                }
            }
        }
        this.f117226h = getActivity().getIntent().getLongExtra("LIVE_ID", 0L);
        this.f117227i = getActivity().getIntent().getLongExtra("OBJECT_ID", 0L);
        this.f117222d = (com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView) getActivity().findViewById(com.tencent.mm.R.id.i_l);
        this.f117223e = (android.widget.ProgressBar) findViewById(com.tencent.mm.R.id.imc);
        r45.a73 a73Var3 = this.f117224f;
        if (a73Var3 != null) {
            if ((a73Var3 == null || (list = a73Var3.getList(0)) == null || list.isEmpty()) ? false : true) {
                r45.a73 a73Var4 = this.f117224f;
                java.util.LinkedList list3 = a73Var4 != null ? a73Var4.getList(0) : null;
                com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView finderRecyclerView = this.f117222d;
                if (list3 != null && finderRecyclerView != null) {
                    java.util.Iterator it = list3.iterator();
                    while (true) {
                        boolean hasNext = it.hasNext();
                        arrayList = this.f117225g;
                        if (!hasNext) {
                            break;
                        }
                        r45.z63 z63Var2 = (r45.z63) it.next();
                        kotlin.jvm.internal.o.d(z63Var2);
                        arrayList.add(new com.tencent.mm.plugin.finder.live.viewmodel.h8(z63Var2));
                    }
                    finderRecyclerView.setLayoutManager(new com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager(getActivity()));
                    finderRecyclerView.setAdapter(new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(new in5.s() { // from class: com.tencent.mm.plugin.finder.live.viewmodel.FinderLiveVisitorGameRankSwitchUIC$onCreate$1$2
                        @Override // in5.s
                        public in5.r getItemConvert(int type) {
                            if (type == com.tencent.mm.plugin.finder.live.viewmodel.h8.class.hashCode()) {
                                return new com.tencent.mm.plugin.finder.live.viewmodel.g8(com.tencent.mm.plugin.finder.live.viewmodel.l8.this.f117229n);
                            }
                            ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).getClass();
                            return new com.tencent.mm.plugin.finder.convert.z2();
                        }
                    }, arrayList, false));
                    androidx.recyclerview.widget.i0 i0Var = new androidx.recyclerview.widget.i0(getActivity(), 1);
                    i0Var.d(getActivity().getResources().getDrawable(com.tencent.mm.R.drawable.f481646z1));
                    finderRecyclerView.N(i0Var);
                }
            }
        }
        if (this.f117228m) {
            i95.m c17 = i95.n0.c(ml2.r0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            ml2.r0.Rj((ml2.r0) c17, 4, null, 0, 6, null);
        }
    }
}
