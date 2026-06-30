package com.tencent.mm.pluginsdk.model;

/* loaded from: classes5.dex */
public final class h4 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.pluginsdk.model.h4 f189337a = new com.tencent.mm.pluginsdk.model.h4();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashSet f189338b = new java.util.HashSet();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.Set f189339c = kz5.z.D0(new java.lang.String[]{"xls", "xlsx", "csv", "doc", "docx", "ppt", "pptx", "pdf", "bat", "c", "cpp", "cs", "css", "go", "h", "hpp", "ini", "java", "js", "json", "log", "lua", "md", "php", "pl", "py", "rb", "sh", "sql", "swift", "tex", "toml", "vue", "yaml", "yml", "xml", "html", "jpg", "png"});

    public final boolean a(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        try {
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.YuanBaoHelper", e17, "YuanBaoHelper install detect fail ", new java.lang.Object[0]);
        }
        return context.getPackageManager().getPackageInfo("com.tencent.hunyuan.app.chat", 0) != null;
    }

    public final boolean b(java.lang.String str) {
        java.util.HashSet hashSet = f189338b;
        if (hashSet.isEmpty()) {
            java.lang.String uj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).uj(new com.tencent.mm.repairer.config.yuanbao.RepairerConfigYuanBaoSupportFileExt());
            if (uj6 != null) {
                java.util.Iterator it = r26.n0.f0(uj6, new java.lang.String[]{"/"}, false, 0, 6, null).iterator();
                while (it.hasNext()) {
                    java.lang.String lowerCase = ((java.lang.String) it.next()).toLowerCase(java.util.Locale.ROOT);
                    kotlin.jvm.internal.o.f(lowerCase, "toLowerCase(...)");
                    hashSet.add(lowerCase);
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.YuanBaoHelper", "SupportExtSet: ".concat(kz5.n0.g0(hashSet, ",", null, null, 0, null, null, 62, null)));
            if (hashSet.isEmpty()) {
                hashSet.addAll(f189339c);
            }
        }
        if (str == null) {
            return false;
        }
        java.lang.String lowerCase2 = str.toLowerCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.o.f(lowerCase2, "toLowerCase(...)");
        return hashSet.contains(lowerCase2);
    }
}
