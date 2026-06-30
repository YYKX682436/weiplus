package nv;

/* loaded from: classes4.dex */
public class a3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f340297d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f340298e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ byte[] f340299f;

    public a3(nv.b3 b3Var, java.lang.String str, java.lang.String str2, byte[] bArr) {
        this.f340297d = str;
        this.f340298e = str2;
        this.f340299f = bArr;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupCore.MsgSynchronize", "start MsgSynchronizeServer");
        if (vi3.k.f437601f == null) {
            vi3.k.f437601f = new vi3.k();
        }
        vi3.k.f437601f.d(this.f340297d, this.f340298e, this.f340299f, "");
    }
}
