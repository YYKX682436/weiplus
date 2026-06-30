package zn0;

/* loaded from: classes3.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zn0.s f474366d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(zn0.s sVar) {
        super(0);
        this.f474366d = sVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        zn0.s sVar = this.f474366d;
        if (sVar.f474389g != zn0.k.f474359d) {
            com.tencent.mars.xlog.Log.e("FinderLivePublishMediaStream", "currentState: " + sVar.f474389g);
            sVar.f474393k = true;
        } else {
            if (sVar.f474388f != null) {
                com.tencent.mars.xlog.Log.w("FinderLivePublishMediaStream", "Has nextDataWrap");
                sVar.f474387e = sVar.f474388f;
                sVar.f474388f = null;
            }
            if (sVar.f474387e == null) {
                com.tencent.mars.xlog.Log.e("FinderLivePublishMediaStream", "currentDataWrap is null");
            } else {
                com.tencent.mars.xlog.Log.i("FinderLivePublishMediaStream", "Call realPublishMediaStream");
                sVar.f();
            }
        }
        return jz5.f0.f302826a;
    }
}
