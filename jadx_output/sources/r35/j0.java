package r35;

/* loaded from: classes9.dex */
public class j0 implements wu5.h {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f369142d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f369143e;

    public j0(java.lang.String str, com.tencent.mm.sdk.platformtools.n3 n3Var) {
        this.f369142d = str;
        this.f369143e = n3Var;
    }

    @Override // wu5.h, wu5.g
    public java.lang.String getKey() {
        return "CdnImageView_download";
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str = this.f369142d;
        byte[] u07 = com.tencent.mm.sdk.platformtools.t8.u0(str);
        android.os.Message obtain = android.os.Message.obtain();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putByteArray("k_data", u07);
        bundle.putString("k_url", str);
        obtain.setData(bundle);
        this.f369143e.sendMessage(obtain);
    }
}
