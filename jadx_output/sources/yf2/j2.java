package yf2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class j2 {

    /* renamed from: d, reason: collision with root package name */
    public static final yf2.j2 f461730d;

    /* renamed from: e, reason: collision with root package name */
    public static final yf2.j2 f461731e;

    /* renamed from: f, reason: collision with root package name */
    public static final yf2.j2 f461732f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ yf2.j2[] f461733g;

    static {
        yf2.j2 j2Var = new yf2.j2("CHAT", 0);
        f461730d = j2Var;
        yf2.j2 j2Var2 = new yf2.j2("LIVE_POST_VERIFIED", 1);
        f461731e = j2Var2;
        yf2.j2 j2Var3 = new yf2.j2("LIVE_POST_UNVERIFIED", 2);
        f461732f = j2Var3;
        yf2.j2[] j2VarArr = {j2Var, j2Var2, j2Var3};
        f461733g = j2VarArr;
        rz5.b.a(j2VarArr);
    }

    public j2(java.lang.String str, int i17) {
    }

    public static yf2.j2 valueOf(java.lang.String str) {
        return (yf2.j2) java.lang.Enum.valueOf(yf2.j2.class, str);
    }

    public static yf2.j2[] values() {
        return (yf2.j2[]) f461733g.clone();
    }
}
