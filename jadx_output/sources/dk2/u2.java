package dk2;

/* loaded from: classes3.dex */
public final class u2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f234146d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f234147e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.s f234148f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f234149g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.sw1 f234150h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(int i17, int i18, yz5.s sVar, java.lang.String str, r45.sw1 sw1Var) {
        super(0);
        this.f234146d = i17;
        this.f234147e = i18;
        this.f234148f = sVar;
        this.f234149g = str;
        this.f234150h = sw1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        yz5.s sVar = this.f234148f;
        int i17 = this.f234147e;
        int i18 = this.f234146d;
        if (i18 == 0 && i17 == 0) {
            if (sVar != null) {
                sVar.v(java.lang.Boolean.TRUE, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17), this.f234149g, this.f234150h);
            }
        } else if (sVar != null) {
            sVar.v(java.lang.Boolean.FALSE, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17), this.f234149g, this.f234150h);
        }
        return jz5.f0.f302826a;
    }
}
