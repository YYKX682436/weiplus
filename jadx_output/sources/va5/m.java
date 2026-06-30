package va5;

/* loaded from: classes11.dex */
public final class m implements oa5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ va5.p f434417a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f434418b;

    public m(va5.p pVar, int i17) {
        this.f434417a = pVar;
        this.f434418b = i17;
    }

    @Override // oa5.a
    public final void a(float f17) {
        va5.p pVar = this.f434417a;
        if (pVar.B == null) {
            return;
        }
        pVar.c(((int) (this.f434418b + (((pVar.f434426h.getMTotalMenuWidth() + pVar.f434437v) - r1) * f17))) * pVar.f434422d);
    }
}
