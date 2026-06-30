package rg5;

/* loaded from: classes8.dex */
public final class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f395273d;

    public p(boolean z17) {
        this.f395273d = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f395273d) {
            return;
        }
        com.tencent.mars.xlog.Log.i("NearbyEntryPreferenceMgr", "handleNearbyEntranceRedDot notify but enableShowNearByEntranceRedDot = false ,remove NearByEntrance ShowInfo");
    }
}
