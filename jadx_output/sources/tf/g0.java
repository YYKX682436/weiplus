package tf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class g0 {

    /* renamed from: d, reason: collision with root package name */
    public static final tf.g0 f418808d;

    /* renamed from: e, reason: collision with root package name */
    public static final tf.g0 f418809e;

    /* renamed from: f, reason: collision with root package name */
    public static final tf.g0 f418810f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ tf.g0[] f418811g;

    static {
        tf.g0 g0Var = new tf.g0("Video", 0);
        f418808d = g0Var;
        tf.g0 g0Var2 = new tf.g0("LivePlayer", 1);
        f418809e = g0Var2;
        tf.g0 g0Var3 = new tf.g0("LivePusher", 2);
        f418810f = g0Var3;
        tf.g0[] g0VarArr = {g0Var, g0Var2, g0Var3};
        f418811g = g0VarArr;
        rz5.b.a(g0VarArr);
    }

    public g0(java.lang.String str, int i17) {
    }

    public static tf.g0 valueOf(java.lang.String str) {
        return (tf.g0) java.lang.Enum.valueOf(tf.g0.class, str);
    }

    public static tf.g0[] values() {
        return (tf.g0[]) f418811g.clone();
    }
}
