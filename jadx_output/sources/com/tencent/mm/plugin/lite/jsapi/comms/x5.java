package com.tencent.mm.plugin.lite.jsapi.comms;

/* loaded from: classes3.dex */
public final class x5 implements zb0.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f143825a;

    public x5(java.lang.String str) {
        this.f143825a = str;
    }

    @Override // zb0.a0
    public void a(java.lang.String srcPath, java.lang.String destPath) {
        kotlin.jvm.internal.o.g(srcPath, "srcPath");
        kotlin.jvm.internal.o.g(destPath, "destPath");
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppJsApiSaveFile", "exportFile onExportSuccess fileName = " + this.f143825a + ", " + srcPath + " -> " + destPath);
    }

    @Override // zb0.a0
    public void b(java.lang.String srcPath, java.lang.String destPath) {
        kotlin.jvm.internal.o.g(srcPath, "srcPath");
        kotlin.jvm.internal.o.g(destPath, "destPath");
        com.tencent.mars.xlog.Log.e("MicroMsg.LiteAppJsApiSaveFile", "exportFile onExportFail fileName = " + this.f143825a + ", " + srcPath + " -> " + destPath);
    }
}
