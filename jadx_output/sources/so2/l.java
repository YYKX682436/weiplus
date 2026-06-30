package so2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class l {

    /* renamed from: d, reason: collision with root package name */
    public static final so2.l f410459d;

    /* renamed from: e, reason: collision with root package name */
    public static final so2.l f410460e;

    /* renamed from: f, reason: collision with root package name */
    public static final so2.l f410461f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ so2.l[] f410462g;

    static {
        so2.l lVar = new so2.l("OK", 0);
        f410459d = lVar;
        so2.l lVar2 = new so2.l("EXCEED_LIMIT", 1);
        f410460e = lVar2;
        so2.l lVar3 = new so2.l("RANGE_OVERLAP", 2);
        f410461f = lVar3;
        so2.l[] lVarArr = {lVar, lVar2, lVar3};
        f410462g = lVarArr;
        rz5.b.a(lVarArr);
    }

    public l(java.lang.String str, int i17) {
    }

    public static so2.l valueOf(java.lang.String str) {
        return (so2.l) java.lang.Enum.valueOf(so2.l.class, str);
    }

    public static so2.l[] values() {
        return (so2.l[]) f410462g.clone();
    }
}
