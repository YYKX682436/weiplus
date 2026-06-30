package rh0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes14.dex */
public final class b0 {

    /* renamed from: d, reason: collision with root package name */
    public static final rh0.b0 f395580d;

    /* renamed from: e, reason: collision with root package name */
    public static final rh0.b0 f395581e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ rh0.b0[] f395582f;

    static {
        rh0.b0 b0Var = new rh0.b0("SEGMENT_NONE", 0);
        f395580d = b0Var;
        rh0.b0 b0Var2 = new rh0.b0("SEGMENT_BLUR", 1);
        rh0.b0 b0Var3 = new rh0.b0("SEGMENT_FOCUS", 2);
        rh0.b0 b0Var4 = new rh0.b0("SEGMENT_GLASS", 3);
        f395581e = b0Var4;
        rh0.b0[] b0VarArr = {b0Var, b0Var2, b0Var3, b0Var4, new rh0.b0("SEGMENT_GLASS_PENSE", 4)};
        f395582f = b0VarArr;
        rz5.b.a(b0VarArr);
    }

    public b0(java.lang.String str, int i17) {
    }

    public static rh0.b0 valueOf(java.lang.String str) {
        return (rh0.b0) java.lang.Enum.valueOf(rh0.b0.class, str);
    }

    public static rh0.b0[] values() {
        return (rh0.b0[]) f395582f.clone();
    }
}
