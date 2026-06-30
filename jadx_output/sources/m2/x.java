package m2;

/* loaded from: classes14.dex */
public final class x extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f322956d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.tooling.ComposeViewAdapter f322957e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f322958f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f322959g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f322960h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Class f322961i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f322962m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(yz5.a aVar, androidx.compose.ui.tooling.ComposeViewAdapter composeViewAdapter, long j17, java.lang.String str, java.lang.String str2, java.lang.Class cls, int i17) {
        super(2);
        this.f322956d = aVar;
        this.f322957e = composeViewAdapter;
        this.f322958f = j17;
        this.f322959g = str;
        this.f322960h = str2;
        this.f322961i = cls;
        this.f322962m = i17;
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
        n0.d2.h(this.f322956d, oVar, 0);
        androidx.compose.ui.tooling.ComposeViewAdapter composeViewAdapter = this.f322957e;
        androidx.compose.ui.tooling.ComposeViewAdapter.a(composeViewAdapter, u0.j.b(oVar, 1938351266, true, new m2.w(this.f322958f, composeViewAdapter, this.f322959g, this.f322960h, this.f322961i, this.f322962m)), oVar, 70);
        return jz5.f0.f302826a;
    }
}
