package ps3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class o {

    /* renamed from: d, reason: collision with root package name */
    public static final ps3.o f358115d;

    /* renamed from: e, reason: collision with root package name */
    public static final ps3.o f358116e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ ps3.o[] f358117f;

    static {
        ps3.o oVar = new ps3.o("Selected", 0);
        f358115d = oVar;
        ps3.o oVar2 = new ps3.o("UnSelected", 1);
        f358116e = oVar2;
        ps3.o[] oVarArr = {oVar, oVar2};
        f358117f = oVarArr;
        rz5.b.a(oVarArr);
    }

    public o(java.lang.String str, int i17) {
    }

    public static ps3.o valueOf(java.lang.String str) {
        return (ps3.o) java.lang.Enum.valueOf(ps3.o.class, str);
    }

    public static ps3.o[] values() {
        return (ps3.o[]) f358117f.clone();
    }
}
