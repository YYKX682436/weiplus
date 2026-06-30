package xx;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ xx.a[] f457769d;

    static {
        xx.a[] aVarArr = {new xx.a("AIAnswerTypeMe", 0, 1), new xx.a("AIAnswerTypeOther", 1, 2)};
        f457769d = aVarArr;
        rz5.b.a(aVarArr);
    }

    public a(java.lang.String str, int i17, int i18) {
    }

    public static xx.a valueOf(java.lang.String str) {
        return (xx.a) java.lang.Enum.valueOf(xx.a.class, str);
    }

    public static xx.a[] values() {
        return (xx.a[]) f457769d.clone();
    }
}
