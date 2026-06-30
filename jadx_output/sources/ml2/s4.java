package ml2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class s4 {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ ml2.s4[] f327926d;

    static {
        ml2.s4[] s4VarArr = {new ml2.s4("EXPOSE", 0, 1), new ml2.s4("BUTTON_CLICK", 1, 2)};
        f327926d = s4VarArr;
        rz5.b.a(s4VarArr);
    }

    public s4(java.lang.String str, int i17, int i18) {
    }

    public static ml2.s4 valueOf(java.lang.String str) {
        return (ml2.s4) java.lang.Enum.valueOf(ml2.s4.class, str);
    }

    public static ml2.s4[] values() {
        return (ml2.s4[]) f327926d.clone();
    }
}
