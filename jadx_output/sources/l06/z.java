package l06;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes15.dex */
public final class z {

    /* renamed from: e, reason: collision with root package name */
    public static final l06.z f314963e;

    /* renamed from: f, reason: collision with root package name */
    public static final l06.z f314964f;

    /* renamed from: g, reason: collision with root package name */
    public static final l06.z f314965g;

    /* renamed from: h, reason: collision with root package name */
    public static final l06.z f314966h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ l06.z[] f314967i;

    /* renamed from: d, reason: collision with root package name */
    public final n16.g f314968d;

    static {
        l06.z zVar = new l06.z("UBYTEARRAY", 0, n16.b.e("kotlin/UByteArray"));
        f314963e = zVar;
        l06.z zVar2 = new l06.z("USHORTARRAY", 1, n16.b.e("kotlin/UShortArray"));
        f314964f = zVar2;
        l06.z zVar3 = new l06.z("UINTARRAY", 2, n16.b.e("kotlin/UIntArray"));
        f314965g = zVar3;
        l06.z zVar4 = new l06.z("ULONGARRAY", 3, n16.b.e("kotlin/ULongArray"));
        f314966h = zVar4;
        l06.z[] zVarArr = {zVar, zVar2, zVar3, zVar4};
        f314967i = zVarArr;
        rz5.b.a(zVarArr);
    }

    public z(java.lang.String str, int i17, n16.b bVar) {
        n16.g j17 = bVar.j();
        kotlin.jvm.internal.o.f(j17, "getShortClassName(...)");
        this.f314968d = j17;
    }

    public static l06.z valueOf(java.lang.String str) {
        return (l06.z) java.lang.Enum.valueOf(l06.z.class, str);
    }

    public static l06.z[] values() {
        return (l06.z[]) f314967i.clone();
    }
}
