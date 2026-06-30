package nz2;

/* loaded from: classes9.dex */
public class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f341568d;

    public q(nz2.x xVar, boolean z17) {
        this.f341568d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.sdk.platformtools.o4.M("mmkv.wallet").putBoolean("MMKV_KEY_HAS_FACE_ID", this.f341568d);
    }
}
