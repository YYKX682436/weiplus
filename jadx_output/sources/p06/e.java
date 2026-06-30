package p06;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes16.dex */
public final class e {

    /* renamed from: e, reason: collision with root package name */
    public static final p06.e f350748e;

    /* renamed from: f, reason: collision with root package name */
    public static final p06.e f350749f;

    /* renamed from: g, reason: collision with root package name */
    public static final p06.e f350750g;

    /* renamed from: h, reason: collision with root package name */
    public static final p06.e f350751h;

    /* renamed from: i, reason: collision with root package name */
    public static final p06.e f350752i;

    /* renamed from: m, reason: collision with root package name */
    public static final p06.e f350753m;

    /* renamed from: n, reason: collision with root package name */
    public static final p06.e f350754n;

    /* renamed from: o, reason: collision with root package name */
    public static final p06.e f350755o;

    /* renamed from: p, reason: collision with root package name */
    public static final p06.e f350756p;

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ p06.e[] f350757q;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f350758d;

    static {
        p06.e eVar = new p06.e("FIELD", 0, null, 1, null);
        f350748e = eVar;
        p06.e eVar2 = new p06.e("FILE", 1, null, 1, null);
        f350749f = eVar2;
        p06.e eVar3 = new p06.e("PROPERTY", 2, null, 1, null);
        f350750g = eVar3;
        p06.e eVar4 = new p06.e("PROPERTY_GETTER", 3, "get");
        f350751h = eVar4;
        p06.e eVar5 = new p06.e("PROPERTY_SETTER", 4, "set");
        f350752i = eVar5;
        p06.e eVar6 = new p06.e("RECEIVER", 5, null, 1, null);
        f350753m = eVar6;
        p06.e eVar7 = new p06.e("CONSTRUCTOR_PARAMETER", 6, "param");
        f350754n = eVar7;
        p06.e eVar8 = new p06.e("SETTER_PARAMETER", 7, "setparam");
        f350755o = eVar8;
        p06.e eVar9 = new p06.e("PROPERTY_DELEGATE_FIELD", 8, "delegate");
        f350756p = eVar9;
        p06.e[] eVarArr = {eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7, eVar8, eVar9};
        f350757q = eVarArr;
        rz5.b.a(eVarArr);
    }

    public e(java.lang.String str, int i17, java.lang.String str2) {
        this.f350758d = str2 == null ? m26.a.c(name()) : str2;
    }

    public static p06.e valueOf(java.lang.String str) {
        return (p06.e) java.lang.Enum.valueOf(p06.e.class, str);
    }

    public static p06.e[] values() {
        return (p06.e[]) f350757q.clone();
    }

    public /* synthetic */ e(java.lang.String str, int i17, java.lang.String str2, int i18, kotlin.jvm.internal.i iVar) {
        this(str, i17, (i18 & 1) != 0 ? null : str2);
    }
}
