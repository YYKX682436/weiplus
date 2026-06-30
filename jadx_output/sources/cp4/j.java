package cp4;

/* loaded from: classes10.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cp4.r f221039d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(cp4.r rVar) {
        super(1);
        this.f221039d = rVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        cp4.r rVar = this.f221039d;
        rVar.f221058f.setShow(false);
        cp4.r.z(rVar, intValue);
        return jz5.f0.f302826a;
    }
}
