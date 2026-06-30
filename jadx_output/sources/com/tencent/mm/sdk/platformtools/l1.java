package com.tencent.mm.sdk.platformtools;

/* loaded from: classes10.dex */
public abstract class l1 {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f192817a = true;

    static {
        com.tencent.mars.xlog.Log.i("MicroMsg.ForceGpuUtil", "setMaxTextureGet: %s, canGetTextureSize %s.", java.lang.Boolean.TRUE, true);
        if (f192817a) {
            com.tencent.mm.sdk.platformtools.v1 v1Var = com.tencent.mm.sdk.platformtools.u1.f193003a;
            com.tencent.mars.xlog.Log.i("MicroMsg.GPU_TAG", "pennqin, updateTextureMaxSize, before: %s.", java.lang.Integer.valueOf(v1Var.f193033a));
            try {
                v1Var.a();
                int[] iArr = new int[1];
                android.opengl.GLES10.glGetIntegerv(3379, iArr, 0);
                int i17 = iArr[0];
                v1Var.f193033a = i17 > 2048 ? i17 : 2048;
                com.tencent.mars.xlog.Log.i("MicroMsg.GPU_TAG", "pennqin, get max texture size: %s %s.", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(v1Var.f193033a));
                f192817a = false;
                try {
                    v1Var.b();
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.GPU_TAG", th6, "release err: %s", th6.getMessage());
                }
            } catch (java.lang.Throwable th7) {
                try {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.GPU_TAG", th7, "err: %s", th7.getMessage());
                    f192817a = false;
                    try {
                        v1Var.b();
                    } catch (java.lang.Throwable th8) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.GPU_TAG", th8, "release err: %s", th8.getMessage());
                    }
                } catch (java.lang.Throwable th9) {
                    f192817a = false;
                    try {
                        v1Var.b();
                    } catch (java.lang.Throwable th10) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.GPU_TAG", th10, "release err: %s", th10.getMessage());
                    }
                    throw th9;
                }
            }
        }
    }
}
