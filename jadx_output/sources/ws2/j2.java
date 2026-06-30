package ws2;

/* loaded from: classes3.dex */
public final class j2 extends mm2.e {

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f449059f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f449060g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.HashMap f449061h;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f449062i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f449063m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(gk2.e liveContext) {
        super(liveContext);
        kotlin.jvm.internal.o.g(liveContext, "liveContext");
        this.f449059f = "LiveRecordCountDownSlick";
        this.f449060g = jz5.h.b(ws2.c2.f449020d);
        this.f449061h = new java.util.HashMap();
        this.f449063m = jz5.h.b(new ws2.h2(this, liveContext));
    }

    public final void N6() {
        r45.nt2 nt2Var = ((mm2.f6) this.f328963d.a(mm2.f6.class)).E;
        boolean z17 = false;
        if (nt2Var != null && nt2Var.getInteger(0) == 2) {
            z17 = true;
        }
        if (!z17) {
            pm0.v.K(null, new ws2.e2(this));
        } else {
            this.f449061h.clear();
            ((com.tencent.mm.sdk.platformtools.b4) ((jz5.n) this.f449063m).getValue()).d();
        }
    }

    @Override // androidx.lifecycle.c1
    public void onCleared() {
        super.onCleared();
        this.f449061h.clear();
        ((com.tencent.mm.sdk.platformtools.b4) ((jz5.n) this.f449063m).getValue()).d();
    }
}
