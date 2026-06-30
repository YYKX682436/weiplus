package qk;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class y9 {

    /* renamed from: e, reason: collision with root package name */
    public static final qk.y9 f364382e;

    /* renamed from: f, reason: collision with root package name */
    public static final qk.y9 f364383f;

    /* renamed from: g, reason: collision with root package name */
    public static final qk.y9 f364384g;

    /* renamed from: h, reason: collision with root package name */
    public static final qk.y9 f364385h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ qk.y9[] f364386i;

    /* renamed from: d, reason: collision with root package name */
    public final int f364387d;

    static {
        qk.y9 y9Var = new qk.y9("Body", 0, 0);
        f364382e = y9Var;
        qk.y9 y9Var2 = new qk.y9("Button_Pause", 1, 1);
        f364383f = y9Var2;
        qk.y9 y9Var3 = new qk.y9("Button_Close", 2, 2);
        f364384g = y9Var3;
        qk.y9 y9Var4 = new qk.y9("Button_Play", 3, 3);
        f364385h = y9Var4;
        qk.y9[] y9VarArr = {y9Var, y9Var2, y9Var3, y9Var4};
        f364386i = y9VarArr;
        rz5.b.a(y9VarArr);
    }

    public y9(java.lang.String str, int i17, int i18) {
        this.f364387d = i18;
    }

    public static qk.y9 valueOf(java.lang.String str) {
        return (qk.y9) java.lang.Enum.valueOf(qk.y9.class, str);
    }

    public static qk.y9[] values() {
        return (qk.y9[]) f364386i.clone();
    }
}
