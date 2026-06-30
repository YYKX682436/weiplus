package ml2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class i3 {

    /* renamed from: e, reason: collision with root package name */
    public static final ml2.i3 f327554e;

    /* renamed from: f, reason: collision with root package name */
    public static final ml2.i3 f327555f;

    /* renamed from: g, reason: collision with root package name */
    public static final ml2.i3 f327556g;

    /* renamed from: h, reason: collision with root package name */
    public static final ml2.i3 f327557h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ ml2.i3[] f327558i;

    /* renamed from: d, reason: collision with root package name */
    public final int f327559d;

    static {
        ml2.i3 i3Var = new ml2.i3("CLOSE", 0, 1);
        f327554e = i3Var;
        ml2.i3 i3Var2 = new ml2.i3("OPEN", 1, 2);
        f327555f = i3Var2;
        ml2.i3 i3Var3 = new ml2.i3("MODIFY", 2, 3);
        f327556g = i3Var3;
        ml2.i3 i3Var4 = new ml2.i3("FAIL", 3, 4);
        f327557h = i3Var4;
        ml2.i3[] i3VarArr = {i3Var, i3Var2, i3Var3, i3Var4};
        f327558i = i3VarArr;
        rz5.b.a(i3VarArr);
    }

    public i3(java.lang.String str, int i17, int i18) {
        this.f327559d = i18;
    }

    public static ml2.i3 valueOf(java.lang.String str) {
        return (ml2.i3) java.lang.Enum.valueOf(ml2.i3.class, str);
    }

    public static ml2.i3[] values() {
        return (ml2.i3[]) f327558i.clone();
    }
}
