package gf;

/* loaded from: classes7.dex */
public final class n0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gf.o0 f271135d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.skyline.jni.ISkylineFileSystemCallback f271136e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ byte[] f271137f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f271138g;

    public n0(gf.o0 o0Var, com.tencent.skyline.jni.ISkylineFileSystemCallback iSkylineFileSystemCallback, byte[] bArr, java.lang.String str) {
        this.f271135d = o0Var;
        this.f271136e = iSkylineFileSystemCallback;
        this.f271137f = bArr;
        this.f271138g = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.appbrand.appstorage.u1 fileSystem = this.f271135d.f271154a.getFileSystem();
        kotlin.jvm.internal.o.d(fileSystem);
        com.tencent.mm.vfs.r6 allocTempFile = fileSystem.allocTempFile("tmp" + java.lang.System.currentTimeMillis());
        if (allocTempFile == null) {
            com.tencent.mars.xlog.Log.e("Luggage.SkylineFileSystemImpl", "tmpFile is null, error");
            this.f271136e.onWriteTempFile(-1, "");
            return;
        }
        com.tencent.mm.vfs.w6.R(allocTempFile.o(), this.f271137f);
        ik1.b0 b0Var = new ik1.b0();
        com.tencent.mm.plugin.appbrand.appstorage.u1 fileSystem2 = this.f271135d.f271154a.getFileSystem();
        kotlin.jvm.internal.o.d(fileSystem2);
        boolean z17 = true;
        fileSystem2.createTempFileFrom(allocTempFile, this.f271138g, true, b0Var);
        com.tencent.mars.xlog.Log.i("Luggage.SkylineFileSystemImpl", "writeTempFileAsync success: " + ((java.lang.String) b0Var.f291824a));
        java.lang.CharSequence charSequence = (java.lang.CharSequence) b0Var.f291824a;
        if (charSequence != null && charSequence.length() != 0) {
            z17 = false;
        }
        if (z17) {
            com.tencent.mars.xlog.Log.e("Luggage.SkylineFileSystemImpl", "pTempFilePath is null, error");
            this.f271136e.onWriteTempFile(-1, "");
        } else {
            com.tencent.skyline.jni.ISkylineFileSystemCallback iSkylineFileSystemCallback = this.f271136e;
            java.lang.Object value = b0Var.f291824a;
            kotlin.jvm.internal.o.f(value, "value");
            iSkylineFileSystemCallback.onWriteTempFile(0, (java.lang.String) value);
        }
    }
}
