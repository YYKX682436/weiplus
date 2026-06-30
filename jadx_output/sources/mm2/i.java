package mm2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class i {

    /* renamed from: d, reason: collision with root package name */
    public static final mm2.i f329126d;

    /* renamed from: e, reason: collision with root package name */
    public static final mm2.i f329127e;

    /* renamed from: f, reason: collision with root package name */
    public static final mm2.i f329128f;

    /* renamed from: g, reason: collision with root package name */
    public static final mm2.i f329129g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ mm2.i[] f329130h;

    static {
        mm2.i iVar = new mm2.i(com.google.android.gms.stats.netstats.NetstatsParserPatterns.TYPE_BACKGROUND_PATTERN, 0, 1);
        f329126d = iVar;
        mm2.i iVar2 = new mm2.i("MIN", 1, 2);
        f329127e = iVar2;
        mm2.i iVar3 = new mm2.i("MAX", 2, 3);
        f329128f = iVar3;
        mm2.i iVar4 = new mm2.i("SQAURE_MODE", 3, 4);
        f329129g = iVar4;
        mm2.i[] iVarArr = {iVar, iVar2, iVar3, iVar4};
        f329130h = iVarArr;
        rz5.b.a(iVarArr);
    }

    public i(java.lang.String str, int i17, int i18) {
    }

    public static mm2.i valueOf(java.lang.String str) {
        return (mm2.i) java.lang.Enum.valueOf(mm2.i.class, str);
    }

    public static mm2.i[] values() {
        return (mm2.i[]) f329130h.clone();
    }
}
