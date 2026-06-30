package ml2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class a3 {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ ml2.a3[] f327203d;

    static {
        ml2.a3[] a3VarArr = {new ml2.a3("TO_HORIZONTAL", 0, 0), new ml2.a3("TO_VERTICAL", 1, 1)};
        f327203d = a3VarArr;
        rz5.b.a(a3VarArr);
    }

    public a3(java.lang.String str, int i17, int i18) {
    }

    public static ml2.a3 valueOf(java.lang.String str) {
        return (ml2.a3) java.lang.Enum.valueOf(ml2.a3.class, str);
    }

    public static ml2.a3[] values() {
        return (ml2.a3[]) f327203d.clone();
    }
}
