package kx0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public static final kx0.b f313239d;

    /* renamed from: e, reason: collision with root package name */
    public static final kx0.b f313240e;

    /* renamed from: f, reason: collision with root package name */
    public static final kx0.b f313241f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ kx0.b[] f313242g;

    static {
        kx0.b bVar = new kx0.b("NONE", 0);
        f313239d = bVar;
        kx0.b bVar2 = new kx0.b("ENTER", 1);
        f313240e = bVar2;
        kx0.b bVar3 = new kx0.b("QUIT", 2);
        f313241f = bVar3;
        kx0.b[] bVarArr = {bVar, bVar2, bVar3};
        f313242g = bVarArr;
        rz5.b.a(bVarArr);
    }

    public b(java.lang.String str, int i17) {
    }

    public static kx0.b valueOf(java.lang.String str) {
        return (kx0.b) java.lang.Enum.valueOf(kx0.b.class, str);
    }

    public static kx0.b[] values() {
        return (kx0.b[]) f313242g.clone();
    }
}
