package gc2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class d {

    /* renamed from: d, reason: collision with root package name */
    public static final gc2.d f270401d;

    /* renamed from: e, reason: collision with root package name */
    public static final gc2.d f270402e;

    /* renamed from: f, reason: collision with root package name */
    public static final gc2.d f270403f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ gc2.d[] f270404g;

    static {
        gc2.d dVar = new gc2.d("NOT_DETERMINED", 0);
        f270401d = dVar;
        gc2.d dVar2 = new gc2.d("HORIZONTAL", 1);
        f270402e = dVar2;
        gc2.d dVar3 = new gc2.d("VERTICAL", 2);
        f270403f = dVar3;
        gc2.d[] dVarArr = {dVar, dVar2, dVar3};
        f270404g = dVarArr;
        rz5.b.a(dVarArr);
    }

    public d(java.lang.String str, int i17) {
    }

    public static gc2.d valueOf(java.lang.String str) {
        return (gc2.d) java.lang.Enum.valueOf(gc2.d.class, str);
    }

    public static gc2.d[] values() {
        return (gc2.d[]) f270404g.clone();
    }
}
