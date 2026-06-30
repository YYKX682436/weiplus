package ml2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class l4 {

    /* renamed from: e, reason: collision with root package name */
    public static final ml2.l4 f327699e;

    /* renamed from: f, reason: collision with root package name */
    public static final ml2.l4 f327700f;

    /* renamed from: g, reason: collision with root package name */
    public static final ml2.l4 f327701g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ ml2.l4[] f327702h;

    /* renamed from: d, reason: collision with root package name */
    public final int f327703d;

    static {
        ml2.l4 l4Var = new ml2.l4("REPLAY_PANEL_GENERATE", 0, 1);
        f327699e = l4Var;
        ml2.l4 l4Var2 = new ml2.l4("REPLAY_PANEL_GENERATING", 1, 2);
        f327700f = l4Var2;
        ml2.l4 l4Var3 = new ml2.l4("REPLAY_PANEL_GENERATED", 2, 3);
        f327701g = l4Var3;
        ml2.l4[] l4VarArr = {l4Var, l4Var2, l4Var3};
        f327702h = l4VarArr;
        rz5.b.a(l4VarArr);
    }

    public l4(java.lang.String str, int i17, int i18) {
        this.f327703d = i18;
    }

    public static ml2.l4 valueOf(java.lang.String str) {
        return (ml2.l4) java.lang.Enum.valueOf(ml2.l4.class, str);
    }

    public static ml2.l4[] values() {
        return (ml2.l4[]) f327702h.clone();
    }
}
