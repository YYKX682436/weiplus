package mv;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class b0 {

    /* renamed from: e, reason: collision with root package name */
    public static final mv.b0 f331477e;

    /* renamed from: f, reason: collision with root package name */
    public static final mv.b0 f331478f;

    /* renamed from: g, reason: collision with root package name */
    public static final mv.b0 f331479g;

    /* renamed from: h, reason: collision with root package name */
    public static final mv.b0 f331480h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ mv.b0[] f331481i;

    /* renamed from: d, reason: collision with root package name */
    public final int f331482d;

    static {
        mv.b0 b0Var = new mv.b0("NONE", 0, -1, "");
        mv.b0 b0Var2 = new mv.b0("HOME", 1, 0, "home");
        f331477e = b0Var2;
        mv.b0 b0Var3 = new mv.b0("DEVICE", 2, 1, "select_device");
        f331478f = b0Var3;
        mv.b0 b0Var4 = new mv.b0("DETAIL", 3, 2, "edit_package");
        f331479g = b0Var4;
        mv.b0 b0Var5 = new mv.b0("RESTORE", 4, 3, "import_package");
        f331480h = b0Var5;
        mv.b0[] b0VarArr = {b0Var, b0Var2, b0Var3, b0Var4, b0Var5};
        f331481i = b0VarArr;
        rz5.b.a(b0VarArr);
    }

    public b0(java.lang.String str, int i17, int i18, java.lang.String str2) {
        this.f331482d = i18;
    }

    public static mv.b0 valueOf(java.lang.String str) {
        return (mv.b0) java.lang.Enum.valueOf(mv.b0.class, str);
    }

    public static mv.b0[] values() {
        return (mv.b0[]) f331481i.clone();
    }
}
