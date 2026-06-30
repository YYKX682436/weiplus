package hn2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class m {

    /* renamed from: d, reason: collision with root package name */
    public static final hn2.m f282535d;

    /* renamed from: e, reason: collision with root package name */
    public static final hn2.m f282536e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ hn2.m[] f282537f;

    static {
        hn2.m mVar = new hn2.m(com.google.android.gms.stats.netstats.NetstatsParserPatterns.TYPE_BACKGROUND_PATTERN, 0);
        f282535d = mVar;
        hn2.m mVar2 = new hn2.m("KTV_LARGE_COVER", 1);
        hn2.m mVar3 = new hn2.m("EDIT_NO_AUDITION", 2);
        f282536e = mVar3;
        hn2.m[] mVarArr = {mVar, mVar2, mVar3};
        f282537f = mVarArr;
        rz5.b.a(mVarArr);
    }

    public m(java.lang.String str, int i17) {
    }

    public static hn2.m valueOf(java.lang.String str) {
        return (hn2.m) java.lang.Enum.valueOf(hn2.m.class, str);
    }

    public static hn2.m[] values() {
        return (hn2.m[]) f282537f.clone();
    }
}
