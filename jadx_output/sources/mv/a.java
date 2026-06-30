package mv;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final mv.a f331469e;

    /* renamed from: f, reason: collision with root package name */
    public static final mv.a f331470f;

    /* renamed from: g, reason: collision with root package name */
    public static final mv.a f331471g;

    /* renamed from: h, reason: collision with root package name */
    public static final mv.a f331472h;

    /* renamed from: i, reason: collision with root package name */
    public static final mv.a f331473i;

    /* renamed from: m, reason: collision with root package name */
    public static final mv.a f331474m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ mv.a[] f331475n;

    /* renamed from: d, reason: collision with root package name */
    public final bw5.m0 f331476d;

    static {
        mv.a aVar = new mv.a("Default", 0, bw5.m0.ENTER_FROM_DEFAULT);
        mv.a aVar2 = new mv.a("Setting", 1, bw5.m0.ENTER_FROM_SETTING);
        f331469e = aVar2;
        mv.a aVar3 = new mv.a("Banner", 2, bw5.m0.ENTER_FROM_BANNER);
        f331470f = aVar3;
        mv.a aVar4 = new mv.a("FtsSearch", 3, bw5.m0.ENTER_FROM_MAIN_SEARCH);
        f331471g = aVar4;
        mv.a aVar5 = new mv.a("WebSearch", 4, bw5.m0.ENTER_FROM_WEB_SEARCH);
        f331472h = aVar5;
        mv.a aVar6 = new mv.a("CameraScan", 5, bw5.m0.ENTER_FROM_CAMERA_SCAN);
        f331473i = aVar6;
        mv.a aVar7 = new mv.a("PcNewXml", 6, bw5.m0.ENTER_FROM_PC_NEW_XML);
        f331474m = aVar7;
        mv.a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7};
        f331475n = aVarArr;
        rz5.b.a(aVarArr);
    }

    public a(java.lang.String str, int i17, bw5.m0 m0Var) {
        this.f331476d = m0Var;
    }

    public static mv.a valueOf(java.lang.String str) {
        return (mv.a) java.lang.Enum.valueOf(mv.a.class, str);
    }

    public static mv.a[] values() {
        return (mv.a[]) f331475n.clone();
    }
}
