package ij2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public static final ij2.b f291688d;

    /* renamed from: e, reason: collision with root package name */
    public static final ij2.b f291689e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ ij2.b[] f291690f;

    static {
        ij2.b bVar = new ij2.b(com.google.android.gms.stats.netstats.NetstatsParserPatterns.TYPE_BACKGROUND_PATTERN, 0);
        f291688d = bVar;
        ij2.b bVar2 = new ij2.b("SELECTED", 1);
        f291689e = bVar2;
        ij2.b[] bVarArr = {bVar, bVar2};
        f291690f = bVarArr;
        rz5.b.a(bVarArr);
    }

    public b(java.lang.String str, int i17) {
    }

    public static ij2.b valueOf(java.lang.String str) {
        return (ij2.b) java.lang.Enum.valueOf(ij2.b.class, str);
    }

    public static ij2.b[] values() {
        return (ij2.b[]) f291690f.clone();
    }
}
