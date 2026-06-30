package nq2;

/* loaded from: classes2.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f338978d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(yz5.l lVar) {
        super(1);
        this.f338978d = lVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        jz5.f0 f0Var;
        az2.w wVar = (az2.w) obj;
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        if (wVar != null) {
            com.tencent.mars.xlog.Log.i("NearbyPreloadManager", "startPreloadSquareTabs hit requestCacheAsync");
            f0Var = f0Var2;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            this.f338978d.invoke("requestCacheAsync");
        }
        return f0Var2;
    }
}
