package com.tencent.mm.pluginsdk.model;

/* loaded from: classes4.dex */
public abstract class e4 {
    public static int a() {
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_enable_c2c_100_video, true);
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_c2c_max_video_size, 100);
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoUploadConfig", "getBigVideoSize  enable:%s configMB:%s", java.lang.Boolean.valueOf(fj6), java.lang.Integer.valueOf(Ni));
        if (fj6) {
            return Ni * 1024 * 1024;
        }
        return 26214400;
    }

    public static boolean b(java.lang.String str) {
        long k17 = com.tencent.mm.vfs.w6.k(str);
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_enable_c2c_100_video, true);
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoUploadConfig", "C2C send big file:%s size:%s enable:%s", str, java.lang.Long.valueOf(k17), java.lang.Boolean.valueOf(fj6));
        return k17 >= 25165824 && fj6;
    }

    public static boolean c(java.lang.String str) {
        long k17 = com.tencent.mm.vfs.w6.k(str);
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_enable_sns_100_video, true);
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoUploadConfig", "SNS send big file:%s size:%s enable:%s", str, java.lang.Long.valueOf(k17), java.lang.Boolean.valueOf(fj6));
        return k17 >= 25165824 && fj6;
    }
}
