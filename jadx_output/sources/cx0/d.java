package cx0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class d {

    /* renamed from: d, reason: collision with root package name */
    public static final cx0.d f224508d;

    /* renamed from: e, reason: collision with root package name */
    public static final cx0.d f224509e;

    /* renamed from: f, reason: collision with root package name */
    public static final cx0.d f224510f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ cx0.d[] f224511g;

    static {
        cx0.d dVar = new cx0.d("None", 0);
        f224508d = dVar;
        cx0.d dVar2 = new cx0.d("NoAnimation", 1);
        f224509e = dVar2;
        cx0.d dVar3 = new cx0.d("Layout", 2);
        f224510f = dVar3;
        cx0.d[] dVarArr = {dVar, dVar2, dVar3};
        f224511g = dVarArr;
        rz5.b.a(dVarArr);
    }

    public d(java.lang.String str, int i17) {
    }

    public static cx0.d valueOf(java.lang.String str) {
        return (cx0.d) java.lang.Enum.valueOf(cx0.d.class, str);
    }

    public static cx0.d[] values() {
        return (cx0.d[]) f224511g.clone();
    }

    public final java.util.EnumSet a(cx0.d other) {
        kotlin.jvm.internal.o.g(other, "other");
        java.util.EnumSet of6 = java.util.EnumSet.of(this, other);
        kotlin.jvm.internal.o.f(of6, "of(...)");
        return of6;
    }
}
