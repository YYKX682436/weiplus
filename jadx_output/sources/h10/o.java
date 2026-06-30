package h10;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class o {

    /* renamed from: d, reason: collision with root package name */
    public static final h10.o f278060d;

    /* renamed from: e, reason: collision with root package name */
    public static final h10.o f278061e;

    /* renamed from: f, reason: collision with root package name */
    public static final h10.o f278062f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ h10.o[] f278063g;

    static {
        h10.o oVar = new h10.o("UNKNOWN", 0, 0);
        f278060d = oVar;
        h10.o oVar2 = new h10.o("RTL", 1, 1);
        f278061e = oVar2;
        h10.o oVar3 = new h10.o("LTR", 2, 2);
        f278062f = oVar3;
        h10.o[] oVarArr = {oVar, oVar2, oVar3};
        f278063g = oVarArr;
        rz5.b.a(oVarArr);
    }

    public o(java.lang.String str, int i17, int i18) {
    }

    public static h10.o valueOf(java.lang.String str) {
        return (h10.o) java.lang.Enum.valueOf(h10.o.class, str);
    }

    public static h10.o[] values() {
        return (h10.o[]) f278063g.clone();
    }
}
