package fb1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class d {

    /* renamed from: d, reason: collision with root package name */
    public static final fb1.d f260829d;

    /* renamed from: e, reason: collision with root package name */
    public static final fb1.d f260830e;

    /* renamed from: f, reason: collision with root package name */
    public static final fb1.d f260831f;

    /* renamed from: g, reason: collision with root package name */
    public static final fb1.d f260832g;

    /* renamed from: h, reason: collision with root package name */
    public static final fb1.d f260833h;

    /* renamed from: i, reason: collision with root package name */
    public static final fb1.d f260834i;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ fb1.d[] f260835m;

    static {
        fb1.d dVar = new fb1.d("Phone", 0);
        f260829d = dVar;
        fb1.d dVar2 = new fb1.d("VOIP", 1);
        f260830e = dVar2;
        fb1.d dVar3 = new fb1.d("LivePusher", 2);
        f260831f = dVar3;
        fb1.d dVar4 = new fb1.d("AppBrandVOIP", 3);
        f260832g = dVar4;
        fb1.d dVar5 = new fb1.d("AppBrandLivePusher", 4);
        f260833h = dVar5;
        fb1.d dVar6 = new fb1.d("AppBrandLivePlayer", 5);
        f260834i = dVar6;
        fb1.d[] dVarArr = {dVar, dVar2, dVar3, dVar4, dVar5, dVar6};
        f260835m = dVarArr;
        rz5.b.a(dVarArr);
    }

    public d(java.lang.String str, int i17) {
    }

    public static fb1.d valueOf(java.lang.String str) {
        return (fb1.d) java.lang.Enum.valueOf(fb1.d.class, str);
    }

    public static fb1.d[] values() {
        return (fb1.d[]) f260835m.clone();
    }
}
