package sc3;

/* loaded from: classes7.dex */
public final class b0 implements com.tencent.mm.libwxaudio.WxAudioNative.NativeCallBackInterface {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sc3.k1 f406430a;

    public b0(sc3.k1 k1Var) {
        this.f406430a = k1Var;
    }

    @Override // com.tencent.mm.libwxaudio.WxAudioNative.NativeCallBackInterface
    public java.lang.String getFilePath(java.lang.String src) {
        kotlin.jvm.internal.o.g(src, "src");
        sc3.k1 k1Var = this.f406430a;
        com.tencent.mars.xlog.Log.i(k1Var.Q, "wxAudio: getFilePath ".concat(src));
        if (r26.i0.y(src, "file://", false)) {
            src = src.substring(7);
            kotlin.jvm.internal.o.f(src, "substring(...)");
        } else if (r26.i0.y(src, "data:audio", false) && r26.n0.B(src, "base64", false)) {
            java.lang.String substring = src.substring(r26.n0.L(src, "base64,", 0, false, 6, null) + 7);
            kotlin.jvm.internal.o.f(substring, "substring(...)");
            src = jh1.d.b(r26.n0.u0(substring).toString());
            kotlin.jvm.internal.o.f(src, "writeToFile(...)");
        } else if (r26.i0.y(src, "wxblob://", false)) {
            jc3.x xVar = k1Var.f406486r;
            if (xVar == null) {
                kotlin.jvm.internal.o.o("pkgManagement");
                throw null;
            }
            com.tencent.mm.vfs.r6 privateAbsoluteFile = xVar.b().getPrivateAbsoluteFile(src);
            if (privateAbsoluteFile != null && privateAbsoluteFile.m()) {
                src = privateAbsoluteFile.o();
                kotlin.jvm.internal.o.f(src, "getAbsolutePath(...)");
            }
        } else if (!r26.i0.y(src, "http://", false) && !r26.i0.y(src, "https://", false)) {
            jc3.x xVar2 = k1Var.f406486r;
            if (xVar2 == null) {
                kotlin.jvm.internal.o.o("pkgManagement");
                throw null;
            }
            com.tencent.mm.vfs.r6 absoluteFile = xVar2.b().getAbsoluteFile(src);
            if (absoluteFile != null && absoluteFile.m()) {
                src = absoluteFile.o();
                kotlin.jvm.internal.o.f(src, "getAbsolutePath(...)");
            }
        }
        com.tencent.mars.xlog.Log.i(k1Var.Q, "wxAudio: getFilePath ret = ".concat(src));
        return src;
    }

    @Override // com.tencent.mm.libwxaudio.WxAudioNative.NativeCallBackInterface
    public void onCallBack(long j17, java.lang.String str) {
        java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (z65.c.a()) {
            bf3.g0 g0Var = bf3.g0.f19627a;
            sc3.a0 a0Var = sc3.a0.f406427d;
            g0Var.getClass();
            ((ku5.t0) ku5.t0.f312615d).q(new bf3.d0(a0Var));
        }
    }
}
