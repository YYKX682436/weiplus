package ml2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class m1 {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ ml2.m1[] f327711d;

    static {
        ml2.m1[] m1VarArr = {new ml2.m1("UNKNOWN", 0, 0), new ml2.m1("BOTTOM_RIGHT_BUTTON", 1, 1), new ml2.m1("HALF_SCREEN_SWITCH", 2, 2)};
        f327711d = m1VarArr;
        rz5.b.a(m1VarArr);
    }

    public m1(java.lang.String str, int i17, int i18) {
    }

    public static ml2.m1 valueOf(java.lang.String str) {
        return (ml2.m1) java.lang.Enum.valueOf(ml2.m1.class, str);
    }

    public static ml2.m1[] values() {
        return (ml2.m1[]) f327711d.clone();
    }
}
