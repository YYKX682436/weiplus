package ml2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class k2 {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ ml2.k2[] f327647d;

    static {
        ml2.k2[] k2VarArr = {new ml2.k2("FINDER", 0, 1), new ml2.k2("ALIAS", 1, 2), new ml2.k2("WECHAT", 2, 3)};
        f327647d = k2VarArr;
        rz5.b.a(k2VarArr);
    }

    public k2(java.lang.String str, int i17, int i18) {
    }

    public static ml2.k2 valueOf(java.lang.String str) {
        return (ml2.k2) java.lang.Enum.valueOf(ml2.k2.class, str);
    }

    public static ml2.k2[] values() {
        return (ml2.k2[]) f327647d.clone();
    }
}
