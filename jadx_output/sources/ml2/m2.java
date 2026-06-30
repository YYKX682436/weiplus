package ml2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class m2 {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ ml2.m2[] f327712d;

    static {
        ml2.m2[] m2VarArr = {new ml2.m2("INITIATIVE", 0, 1), new ml2.m2("PASSIVE", 1, 2)};
        f327712d = m2VarArr;
        rz5.b.a(m2VarArr);
    }

    public m2(java.lang.String str, int i17, int i18) {
    }

    public static ml2.m2 valueOf(java.lang.String str) {
        return (ml2.m2) java.lang.Enum.valueOf(ml2.m2.class, str);
    }

    public static ml2.m2[] values() {
        return (ml2.m2[]) f327712d.clone();
    }
}
