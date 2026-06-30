package qg3;

/* loaded from: classes2.dex */
public final class s0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f362859d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f362860e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ byte[] f362861f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f362862g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ bw5.d30 f362863h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.l f362864i;

    public s0(int i17, int i18, byte[] bArr, int i19, bw5.d30 d30Var, yz5.l lVar) {
        this.f362859d = i17;
        this.f362860e = i18;
        this.f362861f = bArr;
        this.f362862g = i19;
        this.f362863h = d30Var;
        this.f362864i = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = this.f362859d;
        int i18 = this.f362860e;
        int i19 = this.f362862g;
        bw5.d30 d30Var = this.f362863h;
        byte[] lastBuffer = this.f362861f;
        kotlin.jvm.internal.o.g(lastBuffer, "lastBuffer");
        yz5.l callback = this.f362864i;
        kotlin.jvm.internal.o.g(callback, "callback");
        kotlinx.coroutines.l.d((kotlinx.coroutines.y0) ((jz5.n) qg3.e1.f362819b).getValue(), null, null, new qg3.u0(i19, d30Var, lastBuffer, i17, i18, callback, null), 3, null);
    }
}
