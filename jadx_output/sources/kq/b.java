package kq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public static final kq.b f311177d;

    /* renamed from: e, reason: collision with root package name */
    public static final kq.b f311178e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kq.b[] f311179f;

    static {
        kq.b bVar = new kq.b("FILE", 0);
        f311177d = bVar;
        kq.b bVar2 = new kq.b(com.google.android.gms.stats.netstats.NetstatsParserPatterns.TYPE_BACKGROUND_PATTERN, 1);
        f311178e = bVar2;
        kq.b[] bVarArr = {bVar, bVar2};
        f311179f = bVarArr;
        rz5.b.a(bVarArr);
    }

    public b(java.lang.String str, int i17) {
    }

    public static kq.b valueOf(java.lang.String str) {
        return (kq.b) java.lang.Enum.valueOf(kq.b.class, str);
    }

    public static kq.b[] values() {
        return (kq.b[]) f311179f.clone();
    }
}
