package za3;

/* loaded from: classes9.dex */
public class k0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f470970d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f470971e;

    public k0(java.lang.String str, com.tencent.mm.sdk.platformtools.n3 n3Var) {
        this.f470970d = str;
        this.f470971e = n3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        byte[] u07 = com.tencent.mm.sdk.platformtools.t8.u0(this.f470970d);
        android.os.Message obtain = android.os.Message.obtain();
        obtain.obj = u07;
        this.f470971e.sendMessage(obtain);
    }
}
