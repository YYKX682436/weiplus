package yg;

/* loaded from: classes7.dex */
public class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.magicbrush.MBRuntime f462112d;

    public o(com.tencent.magicbrush.MBRuntime mBRuntime) {
        this.f462112d = mBRuntime;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.magicbrush.MBRuntime mBRuntime = this.f462112d;
        mBRuntime.nativeResume(mBRuntime.f48577a);
        this.f462112d.f48584h.i();
    }
}
