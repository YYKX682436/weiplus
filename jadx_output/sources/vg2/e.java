package vg2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class e {

    /* renamed from: d, reason: collision with root package name */
    public static final vg2.e f436492d;

    /* renamed from: e, reason: collision with root package name */
    public static final vg2.e f436493e;

    /* renamed from: f, reason: collision with root package name */
    public static final vg2.e f436494f;

    /* renamed from: g, reason: collision with root package name */
    public static final vg2.e f436495g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ vg2.e[] f436496h;

    static {
        vg2.e eVar = new vg2.e(com.google.android.gms.stats.netstats.NetstatsParserPatterns.TYPE_BACKGROUND_PATTERN, 0);
        f436492d = eVar;
        vg2.e eVar2 = new vg2.e("INTRO", 1);
        f436493e = eVar2;
        vg2.e eVar3 = new vg2.e("PROGRESS", 2);
        f436494f = eVar3;
        vg2.e eVar4 = new vg2.e("FINISHED", 3);
        f436495g = eVar4;
        vg2.e[] eVarArr = {eVar, eVar2, eVar3, eVar4};
        f436496h = eVarArr;
        rz5.b.a(eVarArr);
    }

    public e(java.lang.String str, int i17) {
    }

    public static vg2.e valueOf(java.lang.String str) {
        return (vg2.e) java.lang.Enum.valueOf(vg2.e.class, str);
    }

    public static vg2.e[] values() {
        return (vg2.e[]) f436496h.clone();
    }
}
