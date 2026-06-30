package zw;

/* loaded from: classes7.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public static final zw.v f476543a = new zw.v();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f476544b = new java.util.LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.Map f476545c = new java.util.LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.String f476546d = com.tencent.mm.vfs.q7.c("bizcache") + "/media_tmp/";

    public final void a(java.lang.String path, java.lang.String postPathName) {
        int i17;
        kotlin.jvm.internal.o.g(path, "path");
        kotlin.jvm.internal.o.g(postPathName, "postPathName");
        com.tencent.mars.xlog.Log.i("MicroMsg.BizSelectPhotoCompressHelper", "compress: path:".concat(path));
        java.lang.String str = (java.lang.String) ((java.util.LinkedHashMap) f476544b).get(path);
        if (str != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BizSelectPhotoCompressHelper", "compress: preCompressFile hit: ".concat(str));
            if (com.tencent.mm.vfs.w6.j(str)) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                java.lang.String str2 = f476546d;
                sb6.append(str2);
                sb6.append(postPathName);
                if (kotlin.jvm.internal.o.b(str, sb6.toString())) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.BizSelectPhotoCompressHelper", "compress: just return");
                    return;
                }
                long d17 = com.tencent.mm.vfs.w6.d(str, str2 + postPathName, false);
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("compress: result len: ");
                sb7.append(d17);
                com.tencent.mars.xlog.Log.i("MicroMsg.BizSelectPhotoCompressHelper", sb7.toString());
                if (d17 > 0) {
                    return;
                }
            }
        }
        int c17 = j62.e.g().c(new com.tencent.mm.repairer.config.newlife.RepairerConfigNewLifePostUseMaxShort());
        if (c17 != 0) {
            if (c17 == 1) {
                i17 = 1440;
            } else if (c17 == 2) {
                i17 = 2160;
            }
            int i18 = i17;
            fe0.o4 o4Var = (fe0.o4) i95.n0.c(fe0.o4.class);
            java.lang.String str3 = f476546d;
            ((ee0.v4) o4Var).getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createPic", "com.tencent.mm.feature.sns.SnsUtilService");
            com.tencent.mm.plugin.sns.storage.m2.P0(str3, path, postPathName, false, 0, i18);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createPic", "com.tencent.mm.feature.sns.SnsUtilService");
        }
        i17 = 1080;
        int i182 = i17;
        fe0.o4 o4Var2 = (fe0.o4) i95.n0.c(fe0.o4.class);
        java.lang.String str32 = f476546d;
        ((ee0.v4) o4Var2).getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createPic", "com.tencent.mm.feature.sns.SnsUtilService");
        com.tencent.mm.plugin.sns.storage.m2.P0(str32, path, postPathName, false, 0, i182);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createPic", "com.tencent.mm.feature.sns.SnsUtilService");
    }

    public final java.lang.String b(java.lang.String path) {
        kotlin.jvm.internal.o.g(path, "path");
        java.util.Map map = f476545c;
        java.lang.String str = (java.lang.String) ((java.util.LinkedHashMap) map).get(path);
        if (str == null) {
            str = com.tencent.mm.vfs.w6.p(path);
            if (str == null) {
                str = "";
            }
            if (str.length() > 0) {
                map.put(path, str);
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.BizSelectPhotoCompressHelper", "getFileMD5String: md5 is empty for path: ".concat(path));
            }
        }
        return str;
    }

    public final java.lang.String c(java.lang.String md52) {
        kotlin.jvm.internal.o.g(md52, "md5");
        return "image_".concat(md52);
    }
}
