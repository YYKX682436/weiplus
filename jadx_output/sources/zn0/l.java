package zn0;

/* loaded from: classes3.dex */
public final class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zn0.s f474364d;

    public l(zn0.s sVar) {
        this.f474364d = sVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zn0.s sVar = this.f474364d;
        zn0.k kVar = sVar.f474389g;
        zn0.k kVar2 = zn0.k.f474359d;
        if (kVar == kVar2) {
            com.tencent.mars.xlog.Log.i("FinderLivePublishMediaStream", "self.currentState is None");
        } else {
            com.tencent.mars.xlog.Log.i("FinderLivePublishMediaStream", "currentState: " + sVar.f474389g);
            int ordinal = sVar.f474389g.ordinal();
            if (ordinal == 1) {
                sVar.f474389g = kVar2;
                sVar.g(zn0.j.f474355d, null, -16661, "WeChat Live wait PublishMediaStream result timeout", 0);
                java.lang.String str = sVar.f474385c;
                if (!(str == null || str.length() == 0)) {
                    com.tencent.mars.xlog.Log.e("FinderLivePublishMediaStream", "publishMediaStreamTaskId is not nil: " + sVar.f474385c);
                    sVar.f474385c = null;
                }
                sVar.f474390h++;
                sVar.i();
            } else if (ordinal == 2) {
                sVar.f474389g = kVar2;
                java.lang.String str2 = sVar.f474385c;
                if (str2 == null || str2.length() == 0) {
                    com.tencent.mars.xlog.Log.e("FinderLivePublishMediaStream", "publishMediaStreamTaskId.length is 0");
                } else {
                    sVar.g(zn0.j.f474356e, sVar.f474385c, -16661, "WeChat Live wait PublishMediaStream result timeout", 0);
                    sVar.f474390h++;
                    sVar.j();
                }
            } else if (ordinal != 3) {
                com.tencent.mars.xlog.Log.e("FinderLivePublishMediaStream", "Invalid currentState: " + sVar.f474389g);
            } else {
                sVar.f474389g = kVar2;
                sVar.g(zn0.j.f474357f, sVar.f474385c, -16661, "WeChat Live wait PublishMediaStream result timeout", 0);
                sVar.h();
            }
        }
        sVar.f474396n = null;
    }
}
