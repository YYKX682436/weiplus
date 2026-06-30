package rg;

/* loaded from: classes5.dex */
public enum c {
    /* JADX INFO: Fake field, exist only in values array */
    DIMENSION_LEVEL_144(0, "144p"),
    /* JADX INFO: Fake field, exist only in values array */
    DIMENSION_LEVEL_224(1, "224p"),
    DIMENSION_LEVEL_360(2, "360p"),
    DIMENSION_LEVEL_480(3, "480p"),
    DIMENSION_LEVEL_540(4, "540p"),
    DIMENSION_LEVEL_720(5, "720p"),
    DIMENSION_LEVEL_1080(6, "1080p"),
    DIMENSION_LEVEL_1440(7, "1440p"),
    /* JADX INFO: Fake field, exist only in values array */
    DIMENSION_LEVEL_2160(8, "2160p");


    /* renamed from: n, reason: collision with root package name */
    public static final java.util.Map f395147n = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final int f395149d;

    static {
        for (rg.c cVar : values()) {
            ((java.util.HashMap) f395147n).put(java.lang.Integer.valueOf(cVar.f395149d), cVar);
        }
    }

    c(int i17, java.lang.String str) {
        this.f395149d = i17;
    }

    public static rg.c a(int i17) {
        return (rg.c) ((java.util.HashMap) f395147n).get(java.lang.Integer.valueOf(i17));
    }
}
