package p32;

/* loaded from: classes8.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f351456d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.vfs.r6 f351457e;

    public a(java.lang.String str, com.tencent.mm.vfs.r6 r6Var) {
        this.f351456d = str;
        this.f351457e = r6Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        byte[] u07 = com.tencent.mm.sdk.platformtools.t8.u0(this.f351456d);
        if (u07 != null) {
            com.tencent.mm.vfs.w6.S(this.f351457e.u(), u07, 0, u07.length);
        }
    }

    public java.lang.String toString() {
        return super.toString() + "|DownloadRunnable";
    }
}
