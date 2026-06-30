package kz0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: h, reason: collision with root package name */
    public static final kz0.a f313643h;

    /* renamed from: i, reason: collision with root package name */
    public static final kz0.a f313644i;

    /* renamed from: m, reason: collision with root package name */
    public static final kz0.a f313645m;

    /* renamed from: n, reason: collision with root package name */
    public static final kz0.a f313646n;

    /* renamed from: o, reason: collision with root package name */
    public static final kz0.a f313647o;

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ kz0.a[] f313648p;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f313649d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f313650e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f313651f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f313652g;

    static {
        kz0.a aVar = new kz0.a("MusicPanel", 0, false, false, true, false, 8, null);
        f313643h = aVar;
        boolean z17 = true;
        boolean z18 = false;
        boolean z19 = false;
        int i17 = 8;
        kotlin.jvm.internal.i iVar = null;
        kz0.a aVar2 = new kz0.a("MoreTemplatePanel", 1, z17, true, z18, z19, i17, iVar);
        f313644i = aVar2;
        kz0.a aVar3 = new kz0.a("MusicSearch", 2, false, false, false, false, 8, null);
        f313645m = aVar3;
        kz0.a aVar4 = new kz0.a("SegmentClip", 3, z17, false, z18, z19, i17, iVar);
        f313646n = aVar4;
        kz0.a aVar5 = new kz0.a("MusicPanelV2", 4, false, false, true, false);
        f313647o = aVar5;
        kz0.a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5};
        f313648p = aVarArr;
        rz5.b.a(aVarArr);
    }

    public a(java.lang.String str, int i17, boolean z17, boolean z18, boolean z19, boolean z27) {
        this.f313649d = z17;
        this.f313650e = z18;
        this.f313651f = z19;
        this.f313652g = z27;
    }

    public static kz0.a valueOf(java.lang.String str) {
        return (kz0.a) java.lang.Enum.valueOf(kz0.a.class, str);
    }

    public static kz0.a[] values() {
        return (kz0.a[]) f313648p.clone();
    }

    public /* synthetic */ a(java.lang.String str, int i17, boolean z17, boolean z18, boolean z19, boolean z27, int i18, kotlin.jvm.internal.i iVar) {
        this(str, i17, (i18 & 1) != 0 ? false : z17, (i18 & 2) != 0 ? false : z18, (i18 & 4) != 0 ? true : z19, (i18 & 8) != 0 ? true : z27);
    }
}
