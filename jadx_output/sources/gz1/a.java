package gz1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes13.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final gz1.a f277696d;

    /* renamed from: e, reason: collision with root package name */
    public static final gz1.a f277697e;

    /* renamed from: f, reason: collision with root package name */
    public static final gz1.a f277698f;

    /* renamed from: g, reason: collision with root package name */
    public static final gz1.a f277699g;

    /* renamed from: h, reason: collision with root package name */
    public static final gz1.a f277700h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ gz1.a[] f277701i;

    static {
        gz1.a aVar = new gz1.a("ON_CREATE", 0);
        f277696d = aVar;
        gz1.a aVar2 = new gz1.a("ON_RESUME", 1);
        f277697e = aVar2;
        gz1.a aVar3 = new gz1.a("ON_PAUSE", 2);
        f277698f = aVar3;
        gz1.a aVar4 = new gz1.a("ON_DESTROY_VIEW", 3);
        f277699g = aVar4;
        gz1.a aVar5 = new gz1.a("ON_DESTROY", 4);
        f277700h = aVar5;
        gz1.a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5};
        f277701i = aVarArr;
        rz5.b.a(aVarArr);
    }

    public a(java.lang.String str, int i17) {
    }

    public static gz1.a valueOf(java.lang.String str) {
        return (gz1.a) java.lang.Enum.valueOf(gz1.a.class, str);
    }

    public static gz1.a[] values() {
        return (gz1.a[]) f277701i.clone();
    }
}
