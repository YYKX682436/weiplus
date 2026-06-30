package ur1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ ur1.l[] f430359d;

    static {
        ur1.l[] lVarArr = {new ur1.l("CELL_TYPE_NATIVE", 0, 1), new ur1.l("CELL_TYPE_H5", 1, 2), new ur1.l("CELL_TYPE_WXA", 2, 3)};
        f430359d = lVarArr;
        rz5.b.a(lVarArr);
    }

    public l(java.lang.String str, int i17, int i18) {
    }

    public static ur1.l valueOf(java.lang.String str) {
        return (ur1.l) java.lang.Enum.valueOf(ur1.l.class, str);
    }

    public static ur1.l[] values() {
        return (ur1.l[]) f430359d.clone();
    }
}
