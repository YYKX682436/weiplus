package ml2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class d1 {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ ml2.d1[] f327350d;

    static {
        ml2.d1[] d1VarArr = {new ml2.d1("LIVE_ALL_COMMENT_CLOSE", 0, 1), new ml2.d1("LIVE_ALL_COMMENT_OPEN", 1, 2), new ml2.d1("LIVE_COMMENT_MANAGEMENT_EXPOSE", 2, 3), new ml2.d1("LIVE_COMMENT_SENSITIVE_WORDS_CLICK", 3, 4), new ml2.d1("LIVE_COMMENT_MANAGER_CLICK", 4, 5), new ml2.d1("LIVE_FAST_COMMENT_CLICK", 5, 6)};
        f327350d = d1VarArr;
        rz5.b.a(d1VarArr);
    }

    public d1(java.lang.String str, int i17, int i18) {
    }

    public static ml2.d1 valueOf(java.lang.String str) {
        return (ml2.d1) java.lang.Enum.valueOf(ml2.d1.class, str);
    }

    public static ml2.d1[] values() {
        return (ml2.d1[]) f327350d.clone();
    }
}
