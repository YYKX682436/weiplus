package m2;

/* loaded from: classes13.dex */
public final class w extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f322950d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.tooling.ComposeViewAdapter f322951e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f322952f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f322953g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Class f322954h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f322955i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(long j17, androidx.compose.ui.tooling.ComposeViewAdapter composeViewAdapter, java.lang.String str, java.lang.String str2, java.lang.Class cls, int i17) {
        super(2);
        this.f322950d = j17;
        this.f322951e = composeViewAdapter;
        this.f322952f = str;
        this.f322953g = str2;
        this.f322954h = cls;
        this.f322955i = i17;
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
        java.lang.String str = this.f322952f;
        java.lang.String str2 = this.f322953g;
        java.lang.Class cls = this.f322954h;
        int i17 = this.f322955i;
        androidx.compose.ui.tooling.ComposeViewAdapter composeViewAdapter = this.f322951e;
        m2.v vVar = new m2.v(str, str2, oVar, cls, i17, composeViewAdapter);
        if (this.f322950d >= 0) {
            composeViewAdapter.setClock$ui_tooling_release(new n2.d(new m2.u(composeViewAdapter)));
        }
        vVar.invoke();
        return jz5.f0.f302826a;
    }
}
