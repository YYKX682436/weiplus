package uw;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ uw.j[] f431494d;

    static {
        uw.j[] jVarArr = {new uw.j("RECOMMEND_FEEDS_UNDEFINED", 0, 0), new uw.j("RECOMMEND_FEEDS_CLOSE", 1, 1), new uw.j("RECOMMEND_FEEDS_OPEN", 2, 2)};
        f431494d = jVarArr;
        rz5.b.a(jVarArr);
    }

    public j(java.lang.String str, int i17, int i18) {
    }

    public static uw.j valueOf(java.lang.String str) {
        return (uw.j) java.lang.Enum.valueOf(uw.j.class, str);
    }

    public static uw.j[] values() {
        return (uw.j[]) f431494d.clone();
    }
}
