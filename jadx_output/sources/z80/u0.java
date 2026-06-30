package z80;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class u0 {

    /* renamed from: d, reason: collision with root package name */
    public static final z80.u0 f470677d;

    /* renamed from: e, reason: collision with root package name */
    public static final z80.u0 f470678e;

    /* renamed from: f, reason: collision with root package name */
    public static final z80.u0 f470679f;

    /* renamed from: g, reason: collision with root package name */
    public static final z80.u0 f470680g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ z80.u0[] f470681h;

    static {
        z80.u0 u0Var = new z80.u0("FORWARD", 0);
        f470677d = u0Var;
        z80.u0 u0Var2 = new z80.u0("CUSTOM_POI_FORBID_FORWARD", 1);
        f470678e = u0Var2;
        z80.u0 u0Var3 = new z80.u0("COPY_ADDRESS", 2);
        f470679f = u0Var3;
        z80.u0 u0Var4 = new z80.u0("CORRECT_POI", 3);
        f470680g = u0Var4;
        z80.u0[] u0VarArr = {u0Var, u0Var2, u0Var3, u0Var4};
        f470681h = u0VarArr;
        rz5.b.a(u0VarArr);
    }

    public u0(java.lang.String str, int i17) {
    }

    public static z80.u0 valueOf(java.lang.String str) {
        return (z80.u0) java.lang.Enum.valueOf(z80.u0.class, str);
    }

    public static z80.u0[] values() {
        return (z80.u0[]) f470681h.clone();
    }
}
