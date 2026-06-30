package zv1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: d, reason: collision with root package name */
    public static final zv1.j0 f476308d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ zv1.j0[] f476309e;

    /* renamed from: f, reason: collision with root package name */
    public static final zv1.j0 f476310f;

    /* renamed from: g, reason: collision with root package name */
    public static final zv1.j0 f476311g;

    static {
        zv1.j0 j0Var = new zv1.j0("NO_OP", 0);
        zv1.j0 j0Var2 = new zv1.j0("CLEAN_ALL", 1);
        zv1.j0 j0Var3 = new zv1.j0("CLEAN_LEAST_RECENT", 2);
        f476308d = j0Var3;
        zv1.j0 j0Var4 = new zv1.j0("VFS_EXPIRE", 3);
        f476310f = j0Var4;
        zv1.j0 j0Var5 = new zv1.j0("CUSTOM", 4);
        f476311g = j0Var5;
        zv1.j0[] j0VarArr = {j0Var, j0Var2, j0Var3, j0Var4, j0Var5};
        f476309e = j0VarArr;
        rz5.b.a(j0VarArr);
    }

    public j0(java.lang.String str, int i17) {
    }

    public static zv1.j0 valueOf(java.lang.String str) {
        return (zv1.j0) java.lang.Enum.valueOf(zv1.j0.class, str);
    }

    public static zv1.j0[] values() {
        return (zv1.j0[]) f476309e.clone();
    }
}
