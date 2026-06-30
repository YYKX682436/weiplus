package fn2;

/* loaded from: classes10.dex */
public final class h1 extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public final fn2.u1 f264267d;

    /* renamed from: e, reason: collision with root package name */
    public final androidx.recyclerview.widget.RecyclerView f264268e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.widget.dv f264269f;

    /* renamed from: g, reason: collision with root package name */
    public sf2.d3 f264270g;

    /* renamed from: h, reason: collision with root package name */
    public fn2.q1 f264271h;

    /* renamed from: i, reason: collision with root package name */
    public bm2.k7 f264272i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f264273m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.Integer f264274n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f264275o;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public h1(android.content.Context r1, android.util.AttributeSet r2, int r3, fn2.u1 r4, int r5, kotlin.jvm.internal.i r6) {
        /*
            r0 = this;
            r6 = r5 & 2
            if (r6 == 0) goto L5
            r2 = 0
        L5:
            r5 = r5 & 4
            if (r5 == 0) goto La
            r3 = 0
        La:
            java.lang.String r5 = "context"
            kotlin.jvm.internal.o.g(r1, r5)
            java.lang.String r5 = "sourceScene"
            kotlin.jvm.internal.o.g(r4, r5)
            r0.<init>(r1, r2, r3)
            r0.f264267d = r4
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r1)
            r2 = 2131496102(0x7f0c0ca6, float:1.861576E38)
            r3 = 1
            r1.inflate(r2, r0, r3)
            r1 = 2131321280(0x7f0961c0, float:1.8261178E38)
            android.view.View r1 = r0.findViewById(r1)
            java.lang.String r2 = "findViewById(...)"
            kotlin.jvm.internal.o.f(r1, r2)
            androidx.recyclerview.widget.RecyclerView r1 = (androidx.recyclerview.widget.RecyclerView) r1
            r0.f264268e = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: fn2.h1.<init>(android.content.Context, android.util.AttributeSet, int, fn2.u1, int, kotlin.jvm.internal.i):void");
    }

    public static final void a(fn2.h1 h1Var, int i17) {
        androidx.recyclerview.widget.k3 p07;
        bm2.k7 k7Var = h1Var.f264272i;
        if (k7Var == null) {
            kotlin.jvm.internal.o.o("rvAdapter");
            throw null;
        }
        if (i17 >= 0) {
            java.util.ArrayList arrayList = (java.util.ArrayList) k7Var.f22045q;
            if (i17 < arrayList.size()) {
                if (((bm2.v6) arrayList.get(i17)).f22387a != bm2.w6.f22413f) {
                    com.tencent.mars.xlog.Log.w("FinderLiveRequestSongPlayListAdapter", "Position " + i17 + " is not a song item");
                    return;
                }
                androidx.recyclerview.widget.RecyclerView recyclerView = k7Var.f22042n;
                if (recyclerView == null || (p07 = recyclerView.p0(i17)) == null || !(p07 instanceof bm2.t6)) {
                    return;
                }
                bm2.t6 t6Var = (bm2.t6) p07;
                fn2.c cVar = t6Var.f22331v;
                if (cVar != null) {
                    cVar.a();
                }
                fn2.d dVar = fn2.d.f264242a;
                android.view.View itemView = t6Var.itemView;
                kotlin.jvm.internal.o.f(itemView, "itemView");
                t6Var.f22331v = dVar.a(itemView, t6Var.f22332w.f22039h);
                com.tencent.mars.xlog.Log.i("FinderLiveRequestSongPlayListAdapter", "Playing highlight animation for position: " + i17);
                return;
            }
        }
        com.tencent.mars.xlog.Log.w("FinderLiveRequestSongPlayListAdapter", "Invalid highlight position: " + i17);
    }

    public static final void b(fn2.h1 h1Var, sf2.d3 d3Var, r45.ox1 ox1Var) {
        h1Var.getClass();
        ((kotlinx.coroutines.flow.h3) ((mm2.k5) d3Var.business(mm2.k5.class)).f329198g).k(ox1Var);
    }

    public static void c(fn2.h1 h1Var, kotlinx.coroutines.y0 y0Var, boolean z17, boolean z18, int i17, java.lang.Object obj) {
        fn2.q1 q1Var;
        com.tencent.mm.plugin.finder.live.widget.dv dvVar;
        boolean z19 = (i17 & 2) != 0 ? false : z17;
        boolean z27 = (i17 & 4) != 0 ? false : z18;
        sf2.d3 d3Var = h1Var.f264270g;
        if (d3Var == null || (q1Var = h1Var.f264271h) == null) {
            return;
        }
        if (z19 && (dvVar = h1Var.f264269f) != null) {
            dvVar.e();
        }
        if (y0Var != null) {
            kotlinx.coroutines.l.d(y0Var, null, null, new fn2.c1(h1Var, q1Var, z27, d3Var, null), 3, null);
        }
    }

    public final boolean getMarkNeedRefresh() {
        return this.f264275o;
    }

    public final androidx.recyclerview.widget.RecyclerView getSongRv() {
        return this.f264268e;
    }

    public final void setMarkNeedRefresh(boolean z17) {
        this.f264275o = z17;
    }
}
