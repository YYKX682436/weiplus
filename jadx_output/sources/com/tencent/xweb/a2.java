package com.tencent.xweb;

/* loaded from: classes12.dex */
public abstract class a2 {
    public static boolean a(java.io.File file) {
        if (file == null || !file.exists()) {
            return false;
        }
        return file.getName().contains("xweb_sandbox_crash") || file.getName().contains("xweb_gpu_crash") || file.getName().contains("xweb_render_crash");
    }
}
