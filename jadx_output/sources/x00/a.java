package x00;

/* loaded from: classes8.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t10.d f450970d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(t10.d dVar) {
        super(1);
        this.f450970d = dVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        t10.d dVar = this.f450970d;
        if (booleanValue) {
            dVar.d(null);
        } else {
            dVar.c("user cancel");
        }
        return jz5.f0.f302826a;
    }
}
