package ho1;

/* loaded from: classes15.dex */
public final class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ho1.v f282741d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f282742e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f282743f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ byte[] f282744g;

    public l(ho1.v vVar, java.lang.String str, long j17, byte[] bArr) {
        this.f282741d = vVar;
        this.f282742e = str;
        this.f282743f = j17;
        this.f282744g = bArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ho1.v vVar = this.f282741d;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = vVar.f282834f;
        java.lang.String str = this.f282742e;
        java.io.OutputStream outputStream = (java.io.OutputStream) concurrentHashMap.remove(str);
        long j17 = this.f282743f;
        if (outputStream != null) {
            byte[] bArr = this.f282744g;
            try {
                com.tencent.mars.xlog.Log.i(vVar.f282829a, "fileStreamWriteEndAsync before write, taskId=" + j17 + " context=" + str);
                if (!(bArr.length == 0)) {
                    outputStream.write(bArr);
                }
                com.tencent.wechat.aff.affroam.t0 t0Var = vVar.f282836h;
                if (t0Var != null) {
                    t0Var.E0(j17, 0);
                }
                vz5.b.a(outputStream, null);
                return;
            } catch (java.lang.Throwable th6) {
                try {
                    com.tencent.mars.xlog.Log.printErrStackTrace(vVar.f282829a, th6, "fail to write buf. context = " + str + ", taskId=" + j17 + ", buf.size=" + bArr.length + ", tr=" + th6, new java.lang.Object[0]);
                    vz5.b.a(outputStream, null);
                } catch (java.lang.Throwable th7) {
                    try {
                        throw th7;
                    } catch (java.lang.Throwable th8) {
                        vz5.b.a(outputStream, th7);
                        throw th8;
                    }
                }
            }
        }
        com.tencent.wechat.aff.affroam.t0 t0Var2 = vVar.f282836h;
        if (t0Var2 != null) {
            t0Var2.E0(j17, -1);
        }
    }
}
