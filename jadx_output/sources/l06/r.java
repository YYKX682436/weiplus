package l06;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes15.dex */
public final class r {

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.Set f314895h;

    /* renamed from: i, reason: collision with root package name */
    public static final l06.r f314896i;

    /* renamed from: m, reason: collision with root package name */
    public static final l06.r f314897m;

    /* renamed from: n, reason: collision with root package name */
    public static final l06.r f314898n;

    /* renamed from: o, reason: collision with root package name */
    public static final l06.r f314899o;

    /* renamed from: p, reason: collision with root package name */
    public static final l06.r f314900p;

    /* renamed from: q, reason: collision with root package name */
    public static final l06.r f314901q;

    /* renamed from: r, reason: collision with root package name */
    public static final l06.r f314902r;

    /* renamed from: s, reason: collision with root package name */
    public static final l06.r f314903s;

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ l06.r[] f314904t;

    /* renamed from: d, reason: collision with root package name */
    public final n16.g f314905d;

    /* renamed from: e, reason: collision with root package name */
    public final n16.g f314906e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f314907f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f314908g;

    static {
        l06.r rVar = new l06.r("BOOLEAN", 0, "Boolean");
        f314896i = rVar;
        l06.r rVar2 = new l06.r("CHAR", 1, "Char");
        f314897m = rVar2;
        l06.r rVar3 = new l06.r("BYTE", 2, "Byte");
        f314898n = rVar3;
        l06.r rVar4 = new l06.r("SHORT", 3, "Short");
        f314899o = rVar4;
        l06.r rVar5 = new l06.r("INT", 4, "Int");
        f314900p = rVar5;
        l06.r rVar6 = new l06.r("FLOAT", 5, "Float");
        f314901q = rVar6;
        l06.r rVar7 = new l06.r("LONG", 6, "Long");
        f314902r = rVar7;
        l06.r rVar8 = new l06.r("DOUBLE", 7, "Double");
        f314903s = rVar8;
        l06.r[] rVarArr = {rVar, rVar2, rVar3, rVar4, rVar5, rVar6, rVar7, rVar8};
        f314904t = rVarArr;
        rz5.b.a(rVarArr);
        f314895h = kz5.z.D0(new l06.r[]{rVar2, rVar3, rVar4, rVar5, rVar6, rVar7, rVar8});
    }

    public r(java.lang.String str, int i17, java.lang.String str2) {
        this.f314905d = n16.g.k(str2);
        this.f314906e = n16.g.k(str2.concat("Array"));
        jz5.i iVar = jz5.i.f302830e;
        this.f314907f = jz5.h.a(iVar, new l06.q(this));
        this.f314908g = jz5.h.a(iVar, new l06.p(this));
    }

    public static l06.r valueOf(java.lang.String str) {
        return (l06.r) java.lang.Enum.valueOf(l06.r.class, str);
    }

    public static l06.r[] values() {
        return (l06.r[]) f314904t.clone();
    }
}
