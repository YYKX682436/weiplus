package cw4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class p0 {

    /* renamed from: e, reason: collision with root package name */
    public static final cw4.p0 f224264e;

    /* renamed from: f, reason: collision with root package name */
    public static final cw4.p0 f224265f;

    /* renamed from: g, reason: collision with root package name */
    public static final cw4.p0 f224266g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ cw4.p0[] f224267h;

    /* renamed from: d, reason: collision with root package name */
    public final int f224268d;

    static {
        cw4.p0 p0Var = new cw4.p0("None", 0, 0);
        f224264e = p0Var;
        cw4.p0 p0Var2 = new cw4.p0("DoTrans", 1, 1);
        f224265f = p0Var2;
        cw4.p0 p0Var3 = new cw4.p0("DoRevert", 2, 2);
        f224266g = p0Var3;
        cw4.p0[] p0VarArr = {p0Var, p0Var2, p0Var3};
        f224267h = p0VarArr;
        rz5.b.a(p0VarArr);
    }

    public p0(java.lang.String str, int i17, int i18) {
        this.f224268d = i18;
    }

    public static cw4.p0 valueOf(java.lang.String str) {
        return (cw4.p0) java.lang.Enum.valueOf(cw4.p0.class, str);
    }

    public static cw4.p0[] values() {
        return (cw4.p0[]) f224267h.clone();
    }
}
