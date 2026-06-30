package ml2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class f3 {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ ml2.f3[] f327429d;

    static {
        ml2.f3[] f3VarArr = {new ml2.f3("NORMAL", 0, 1), new ml2.f3("DUAL", 1, 2), new ml2.f3("GRAB", 2, 3)};
        f327429d = f3VarArr;
        rz5.b.a(f3VarArr);
    }

    public f3(java.lang.String str, int i17, int i18) {
    }

    public static ml2.f3 valueOf(java.lang.String str) {
        return (ml2.f3) java.lang.Enum.valueOf(ml2.f3.class, str);
    }

    public static ml2.f3[] values() {
        return (ml2.f3[]) f327429d.clone();
    }
}
