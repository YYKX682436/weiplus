package j33;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class c {

    /* renamed from: e, reason: collision with root package name */
    public static final j33.b f297404e;

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.Map f297405f;

    /* renamed from: g, reason: collision with root package name */
    public static final j33.c f297406g;

    /* renamed from: h, reason: collision with root package name */
    public static final j33.c f297407h;

    /* renamed from: i, reason: collision with root package name */
    public static final j33.c f297408i;

    /* renamed from: m, reason: collision with root package name */
    public static final j33.c f297409m;

    /* renamed from: n, reason: collision with root package name */
    public static final j33.c f297410n;

    /* renamed from: o, reason: collision with root package name */
    public static final j33.c f297411o;

    /* renamed from: p, reason: collision with root package name */
    public static final j33.c f297412p;

    /* renamed from: q, reason: collision with root package name */
    public static final j33.c f297413q;

    /* renamed from: r, reason: collision with root package name */
    public static final j33.c f297414r;

    /* renamed from: s, reason: collision with root package name */
    public static final j33.c f297415s;

    /* renamed from: t, reason: collision with root package name */
    public static final j33.c f297416t;

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ j33.c[] f297417u;

    /* renamed from: d, reason: collision with root package name */
    public final int f297418d;

    static {
        j33.c cVar = new j33.c(com.google.android.gms.stats.netstats.NetstatsParserPatterns.TYPE_BACKGROUND_PATTERN, 0, 0);
        f297406g = cVar;
        j33.c cVar2 = new j33.c("IMAGES_SIZE_LIMITED", 1, 1);
        f297407h = cVar2;
        j33.c cVar3 = new j33.c("VIDEOS_SIZE_LIMITED", 2, 2);
        f297408i = cVar3;
        j33.c cVar4 = new j33.c("VIDEOS_DURATION_LIMITED", 3, 3);
        f297409m = cVar4;
        j33.c cVar5 = new j33.c("VIDEOS_BOTH_LIMITED", 4, 4);
        f297410n = cVar5;
        j33.c cVar6 = new j33.c("BOTH_IMAGES_SIZE_LIMITED", 5, 5);
        f297411o = cVar6;
        j33.c cVar7 = new j33.c("BOTH_VIDEOS_SIZE_LIMITED", 6, 6);
        f297412p = cVar7;
        j33.c cVar8 = new j33.c("BOTH_VIDEOS_DURATION_LIMITED", 7, 7);
        f297413q = cVar8;
        j33.c cVar9 = new j33.c("BOTH_VIDEOS_BOTH_LIMITED", 8, 8);
        f297414r = cVar9;
        j33.c cVar10 = new j33.c("MIXED_VIDEOS_SIZE_LIMITED", 9, 9);
        f297415s = cVar10;
        j33.c cVar11 = new j33.c("MIXED_VIDEOS_DURATION_LIMITED", 10, 10);
        f297416t = cVar11;
        j33.c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9, cVar10, cVar11};
        f297417u = cVarArr;
        java.util.List a17 = rz5.b.a(cVarArr);
        f297404e = new j33.b(null);
        int d17 = kz5.b1.d(kz5.d0.q(a17, 10));
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(d17 < 16 ? 16 : d17);
        kz5.e eVar = new kz5.e((kz5.h) a17);
        while (eVar.hasNext()) {
            java.lang.Object next = eVar.next();
            linkedHashMap.put(java.lang.Integer.valueOf(((j33.c) next).f297418d), next);
        }
        f297405f = linkedHashMap;
    }

    public c(java.lang.String str, int i17, int i18) {
        this.f297418d = i18;
    }

    public static j33.c valueOf(java.lang.String str) {
        return (j33.c) java.lang.Enum.valueOf(j33.c.class, str);
    }

    public static j33.c[] values() {
        return (j33.c[]) f297417u.clone();
    }
}
