package ho1;

/* loaded from: classes15.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ho1.v f282719d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f282720e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f282721f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ byte[] f282722g;

    public j(ho1.v vVar, java.lang.String str, long j17, byte[] bArr) {
        this.f282719d = vVar;
        this.f282720e = str;
        this.f282721f = j17;
        this.f282722g = bArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ho1.v vVar = this.f282719d;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = vVar.f282834f;
        java.lang.String str = this.f282720e;
        java.io.OutputStream outputStream = (java.io.OutputStream) concurrentHashMap.get(str);
        long j17 = this.f282721f;
        if (outputStream != null) {
            byte[] bArr = this.f282722g;
            try {
                com.tencent.mars.xlog.Log.i(vVar.f282829a, "Enter fileStreamWriteAsync, before write, taskId: " + j17 + ", context: " + str);
                outputStream.write(bArr);
                com.tencent.wechat.aff.affroam.t0 t0Var = vVar.f282836h;
                if (t0Var != null) {
                    t0Var.g0(j17, 0);
                    return;
                }
                return;
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.printErrStackTrace(vVar.f282829a, th6, "fail to write buf. context = " + str + ", taskId: " + j17 + ", buf.size=" + bArr.length + ", e=" + th6, new java.lang.Object[0]);
            }
        }
        com.tencent.wechat.aff.affroam.t0 t0Var2 = vVar.f282836h;
        if (t0Var2 != null) {
            t0Var2.g0(j17, -1);
        }
    }
}
