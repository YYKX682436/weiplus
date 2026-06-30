package ox;

/* loaded from: classes7.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l81.b1 f349455d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f349456e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ tk.p f349457f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(l81.b1 b1Var, android.content.Context context, tk.p pVar) {
        super(1);
        this.f349455d = b1Var;
        this.f349456e = context;
        this.f349457f = pVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        l81.b1 b1Var = this.f349455d;
        b1Var.f317016c = intValue;
        ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).bj(this.f349456e, b1Var);
        this.f349457f.a(true, "", null);
        return jz5.f0.f302826a;
    }
}
