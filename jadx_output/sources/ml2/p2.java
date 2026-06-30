package ml2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class p2 {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ ml2.p2[] f327787d;

    static {
        ml2.p2[] p2VarArr = {new ml2.p2("LIVE_LIKE_SWITCH_ENABLE", 0, 1), new ml2.p2("LIVE_LIKE_SWITCH_DISABLE", 1, 2)};
        f327787d = p2VarArr;
        rz5.b.a(p2VarArr);
    }

    public p2(java.lang.String str, int i17, int i18) {
    }

    public static ml2.p2 valueOf(java.lang.String str) {
        return (ml2.p2) java.lang.Enum.valueOf(ml2.p2.class, str);
    }

    public static ml2.p2[] values() {
        return (ml2.p2[]) f327787d.clone();
    }
}
