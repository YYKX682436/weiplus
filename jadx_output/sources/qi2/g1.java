package qi2;

/* loaded from: classes10.dex */
public final class g1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f363523d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qi2.j1 f363524e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(yz5.l lVar, qi2.j1 j1Var) {
        super(1);
        this.f363523d = lVar;
        this.f363524e = j1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        yz5.l lVar = this.f363523d;
        if (lVar != null) {
            lVar.invoke(java.lang.Boolean.valueOf(booleanValue));
        }
        if (booleanValue) {
            this.f363524e.a();
        }
        return jz5.f0.f302826a;
    }
}
