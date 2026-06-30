package o63;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ o63.g[] f343199d;

    static {
        o63.g[] gVarArr = {new o63.g(com.google.android.gms.stats.netstats.NetstatsParserPatterns.TYPE_BACKGROUND_PATTERN, 0, -1), new o63.g("PAGE_EVENT", 1, 0), new o63.g("SESSION_EVENT", 2, 1), new o63.g("ALL_EVENT", 3, 2)};
        f343199d = gVarArr;
        rz5.b.a(gVarArr);
    }

    public g(java.lang.String str, int i17, int i18) {
    }

    public static o63.g valueOf(java.lang.String str) {
        return (o63.g) java.lang.Enum.valueOf(o63.g.class, str);
    }

    public static o63.g[] values() {
        return (o63.g[]) f343199d.clone();
    }
}
