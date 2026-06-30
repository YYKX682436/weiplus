package ez2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class d {

    /* renamed from: e, reason: collision with root package name */
    public static final ez2.d f257869e;

    /* renamed from: f, reason: collision with root package name */
    public static final ez2.d f257870f;

    /* renamed from: g, reason: collision with root package name */
    public static final ez2.d f257871g;

    /* renamed from: h, reason: collision with root package name */
    public static final ez2.d f257872h;

    /* renamed from: i, reason: collision with root package name */
    public static final ez2.d f257873i;

    /* renamed from: m, reason: collision with root package name */
    public static final ez2.d f257874m;

    /* renamed from: n, reason: collision with root package name */
    public static final ez2.d f257875n;

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ ez2.d[] f257876o;

    /* renamed from: d, reason: collision with root package name */
    public final int f257877d;

    static {
        ez2.d dVar = new ez2.d("NONE", 0, 0);
        f257869e = dVar;
        ez2.d dVar2 = new ez2.d("FINDER_LIVE", 1, 1);
        f257870f = dVar2;
        ez2.d dVar3 = new ez2.d("SQUARE_LIVE", 2, 2);
        f257871g = dVar3;
        ez2.d dVar4 = new ez2.d("SHOP_LIVE", 3, 3);
        f257872h = dVar4;
        ez2.d dVar5 = new ez2.d("IMAGE", 4, 4);
        f257873i = dVar5;
        ez2.d dVar6 = new ez2.d("WINDOW_FLOAT", 5, 5);
        f257874m = dVar6;
        ez2.d dVar7 = new ez2.d("SCROLL_SQUARE", 6, 6);
        f257875n = dVar7;
        ez2.d[] dVarArr = {dVar, dVar2, dVar3, dVar4, dVar5, dVar6, dVar7};
        f257876o = dVarArr;
        rz5.b.a(dVarArr);
    }

    public d(java.lang.String str, int i17, int i18) {
        this.f257877d = i18;
    }

    public static ez2.d valueOf(java.lang.String str) {
        return (ez2.d) java.lang.Enum.valueOf(ez2.d.class, str);
    }

    public static ez2.d[] values() {
        return (ez2.d[]) f257876o.clone();
    }
}
