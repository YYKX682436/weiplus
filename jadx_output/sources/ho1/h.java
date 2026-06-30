package ho1;

/* loaded from: classes15.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ho1.v f282696d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f282697e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f282698f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f282699g;

    public h(ho1.v vVar, java.lang.String str, long j17, long j18) {
        this.f282696d = vVar;
        this.f282697e = str;
        this.f282698f = j17;
        this.f282699g = j18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17;
        ho1.v vVar = this.f282696d;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = vVar.f282835g;
        java.lang.String str = this.f282697e;
        java.io.InputStream inputStream = (java.io.InputStream) concurrentHashMap.get(str);
        long j17 = this.f282698f;
        if (inputStream != null) {
            long j18 = this.f282699g;
            int i18 = (int) j18;
            byte[] bArr = new byte[i18];
            try {
                if (inputStream.read(bArr) != i18) {
                    java.io.InputStream inputStream2 = (java.io.InputStream) vVar.f282835g.remove(str);
                    if (inputStream2 != null) {
                        inputStream2.close();
                    }
                    i17 = 1;
                } else {
                    i17 = 0;
                }
                com.tencent.wechat.aff.affroam.t0 t0Var = vVar.f282836h;
                if (t0Var != null) {
                    t0Var.D0(j17, i17, bArr);
                    return;
                }
                return;
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.printErrStackTrace(vVar.f282829a, th6, "fail to read, taskId=" + j17 + ", readSize=" + j18 + ", e=" + th6, new java.lang.Object[0]);
            }
        }
        com.tencent.wechat.aff.affroam.t0 t0Var2 = vVar.f282836h;
        if (t0Var2 != null) {
            t0Var2.D0(j17, -1, new byte[0]);
        }
    }
}
