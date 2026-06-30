package fp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class l0 {

    /* renamed from: d, reason: collision with root package name */
    public static final fp.l0 f265204d;

    /* renamed from: e, reason: collision with root package name */
    public static final fp.l0 f265205e;

    /* renamed from: f, reason: collision with root package name */
    public static final fp.l0 f265206f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ fp.l0[] f265207g;

    static {
        fp.l0 l0Var = new fp.l0("DEVICE_LOW", 0);
        f265204d = l0Var;
        fp.l0 l0Var2 = new fp.l0("DEVICE_MID", 1);
        f265205e = l0Var2;
        fp.l0 l0Var3 = new fp.l0("DEVICE_HIGH", 2);
        f265206f = l0Var3;
        fp.l0[] l0VarArr = {l0Var, l0Var2, l0Var3};
        f265207g = l0VarArr;
        rz5.b.a(l0VarArr);
    }

    public l0(java.lang.String str, int i17) {
    }

    public static fp.l0 valueOf(java.lang.String str) {
        return (fp.l0) java.lang.Enum.valueOf(fp.l0.class, str);
    }

    public static fp.l0[] values() {
        return (fp.l0[]) f265207g.clone();
    }
}
