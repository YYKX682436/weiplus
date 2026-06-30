package mn2;

/* loaded from: classes4.dex */
public final class t3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mn2.x3 f330118d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f330119e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f330120f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ dn.h f330121g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t3(mn2.x3 x3Var, java.lang.String str, int i17, dn.h hVar) {
        super(0);
        this.f330118d = x3Var;
        this.f330119e = str;
        this.f330120f = i17;
        this.f330121g = hVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        mn2.x3 x3Var = this.f330118d;
        t21.h0 h0Var = x3Var.f330160e;
        int i17 = this.f330120f;
        if (h0Var != null) {
            h0Var.o(this.f330119e, i17);
        }
        cw2.eb ebVar = x3Var.f330159d;
        if (ebVar != null) {
            ebVar.q(i17, x3Var.f330161f, this.f330121g);
        }
        return jz5.f0.f302826a;
    }
}
