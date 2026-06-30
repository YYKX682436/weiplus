package ml2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class v4 {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ ml2.v4[] f328149d;

    static {
        ml2.v4[] v4VarArr = {new ml2.v4("WIN", 0, 1), new ml2.v4("NO_WIN", 1, 2), new ml2.v4("NO_JOIN", 2, 3)};
        f328149d = v4VarArr;
        rz5.b.a(v4VarArr);
    }

    public v4(java.lang.String str, int i17, int i18) {
    }

    public static ml2.v4 valueOf(java.lang.String str) {
        return (ml2.v4) java.lang.Enum.valueOf(ml2.v4.class, str);
    }

    public static ml2.v4[] values() {
        return (ml2.v4[]) f328149d.clone();
    }
}
