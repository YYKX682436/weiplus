package k52;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes15.dex */
public final class g {

    /* renamed from: e, reason: collision with root package name */
    public static final k52.g f304294e;

    /* renamed from: f, reason: collision with root package name */
    public static final k52.g f304295f;

    /* renamed from: g, reason: collision with root package name */
    public static final k52.g f304296g;

    /* renamed from: h, reason: collision with root package name */
    public static final k52.g f304297h;

    /* renamed from: i, reason: collision with root package name */
    public static final k52.g f304298i;

    /* renamed from: m, reason: collision with root package name */
    public static final k52.g f304299m;

    /* renamed from: n, reason: collision with root package name */
    public static final k52.g f304300n;

    /* renamed from: o, reason: collision with root package name */
    public static final k52.g f304301o;

    /* renamed from: p, reason: collision with root package name */
    public static final k52.g f304302p;

    /* renamed from: q, reason: collision with root package name */
    public static final k52.g f304303q;

    /* renamed from: r, reason: collision with root package name */
    public static final k52.g f304304r;

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ k52.g[] f304305s;

    /* renamed from: d, reason: collision with root package name */
    public final int f304306d;

    static {
        k52.g gVar = new k52.g("INVALIDATE", 0, -1);
        k52.g gVar2 = new k52.g("TOUCH", 1, 0);
        f304294e = gVar2;
        k52.g gVar3 = new k52.g("SINGLE_CLICK", 2, 1);
        f304295f = gVar3;
        k52.g gVar4 = new k52.g("LONG_CLICK", 3, 2);
        f304296g = gVar4;
        k52.g gVar5 = new k52.g("DOUBLE_CLICK", 4, 3);
        f304297h = gVar5;
        k52.g gVar6 = new k52.g("ITEM_CLICK", 5, 4);
        f304298i = gVar6;
        k52.g gVar7 = new k52.g("ITEM_LONG_CLICK", 6, 5);
        f304299m = gVar7;
        k52.g gVar8 = new k52.g("ITEM_SELECTED", 7, 6);
        f304300n = gVar8;
        k52.g gVar9 = new k52.g("DRAG", 8, 7);
        f304301o = gVar9;
        k52.g gVar10 = new k52.g("KEY", 9, 8);
        f304302p = gVar10;
        k52.g gVar11 = new k52.g("HOVER", 10, 9);
        f304303q = gVar11;
        k52.g gVar12 = new k52.g("GLIDE", 11, 10);
        f304304r = gVar12;
        k52.g[] gVarArr = {gVar, gVar2, gVar3, gVar4, gVar5, gVar6, gVar7, gVar8, gVar9, gVar10, gVar11, gVar12};
        f304305s = gVarArr;
        rz5.b.a(gVarArr);
    }

    public g(java.lang.String str, int i17, int i18) {
        this.f304306d = i18;
    }

    public static k52.g valueOf(java.lang.String str) {
        return (k52.g) java.lang.Enum.valueOf(k52.g.class, str);
    }

    public static k52.g[] values() {
        return (k52.g[]) f304305s.clone();
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
        return name() + '=' + this.f304306d;
    }
}
