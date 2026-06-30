package mm2;

/* loaded from: classes3.dex */
public final class f5 extends mm2.e {

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f329024f;

    /* renamed from: g, reason: collision with root package name */
    public r45.xn1 f329025g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.ArrayList f329026h;

    /* renamed from: i, reason: collision with root package name */
    public int f329027i;

    /* renamed from: m, reason: collision with root package name */
    public int f329028m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f329029n;

    /* renamed from: o, reason: collision with root package name */
    public int f329030o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f5(gk2.e liveContext) {
        super(liveContext);
        kotlin.jvm.internal.o.g(liveContext, "liveContext");
        this.f329024f = new java.util.ArrayList();
        this.f329026h = new java.util.ArrayList();
        this.f329029n = "";
    }

    public final boolean N6() {
        ae2.in inVar = ae2.in.f3688a;
        jz5.g gVar = ae2.in.Z2;
        return ((java.lang.Number) ((lb2.j) ((jz5.n) gVar).getValue()).r()).intValue() != -1 ? ((java.lang.Number) ((lb2.j) ((jz5.n) gVar).getValue()).r()).intValue() != 0 : this.f329030o > 0;
    }

    @Override // androidx.lifecycle.c1
    public void onCleared() {
        this.f329024f.clear();
        this.f329025g = null;
        this.f329026h.clear();
        this.f329027i = 0;
        this.f329028m = 0;
        this.f329030o = 0;
    }
}
