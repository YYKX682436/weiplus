package x06;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes15.dex */
public class f1 {

    /* renamed from: e, reason: collision with root package name */
    public static final x06.f1 f451235e;

    /* renamed from: f, reason: collision with root package name */
    public static final x06.f1 f451236f;

    /* renamed from: g, reason: collision with root package name */
    public static final x06.f1 f451237g;

    /* renamed from: h, reason: collision with root package name */
    public static final x06.f1 f451238h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ x06.f1[] f451239i;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Object f451240d;

    static {
        x06.f1 f1Var = new x06.f1("NULL", 0, null);
        f451235e = f1Var;
        x06.f1 f1Var2 = new x06.f1("INDEX", 1, -1);
        f451236f = f1Var2;
        x06.f1 f1Var3 = new x06.f1("FALSE", 2, java.lang.Boolean.FALSE);
        f451237g = f1Var3;
        final java.lang.String str = "MAP_GET_OR_DEFAULT";
        final int i17 = 3;
        x06.f1 f1Var4 = new x06.f1(str, i17) { // from class: x06.e1
        };
        f451238h = f1Var4;
        x06.f1[] f1VarArr = {f1Var, f1Var2, f1Var3, f1Var4};
        f451239i = f1VarArr;
        rz5.b.a(f1VarArr);
    }

    public f1(java.lang.String str, int i17, java.lang.Object obj) {
        this.f451240d = obj;
    }

    public static x06.f1 valueOf(java.lang.String str) {
        return (x06.f1) java.lang.Enum.valueOf(x06.f1.class, str);
    }

    public static x06.f1[] values() {
        return (x06.f1[]) f451239i.clone();
    }
}
