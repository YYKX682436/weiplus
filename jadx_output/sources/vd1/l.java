package vd1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class l {

    /* renamed from: d, reason: collision with root package name */
    public static final vd1.k f435590d;

    /* renamed from: e, reason: collision with root package name */
    public static final vd1.l f435591e;

    /* renamed from: f, reason: collision with root package name */
    public static final vd1.l f435592f;

    /* renamed from: g, reason: collision with root package name */
    public static final vd1.l f435593g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ vd1.l[] f435594h;

    static {
        vd1.l lVar = new vd1.l("HIGH", 0);
        f435591e = lVar;
        vd1.l lVar2 = new vd1.l("LOW", 1);
        f435592f = lVar2;
        vd1.l lVar3 = new vd1.l("IMMEDIATE", 2);
        f435593g = lVar3;
        vd1.l[] lVarArr = {lVar, lVar2, lVar3};
        f435594h = lVarArr;
        rz5.b.a(lVarArr);
        f435590d = new vd1.k(null);
    }

    public l(java.lang.String str, int i17) {
    }

    public static vd1.l valueOf(java.lang.String str) {
        return (vd1.l) java.lang.Enum.valueOf(vd1.l.class, str);
    }

    public static vd1.l[] values() {
        return (vd1.l[]) f435594h.clone();
    }
}
