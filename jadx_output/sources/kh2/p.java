package kh2;

/* loaded from: classes10.dex */
public final class p extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kh2.r f308026d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(kh2.r rVar) {
        super(0);
        this.f308026d = rVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str;
        kh2.r rVar = this.f308026d;
        jh2.a aVar = rVar.f308029b;
        if (aVar != null) {
            om2.u uVar = rVar.f308035h;
            if (uVar == null || (str = uVar.f346383a) == null) {
                str = "";
            }
            aVar.I4(str);
        }
        return jz5.f0.f302826a;
    }
}
