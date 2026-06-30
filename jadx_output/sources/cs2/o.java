package cs2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class o {

    /* renamed from: d, reason: collision with root package name */
    public static final cs2.o f222083d;

    /* renamed from: e, reason: collision with root package name */
    public static final cs2.o f222084e;

    /* renamed from: f, reason: collision with root package name */
    public static final cs2.o f222085f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ cs2.o[] f222086g;

    static {
        cs2.o oVar = new cs2.o("LOADING", 0);
        f222083d = oVar;
        cs2.o oVar2 = new cs2.o("PENDING", 1);
        f222084e = oVar2;
        cs2.o oVar3 = new cs2.o("WAITING", 2);
        f222085f = oVar3;
        cs2.o[] oVarArr = {oVar, oVar2, oVar3};
        f222086g = oVarArr;
        rz5.b.a(oVarArr);
    }

    public o(java.lang.String str, int i17) {
    }

    public static cs2.o valueOf(java.lang.String str) {
        return (cs2.o) java.lang.Enum.valueOf(cs2.o.class, str);
    }

    public static cs2.o[] values() {
        return (cs2.o[]) f222086g.clone();
    }
}
