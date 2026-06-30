package yp3;

/* loaded from: classes7.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final long f464400a = java.util.concurrent.TimeUnit.DAYS.toMillis(7);

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.mm.vfs.r6 f464401b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.String[] f464402c;

    static {
        java.lang.String o17;
        com.tencent.mm.vfs.r6 j17 = com.tencent.mm.vfs.r6.j(com.tencent.mm.sdk.platformtools.x2.f193071a.getExternalCacheDir());
        f464401b = j17;
        java.lang.String[] strArr = new java.lang.String[2];
        strArr[0] = (j17 == null || (o17 = j17.o()) == null) ? null : o17.concat("/hprofs/");
        strArr[1] = (j17 != null ? j17.o() : null) + "/matrix_resource";
        f464402c = strArr;
    }
}
