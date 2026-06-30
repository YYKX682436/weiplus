package zn0;

/* loaded from: classes3.dex */
public final class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zn0.s f474365d;

    public m(zn0.s sVar) {
        this.f474365d = sVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zn0.s sVar = this.f474365d;
        if (sVar.f474392j) {
            sVar.f474392j = false;
            com.tencent.mars.xlog.Log.i("FinderLivePublishMediaStream", "Call realPublishMediaStream");
            if (sVar.f474388f != null) {
                com.tencent.mars.xlog.Log.i("FinderLivePublishMediaStream", "Has nextDataWrap");
                sVar.f474387e = sVar.f474388f;
                sVar.f474388f = null;
            }
            sVar.f();
        } else {
            com.tencent.mars.xlog.Log.e("FinderLivePublishMediaStream", "shouldPublishMediaStreamAfterDelay is false");
        }
        sVar.f474395m = null;
    }
}
