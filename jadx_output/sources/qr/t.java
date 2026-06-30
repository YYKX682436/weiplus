package qr;

/* loaded from: classes12.dex */
public final class t extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qr.x f366046d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(qr.x xVar) {
        super(1);
        this.f366046d = xVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        qr.x xVar = this.f366046d;
        if (booleanValue) {
            xVar.a(0);
        } else {
            xVar.getClass();
            new qr.r(xVar.f366019a, xVar.f366020b, new qr.w(xVar));
        }
        return jz5.f0.f302826a;
    }
}
