package ml2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class d4 {

    /* renamed from: e, reason: collision with root package name */
    public static final ml2.d4 f327361e;

    /* renamed from: f, reason: collision with root package name */
    public static final ml2.d4 f327362f;

    /* renamed from: g, reason: collision with root package name */
    public static final ml2.d4 f327363g;

    /* renamed from: h, reason: collision with root package name */
    public static final ml2.d4 f327364h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ ml2.d4[] f327365i;

    /* renamed from: d, reason: collision with root package name */
    public final int f327366d;

    static {
        ml2.d4 d4Var = new ml2.d4("AuthExposure", 0, 1);
        f327361e = d4Var;
        ml2.d4 d4Var2 = new ml2.d4("AuthEnter", 1, 2);
        f327362f = d4Var2;
        ml2.d4 d4Var3 = new ml2.d4("AuthSucc", 2, 3);
        f327363g = d4Var3;
        ml2.d4 d4Var4 = new ml2.d4("AuthFail", 3, 4);
        f327364h = d4Var4;
        ml2.d4[] d4VarArr = {d4Var, d4Var2, d4Var3, d4Var4};
        f327365i = d4VarArr;
        rz5.b.a(d4VarArr);
    }

    public d4(java.lang.String str, int i17, int i18) {
        this.f327366d = i18;
    }

    public static ml2.d4 valueOf(java.lang.String str) {
        return (ml2.d4) java.lang.Enum.valueOf(ml2.d4.class, str);
    }

    public static ml2.d4[] values() {
        return (ml2.d4[]) f327365i.clone();
    }
}
