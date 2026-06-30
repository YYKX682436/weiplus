package mv;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class d0 {

    /* renamed from: e, reason: collision with root package name */
    public static final mv.d0 f331487e;

    /* renamed from: f, reason: collision with root package name */
    public static final mv.d0 f331488f;

    /* renamed from: g, reason: collision with root package name */
    public static final mv.d0 f331489g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ mv.d0[] f331490h;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f331491d;

    static {
        mv.d0 d0Var = new mv.d0("TaskDetail", 0, "/task_detail");
        f331487e = d0Var;
        mv.d0 d0Var2 = new mv.d0("MigrationTypeSelect", 1, "/migration_type_select");
        f331488f = d0Var2;
        mv.d0 d0Var3 = new mv.d0("GuestEntry", 2, "/guest_entry");
        f331489g = d0Var3;
        mv.d0[] d0VarArr = {d0Var, d0Var2, d0Var3};
        f331490h = d0VarArr;
        rz5.b.a(d0VarArr);
    }

    public d0(java.lang.String str, int i17, java.lang.String str2) {
        this.f331491d = str2;
    }

    public static mv.d0 valueOf(java.lang.String str) {
        return (mv.d0) java.lang.Enum.valueOf(mv.d0.class, str);
    }

    public static mv.d0[] values() {
        return (mv.d0[]) f331490h.clone();
    }
}
