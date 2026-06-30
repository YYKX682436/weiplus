package t50;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes12.dex */
public final class f {

    /* renamed from: e, reason: collision with root package name */
    public static final t50.f f415698e;

    /* renamed from: f, reason: collision with root package name */
    public static final t50.f f415699f;

    /* renamed from: g, reason: collision with root package name */
    public static final t50.f f415700g;

    /* renamed from: h, reason: collision with root package name */
    public static final t50.f f415701h;

    /* renamed from: i, reason: collision with root package name */
    public static final t50.f f415702i;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ t50.f[] f415703m;

    /* renamed from: d, reason: collision with root package name */
    public final int f415704d;

    static {
        t50.f fVar = new t50.f(com.tencent.mm.plugin.lite.LiteAppCenter.FRAMEWORK_TYPE_NONE, 0, 0);
        f415698e = fVar;
        t50.f fVar2 = new t50.f("teach_bottom", 1, 1);
        f415699f = fVar2;
        t50.f fVar3 = new t50.f("teach_top", 2, 2);
        f415700g = fVar3;
        t50.f fVar4 = new t50.f("actionbar_right", 3, 3);
        f415701h = fVar4;
        t50.f fVar5 = new t50.f("actionbar_ad_left", 4, 4);
        f415702i = fVar5;
        t50.f[] fVarArr = {fVar, fVar2, fVar3, fVar4, fVar5};
        f415703m = fVarArr;
        rz5.b.a(fVarArr);
    }

    public f(java.lang.String str, int i17, int i18) {
        this.f415704d = i18;
    }

    public static t50.f valueOf(java.lang.String str) {
        return (t50.f) java.lang.Enum.valueOf(t50.f.class, str);
    }

    public static t50.f[] values() {
        return (t50.f[]) f415703m.clone();
    }
}
