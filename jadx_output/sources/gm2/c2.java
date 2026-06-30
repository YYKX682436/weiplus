package gm2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class c2 {

    /* renamed from: e, reason: collision with root package name */
    public static final gm2.b2 f273346e;

    /* renamed from: f, reason: collision with root package name */
    public static final gm2.c2[] f273347f;

    /* renamed from: g, reason: collision with root package name */
    public static final gm2.c2 f273348g;

    /* renamed from: h, reason: collision with root package name */
    public static final gm2.c2 f273349h;

    /* renamed from: i, reason: collision with root package name */
    public static final gm2.c2 f273350i;

    /* renamed from: m, reason: collision with root package name */
    public static final gm2.c2 f273351m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ gm2.c2[] f273352n;

    /* renamed from: d, reason: collision with root package name */
    public final int f273353d;

    static {
        gm2.c2 c2Var = new gm2.c2("MODE_DARK", 0, 0);
        f273348g = c2Var;
        gm2.c2 c2Var2 = new gm2.c2("MODE_LIGHT", 1, 1);
        f273349h = c2Var2;
        gm2.c2 c2Var3 = new gm2.c2("MODE_AUTO", 2, 2);
        f273350i = c2Var3;
        gm2.c2 c2Var4 = new gm2.c2("MODE_LIGHT_BG", 3, 3);
        f273351m = c2Var4;
        gm2.c2[] c2VarArr = {c2Var, c2Var2, c2Var3, c2Var4};
        f273352n = c2VarArr;
        rz5.b.a(c2VarArr);
        f273346e = new gm2.b2(null);
        f273347f = values();
    }

    public c2(java.lang.String str, int i17, int i18) {
        this.f273353d = i18;
    }

    public static gm2.c2 valueOf(java.lang.String str) {
        return (gm2.c2) java.lang.Enum.valueOf(gm2.c2.class, str);
    }

    public static gm2.c2[] values() {
        return (gm2.c2[]) f273352n.clone();
    }
}
