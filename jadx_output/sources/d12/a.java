package d12;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final d12.a f225708d;

    /* renamed from: e, reason: collision with root package name */
    public static final d12.a f225709e;

    /* renamed from: f, reason: collision with root package name */
    public static final d12.a f225710f;

    /* renamed from: g, reason: collision with root package name */
    public static final d12.a f225711g;

    /* renamed from: h, reason: collision with root package name */
    public static final d12.a f225712h;

    /* renamed from: i, reason: collision with root package name */
    public static final d12.a f225713i;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ d12.a[] f225714m;

    static {
        d12.a aVar = new d12.a("Succeed", 0);
        f225708d = aVar;
        d12.a aVar2 = new d12.a("Failed", 1);
        f225709e = aVar2;
        d12.a aVar3 = new d12.a("Denied", 2);
        f225710f = aVar3;
        d12.a aVar4 = new d12.a("FatalError", 3);
        f225711g = aVar4;
        d12.a aVar5 = new d12.a("LoadMaterialFailed", 4);
        f225712h = aVar5;
        d12.a aVar6 = new d12.a("NoMaterial", 5);
        f225713i = aVar6;
        d12.a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6};
        f225714m = aVarArr;
        rz5.b.a(aVarArr);
    }

    public a(java.lang.String str, int i17) {
    }

    public static d12.a valueOf(java.lang.String str) {
        return (d12.a) java.lang.Enum.valueOf(d12.a.class, str);
    }

    public static d12.a[] values() {
        return (d12.a[]) f225714m.clone();
    }
}
