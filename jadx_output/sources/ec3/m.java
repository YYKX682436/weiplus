package ec3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class m {

    /* renamed from: d, reason: collision with root package name */
    public static final ec3.m f251050d;

    /* renamed from: e, reason: collision with root package name */
    public static final ec3.m f251051e;

    /* renamed from: f, reason: collision with root package name */
    public static final ec3.m f251052f;

    /* renamed from: g, reason: collision with root package name */
    public static final ec3.m f251053g;

    /* renamed from: h, reason: collision with root package name */
    public static final ec3.m f251054h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ ec3.m[] f251055i;

    static {
        ec3.m mVar = new ec3.m(com.google.android.gms.stats.netstats.NetstatsParserPatterns.TYPE_BACKGROUND_PATTERN, 0);
        f251050d = mVar;
        ec3.m mVar2 = new ec3.m("NONE", 1);
        f251051e = mVar2;
        ec3.m mVar3 = new ec3.m("UP_TO_DOWN", 2);
        f251052f = mVar3;
        ec3.m mVar4 = new ec3.m("DOWN_TO_UP", 3);
        f251053g = mVar4;
        ec3.m mVar5 = new ec3.m(com.google.android.gms.stats.netstats.NetstatsParserPatterns.TYPE_BOTH_PATTERN, 4);
        f251054h = mVar5;
        ec3.m[] mVarArr = {mVar, mVar2, mVar3, mVar4, mVar5};
        f251055i = mVarArr;
        rz5.b.a(mVarArr);
    }

    public m(java.lang.String str, int i17) {
    }

    public static ec3.m valueOf(java.lang.String str) {
        return (ec3.m) java.lang.Enum.valueOf(ec3.m.class, str);
    }

    public static ec3.m[] values() {
        return (ec3.m[]) f251055i.clone();
    }
}
