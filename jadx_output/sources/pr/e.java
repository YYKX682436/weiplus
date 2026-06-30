package pr;

/* loaded from: classes4.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pr.f f357702d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(pr.f fVar) {
        super(1);
        this.f357702d = fVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        pr.f fVar = this.f357702d;
        if (booleanValue) {
            fVar.b(fp0.u.f265290f);
        } else {
            fVar.b(fp0.u.f265291g);
        }
        return jz5.f0.f302826a;
    }
}
