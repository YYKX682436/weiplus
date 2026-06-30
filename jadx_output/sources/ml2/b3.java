package ml2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class b3 {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ ml2.b3[] f327214d;

    static {
        ml2.b3[] b3VarArr = {new ml2.b3("LIVE_PERSONAL_VIEW_SHOW", 0, 1), new ml2.b3("LIVE_PERSONAL_COMMENT_CLOSE", 1, 2), new ml2.b3("LIVE_PERSONAL_COMMENT_OPEN", 2, 3), new ml2.b3("LIVE_PERSONAL_COMPLAIN", 3, 4), new ml2.b3("LIVE_PERSONAL_KICK_OUT", 4, 5)};
        f327214d = b3VarArr;
        rz5.b.a(b3VarArr);
    }

    public b3(java.lang.String str, int i17, int i18) {
    }

    public static ml2.b3 valueOf(java.lang.String str) {
        return (ml2.b3) java.lang.Enum.valueOf(ml2.b3.class, str);
    }

    public static ml2.b3[] values() {
        return (ml2.b3[]) f327214d.clone();
    }
}
