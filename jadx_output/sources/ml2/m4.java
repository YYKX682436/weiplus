package ml2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class m4 {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ ml2.m4[] f327717d;

    static {
        ml2.m4[] m4VarArr = {new ml2.m4("FAIL_BY_REWARD_SETTING", 0, 0), new ml2.m4("FAIL_BY_FOLLOW_SETTING", 1, 1), new ml2.m4("FAIL_BY_BUY_PRODUCT_SETTING", 2, 2)};
        f327717d = m4VarArr;
        rz5.b.a(m4VarArr);
    }

    public m4(java.lang.String str, int i17, int i18) {
    }

    public static ml2.m4 valueOf(java.lang.String str) {
        return (ml2.m4) java.lang.Enum.valueOf(ml2.m4.class, str);
    }

    public static ml2.m4[] values() {
        return (ml2.m4[]) f327717d.clone();
    }
}
