package kh2;

/* loaded from: classes10.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kh2.l f308002d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(kh2.l lVar) {
        super(0);
        this.f308002d = lVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str;
        kh2.l lVar = this.f308002d;
        jh2.a aVar = lVar.f308005b;
        if (aVar != null) {
            om2.u uVar = lVar.f308015l;
            if (uVar == null || (str = uVar.f346383a) == null) {
                str = "";
            }
            aVar.f6(str);
        }
        return jz5.f0.f302826a;
    }
}
