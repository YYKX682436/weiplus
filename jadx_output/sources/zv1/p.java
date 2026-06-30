package zv1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes15.dex */
public final class p {

    /* renamed from: e, reason: collision with root package name */
    public static final zv1.p f476339e;

    /* renamed from: f, reason: collision with root package name */
    public static final zv1.p f476340f;

    /* renamed from: g, reason: collision with root package name */
    public static final zv1.p f476341g;

    /* renamed from: h, reason: collision with root package name */
    public static final zv1.p f476342h;

    /* renamed from: i, reason: collision with root package name */
    public static final zv1.p f476343i;

    /* renamed from: m, reason: collision with root package name */
    public static final zv1.p f476344m;

    /* renamed from: n, reason: collision with root package name */
    public static final zv1.p f476345n;

    /* renamed from: o, reason: collision with root package name */
    public static final zv1.p f476346o;

    /* renamed from: p, reason: collision with root package name */
    public static final zv1.p f476347p;

    /* renamed from: q, reason: collision with root package name */
    public static final zv1.p f476348q;

    /* renamed from: r, reason: collision with root package name */
    public static final zv1.p f476349r;

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ zv1.p[] f476350s;

    /* renamed from: d, reason: collision with root package name */
    public final int f476351d;

    static {
        zv1.p pVar = new zv1.p("CANCELLED", 0, 0);
        f476339e = pVar;
        zv1.p pVar2 = new zv1.p("NO_CLEANERS", 1, 1);
        f476340f = pVar2;
        zv1.p pVar3 = new zv1.p("CLEAN_EXCEPTION", 2, 2);
        f476341g = pVar3;
        zv1.p pVar4 = new zv1.p("NO_NEED_TO_CLEAN", 3, 10);
        f476342h = pVar4;
        zv1.p pVar5 = new zv1.p("ALLOC_NOTHING", 4, 11);
        f476343i = pVar5;
        zv1.p pVar6 = new zv1.p("WTF", 5, 100);
        f476344m = pVar6;
        zv1.p pVar7 = new zv1.p("SUCCESS", 6, 200);
        f476345n = pVar7;
        zv1.p pVar8 = new zv1.p("SUCCESS_PARTIAL", 7, 210);
        f476346o = pVar8;
        zv1.p pVar9 = new zv1.p("FAILURE", 8, 300);
        f476347p = pVar9;
        zv1.p pVar10 = new zv1.p("FAILURE_RETURN_LIE", 9, 310);
        f476348q = pVar10;
        zv1.p pVar11 = new zv1.p("FAILURE_FILE_EXEMPTED", 10, com.tencent.mapsdk.internal.km.f50100e);
        f476349r = pVar11;
        zv1.p[] pVarArr = {pVar, pVar2, pVar3, pVar4, pVar5, pVar6, pVar7, pVar8, pVar9, pVar10, pVar11};
        f476350s = pVarArr;
        rz5.b.a(pVarArr);
    }

    public p(java.lang.String str, int i17, int i18) {
        this.f476351d = i18;
    }

    public static zv1.p valueOf(java.lang.String str) {
        return (zv1.p) java.lang.Enum.valueOf(zv1.p.class, str);
    }

    public static zv1.p[] values() {
        return (zv1.p[]) f476350s.clone();
    }
}
