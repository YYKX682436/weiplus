package m2;

/* loaded from: classes14.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.tooling.ComposeViewAdapter f322930d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.p f322931e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f322932f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(androidx.compose.ui.tooling.ComposeViewAdapter composeViewAdapter, yz5.p pVar, int i17) {
        super(2);
        this.f322930d = composeViewAdapter;
        this.f322931e = pVar;
        this.f322932f = i17;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        n0.o oVar = (n0.o) obj;
        if ((((java.lang.Number) obj2).intValue() & 11) == 2) {
            n0.y0 y0Var = (n0.y0) oVar;
            if (y0Var.v()) {
                y0Var.O();
                return jz5.f0.f302826a;
            }
        }
        m2.d0.a(this.f322930d.f10840i, this.f322931e, oVar, (this.f322932f << 3) & 112);
        return jz5.f0.f302826a;
    }
}
