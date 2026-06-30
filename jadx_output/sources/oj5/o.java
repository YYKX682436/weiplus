package oj5;

/* loaded from: classes14.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f345862a;

    /* renamed from: b, reason: collision with root package name */
    public final int f345863b;

    /* renamed from: c, reason: collision with root package name */
    public final int f345864c;

    /* renamed from: d, reason: collision with root package name */
    public final oj5.q f345865d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f345866e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f345867f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f345868g;

    /* renamed from: h, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f345869h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f345870i;

    /* renamed from: j, reason: collision with root package name */
    public final oj5.h f345871j;

    /* renamed from: k, reason: collision with root package name */
    public final oj5.n f345872k;

    /* renamed from: l, reason: collision with root package name */
    public oj5.g f345873l;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicLong f345874m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicLong f345875n;

    public o(java.lang.String TAG, int i17, int i18, oj5.q boundCaches, boolean z17, com.tencent.mm.sdk.platformtools.n3 handler, int[] records) {
        kotlin.jvm.internal.o.g(TAG, "TAG");
        kotlin.jvm.internal.o.g(boundCaches, "boundCaches");
        kotlin.jvm.internal.o.g(handler, "handler");
        kotlin.jvm.internal.o.g(records, "records");
        this.f345862a = TAG;
        this.f345863b = i17;
        this.f345864c = i18;
        this.f345865d = boundCaches;
        this.f345866e = z17;
        this.f345867f = handler;
        this.f345868g = records;
        this.f345870i = jz5.h.b(new oj5.l(this));
        this.f345871j = new oj5.h(this);
        this.f345872k = new oj5.n(this);
        this.f345874m = new java.util.concurrent.atomic.AtomicLong(0L);
        this.f345875n = new java.util.concurrent.atomic.AtomicLong(0L);
    }

    public static final void a(oj5.o oVar) {
        oVar.f345874m.set(oVar.f345875n.incrementAndGet());
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(oj5.o r17, boolean r18, java.lang.String r19, long r20, int r22, java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 532
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oj5.o.b(oj5.o, boolean, java.lang.String, long, int, java.lang.Object):void");
    }

    public final void c(android.util.Range range, int i17, java.util.ArrayList arrayList) {
        java.lang.Integer num = (java.lang.Integer) (i17 > 0 ? range.getLower() : range.getUpper());
        java.lang.Integer num2 = (java.lang.Integer) (i17 > 0 ? range.getUpper() : range.getLower());
        kotlin.jvm.internal.o.d(num);
        int intValue = num.intValue();
        kotlin.jvm.internal.o.d(num2);
        int intValue2 = num2.intValue();
        if (i17 == 0) {
            throw new java.lang.IllegalArgumentException("Step must be non-zero.");
        }
        if (i17 == Integer.MIN_VALUE) {
            throw new java.lang.IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        int a17 = sz5.b.a(intValue, intValue2, i17);
        if ((i17 <= 0 || intValue > a17) && (i17 >= 0 || a17 > intValue)) {
            return;
        }
        while (true) {
            arrayList.add(java.lang.Integer.valueOf(intValue));
            if (intValue == a17) {
                return;
            } else {
                intValue += i17;
            }
        }
    }

    public final androidx.recyclerview.widget.k3 d(androidx.recyclerview.widget.z2 z2Var, int i17) {
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f345869h;
        if (recyclerView == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        androidx.recyclerview.widget.f2 adapter = recyclerView.getAdapter();
        if (adapter == null || i17 < 0 || this.f345865d.values().size() >= this.f345864c) {
            return null;
        }
        int itemViewType = adapter.getItemViewType(i17);
        androidx.recyclerview.widget.RecyclerView recyclerView2 = this.f345869h;
        if (recyclerView2 == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        androidx.recyclerview.widget.k3 b17 = recyclerView2.getRecycledViewPool().b(itemViewType);
        if (b17 == null) {
            androidx.recyclerview.widget.RecyclerView recyclerView3 = this.f345869h;
            if (recyclerView3 == null) {
                kotlin.jvm.internal.o.o("recyclerView");
                throw null;
            }
            b17 = adapter.createViewHolder(recyclerView3, itemViewType);
        }
        kotlin.jvm.internal.o.d(b17);
        android.view.ViewGroup.LayoutParams layoutParams = b17.itemView.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new androidx.recyclerview.widget.RecyclerView.LayoutParams(-2, -2);
        }
        b17.itemView.setLayoutParams(layoutParams);
        jz5.g gVar = oj5.x.f345906a;
        java.lang.reflect.Field declaredField = androidx.recyclerview.widget.RecyclerView.LayoutParams.class.getDeclaredField("d");
        declaredField.setAccessible(true);
        declaredField.set((androidx.recyclerview.widget.RecyclerView.LayoutParams) layoutParams, b17);
        z2Var.b(b17.itemView, i17);
        return b17;
    }
}
