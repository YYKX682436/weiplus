package m22;

/* loaded from: classes15.dex */
public final class d implements androidx.recyclerview.widget.v2 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f323022d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Boolean f323023e;

    /* renamed from: f, reason: collision with root package name */
    public int f323024f;

    /* renamed from: g, reason: collision with root package name */
    public int f323025g;

    /* renamed from: h, reason: collision with root package name */
    public int f323026h;

    /* renamed from: i, reason: collision with root package name */
    public int f323027i;

    /* renamed from: m, reason: collision with root package name */
    public final int f323028m;

    /* renamed from: n, reason: collision with root package name */
    public m22.b f323029n;

    /* renamed from: o, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f323030o;

    /* renamed from: p, reason: collision with root package name */
    public m22.a f323031p;

    /* renamed from: q, reason: collision with root package name */
    public androidx.recyclerview.widget.GridLayoutManager f323032q;

    /* renamed from: r, reason: collision with root package name */
    public final int f323033r;

    /* renamed from: s, reason: collision with root package name */
    public long f323034s;

    /* renamed from: t, reason: collision with root package name */
    public final m22.c f323035t;

    public d(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f323026h = -1;
        this.f323027i = -1;
        this.f323028m = android.view.ViewConfiguration.get(context).getScaledTouchSlop();
        this.f323029n = m22.b.f323017d;
        this.f323033r = ym5.x.a(context, 800.0f);
        this.f323035t = new m22.c(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0058, code lost:
    
        if (r13 != 3) goto L87;
     */
    @Override // androidx.recyclerview.widget.v2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(androidx.recyclerview.widget.RecyclerView r13, android.view.MotionEvent r14) {
        /*
            Method dump skipped, instructions count: 561
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m22.d.a(androidx.recyclerview.widget.RecyclerView, android.view.MotionEvent):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0021, code lost:
    
        if (r7 != 3) goto L39;
     */
    @Override // androidx.recyclerview.widget.v2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean b(androidx.recyclerview.widget.RecyclerView r7, android.view.MotionEvent r8) {
        /*
            Method dump skipped, instructions count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m22.d.b(androidx.recyclerview.widget.RecyclerView, android.view.MotionEvent):boolean");
    }

    @Override // androidx.recyclerview.widget.v2
    public void c(boolean z17) {
        if (z17) {
            this.f323023e = java.lang.Boolean.FALSE;
        }
    }

    public final int d(float f17, float f18) {
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f323030o;
        if (recyclerView == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        android.view.View k07 = recyclerView.k0(f17, f18);
        if (k07 == null) {
            return -1;
        }
        androidx.recyclerview.widget.GridLayoutManager gridLayoutManager = this.f323032q;
        if (gridLayoutManager != null) {
            return gridLayoutManager.getPosition(k07);
        }
        kotlin.jvm.internal.o.o("layoutManager");
        throw null;
    }
}
