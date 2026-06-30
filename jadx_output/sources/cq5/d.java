package cq5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class d {

    /* renamed from: e, reason: collision with root package name */
    public static final cq5.d f221514e;

    /* renamed from: f, reason: collision with root package name */
    public static final cq5.d f221515f;

    /* renamed from: g, reason: collision with root package name */
    public static final cq5.d f221516g;

    /* renamed from: h, reason: collision with root package name */
    public static final cq5.d f221517h;

    /* renamed from: i, reason: collision with root package name */
    public static final cq5.d f221518i;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ cq5.d[] f221519m;

    /* renamed from: d, reason: collision with root package name */
    public final int f221520d;

    static {
        cq5.d dVar = new cq5.d("SUCCESS", 0, 0);
        f221514e = dVar;
        cq5.d dVar2 = new cq5.d("FIRST_EDU", 1, 1);
        f221515f = dVar2;
        cq5.d dVar3 = new cq5.d("HAS_SCAN_BY_OTHERS", 2, 2);
        f221516g = dVar3;
        cq5.d dVar4 = new cq5.d("EXPIRED", 3, 3);
        f221517h = dVar4;
        cq5.d dVar5 = new cq5.d("OTHER", 4, 4);
        f221518i = dVar5;
        cq5.d[] dVarArr = {dVar, dVar2, dVar3, dVar4, dVar5};
        f221519m = dVarArr;
        rz5.b.a(dVarArr);
    }

    public d(java.lang.String str, int i17, int i18) {
        this.f221520d = i18;
    }

    public static cq5.d valueOf(java.lang.String str) {
        return (cq5.d) java.lang.Enum.valueOf(cq5.d.class, str);
    }

    public static cq5.d[] values() {
        return (cq5.d[]) f221519m.clone();
    }
}
