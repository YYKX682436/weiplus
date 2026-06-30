package sc2;

/* loaded from: classes2.dex */
public final class y1 implements ff0.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sc2.f2 f406378a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.l f406379b;

    public y1(sc2.f2 f2Var, yz5.l lVar) {
        this.f406378a = f2Var;
        this.f406379b = lVar;
    }

    @Override // ff0.x
    public void a(ff0.z zVar) {
        yz5.l lVar;
        java.lang.String k17 = this.f406378a.k();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onPickImageColorFinished ");
        sb6.append(zVar != null ? java.lang.Integer.valueOf(zVar.f261595a) : null);
        com.tencent.mars.xlog.Log.e(k17, sb6.toString());
        if (zVar == null || (lVar = this.f406379b) == null) {
            return;
        }
        lVar.invoke(java.lang.Integer.valueOf(zVar.f261596b));
    }
}
