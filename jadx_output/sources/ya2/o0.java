package ya2;

/* loaded from: classes.dex */
public final class o0 implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f460517a;

    public o0(yz5.l lVar) {
        this.f460517a = lVar;
    }

    @Override // q80.f0
    public void fail() {
        com.tencent.mars.xlog.Log.i("FinderRouterApi", "OpenLiteApp fail");
        yz5.l lVar = this.f460517a;
        if (lVar != null) {
            lVar.invoke(java.lang.Boolean.FALSE);
        }
    }

    @Override // q80.f0
    public void success() {
        com.tencent.mars.xlog.Log.i("FinderRouterApi", "OpenLiteApp success");
        yz5.l lVar = this.f460517a;
        if (lVar != null) {
            lVar.invoke(java.lang.Boolean.TRUE);
        }
    }
}
