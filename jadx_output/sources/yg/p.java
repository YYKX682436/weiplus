package yg;

/* loaded from: classes7.dex */
public class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.magicbrush.MBRuntime f462113d;

    public p(com.tencent.magicbrush.MBRuntime mBRuntime) {
        this.f462113d = mBRuntime;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f462113d.f48584h.h();
        com.tencent.magicbrush.MBRuntime mBRuntime = this.f462113d;
        mBRuntime.nativePause(mBRuntime.f48577a);
    }
}
