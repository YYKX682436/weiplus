package xv2;

/* loaded from: classes10.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.storage.FinderItem f457392d;

    /* renamed from: e, reason: collision with root package name */
    public final r45.mb4 f457393e;

    public a(com.tencent.mm.plugin.finder.storage.FinderItem finderObj, r45.mb4 media) {
        kotlin.jvm.internal.o.g(finderObj, "finderObj");
        kotlin.jvm.internal.o.g(media, "media");
        this.f457392d = finderObj;
        this.f457393e = media;
    }

    public final int a(java.lang.String str, java.lang.String str2) {
        if (str == null || str.length() == 0) {
            return -1;
        }
        if (str2 == null || str2.length() == 0) {
            return -1;
        }
        android.graphics.BitmapFactory.Options n07 = com.tencent.mm.sdk.platformtools.x.n0(str);
        com.tencent.mm.plugin.finder.storage.FinderItem finderObj = this.f457392d;
        kotlin.jvm.internal.o.g(finderObj, "finderObj");
        int c17 = finderObj.isNewLife() ? j62.e.g().c(new com.tencent.mm.repairer.config.newlife.RepairerConfigNewLifePostUseWxam()) : 0;
        if (c17 == 0) {
            return -1;
        }
        if (c17 == 1) {
            return ((h12.z) ((k12.u) i95.n0.c(k12.u.class))).cj(str, str2, n07.outWidth, n07.outHeight, 8);
        }
        if (c17 != 2) {
            return -1;
        }
        return ((h12.z) ((k12.u) i95.n0.c(k12.u.class))).fj(str, str2, n07.outWidth, n07.outHeight, 8, true);
    }

    @Override // java.lang.Runnable
    public void run() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[finderpost] WxamCompressTask run begin ");
        r45.mb4 mb4Var = this.f457393e;
        sb6.append(mb4Var.getString(9));
        com.tencent.mars.xlog.Log.i("NewLife.LogPost.NewLifeMediaProcessStage", sb6.toString());
        java.lang.String string = mb4Var.getString(0);
        java.lang.String str = string + "_wxam";
        java.lang.String string2 = mb4Var.getString(1);
        java.lang.String str2 = string2 + "_wxam";
        if (com.tencent.mm.sdk.platformtools.y1.g(mb4Var.getString(0)) && com.tencent.mm.sdk.platformtools.y1.g(mb4Var.getString(1))) {
            com.tencent.mars.xlog.Log.e("NewLife.LogPost.NewLifeMediaProcessStage", "[finderpost]:WxamCompressTask wxam : already wxam! [" + mb4Var.getString(0) + "]-[" + mb4Var.getString(1) + ']');
        } else {
            int a17 = a(string, str);
            int a18 = a(string2, str2);
            com.tencent.mars.xlog.Log.i("NewLife.LogPost.NewLifeMediaProcessStage", "[finderpost]:WxamCompressTask wxam : originPath:" + string + " originWxamPath:" + str + " thumbPath:" + string2 + " thumbWxamPath:" + str2 + " originWxamRet:" + a17 + " targetWxamRet:" + a18);
            if (a17 == 0 && a18 == 0) {
                com.tencent.mm.vfs.w6.h(string);
                com.tencent.mm.vfs.w6.h(string2);
                com.tencent.mm.vfs.w6.c(str, string);
                com.tencent.mm.vfs.w6.c(str2, string2);
                com.tencent.mm.vfs.w6.h(str);
                com.tencent.mm.vfs.w6.h(str2);
            }
        }
        com.tencent.mars.xlog.Log.i("NewLife.LogPost.NewLifeMediaProcessStage", "[finderpost] WxamCompressTask run end " + mb4Var.getString(9) + ": cost:[" + (java.lang.System.currentTimeMillis() - currentTimeMillis) + " ms]");
    }
}
