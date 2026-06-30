package pk3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final pk3.a f356434d;

    /* renamed from: e, reason: collision with root package name */
    public static final pk3.a f356435e;

    /* renamed from: f, reason: collision with root package name */
    public static final pk3.a f356436f;

    /* renamed from: g, reason: collision with root package name */
    public static final pk3.a f356437g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ pk3.a[] f356438h;

    static {
        pk3.a aVar = new pk3.a("MODE_SHOW_SINGLE_SCENE", 0);
        f356434d = aVar;
        pk3.a aVar2 = new pk3.a("MODE_SHOW_MULTI_SCENE", 1);
        f356435e = aVar2;
        pk3.a aVar3 = new pk3.a("MODE_SHOW_SNAPSHOT_SCENE", 2);
        f356436f = aVar3;
        pk3.a aVar4 = new pk3.a("MODE_NONE", 3);
        f356437g = aVar4;
        pk3.a[] aVarArr = {aVar, aVar2, aVar3, aVar4};
        f356438h = aVarArr;
        rz5.b.a(aVarArr);
    }

    public a(java.lang.String str, int i17) {
    }

    public static pk3.a valueOf(java.lang.String str) {
        return (pk3.a) java.lang.Enum.valueOf(pk3.a.class, str);
    }

    public static pk3.a[] values() {
        return (pk3.a[]) f356438h.clone();
    }
}
