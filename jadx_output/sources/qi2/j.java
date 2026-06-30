package qi2;

/* loaded from: classes10.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f363532d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qi2.n f363533e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(yz5.l lVar, qi2.n nVar) {
        super(1);
        this.f363532d = lVar;
        this.f363533e = nVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        yz5.l lVar = this.f363532d;
        if (lVar != null) {
            lVar.invoke(java.lang.Boolean.valueOf(booleanValue));
        }
        if (booleanValue) {
            this.f363533e.a();
        }
        return jz5.f0.f302826a;
    }
}
