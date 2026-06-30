package uo;

/* loaded from: classes12.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uo.a f429517d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.p f429518e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(uo.a aVar, yz5.p pVar) {
        super(1);
        this.f429517d = aVar;
        this.f429518e = pVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        uo.a aVar = this.f429517d;
        if (booleanValue) {
            uo.n.f429522a.f(null);
        } else {
            uo.n.f429522a.h(aVar, this.f429518e);
        }
        java.lang.String[] strArr = new java.lang.String[4];
        strArr[0] = java.lang.String.valueOf(aVar.f429502d);
        strArr[1] = booleanValue ? "1" : "0";
        strArr[2] = java.lang.String.valueOf(aVar.f429501c);
        strArr[3] = java.lang.String.valueOf(aVar.f429503e);
        ap.a.a(1, "openCameraRetry", null, null, strArr);
        return jz5.f0.f302826a;
    }
}
