package ml2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class q4 {

    /* renamed from: e, reason: collision with root package name */
    public static final ml2.q4 f327852e;

    /* renamed from: f, reason: collision with root package name */
    public static final ml2.q4 f327853f;

    /* renamed from: g, reason: collision with root package name */
    public static final ml2.q4 f327854g;

    /* renamed from: h, reason: collision with root package name */
    public static final ml2.q4 f327855h;

    /* renamed from: i, reason: collision with root package name */
    public static final ml2.q4 f327856i;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ ml2.q4[] f327857m;

    /* renamed from: d, reason: collision with root package name */
    public final int f327858d;

    static {
        ml2.q4 q4Var = new ml2.q4("COLLAPSE", 0, 1);
        f327852e = q4Var;
        ml2.q4 q4Var2 = new ml2.q4("MIC_SWITCH", 1, 2);
        f327853f = q4Var2;
        ml2.q4 q4Var3 = new ml2.q4("CAMERA_SWITCH", 2, 3);
        f327854g = q4Var3;
        ml2.q4 q4Var4 = new ml2.q4("FRAME_SETTING", 3, 4);
        f327855h = q4Var4;
        ml2.q4 q4Var5 = new ml2.q4("HANG_UP", 4, 5);
        f327856i = q4Var5;
        ml2.q4[] q4VarArr = {q4Var, q4Var2, q4Var3, q4Var4, q4Var5};
        f327857m = q4VarArr;
        rz5.b.a(q4VarArr);
    }

    public q4(java.lang.String str, int i17, int i18) {
        this.f327858d = i18;
    }

    public static ml2.q4 valueOf(java.lang.String str) {
        return (ml2.q4) java.lang.Enum.valueOf(ml2.q4.class, str);
    }

    public static ml2.q4[] values() {
        return (ml2.q4[]) f327857m.clone();
    }
}
