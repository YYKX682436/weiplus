package mq0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: e, reason: collision with root package name */
    public static final mq0.f0 f330553e;

    /* renamed from: f, reason: collision with root package name */
    public static final mq0.f0 f330554f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ mq0.f0[] f330555g;

    /* renamed from: d, reason: collision with root package name */
    public final int f330556d;

    static {
        mq0.f0 f0Var = new mq0.f0("Unknown", 0, -1);
        mq0.f0 f0Var2 = new mq0.f0("Old", 1, 0);
        f330553e = f0Var2;
        mq0.f0 f0Var3 = new mq0.f0("New", 2, 1);
        f330554f = f0Var3;
        mq0.f0[] f0VarArr = {f0Var, f0Var2, f0Var3};
        f330555g = f0VarArr;
        rz5.b.a(f0VarArr);
    }

    public f0(java.lang.String str, int i17, int i18) {
        this.f330556d = i18;
    }

    public static mq0.f0 valueOf(java.lang.String str) {
        return (mq0.f0) java.lang.Enum.valueOf(mq0.f0.class, str);
    }

    public static mq0.f0[] values() {
        return (mq0.f0[]) f330555g.clone();
    }
}
