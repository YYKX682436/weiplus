package te2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class j3 {

    /* renamed from: e, reason: collision with root package name */
    public static final te2.j3 f418132e;

    /* renamed from: f, reason: collision with root package name */
    public static final te2.j3 f418133f;

    /* renamed from: g, reason: collision with root package name */
    public static final te2.j3 f418134g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ te2.j3[] f418135h;

    /* renamed from: d, reason: collision with root package name */
    public final int f418136d;

    static {
        te2.j3 j3Var = new te2.j3("IMAGE_LOADED", 0, 1);
        f418132e = j3Var;
        te2.j3 j3Var2 = new te2.j3("HD_ENTRANCE_EXPOSE", 1, 2);
        f418133f = j3Var2;
        te2.j3 j3Var3 = new te2.j3("HD_ENTRANCE_CLICK", 2, 3);
        f418134g = j3Var3;
        te2.j3[] j3VarArr = {j3Var, j3Var2, j3Var3};
        f418135h = j3VarArr;
        rz5.b.a(j3VarArr);
    }

    public j3(java.lang.String str, int i17, int i18) {
        this.f418136d = i18;
    }

    public static te2.j3 valueOf(java.lang.String str) {
        return (te2.j3) java.lang.Enum.valueOf(te2.j3.class, str);
    }

    public static te2.j3[] values() {
        return (te2.j3[]) f418135h.clone();
    }
}
