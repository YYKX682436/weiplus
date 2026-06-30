package is0;

/* loaded from: classes14.dex */
public final class a implements java.io.Closeable {

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f294386d;

    /* renamed from: e, reason: collision with root package name */
    public final int f294387e;

    /* renamed from: f, reason: collision with root package name */
    public final long f294388f;

    /* renamed from: g, reason: collision with root package name */
    public final int f294389g;

    /* renamed from: h, reason: collision with root package name */
    public final long f294390h;

    public a(long j17) {
        this.f294387e = -1;
        this.f294388f = 2L;
        this.f294389g = -1;
        this.f294388f = j17;
        com.tencent.mars.xlog.Log.i("MicroMsg.GLLeakIDKeyReport", "markGLFBOCreated");
        jx3.f.INSTANCE.w(1184L, 100L, 1L);
        int myTid = android.os.Process.myTid();
        this.f294389g = myTid;
        long nativeHandle = android.opengl.EGL14.eglGetCurrentContext().getNativeHandle();
        this.f294390h = nativeHandle;
        int q17 = rs0.i.f399296a.q();
        this.f294387e = q17;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("create frameBuffer:");
        sb6.append(q17);
        sb6.append(" tid:");
        sb6.append(myTid);
        sb6.append(", context: ");
        sb6.append(nativeHandle);
        sb6.append(", stackTrace: ");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        sb6.append(new com.tencent.mm.sdk.platformtools.z3());
        com.tencent.mars.xlog.Log.i("MicroMsg.GLFrameBufferObject", sb6.toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f294386d) {
            com.tencent.mars.xlog.Log.i("MicroMsg.GLFrameBufferObject", hashCode() + " close already close");
            return;
        }
        int myTid = android.os.Process.myTid();
        if (this.f294389g != myTid) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(hashCode());
            sb6.append(" Leaked by different thread!!!  scene：");
            sb6.append(this.f294388f);
            sb6.append("  created in:");
            sb6.append(this.f294389g);
            sb6.append(" release in:");
            sb6.append(myTid);
            sb6.append(", stackTrace:\t");
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            sb6.append(new com.tencent.mm.sdk.platformtools.z3());
            com.tencent.mars.xlog.Log.e("MicroMsg.GLFrameBufferObject", sb6.toString());
            com.tencent.mars.xlog.Log.i("MicroMsg.GLLeakIDKeyReport", "markGLFBOLeakedInErrorTid");
            jx3.f.INSTANCE.w(1184L, 201L, 1L);
            return;
        }
        this.f294386d = true;
        rs0.g gVar = rs0.i.f399296a;
        int i17 = this.f294387e;
        gVar.getClass();
        android.opengl.GLES20.glDeleteFramebuffers(1, new int[]{i17}, 0);
        android.opengl.EGLContext eglGetCurrentContext = android.opengl.EGL14.eglGetCurrentContext();
        if (eglGetCurrentContext.getNativeHandle() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GLFrameBufferObject", "context is destroyed, framebuffer leaked! framebufferId: " + this.f294387e);
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        }
        if (eglGetCurrentContext.getNativeHandle() != this.f294390h) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GLFrameBufferObject", "release framebuffer(" + this.f294387e + ") with current context(" + eglGetCurrentContext.getNativeHandle() + ") which NOT equals to the origin context (" + this.f294390h + "). something wrong and causes leak!");
            java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        sb7.append(hashCode());
        sb7.append(" close framebufferId:");
        sb7.append(this.f294387e);
        sb7.append(" context: ");
        sb7.append(eglGetCurrentContext.getNativeHandle());
        sb7.append(", stacks:");
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        sb7.append(new com.tencent.mm.sdk.platformtools.z3());
        com.tencent.mars.xlog.Log.i("MicroMsg.GLFrameBufferObject", sb7.toString());
    }

    public final void finalize() {
        if (this.f294386d) {
            com.tencent.mars.xlog.Log.i("MicroMsg.GLFrameBufferObject", hashCode() + " release success!");
            return;
        }
        long j17 = this.f294388f;
        com.tencent.mars.xlog.Log.i("MicroMsg.GLLeakIDKeyReport", "markGLFBOLeakedScene key:" + j17);
        jx3.f fVar = jx3.f.INSTANCE;
        fVar.w(1184L, ((long) 100) + j17, 1L);
        com.tencent.mars.xlog.Log.i("MicroMsg.GLLeakIDKeyReport", "markGLFBOLeaked");
        fVar.w(1184L, 101L, 1L);
        com.tencent.mars.xlog.Log.e("MicroMsg.GLFrameBufferObject", hashCode() + " Leaked !!!  scene：" + this.f294388f);
    }

    public java.lang.String toString() {
        return "hashcode:" + hashCode() + " frameBufferId:" + this.f294387e + " memRelease:" + this.f294386d + " scene:" + this.f294388f + " create-tid:" + this.f294389g;
    }
}
