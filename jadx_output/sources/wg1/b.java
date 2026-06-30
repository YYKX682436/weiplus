package wg1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public static final wg1.b f445711d;

    /* renamed from: e, reason: collision with root package name */
    public static final wg1.b f445712e;

    /* renamed from: f, reason: collision with root package name */
    public static final wg1.b f445713f;

    /* renamed from: g, reason: collision with root package name */
    public static final wg1.b f445714g;

    /* renamed from: h, reason: collision with root package name */
    public static final wg1.b f445715h;

    /* renamed from: i, reason: collision with root package name */
    public static final wg1.b f445716i;

    /* renamed from: m, reason: collision with root package name */
    public static final wg1.b f445717m;

    /* renamed from: n, reason: collision with root package name */
    public static final wg1.b f445718n;

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ wg1.b[] f445719o;

    static {
        wg1.b bVar = new wg1.b("NeedLatestVersion", 0);
        f445711d = bVar;
        wg1.b bVar2 = new wg1.b("LocalVersionFallback", 1);
        f445712e = bVar2;
        wg1.b bVar3 = new wg1.b("UpdateApp", 2);
        f445713f = bVar3;
        wg1.b bVar4 = new wg1.b("WxaMigrate", 3);
        f445714g = bVar4;
        wg1.b bVar5 = new wg1.b("WeakNetReload", 4);
        f445715h = bVar5;
        wg1.b bVar6 = new wg1.b("FallbackErrorReload", 5);
        f445716i = bVar6;
        wg1.b bVar7 = new wg1.b("NeedLatestVersionByLaunchParams", 6);
        f445717m = bVar7;
        wg1.b bVar8 = new wg1.b("JsApiNavigateToMiniProgram", 7);
        f445718n = bVar8;
        wg1.b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8};
        f445719o = bVarArr;
        rz5.b.a(bVarArr);
    }

    public b(java.lang.String str, int i17) {
    }

    public static wg1.b valueOf(java.lang.String str) {
        return (wg1.b) java.lang.Enum.valueOf(wg1.b.class, str);
    }

    public static wg1.b[] values() {
        return (wg1.b[]) f445719o.clone();
    }

    public final java.lang.String h() {
        return wg1.a.f445710a[ordinal()] == 1 ? ne1.f.NAME : name();
    }
}
