package l0;

/* loaded from: classes14.dex */
public final class d4 extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l0.m3 f314124d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f314125e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f314126f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ c0.n f314127g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f314128h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f314129i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d4(l0.m3 m3Var, boolean z17, boolean z18, c0.n nVar, int i17, int i18) {
        super(3);
        this.f314124d = m3Var;
        this.f314125e = z17;
        this.f314126f = z18;
        this.f314127g = nVar;
        this.f314128h = i17;
        this.f314129i = i18;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        l0.l0 it = (l0.l0) obj;
        ((java.lang.Number) obj3).intValue();
        kotlin.jvm.internal.o.g(it, "it");
        n0.y0 y0Var = (n0.y0) ((n0.o) obj2);
        y0Var.U(697243846);
        boolean z17 = it == l0.l0.UnfocusedEmpty ? false : this.f314126f;
        int i17 = (this.f314128h >> 27) & 14;
        int i18 = this.f314129i;
        int i19 = i17 | ((i18 << 3) & ce1.h.CTRL_INDEX) | (i18 & 7168);
        l0.y yVar = (l0.y) this.f314124d;
        yVar.getClass();
        c0.n interactionSource = this.f314127g;
        kotlin.jvm.internal.o.g(interactionSource, "interactionSource");
        y0Var.U(727091888);
        n0.e5 e17 = n0.s4.e(new e1.y(!this.f314125e ? yVar.f314644r : z17 ? yVar.f314645s : ((java.lang.Boolean) c0.h.a(interactionSource, y0Var, (i19 >> 6) & 14).getValue()).booleanValue() ? yVar.f314642p : yVar.f314643q), y0Var, 0);
        y0Var.o(false);
        long j17 = ((e1.y) e17.getValue()).f246322a;
        y0Var.o(false);
        return new e1.y(j17);
    }
}
