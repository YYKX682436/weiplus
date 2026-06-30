package ds1;

/* loaded from: classes7.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ds1.j f242843d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f242844e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(ds1.j jVar, yz5.l lVar) {
        super(2);
        this.f242843d = jVar;
        this.f242844e = lVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        yz5.l lVar = this.f242844e;
        if (booleanValue) {
            ds1.h hVar = new ds1.h(lVar, booleanValue);
            this.f242843d.f242847d = true;
            hVar.invoke();
        } else {
            lVar.invoke(java.lang.Boolean.FALSE);
        }
        return jz5.f0.f302826a;
    }
}
