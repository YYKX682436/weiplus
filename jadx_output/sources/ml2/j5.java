package ml2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class j5 {

    /* renamed from: e, reason: collision with root package name */
    public static final ml2.j5 f327630e;

    /* renamed from: f, reason: collision with root package name */
    public static final ml2.j5 f327631f;

    /* renamed from: g, reason: collision with root package name */
    public static final ml2.j5 f327632g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ ml2.j5[] f327633h;

    /* renamed from: d, reason: collision with root package name */
    public final int f327634d;

    static {
        ml2.j5 j5Var = new ml2.j5("Chat", 0, 1);
        f327630e = j5Var;
        ml2.j5 j5Var2 = new ml2.j5("Timeline", 1, 2);
        f327631f = j5Var2;
        ml2.j5 j5Var3 = new ml2.j5("PERSIONAL_STATE_SHARE_SUCC", 2, 5);
        f327632g = j5Var3;
        ml2.j5[] j5VarArr = {j5Var, j5Var2, j5Var3};
        f327633h = j5VarArr;
        rz5.b.a(j5VarArr);
    }

    public j5(java.lang.String str, int i17, int i18) {
        this.f327634d = i18;
    }

    public static ml2.j5 valueOf(java.lang.String str) {
        return (ml2.j5) java.lang.Enum.valueOf(ml2.j5.class, str);
    }

    public static ml2.j5[] values() {
        return (ml2.j5[]) f327633h.clone();
    }
}
