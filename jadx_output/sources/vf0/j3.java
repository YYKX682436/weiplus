package vf0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes12.dex */
public final class j3 {

    /* renamed from: e, reason: collision with root package name */
    public static final vf0.j3 f436203e;

    /* renamed from: f, reason: collision with root package name */
    public static final vf0.j3 f436204f;

    /* renamed from: g, reason: collision with root package name */
    public static final vf0.j3 f436205g;

    /* renamed from: h, reason: collision with root package name */
    public static final vf0.j3 f436206h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ vf0.j3[] f436207i;

    /* renamed from: d, reason: collision with root package name */
    public final int f436208d;

    static {
        vf0.j3 j3Var = new vf0.j3("FromCapture", 0, 1);
        f436203e = j3Var;
        vf0.j3 j3Var2 = new vf0.j3("FromGallery", 1, 2);
        f436204f = j3Var2;
        vf0.j3 j3Var3 = new vf0.j3("FromTransmit", 2, 3);
        f436205g = j3Var3;
        vf0.j3 j3Var4 = new vf0.j3("FromFav", 3, 4);
        f436206h = j3Var4;
        vf0.j3[] j3VarArr = {j3Var, j3Var2, j3Var3, j3Var4, new vf0.j3("FromExternal", 4, 5), new vf0.j3(com.google.android.gms.stats.netstats.NetstatsParserPatterns.TYPE_BACKGROUND_PATTERN, 5, 0)};
        f436207i = j3VarArr;
        rz5.b.a(j3VarArr);
    }

    public j3(java.lang.String str, int i17, int i18) {
        this.f436208d = i18;
    }

    public static vf0.j3 valueOf(java.lang.String str) {
        return (vf0.j3) java.lang.Enum.valueOf(vf0.j3.class, str);
    }

    public static vf0.j3[] values() {
        return (vf0.j3[]) f436207i.clone();
    }
}
