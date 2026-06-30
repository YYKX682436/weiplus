package com.tencent.mm.plugin.vlog.parallel;

/* loaded from: classes10.dex */
public final class a {
    public a(kotlin.jvm.internal.i iVar) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final com.tencent.mm.plugin.vlog.parallel.b a(android.media.MediaFormat format, java.lang.String fileName) {
        java.lang.String c17;
        kotlin.jvm.internal.o.g(format, "format");
        kotlin.jvm.internal.o.g(fileName, "fileName");
        java.lang.String string = format.getString("mime");
        int i17 = (string == null || !r26.n0.B(string, "video", false)) ? 0 : 1;
        if (i17 != 0) {
            c17 = dw3.h.f244211a.c("mux", java.lang.System.currentTimeMillis() + "..h264");
        } else {
            c17 = dw3.h.f244211a.c("mux", java.lang.System.currentTimeMillis() + "..aac");
        }
        return new com.tencent.mm.plugin.vlog.parallel.b(i17, i17, format, 0, 0, c17, null, null, 216, null);
    }
}
