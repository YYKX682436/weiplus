package dw3;

/* loaded from: classes7.dex */
public final class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f244238d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f244239e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f244240f;

    public o(java.lang.String str, java.lang.String str2, long j17) {
        this.f244238d = str;
        this.f244239e = str2;
        this.f244240f = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Iterable<com.tencent.mm.vfs.x1> s17;
        java.lang.StringBuilder sb6;
        java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("HH:mm:ss");
        simpleDateFormat.setTimeZone(java.util.TimeZone.getTimeZone("GMT+00:00"));
        java.lang.String str = this.f244238d;
        if (android.text.TextUtils.isEmpty(str) || !com.tencent.mm.vfs.w6.j(str) || (s17 = com.tencent.mm.vfs.w6.s(str, false)) == null) {
            return;
        }
        for (com.tencent.mm.vfs.x1 x1Var : s17) {
            java.lang.String relPath = x1Var.f213231a;
            kotlin.jvm.internal.o.f(relPath, "relPath");
            if (r26.n0.B(relPath, this.f244239e, false)) {
                long j17 = x1Var.f213235e;
                java.util.Date date = new java.util.Date(j17);
                java.lang.String format = simpleDateFormat.format(java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - j17));
                char D0 = r26.p0.D0(str);
                java.lang.String str2 = x1Var.f213231a;
                if (D0 == '/') {
                    sb6 = new java.lang.StringBuilder();
                    sb6.append(str);
                } else {
                    sb6 = new java.lang.StringBuilder();
                    sb6.append(str);
                    sb6.append(java.io.File.separator);
                }
                sb6.append(str2);
                java.lang.String sb7 = sb6.toString();
                com.tencent.mars.xlog.Log.i("MicroMsg.MediaFileUtil", "print file path:" + sb7 + " data:" + date + " time:" + j17 + " exist:" + format);
                if (java.lang.System.currentTimeMillis() - j17 >= this.f244240f) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.MediaFileUtil", "delete file path:" + sb7);
                    dw3.c0.f244182a.j(sb7);
                }
            }
        }
    }
}
