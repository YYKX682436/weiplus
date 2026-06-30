package hk4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public static final hk4.b f281932d;

    /* renamed from: e, reason: collision with root package name */
    public static final hk4.b f281933e;

    /* renamed from: f, reason: collision with root package name */
    public static final hk4.b f281934f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ hk4.b[] f281935g;

    static {
        hk4.b bVar = new hk4.b("Unknown", 0);
        f281932d = bVar;
        hk4.b bVar2 = new hk4.b("Image", 1);
        f281933e = bVar2;
        hk4.b bVar3 = new hk4.b("Video", 2);
        f281934f = bVar3;
        hk4.b[] bVarArr = {bVar, bVar2, bVar3};
        f281935g = bVarArr;
        rz5.b.a(bVarArr);
    }

    public b(java.lang.String str, int i17) {
    }

    public static hk4.b valueOf(java.lang.String str) {
        return (hk4.b) java.lang.Enum.valueOf(hk4.b.class, str);
    }

    public static hk4.b[] values() {
        return (hk4.b[]) f281935g.clone();
    }
}
