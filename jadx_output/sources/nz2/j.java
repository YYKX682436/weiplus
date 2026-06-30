package nz2;

/* loaded from: classes9.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f341560d;

    public j(nz2.n nVar, boolean z17) {
        this.f341560d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.sdk.platformtools.o4.M("mmkv.wallet").putBoolean("MMKV_KEY_HAS_FINGER", this.f341560d);
    }
}
