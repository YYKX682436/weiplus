package yi0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public static final yi0.a f462477d;

    /* renamed from: e, reason: collision with root package name */
    public static final yi0.b f462478e;

    /* renamed from: f, reason: collision with root package name */
    public static final yi0.b f462479f;

    /* renamed from: g, reason: collision with root package name */
    public static final yi0.b f462480g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ yi0.b[] f462481h;

    static {
        yi0.b bVar = new yi0.b("None", 0);
        f462478e = bVar;
        yi0.b bVar2 = new yi0.b("Image", 1);
        f462479f = bVar2;
        yi0.b bVar3 = new yi0.b("Video", 2);
        f462480g = bVar3;
        yi0.b[] bVarArr = {bVar, bVar2, bVar3};
        f462481h = bVarArr;
        rz5.b.a(bVarArr);
        f462477d = new yi0.a(null);
    }

    public b(java.lang.String str, int i17) {
    }

    public static yi0.b valueOf(java.lang.String str) {
        return (yi0.b) java.lang.Enum.valueOf(yi0.b.class, str);
    }

    public static yi0.b[] values() {
        return (yi0.b[]) f462481h.clone();
    }
}
