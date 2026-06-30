package nl4;

/* loaded from: classes11.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nl4.r f338206d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(nl4.r rVar) {
        super(0);
        this.f338206d = rVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        nl4.r rVar = this.f338206d;
        java.lang.String str = rVar.f338242l;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("seekend, callback:");
        sb6.append(rVar.f338231a);
        sb6.append(", null?");
        sb6.append(rVar.f338231a == null);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        ll4.a aVar = rVar.f338231a;
        if (aVar != null) {
            ll4.a.a(aVar, 10, null, 2, null);
        }
        return jz5.f0.f302826a;
    }
}
