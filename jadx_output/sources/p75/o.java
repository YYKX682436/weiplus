package p75;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class o {

    /* renamed from: d, reason: collision with root package name */
    public static final p75.o f352677d;

    /* renamed from: e, reason: collision with root package name */
    public static final p75.o f352678e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ p75.o[] f352679f;

    static {
        p75.o oVar = new p75.o("AND", 0);
        f352677d = oVar;
        p75.o oVar2 = new p75.o("OR", 1);
        f352678e = oVar2;
        p75.o[] oVarArr = {oVar, oVar2};
        f352679f = oVarArr;
        rz5.b.a(oVarArr);
    }

    public o(java.lang.String str, int i17) {
    }

    public static p75.o valueOf(java.lang.String str) {
        return (p75.o) java.lang.Enum.valueOf(p75.o.class, str);
    }

    public static p75.o[] values() {
        return (p75.o[]) f352679f.clone();
    }
}
