package n30;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class u {

    /* renamed from: d, reason: collision with root package name */
    public static final n30.u f334470d;

    /* renamed from: e, reason: collision with root package name */
    public static final n30.u f334471e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ n30.u[] f334472f;

    static {
        n30.u uVar = new n30.u("STRATEGY_SPEED", 0, 0);
        f334470d = uVar;
        n30.u uVar2 = new n30.u("STRATEGY_SAMPLING", 1, 1);
        f334471e = uVar2;
        n30.u[] uVarArr = {uVar, uVar2};
        f334472f = uVarArr;
        rz5.b.a(uVarArr);
    }

    public u(java.lang.String str, int i17, int i18) {
    }

    public static n30.u valueOf(java.lang.String str) {
        return (n30.u) java.lang.Enum.valueOf(n30.u.class, str);
    }

    public static n30.u[] values() {
        return (n30.u[]) f334472f.clone();
    }
}
