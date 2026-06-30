package uf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public static final uf.b f426971d;

    /* renamed from: e, reason: collision with root package name */
    public static final uf.b f426972e;

    /* renamed from: f, reason: collision with root package name */
    public static final uf.b f426973f;

    /* renamed from: g, reason: collision with root package name */
    public static final uf.b f426974g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ uf.b[] f426975h;

    static {
        uf.b bVar = new uf.b("Idle", 0);
        f426971d = bVar;
        uf.b bVar2 = new uf.b("CastEnabled", 1);
        f426972e = bVar2;
        uf.b bVar3 = new uf.b("CastDeviceSelected", 2);
        f426973f = bVar3;
        uf.b bVar4 = new uf.b("CastStarted", 3);
        f426974g = bVar4;
        uf.b[] bVarArr = {bVar, bVar2, bVar3, bVar4};
        f426975h = bVarArr;
        rz5.b.a(bVarArr);
    }

    public b(java.lang.String str, int i17) {
    }

    public static uf.b valueOf(java.lang.String str) {
        return (uf.b) java.lang.Enum.valueOf(uf.b.class, str);
    }

    public static uf.b[] values() {
        return (uf.b[]) f426975h.clone();
    }
}
