package xi0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final xi0.a f454662d;

    /* renamed from: e, reason: collision with root package name */
    public static final xi0.a f454663e;

    /* renamed from: f, reason: collision with root package name */
    public static final xi0.a f454664f;

    /* renamed from: g, reason: collision with root package name */
    public static final xi0.a f454665g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ xi0.a[] f454666h;

    static {
        xi0.a aVar = new xi0.a("Text", 0);
        f454662d = aVar;
        xi0.a aVar2 = new xi0.a("Image", 1);
        f454663e = aVar2;
        xi0.a aVar3 = new xi0.a("Video", 2);
        f454664f = aVar3;
        xi0.a aVar4 = new xi0.a("Unknown", 3);
        f454665g = aVar4;
        xi0.a[] aVarArr = {aVar, aVar2, aVar3, aVar4};
        f454666h = aVarArr;
        rz5.b.a(aVarArr);
    }

    public a(java.lang.String str, int i17) {
    }

    public static xi0.a valueOf(java.lang.String str) {
        return (xi0.a) java.lang.Enum.valueOf(xi0.a.class, str);
    }

    public static xi0.a[] values() {
        return (xi0.a[]) f454666h.clone();
    }
}
