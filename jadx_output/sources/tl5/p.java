package tl5;

/* loaded from: classes10.dex */
public final class p extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tl5.s f420380d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(tl5.s sVar) {
        super(1);
        this.f420380d = sVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        float floatValue = ((java.lang.Number) obj).floatValue();
        tl5.d dVar = this.f420380d.f420388d;
        if (dVar != null) {
            dVar.b(floatValue, true);
        }
        return jz5.f0.f302826a;
    }
}
