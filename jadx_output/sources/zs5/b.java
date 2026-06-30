package zs5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes15.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public static final zs5.b f475319d;

    /* renamed from: e, reason: collision with root package name */
    public static final zs5.b f475320e;

    /* renamed from: f, reason: collision with root package name */
    public static final zs5.b f475321f;

    /* renamed from: g, reason: collision with root package name */
    public static final zs5.b f475322g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ zs5.b[] f475323h;

    static {
        zs5.b bVar = new zs5.b("NotInit", 0);
        f475319d = bVar;
        zs5.b bVar2 = new zs5.b("Initing", 1);
        f475320e = bVar2;
        zs5.b bVar3 = new zs5.b("InitSuccess", 2);
        f475321f = bVar3;
        zs5.b bVar4 = new zs5.b("InitFailed", 3);
        f475322g = bVar4;
        zs5.b[] bVarArr = {bVar, bVar2, bVar3, bVar4};
        f475323h = bVarArr;
        rz5.b.a(bVarArr);
    }

    public b(java.lang.String str, int i17) {
    }

    public static zs5.b valueOf(java.lang.String str) {
        return (zs5.b) java.lang.Enum.valueOf(zs5.b.class, str);
    }

    public static zs5.b[] values() {
        return (zs5.b[]) f475323h.clone();
    }
}
