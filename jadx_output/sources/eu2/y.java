package eu2;

/* loaded from: classes2.dex */
public final class y implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f256814d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ eu2.b0 f256815e;

    public y(long j17, eu2.b0 b0Var) {
        this.f256814d = j17;
        this.f256815e = b0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mars.xlog.Log.i("FinderVideoSystemPlayerController", "[updateSystemPlayerWhenScreenOff] cancel notification, delayMs= " + this.f256814d + '!');
        this.f256815e.Ni();
    }
}
