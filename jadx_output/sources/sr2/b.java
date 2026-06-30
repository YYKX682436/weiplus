package sr2;

/* loaded from: classes2.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sr2.c f411515d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(sr2.c cVar) {
        super(2);
        this.f411515d = cVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        java.lang.String str = (java.lang.String) obj2;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("success:");
        sb6.append(booleanValue);
        sb6.append(" , filePath:");
        sb6.append(str);
        sb6.append(", fileExist:");
        sr2.c cVar = this.f411515d;
        sb6.append(o35.a.b(cVar.f411522d));
        com.tencent.mars.xlog.Log.i("FinderMusicCheckUIC", sb6.toString());
        pm0.v.X(new sr2.a(cVar, str, booleanValue));
        return jz5.f0.f302826a;
    }
}
