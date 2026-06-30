package jn2;

/* loaded from: classes10.dex */
public final class c1 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f300567d;

    /* renamed from: e, reason: collision with root package name */
    public final sf2.x f300568e;

    /* renamed from: f, reason: collision with root package name */
    public final gk2.e f300569f;

    /* renamed from: g, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f300570g;

    /* renamed from: h, reason: collision with root package name */
    public final jn2.a2 f300571h;

    /* renamed from: i, reason: collision with root package name */
    public final r45.in f300572i;

    /* renamed from: m, reason: collision with root package name */
    public r45.ch6 f300573m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.List f300574n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f300575o;

    public c1(android.content.Context context, sf2.x xVar, gk2.e liveData, kotlinx.coroutines.y0 y0Var, jn2.a2 sourceType, r45.in inVar, r45.ch6 ch6Var, int i17, kotlin.jvm.internal.i iVar) {
        inVar = (i17 & 32) != 0 ? null : inVar;
        ch6Var = (i17 & 64) != 0 ? null : ch6Var;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(liveData, "liveData");
        kotlin.jvm.internal.o.g(sourceType, "sourceType");
        this.f300567d = context;
        this.f300568e = xVar;
        this.f300569f = liveData;
        this.f300570g = y0Var;
        this.f300571h = sourceType;
        this.f300572i = inVar;
        this.f300573m = ch6Var;
        this.f300574n = new java.util.ArrayList();
        hn2.h hVar = new hn2.h(y0Var, xVar != null ? ((mm2.j5) xVar.business(mm2.j5.class)).f329182g : null);
        zl2.q4.f473933a.R("FinderLiveAnchorSingSongListAdapter");
        jn2.s0 s0Var = new jn2.s0(this);
        jn2.t0 t0Var = new jn2.t0(this);
        if (y0Var != null) {
            kotlinx.coroutines.l.d(y0Var, null, null, new hn2.g(hVar, s0Var, t0Var, null), 3, null);
        }
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return ((java.util.ArrayList) this.f300574n).size() + (this.f300575o ? 1 : 0);
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        return i17 < ((java.util.ArrayList) this.f300574n).size() ? 0 : 1;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 holder, int i17) {
        kotlin.jvm.internal.o.g(holder, "holder");
        if (holder instanceof jn2.b1) {
            jn2.w0 songData = (jn2.w0) ((java.util.ArrayList) this.f300574n).get(i17);
            jn2.b1 b1Var = (jn2.b1) holder;
            kotlin.jvm.internal.o.g(songData, "songData");
            com.tencent.mm.plugin.finder.live.widget.singlist.common.FinderLiveSongInfoView finderLiveSongInfoView = b1Var.f300558d;
            r45.ay1 ay1Var = songData.f300740a;
            finderLiveSongInfoView.A(ay1Var.f370351e, ay1Var.f370353g, ay1Var.f370354h, ay1Var.f370355i, ay1Var.f370360q);
            java.lang.String str = ay1Var.f370350d;
            boolean z17 = ay1Var.f370360q;
            jn2.c1 c1Var = b1Var.f300563i;
            java.util.ArrayList arrayList = ((mm2.m6) c1Var.f300569f.a(mm2.m6.class)).f329249q.f234085a;
            boolean z18 = false;
            if (!(arrayList instanceof java.util.Collection) || !arrayList.isEmpty()) {
                java.util.Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    r45.z22 z22Var = (r45.z22) it.next();
                    if (kotlin.jvm.internal.o.b(z22Var.f391627d, str) && z22Var.f391628e == z17) {
                        z18 = true;
                        break;
                    }
                }
            }
            b1Var.j(z18 ? jn2.u0.f300713f : jn2.u0.f300711d);
            b1Var.f300559e.setOnClickListener(new jn2.y0(b1Var, c1Var, ay1Var, songData));
            b1Var.f300558d.setOnClickListener(new jn2.z0(b1Var, songData));
            b1Var.i(songData);
            return;
        }
        boolean z19 = holder instanceof jn2.v0;
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        if (i17 == 0) {
            android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.f489003ec4, parent, false);
            kotlin.jvm.internal.o.d(inflate);
            return new jn2.b1(this, inflate);
        }
        if (i17 != 1) {
            throw new java.lang.IllegalArgumentException("Invalid view type");
        }
        android.view.View inflate2 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.ami, parent, false);
        kotlin.jvm.internal.o.d(inflate2);
        return new jn2.v0(inflate2);
    }

    public final void x(java.util.List basicInfoList, java.util.List resourceInfoList, java.lang.String searchKey) {
        kotlin.jvm.internal.o.g(basicInfoList, "basicInfoList");
        kotlin.jvm.internal.o.g(resourceInfoList, "resourceInfoList");
        kotlin.jvm.internal.o.g(searchKey, "searchKey");
        java.util.List list = this.f300574n;
        int size = ((java.util.ArrayList) list).size();
        int i17 = 0;
        for (java.lang.Object obj : basicInfoList) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            ((java.util.ArrayList) list).add(new jn2.w0((r45.ay1) obj, (r45.cy1) kz5.n0.a0(resourceInfoList, i17)));
            i17 = i18;
        }
        notifyItemRangeInserted(size, basicInfoList.size());
    }

    public final void y(java.util.List basicInfoList, java.util.List resourceInfoList, boolean z17, java.lang.String searchKey) {
        kotlin.jvm.internal.o.g(basicInfoList, "basicInfoList");
        kotlin.jvm.internal.o.g(resourceInfoList, "resourceInfoList");
        kotlin.jvm.internal.o.g(searchKey, "searchKey");
        java.util.List list = this.f300574n;
        ((java.util.ArrayList) list).clear();
        int i17 = 0;
        for (java.lang.Object obj : basicInfoList) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            ((java.util.ArrayList) list).add(new jn2.w0((r45.ay1) obj, (r45.cy1) kz5.n0.a0(resourceInfoList, i17)));
            i17 = i18;
        }
        this.f300575o = z17;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 holder, int i17, java.util.List payloads) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(payloads, "payloads");
        if ((!payloads.isEmpty()) && payloads.contains("payload_audition_state")) {
            if (holder instanceof jn2.b1) {
                java.util.List list = this.f300574n;
                if (i17 < ((java.util.ArrayList) list).size()) {
                    ((jn2.b1) holder).i((jn2.w0) ((java.util.ArrayList) list).get(i17));
                    return;
                }
                return;
            }
            return;
        }
        onBindViewHolder(holder, i17);
    }
}
