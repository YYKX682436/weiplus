package l06;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes15.dex */
public final class a0 {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ l06.a0[] f314868g;

    /* renamed from: d, reason: collision with root package name */
    public final n16.b f314869d;

    /* renamed from: e, reason: collision with root package name */
    public final n16.g f314870e;

    /* renamed from: f, reason: collision with root package name */
    public final n16.b f314871f;

    static {
        l06.a0[] a0VarArr = {new l06.a0("UBYTE", 0, n16.b.e("kotlin/UByte")), new l06.a0("USHORT", 1, n16.b.e("kotlin/UShort")), new l06.a0("UINT", 2, n16.b.e("kotlin/UInt")), new l06.a0("ULONG", 3, n16.b.e("kotlin/ULong"))};
        f314868g = a0VarArr;
        rz5.b.a(a0VarArr);
    }

    public a0(java.lang.String str, int i17, n16.b bVar) {
        this.f314869d = bVar;
        n16.g j17 = bVar.j();
        kotlin.jvm.internal.o.f(j17, "getShortClassName(...)");
        this.f314870e = j17;
        this.f314871f = new n16.b(bVar.h(), n16.g.k(j17.h() + "Array"));
    }

    public static l06.a0 valueOf(java.lang.String str) {
        return (l06.a0) java.lang.Enum.valueOf(l06.a0.class, str);
    }

    public static l06.a0[] values() {
        return (l06.a0[]) f314868g.clone();
    }
}
