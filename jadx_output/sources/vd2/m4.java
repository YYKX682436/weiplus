package vd2;

/* loaded from: classes3.dex */
public final class m4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.FinderLiveViewCallback f435810d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f435811e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f435812f;

    public m4(com.tencent.mm.plugin.finder.live.FinderLiveViewCallback finderLiveViewCallback, long j17, java.lang.String str) {
        this.f435810d = finderLiveViewCallback;
        this.f435811e = j17;
        this.f435812f = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str;
        km2.n nVar;
        java.util.HashMap hashMap;
        km2.n nVar2;
        com.tencent.mm.autogen.events.FinderLiveSwitchEvent finderLiveSwitchEvent = new com.tencent.mm.autogen.events.FinderLiveSwitchEvent();
        vd2.t1 t1Var = this.f435810d.f111486h;
        int i17 = (t1Var == null || (nVar2 = dk2.ef.H) == null) ? 0 : nVar2.f309156h;
        am.dc dcVar = finderLiveSwitchEvent.f54299g;
        dcVar.f6441a = i17;
        java.lang.String str2 = this.f435812f;
        if (i17 != 4 || t1Var == null || (nVar = dk2.ef.H) == null || (hashMap = nVar.f309157i) == null || (str = (java.lang.String) hashMap.get(java.lang.Long.valueOf(this.f435811e))) == null) {
            str = str2;
        }
        dcVar.f6442b = str;
        finderLiveSwitchEvent.e();
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveViewCallback", "notifyLiveSwitch data.liveId:" + dcVar.f6442b + ", liveId:" + str2 + ", source:" + dcVar.f6441a);
    }
}
