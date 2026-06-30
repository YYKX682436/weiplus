package p72;

/* loaded from: classes12.dex */
public final class a extends dm.l3 {
    public static final l75.e0 F = dm.l3.initAutoDBInfo(dm.l3.class);
    public static final java.text.SimpleDateFormat G = new java.text.SimpleDateFormat("yyyy.MM.dd HH:mm", java.util.Locale.ENGLISH);

    public final java.lang.String J0(long j17) {
        try {
            java.lang.String format = G.format(java.lang.Long.valueOf(j17));
            kotlin.jvm.internal.o.d(format);
            return format;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FavDelMgr", th6, "format err", new java.lang.Object[0]);
            return java.lang.String.valueOf(j17);
        }
    }

    @Override // dm.l3, l75.f0
    public l75.e0 getDBInfo() {
        return F;
    }

    public java.lang.String toString() {
        return toJSON().toString() + "delTimeF:" + J0(u0()) + " updateTimeF:" + J0(v0());
    }
}
