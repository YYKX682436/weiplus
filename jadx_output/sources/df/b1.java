package df;

/* loaded from: classes7.dex */
public final class b1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.skyline.SkylineRuntime f229431d;

    public b1(com.tencent.skyline.SkylineRuntime skylineRuntime) {
        this.f229431d = skylineRuntime;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.skyline.SkylineLog.i("SkylinePreloader", this.f229431d + " hello task runner");
    }
}
