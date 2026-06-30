package ml2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class e3 {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ ml2.e3[] f327375d;

    static {
        ml2.e3[] e3VarArr = {new ml2.e3("ORDINARY_LAUNCH_UI", 0, 1), new ml2.e3("INNER_NOTICE_TIME_LAUNCH_UI", 1, 2), new ml2.e3("RETURN_LIVE_ROOM", 2, 3)};
        f327375d = e3VarArr;
        rz5.b.a(e3VarArr);
    }

    public e3(java.lang.String str, int i17, int i18) {
    }

    public static ml2.e3 valueOf(java.lang.String str) {
        return (ml2.e3) java.lang.Enum.valueOf(ml2.e3.class, str);
    }

    public static ml2.e3[] values() {
        return (ml2.e3[]) f327375d.clone();
    }
}
