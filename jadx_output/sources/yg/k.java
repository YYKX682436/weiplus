package yg;

/* loaded from: classes7.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f462097d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.magicbrush.MBRuntime f462098e;

    public k(com.tencent.magicbrush.MBRuntime mBRuntime, int i17) {
        this.f462098e = mBRuntime;
        this.f462097d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.magicbrush.MBRuntime mBRuntime = this.f462098e;
        mBRuntime.nativeNotifyWindowDestroyed(mBRuntime.f48577a, this.f462097d);
    }
}
