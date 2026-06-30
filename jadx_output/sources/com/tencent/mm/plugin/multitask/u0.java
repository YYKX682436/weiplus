package com.tencent.mm.plugin.multitask;

/* loaded from: classes8.dex */
public final class u0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.multitask.u0 f150506a = new com.tencent.mm.plugin.multitask.u0();

    /* renamed from: b, reason: collision with root package name */
    public static final o11.g f150507b;

    static {
        o11.f fVar = new o11.f();
        fVar.f342077a = true;
        fVar.f342085i = 1;
        fVar.f342088l = android.graphics.Bitmap.Config.RGB_565;
        f150507b = fVar.a();
    }

    public final boolean a(android.graphics.Bitmap bmp, java.lang.String src, java.lang.String destPath) {
        kotlin.jvm.internal.o.g(bmp, "bmp");
        kotlin.jvm.internal.o.g(src, "src");
        kotlin.jvm.internal.o.g(destPath, "destPath");
        try {
            java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(bmp.getByteCount());
            bmp.copyPixelsToBuffer(allocate);
            return ((h12.z) ((k12.u) i95.n0.c(k12.u.class))).Zi(allocate.array(), src, destPath, bmp.getWidth(), bmp.getHeight(), bmp.getWidth(), bmp.getHeight(), 2, 0, new byte[0]) == 0;
        } catch (java.lang.OutOfMemoryError unused) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MultiTaskLogic", "convertBmp2Wxam bmp OutOfMemoryError!");
            return false;
        }
    }

    public final java.lang.String b(java.lang.String str) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String str2 = com.tencent.mm.plugin.multitask.v0.f150612a;
        sb6.append(com.tencent.mm.plugin.multitask.v0.f150613b);
        sb6.append(str);
        return sb6.toString();
    }

    public final java.lang.String c(com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo) {
        java.lang.String str = multiTaskInfo != null ? multiTaskInfo.field_id : null;
        if (str == null) {
            str = "";
        }
        return b(str);
    }
}
