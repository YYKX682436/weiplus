package zv1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes15.dex */
public final class o {

    /* renamed from: e, reason: collision with root package name */
    public static final zv1.o f476323e;

    /* renamed from: f, reason: collision with root package name */
    public static final zv1.o f476324f;

    /* renamed from: g, reason: collision with root package name */
    public static final zv1.o f476325g;

    /* renamed from: h, reason: collision with root package name */
    public static final zv1.o f476326h;

    /* renamed from: i, reason: collision with root package name */
    public static final zv1.o f476327i;

    /* renamed from: m, reason: collision with root package name */
    public static final zv1.o f476328m;

    /* renamed from: n, reason: collision with root package name */
    public static final zv1.o f476329n;

    /* renamed from: o, reason: collision with root package name */
    public static final zv1.o f476330o;

    /* renamed from: p, reason: collision with root package name */
    public static final zv1.o f476331p;

    /* renamed from: q, reason: collision with root package name */
    public static final zv1.o f476332q;

    /* renamed from: r, reason: collision with root package name */
    public static final zv1.o f476333r;

    /* renamed from: s, reason: collision with root package name */
    public static final zv1.o f476334s;

    /* renamed from: t, reason: collision with root package name */
    public static final zv1.o f476335t;

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ zv1.o[] f476336u;

    /* renamed from: d, reason: collision with root package name */
    public final int f476337d;

    static {
        zv1.o oVar = new zv1.o("CANCELLED", 0, 0);
        f476323e = oVar;
        zv1.o oVar2 = new zv1.o("NO_CLEANER", 1, 1);
        f476324f = oVar2;
        zv1.o oVar3 = new zv1.o("CLEANER_EXCEPTION", 2, 2);
        f476325g = oVar3;
        zv1.o oVar4 = new zv1.o("CLEANER_EXEMPTED", 3, 3);
        f476326h = oVar4;
        zv1.o oVar5 = new zv1.o("CLEANER_NO_NEED_TO_CLEAN", 4, 10);
        f476327i = oVar5;
        zv1.o oVar6 = new zv1.o("WTF", 5, 100);
        f476328m = oVar6;
        zv1.o oVar7 = new zv1.o("SUCCESS", 6, 200);
        f476329n = oVar7;
        zv1.o oVar8 = new zv1.o("SUCCESS_ACTUAL", 7, 201);
        f476330o = oVar8;
        zv1.o oVar9 = new zv1.o("SUCCESS_PARTIAL", 8, 210);
        f476331p = oVar9;
        zv1.o oVar10 = new zv1.o("SUCCESS_RETURN", 9, 211);
        f476332q = oVar10;
        zv1.o oVar11 = new zv1.o("FAILURE", 10, 300);
        f476333r = oVar11;
        zv1.o oVar12 = new zv1.o("FAILURE_RETURN_LIE", 11, 310);
        f476334s = oVar12;
        zv1.o oVar13 = new zv1.o("FAILURE_FILE_EXEMPTED", 12, com.tencent.mapsdk.internal.km.f50100e);
        f476335t = oVar13;
        zv1.o[] oVarArr = {oVar, oVar2, oVar3, oVar4, oVar5, oVar6, oVar7, oVar8, oVar9, oVar10, oVar11, oVar12, oVar13};
        f476336u = oVarArr;
        rz5.b.a(oVarArr);
    }

    public o(java.lang.String str, int i17, int i18) {
        this.f476337d = i18;
    }

    public static zv1.o valueOf(java.lang.String str) {
        return (zv1.o) java.lang.Enum.valueOf(zv1.o.class, str);
    }

    public static zv1.o[] values() {
        return (zv1.o[]) f476336u.clone();
    }
}
