package ho1;

/* loaded from: classes15.dex */
public final class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ho1.v f282749d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f282750e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f282751f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ byte[] f282752g;

    public m(ho1.v vVar, long j17, java.lang.String str, byte[] bArr) {
        this.f282749d = vVar;
        this.f282750e = j17;
        this.f282751f = str;
        this.f282752g = bArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ho1.v vVar = this.f282749d;
        java.lang.String str = vVar.f282829a;
        java.lang.Object[] objArr = new java.lang.Object[3];
        long j17 = this.f282750e;
        objArr[0] = java.lang.Long.valueOf(j17);
        java.lang.String str2 = this.f282751f;
        objArr[1] = str2;
        byte[] bArr = this.f282752g;
        objArr[2] = bArr != null ? java.lang.Integer.valueOf(bArr.length) : null;
        com.tencent.mars.xlog.Log.i(str, "fileStreamWriteOnceAsync, before open, taskId = %s, remotePath = %s, buf.size = %s", objArr);
        ro1.g gVar = vVar.f282831c;
        if (gVar == null) {
            kotlin.jvm.internal.o.o("mUDiskChannel");
            throw null;
        }
        java.io.OutputStream h17 = gVar.h(str2);
        if (h17 != null) {
            try {
                h17.write(bArr);
                com.tencent.wechat.aff.affroam.t0 t0Var = vVar.f282836h;
                if (t0Var != null) {
                    t0Var.T(j17, 0);
                }
                vz5.b.a(h17, null);
                return;
            } catch (java.lang.Throwable th6) {
                try {
                    com.tencent.mars.xlog.Log.printErrStackTrace(vVar.f282829a, th6, "", new java.lang.Object[0]);
                    vz5.b.a(h17, null);
                } catch (java.lang.Throwable th7) {
                    try {
                        throw th7;
                    } catch (java.lang.Throwable th8) {
                        vz5.b.a(h17, th7);
                        throw th8;
                    }
                }
            }
        }
        com.tencent.wechat.aff.affroam.t0 t0Var2 = vVar.f282836h;
        if (t0Var2 != null) {
            t0Var2.T(j17, -1);
        }
    }
}
