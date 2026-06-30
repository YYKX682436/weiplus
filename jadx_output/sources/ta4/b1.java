package ta4;

/* loaded from: classes4.dex */
public final class b1 {

    /* renamed from: a, reason: collision with root package name */
    public static final ta4.b1 f416725a = new ta4.b1();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f416726b = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f416727c = new java.util.concurrent.ConcurrentHashMap();

    public final void a(java.lang.String sourcePath, java.lang.String targetPath) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addPathMapping", "com.tencent.mm.plugin.sns.report.SnsPostMediaMetaDataReporter");
        kotlin.jvm.internal.o.g(sourcePath, "sourcePath");
        kotlin.jvm.internal.o.g(targetPath, "targetPath");
        if (pc4.d.f353410a.j()) {
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = f416727c;
            concurrentHashMap.clear();
            if (sourcePath.length() > 0) {
                if (targetPath.length() > 0) {
                    java.lang.String i17 = com.tencent.mm.vfs.w6.i(targetPath, false);
                    if (i17 != null) {
                        targetPath = i17;
                    }
                    java.lang.String i18 = com.tencent.mm.vfs.w6.i(sourcePath, false);
                    if (i18 != null) {
                        sourcePath = i18;
                    }
                    concurrentHashMap.put(targetPath, sourcePath);
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addPathMapping", "com.tencent.mm.plugin.sns.report.SnsPostMediaMetaDataReporter");
    }

    public final void b(int i17, java.util.List pathList) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addVideoSource", "com.tencent.mm.plugin.sns.report.SnsPostMediaMetaDataReporter");
        kotlin.jvm.internal.o.g(pathList, "pathList");
        if (pc4.d.f353410a.j()) {
            org.chromium.base.Log.i("MicroMsg.SnsPostMediaMetaDataReporter", "addVideoSource >> " + i17);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = pathList.iterator();
            while (it.hasNext()) {
                java.lang.String str = (java.lang.String) it.next();
                java.lang.String i18 = com.tencent.mm.vfs.w6.i(str, false);
                if (i18 != null) {
                    str = i18;
                }
                kotlin.jvm.internal.o.d(str);
                java.lang.String str2 = (java.lang.String) f416727c.remove(str);
                if (str2 != null) {
                    str = str2;
                }
                arrayList.add(str);
            }
            f416726b.put(java.lang.Integer.valueOf(i17), new ta4.c1(4, arrayList));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addVideoSource", "com.tencent.mm.plugin.sns.report.SnsPostMediaMetaDataReporter");
    }
}
