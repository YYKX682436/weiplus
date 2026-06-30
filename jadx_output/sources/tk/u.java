package tk;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class u {

    /* renamed from: e, reason: collision with root package name */
    public static final tk.t f419871e;

    /* renamed from: f, reason: collision with root package name */
    public static final tk.u f419872f;

    /* renamed from: g, reason: collision with root package name */
    public static final tk.u f419873g;

    /* renamed from: h, reason: collision with root package name */
    public static final tk.u f419874h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ tk.u[] f419875i;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ rz5.a f419876m;

    /* renamed from: d, reason: collision with root package name */
    public final int f419877d;

    static {
        tk.u uVar = new tk.u("OPEN_IMAGE", 0, 1);
        f419872f = uVar;
        tk.u uVar2 = new tk.u("OPEN_MP_PUBLISH", 1, 2);
        tk.u uVar3 = new tk.u("OPEN_MP_ARTICLE", 2, 3);
        f419873g = uVar3;
        tk.u uVar4 = new tk.u("OPEN_REGISTER_PAGE", 3, 4);
        f419874h = uVar4;
        tk.u[] uVarArr = {uVar, uVar2, uVar3, uVar4, new tk.u("OPEN_WEAPP", 4, 5)};
        f419875i = uVarArr;
        f419876m = rz5.b.a(uVarArr);
        f419871e = new tk.t(null);
    }

    public u(java.lang.String str, int i17, int i18) {
        this.f419877d = i18;
    }

    public static tk.u valueOf(java.lang.String str) {
        return (tk.u) java.lang.Enum.valueOf(tk.u.class, str);
    }

    public static tk.u[] values() {
        return (tk.u[]) f419875i.clone();
    }
}
