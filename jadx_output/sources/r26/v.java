package r26;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class v {

    /* renamed from: e, reason: collision with root package name */
    public static final r26.v f368918e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ r26.v[] f368919f;

    /* renamed from: d, reason: collision with root package name */
    public final int f368920d;

    static {
        r26.v vVar = new r26.v("IGNORE_CASE", 0, 2, 0, 2, null);
        f368918e = vVar;
        r26.v[] vVarArr = {vVar, new r26.v("MULTILINE", 1, 8, 0, 2, null), new r26.v("LITERAL", 2, 16, 0, 2, null), new r26.v("UNIX_LINES", 3, 1, 0, 2, null), new r26.v("COMMENTS", 4, 4, 0, 2, null), new r26.v("DOT_MATCHES_ALL", 5, 32, 0, 2, null), new r26.v("CANON_EQ", 6, 128, 0, 2, null)};
        f368919f = vVarArr;
        rz5.b.a(vVarArr);
    }

    public v(java.lang.String str, int i17, int i18, int i19, int i27, kotlin.jvm.internal.i iVar) {
        this.f368920d = i18;
    }

    public static r26.v valueOf(java.lang.String str) {
        return (r26.v) java.lang.Enum.valueOf(r26.v.class, str);
    }

    public static r26.v[] values() {
        return (r26.v[]) f368919f.clone();
    }
}
