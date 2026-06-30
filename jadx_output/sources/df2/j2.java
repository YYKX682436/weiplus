package df2;

/* loaded from: classes10.dex */
public final class j2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.k2 f230447d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(df2.k2 k2Var) {
        super(0);
        this.f230447d = k2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        df2.k2 k2Var = this.f230447d;
        mn0.b0 Z6 = k2Var.Z6();
        if (Z6 == null) {
            com.tencent.mars.xlog.Log.i("FinderLiveMediaBrowserController", "unregisterPlayerListener - Skip, cdnPlayer not available");
        } else {
            mn0.y yVar = (mn0.y) Z6;
            if (yVar.f329808g.contains(k2Var)) {
                yVar.x(k2Var);
                com.tencent.mars.xlog.Log.i("FinderLiveMediaBrowserController", "unregisterPlayerListener - Listener removed");
            } else {
                com.tencent.mars.xlog.Log.i("FinderLiveMediaBrowserController", "unregisterPlayerListener - Skip, cdnPlayer does not contain listener");
            }
        }
        k2Var.f230545n = null;
        android.support.v4.media.m mVar = k2Var.f230544m;
        if (mVar != null) {
            mVar.a();
        }
        k2Var.f230544m = null;
        com.tencent.mars.xlog.Log.i("FinderLiveMediaBrowserController", "stopMediaBrowser - MediaBrowser disconnected");
        return jz5.f0.f302826a;
    }
}
