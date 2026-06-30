package ml2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class o4 {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ ml2.o4[] f327774d;

    static {
        ml2.o4[] o4VarArr = {new ml2.o4("LIKE", 0, 1), new ml2.o4("COMMENT", 1, 2), new ml2.o4("FOLLOW", 2, 3), new ml2.o4("FAN", 3, 4)};
        f327774d = o4VarArr;
        rz5.b.a(o4VarArr);
    }

    public o4(java.lang.String str, int i17, int i18) {
    }

    public static ml2.o4 valueOf(java.lang.String str) {
        return (ml2.o4) java.lang.Enum.valueOf(ml2.o4.class, str);
    }

    public static ml2.o4[] values() {
        return (ml2.o4[]) f327774d.clone();
    }
}
