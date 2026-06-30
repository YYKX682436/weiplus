package wj;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class o {

    /* renamed from: d, reason: collision with root package name */
    public static final wj.o f446453d;

    /* renamed from: e, reason: collision with root package name */
    public static final wj.o f446454e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ wj.o[] f446455f;

    static {
        wj.o oVar = new wj.o("Success", 0);
        f446453d = oVar;
        wj.o oVar2 = new wj.o("Fail", 1);
        f446454e = oVar2;
        wj.o[] oVarArr = {oVar, oVar2};
        f446455f = oVarArr;
        rz5.b.a(oVarArr);
    }

    public o(java.lang.String str, int i17) {
    }

    public static wj.o valueOf(java.lang.String str) {
        return (wj.o) java.lang.Enum.valueOf(wj.o.class, str);
    }

    public static wj.o[] values() {
        return (wj.o[]) f446455f.clone();
    }
}
