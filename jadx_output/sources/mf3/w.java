package mf3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes12.dex */
public final class w {

    /* renamed from: d, reason: collision with root package name */
    public static final mf3.w f326128d;

    /* renamed from: e, reason: collision with root package name */
    public static final mf3.w f326129e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ mf3.w[] f326130f;

    static {
        mf3.w wVar = new mf3.w(com.google.android.gms.stats.netstats.NetstatsParserPatterns.TYPE_BACKGROUND_PATTERN, 0);
        f326128d = wVar;
        mf3.w wVar2 = new mf3.w("HD", 1);
        f326129e = wVar2;
        mf3.w[] wVarArr = {wVar, wVar2};
        f326130f = wVarArr;
        rz5.b.a(wVarArr);
    }

    public w(java.lang.String str, int i17) {
    }

    public static mf3.w valueOf(java.lang.String str) {
        return (mf3.w) java.lang.Enum.valueOf(mf3.w.class, str);
    }

    public static mf3.w[] values() {
        return (mf3.w[]) f326130f.clone();
    }
}
