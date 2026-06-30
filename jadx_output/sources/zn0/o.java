package zn0;

/* loaded from: classes3.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zn0.s f474367d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(zn0.s sVar) {
        super(0);
        this.f474367d = sVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        zn0.s sVar = this.f474367d;
        java.lang.String str = sVar.f474385c;
        if (str == null || str.length() == 0) {
            com.tencent.mars.xlog.Log.i("FinderLivePublishMediaStream", "publishMediaStreamTaskId.length is 0");
        } else {
            if (sVar.f474388f != null) {
                com.tencent.mars.xlog.Log.i("FinderLivePublishMediaStream", "Has nextDataWrap");
                sVar.f474388f = null;
            }
            if (sVar.f474387e != null) {
                com.tencent.mars.xlog.Log.i("FinderLivePublishMediaStream", "Has currentDataWrap");
                sVar.f474387e = null;
            }
            com.tencent.mars.xlog.Log.i("FinderLivePublishMediaStream", "currentState: " + sVar.f474389g + ", publishMediaStreamTaskId: " + sVar.f474385c);
            sVar.f474383a.stopPublishMediaStream(sVar.f474385c);
        }
        return jz5.f0.f302826a;
    }
}
