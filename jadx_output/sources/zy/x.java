package zy;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class x {

    /* renamed from: e, reason: collision with root package name */
    public static final zy.x f477303e;

    /* renamed from: f, reason: collision with root package name */
    public static final zy.x f477304f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ zy.x[] f477305g;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f477306d;

    static {
        zy.x xVar = new zy.x(com.google.android.gms.stats.netstats.NetstatsParserPatterns.TYPE_BACKGROUND_PATTERN, 0, "resource_downloader_2");
        f477303e = xVar;
        zy.x xVar2 = new zy.x("KTV_SONG", 1, "finder_live_ktv_song");
        f477304f = xVar2;
        zy.x[] xVarArr = {xVar, xVar2};
        f477305g = xVarArr;
        rz5.b.a(xVarArr);
    }

    public x(java.lang.String str, int i17, java.lang.String str2) {
        this.f477306d = str2;
    }

    public static zy.x valueOf(java.lang.String str) {
        return (zy.x) java.lang.Enum.valueOf(zy.x.class, str);
    }

    public static zy.x[] values() {
        return (zy.x[]) f477305g.clone();
    }
}
