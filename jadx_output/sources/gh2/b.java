package gh2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class b {

    /* renamed from: e, reason: collision with root package name */
    public static final gh2.b f271855e;

    /* renamed from: f, reason: collision with root package name */
    public static final gh2.b f271856f;

    /* renamed from: g, reason: collision with root package name */
    public static final gh2.b f271857g;

    /* renamed from: h, reason: collision with root package name */
    public static final gh2.b f271858h;

    /* renamed from: i, reason: collision with root package name */
    public static final gh2.b f271859i;

    /* renamed from: m, reason: collision with root package name */
    public static final gh2.b f271860m;

    /* renamed from: n, reason: collision with root package name */
    public static final gh2.b f271861n;

    /* renamed from: o, reason: collision with root package name */
    public static final gh2.b f271862o;

    /* renamed from: p, reason: collision with root package name */
    public static final gh2.b f271863p;

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ gh2.b[] f271864q;

    /* renamed from: d, reason: collision with root package name */
    public final int f271865d;

    static {
        gh2.b bVar = new gh2.b("Success", 0, 0);
        f271855e = bVar;
        gh2.b bVar2 = new gh2.b("NoteFail", 1, 1);
        f271856f = bVar2;
        gh2.b bVar3 = new gh2.b("QrcFail", 2, 2);
        f271857g = bVar3;
        gh2.b bVar4 = new gh2.b("BgmDownloadFail", 3, 3);
        f271858h = bVar4;
        gh2.b bVar5 = new gh2.b("BgmParseFail", 4, 4);
        f271859i = bVar5;
        gh2.b bVar6 = new gh2.b("ConfirmPlayFail", 5, 5);
        f271860m = bVar6;
        gh2.b bVar7 = new gh2.b("BgmPlayFail", 6, 6);
        f271861n = bVar7;
        gh2.b bVar8 = new gh2.b("ScoreEngineInitFail", 7, 7);
        f271862o = bVar8;
        gh2.b bVar9 = new gh2.b("OtherFail", 8, -1);
        f271863p = bVar9;
        gh2.b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9};
        f271864q = bVarArr;
        rz5.b.a(bVarArr);
    }

    public b(java.lang.String str, int i17, int i18) {
        this.f271865d = i18;
    }

    public static gh2.b valueOf(java.lang.String str) {
        return (gh2.b) java.lang.Enum.valueOf(gh2.b.class, str);
    }

    public static gh2.b[] values() {
        return (gh2.b[]) f271864q.clone();
    }
}
