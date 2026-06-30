package oh;

/* loaded from: classes7.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final oh.d f345176d = new oh.d();

    public d() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a("/sys/class/kgsl/kgsl-3d0/gpubusy"));
        if (r6Var.m()) {
            try {
                java.io.RandomAccessFile randomAccessFile = new java.io.RandomAccessFile(r6Var.o(), "r");
                try {
                    com.tencent.mars.xlog.Log.i("MicroMsg.GpuBusySnapshot", "read gpu-busy: " + randomAccessFile.readLine());
                    vz5.b.a(randomAccessFile, null);
                } finally {
                }
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.GpuBusySnapshot", th6, "read gpu-busy err", new java.lang.Object[0]);
                java.lang.String message = th6.getMessage();
                if (message == null) {
                    message = "";
                }
                if (r26.n0.B(message, "EACCES", false)) {
                    return java.lang.Boolean.TRUE;
                }
            }
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.GpuBusySnapshot", "file not exists: " + r6Var.o());
        }
        return java.lang.Boolean.FALSE;
    }
}
