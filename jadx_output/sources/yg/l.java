package yg;

/* loaded from: classes7.dex */
public class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ch.b f462099d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f462100e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f462101f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f462102g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.magicbrush.MBRuntime f462103h;

    public l(com.tencent.magicbrush.MBRuntime mBRuntime, ch.b bVar, long j17, int i17, int i18) {
        this.f462103h = mBRuntime;
        this.f462099d = bVar;
        this.f462100e = j17;
        this.f462101f = i17;
        this.f462102g = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f462103h.f48577a != 0) {
            com.tencent.magicbrush.MBRuntime mBRuntime = this.f462103h;
            mBRuntime.nativeNotifyTouchEvent(mBRuntime.f48577a, this.f462101f, this.f462102g, this.f462100e);
            return;
        }
        ch.b bVar = this.f462099d;
        long j17 = this.f462100e;
        com.tencent.magicbrush.handler.JsTouchEventHandler jsTouchEventHandler = (com.tencent.magicbrush.handler.JsTouchEventHandler) ((ch.d) bVar).f41179a.get();
        if (jsTouchEventHandler != null) {
            jsTouchEventHandler.nativeFreeTouchEvent(j17);
        }
    }
}
