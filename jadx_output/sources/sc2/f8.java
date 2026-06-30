package sc2;

/* loaded from: classes2.dex */
public final class f8 implements ff0.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sc2.p8 f405894a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.l f405895b;

    public f8(sc2.p8 p8Var, yz5.l lVar) {
        this.f405894a = p8Var;
        this.f405895b = lVar;
    }

    @Override // ff0.x
    public void a(ff0.z zVar) {
        yz5.l lVar;
        java.lang.String str = this.f405894a.f406152w;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onPickImageColorFinished ");
        sb6.append(zVar != null ? java.lang.Integer.valueOf(zVar.f261595a) : null);
        com.tencent.mars.xlog.Log.e(str, sb6.toString());
        if (zVar == null || (lVar = this.f405895b) == null) {
            return;
        }
        lVar.invoke(java.lang.Integer.valueOf(zVar.f261596b));
    }
}
