package f92;

/* loaded from: classes10.dex */
public final class h implements c01.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f260248d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qb2.t f260249e;

    public h(java.lang.String str, qb2.t tVar) {
        this.f260248d = str;
        this.f260249e = tVar;
    }

    @Override // c01.da
    public boolean a() {
        return false;
    }

    @Override // c01.da
    public void c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[deleteMyLocalAccountData] finderUsername=");
        sb6.append(this.f260248d);
        sb6.append(" delete msg end... ");
        qb2.t tVar = this.f260249e;
        sb6.append(tVar.F1);
        sb6.append(' ');
        sb6.append(tVar.field_sessionId);
        com.tencent.mars.xlog.Log.i("Finder.AccountLogicHandler", sb6.toString());
    }
}
