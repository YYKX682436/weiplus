package pr;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class r0 {

    /* renamed from: d, reason: collision with root package name */
    public static final pr.r0 f357775d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ pr.r0[] f357776e;

    static {
        pr.r0 r0Var = new pr.r0("Init", 0);
        pr.r0 r0Var2 = new pr.r0("Checking", 1);
        pr.r0 r0Var3 = new pr.r0("Syncing", 2);
        pr.r0 r0Var4 = new pr.r0("WaitWifi", 3);
        pr.r0 r0Var5 = new pr.r0("WaitLoadMore", 4);
        pr.r0 r0Var6 = new pr.r0("End", 5);
        f357775d = r0Var6;
        pr.r0[] r0VarArr = {r0Var, r0Var2, r0Var3, r0Var4, r0Var5, r0Var6};
        f357776e = r0VarArr;
        rz5.b.a(r0VarArr);
    }

    public r0(java.lang.String str, int i17) {
    }

    public static pr.r0 valueOf(java.lang.String str) {
        return (pr.r0) java.lang.Enum.valueOf(pr.r0.class, str);
    }

    public static pr.r0[] values() {
        return (pr.r0[]) f357776e.clone();
    }
}
