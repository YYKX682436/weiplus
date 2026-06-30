package hm;

/* loaded from: classes12.dex */
public final class f extends jm0.g {

    /* renamed from: i, reason: collision with root package name */
    public static final hm.a f282148i = new hm.a(null);

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f282149f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f282150g;

    /* renamed from: h, reason: collision with root package name */
    public final xg3.h0 f282151h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(jm0.o service) {
        super(service);
        kotlin.jvm.internal.o.g(service, "service");
        this.f282149f = jz5.h.b(hm.b.f282142d);
        this.f282150g = jz5.h.b(hm.e.f282147d);
        this.f282151h = new hm.c(this);
    }

    @Override // jm0.g
    public void P6(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().n0(this.f282151h, null);
    }

    @Override // jm0.g
    public void S6() {
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().za(this.f282151h);
    }

    public final java.util.HashMap T6() {
        return (java.util.HashMap) ((jz5.n) this.f282149f).getValue();
    }
}
