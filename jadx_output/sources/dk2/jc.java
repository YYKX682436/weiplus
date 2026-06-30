package dk2;

/* loaded from: classes3.dex */
public final class jc implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public static final dk2.jc f233662d = new dk2.jc();

    @Override // com.tencent.mm.sdk.platformtools.a4
    public final boolean onTimerExpired() {
        dk2.kc.f233696a.a(true);
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderLiveReporter", "cleanClientStatus");
        synchronized (hn0.v.f282440a) {
            hn0.v.f282441b.clear();
        }
        return true;
    }
}
