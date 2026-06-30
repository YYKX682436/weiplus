package com.tencent.mm.plugin.lite.jsapi.comms;

/* loaded from: classes12.dex */
public final class i7 implements com.tencent.mm.plugin.lite.jsapi.comms.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.jsapi.comms.k7 f143616a;

    public i7(com.tencent.mm.plugin.lite.jsapi.comms.k7 k7Var) {
        this.f143616a = k7Var;
    }

    @Override // com.tencent.mm.plugin.lite.jsapi.comms.b
    public final void a(java.lang.String str, int i17, int i18) {
        if (str != null && r26.i0.n(str, ".temp", false)) {
            java.lang.String t17 = r26.i0.t(str, ".temp", "", false);
            com.tencent.mm.vfs.w6.w(str, t17);
            str = t17;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppJsApiShareMediaToTimeline", "download video filePath: %s", str);
        com.tencent.mm.plugin.lite.jsapi.comms.k7 k7Var = this.f143616a;
        if (i17 != 0) {
            if (i17 != 2) {
                k7Var.f143443f.a("download video cancel");
                return;
            } else {
                k7Var.f143443f.a("download video fail");
                return;
            }
        }
        if (k7Var.f143643n.length() == 0) {
            kotlin.jvm.internal.o.d(str);
            k7Var.B(str, "");
        } else {
            kotlin.jvm.internal.o.d(str);
            k7Var.C(str);
        }
    }
}
