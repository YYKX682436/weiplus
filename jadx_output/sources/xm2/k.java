package xm2;

/* loaded from: classes14.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xm2.l f455221d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(xm2.l lVar) {
        super(1);
        this.f455221d = lVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        xm2.l lVar = this.f455221d;
        yz5.l lVar2 = lVar.f455226e;
        if (lVar2 != null) {
            lVar2.invoke(lVar.f455222a.get(e06.p.f(intValue, 0, r0.size() - 1)));
        }
        return jz5.f0.f302826a;
    }
}
