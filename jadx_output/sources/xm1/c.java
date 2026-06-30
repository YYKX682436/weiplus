package xm1;

/* loaded from: classes12.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f455158d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f455159e;

    public c(boolean z17, boolean z18) {
        this.f455158d = z17;
        this.f455159e = z18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseAudioManager", "isBluetoothScoOn: %s isBluetoothA2dpOn: %s, isBluetoothCanUse: %s", java.lang.Boolean.valueOf(this.f455158d), java.lang.Boolean.valueOf(this.f455159e), java.lang.Boolean.valueOf(an1.c.f8833a.b()));
    }
}
