package l82;

/* loaded from: classes12.dex */
public abstract class a {
    public static final java.util.List a(long j17) {
        if (!c82.e.d()) {
            p75.i0 i17 = dm.j3.f237757u.i();
            i17.f352657d = dm.j3.f237759w.i(java.lang.Long.valueOf(j17));
            i17.f352656c = "MicroMsg.SDK.BaseFavCdnInfo";
            return i17.a().k(c82.e.f39668a.a(), o72.e2.class);
        }
        try {
            java.util.List m07 = z72.a.m0(c82.e.f39668a.b().getAllObjects(up5.b.a(), "FavCdnInfo", up5.b.f429894d.eq(j17)));
            kotlin.jvm.internal.o.d(m07);
            return m07;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FavCdnStorageKt", "Operation failed: " + e17.getMessage());
            return kz5.p0.f313996d;
        }
    }
}
