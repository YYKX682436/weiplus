package uf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class d2 {

    /* renamed from: d, reason: collision with root package name */
    public static final uf.d2 f427016d;

    /* renamed from: e, reason: collision with root package name */
    public static final uf.d2 f427017e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ uf.d2[] f427018f;

    static {
        uf.d2 d2Var = new uf.d2("VOD", 0);
        f427016d = d2Var;
        uf.d2 d2Var2 = new uf.d2("LIVE", 1);
        f427017e = d2Var2;
        uf.d2[] d2VarArr = {d2Var, d2Var2};
        f427018f = d2VarArr;
        rz5.b.a(d2VarArr);
    }

    public d2(java.lang.String str, int i17) {
    }

    public static uf.d2 valueOf(java.lang.String str) {
        return (uf.d2) java.lang.Enum.valueOf(uf.d2.class, str);
    }

    public static uf.d2[] values() {
        return (uf.d2[]) f427018f.clone();
    }
}
