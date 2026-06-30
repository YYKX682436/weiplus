package f0;

/* loaded from: classes14.dex */
public final class y1 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f258274a;

    /* renamed from: b, reason: collision with root package name */
    public final int f258275b;

    /* renamed from: c, reason: collision with root package name */
    public final int f258276c;

    /* renamed from: d, reason: collision with root package name */
    public final f0.v1 f258277d;

    /* renamed from: e, reason: collision with root package name */
    public final f0.k1 f258278e;

    /* renamed from: f, reason: collision with root package name */
    public final f0.k2 f258279f;

    /* renamed from: g, reason: collision with root package name */
    public final yz5.p f258280g;

    public y1(boolean z17, java.util.List slotSizesSums, int i17, int i18, int i19, f0.v1 measuredItemProvider, f0.k1 spanLayoutProvider, f0.k2 measuredLineFactory) {
        kotlin.jvm.internal.o.g(slotSizesSums, "slotSizesSums");
        kotlin.jvm.internal.o.g(measuredItemProvider, "measuredItemProvider");
        kotlin.jvm.internal.o.g(spanLayoutProvider, "spanLayoutProvider");
        kotlin.jvm.internal.o.g(measuredLineFactory, "measuredLineFactory");
        this.f258274a = z17;
        this.f258275b = i18;
        this.f258276c = i19;
        this.f258277d = measuredItemProvider;
        this.f258278e = spanLayoutProvider;
        this.f258279f = measuredLineFactory;
        this.f258280g = new f0.x1(slotSizesSums, i17, this);
    }

    public final f0.w1 a(int i17) {
        f0.i1 b17 = this.f258278e.b(i17);
        java.util.List spans = b17.f258117b;
        int size = spans.size();
        int i18 = b17.f258116a;
        int i19 = (size == 0 || i18 + size == this.f258275b) ? 0 : this.f258276c;
        f0.u1[] u1VarArr = new f0.u1[size];
        int i27 = 0;
        for (int i28 = 0; i28 < size; i28++) {
            int i29 = (int) ((f0.d) spans.get(i28)).f258040a;
            long j17 = ((p2.c) ((f0.x1) this.f258280g).invoke(java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(i29))).f351377a;
            i27 += i29;
            u1VarArr[i28] = this.f258277d.a(i18 + i28, i19, j17);
        }
        f0.i0 i0Var = (f0.i0) this.f258279f;
        i0Var.getClass();
        kotlin.jvm.internal.o.g(spans, "spans");
        return new f0.w1(i17, u1VarArr, spans, i0Var.f258112a, i0Var.f258113b.size(), ((androidx.compose.foundation.lazy.layout.s) i0Var.f258114c).getLayoutDirection(), i19, i0Var.f258115d, null);
    }
}
