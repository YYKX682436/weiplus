package df2;

/* loaded from: classes10.dex */
public final class g2 implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.k2 f230185d;

    public g2(df2.k2 k2Var) {
        this.f230185d = k2Var;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mars.xlog.Log.i("FinderLiveMediaBrowserController", "startCollectingLiveInfo - Live info changed, trigger=" + ((java.lang.Number) obj).intValue());
        df2.k2 k2Var = this.f230185d;
        k2Var.getClass();
        com.tencent.mars.xlog.Log.i("FinderLiveMediaBrowserController", "notifyLiveInfoChanged - Send update live info command to service");
        android.support.v4.media.session.r rVar = k2Var.f230545n;
        if (rVar != null) {
            sn2.c cVar = sn2.c.f410120e;
            rVar.a("UPDATE_LIVE_INFO", null, null);
        }
        return jz5.f0.f302826a;
    }
}
