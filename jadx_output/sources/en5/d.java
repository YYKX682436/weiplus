package en5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes14.dex */
public final class d {

    /* renamed from: d, reason: collision with root package name */
    public static final en5.d f255371d;

    /* renamed from: e, reason: collision with root package name */
    public static final en5.d f255372e;

    /* renamed from: f, reason: collision with root package name */
    public static final en5.d f255373f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ en5.d[] f255374g;

    static {
        en5.d dVar = new en5.d(com.google.android.gms.stats.netstats.NetstatsParserPatterns.TYPE_BOTH_PATTERN, 0);
        f255371d = dVar;
        en5.d dVar2 = new en5.d("PIC", 1);
        f255372e = dVar2;
        en5.d dVar3 = new en5.d("OCR", 2);
        f255373f = dVar3;
        en5.d[] dVarArr = {dVar, dVar2, dVar3};
        f255374g = dVarArr;
        rz5.b.a(dVarArr);
    }

    public d(java.lang.String str, int i17) {
    }

    public static en5.d valueOf(java.lang.String str) {
        return (en5.d) java.lang.Enum.valueOf(en5.d.class, str);
    }

    public static en5.d[] values() {
        return (en5.d[]) f255374g.clone();
    }
}
