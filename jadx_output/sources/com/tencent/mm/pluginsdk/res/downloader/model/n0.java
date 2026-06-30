package com.tencent.mm.pluginsdk.res.downloader.model;

/* loaded from: classes12.dex */
public class n0 extends dm.v9 {
    public static final l75.e0 U1 = dm.v9.initAutoDBInfo(com.tencent.mm.pluginsdk.res.downloader.model.n0.class);

    @Override // dm.v9, l75.f0
    public l75.e0 getDBInfo() {
        return U1;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("ResDownloaderRecord {");
        try {
            for (java.lang.reflect.Field field : com.tencent.mm.pluginsdk.res.downloader.model.n0.class.getSuperclass().getDeclaredFields()) {
                if (field.getName().startsWith(l75.f0.FIELD_PREFIX)) {
                    field.setAccessible(true);
                    java.lang.Object obj = field.get(this);
                    sb6.append(field.getName().replaceFirst(l75.f0.FIELD_PREFIX, ""));
                    sb6.append(" = ");
                    sb6.append(obj);
                    sb6.append(", ");
                }
            }
        } catch (java.lang.IllegalAccessException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ResDownloaderRecord", e17, "", new java.lang.Object[0]);
        }
        try {
            java.lang.reflect.Field field2 = com.tencent.mm.pluginsdk.res.downloader.model.n0.class.getSuperclass().getSuperclass().getField("systemRowid");
            field2.setAccessible(true);
            sb6.append("systemRowid = ");
            sb6.append(field2.get(this));
        } catch (java.lang.IllegalAccessException e18) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ResDownloaderRecord", e18, "", new java.lang.Object[0]);
        } catch (java.lang.NoSuchFieldException e19) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ResDownloaderRecord", e19, "", new java.lang.Object[0]);
        }
        sb6.append(" }");
        return sb6.toString();
    }
}
