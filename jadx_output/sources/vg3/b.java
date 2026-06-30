package vg3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class b {

    /* renamed from: e, reason: collision with root package name */
    public static final vg3.b f436645e;

    /* renamed from: f, reason: collision with root package name */
    public static final vg3.b f436646f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ vg3.b[] f436647g;

    /* renamed from: d, reason: collision with root package name */
    public final int f436648d;

    static {
        vg3.b bVar = new vg3.b("REQUEST", 0, 1);
        f436645e = bVar;
        vg3.b bVar2 = new vg3.b("RESPONSE", 1, 2);
        f436646f = bVar2;
        vg3.b[] bVarArr = {bVar, bVar2};
        f436647g = bVarArr;
        rz5.b.a(bVarArr);
    }

    public b(java.lang.String str, int i17, int i18) {
        this.f436648d = i18;
    }

    public static vg3.b valueOf(java.lang.String str) {
        return (vg3.b) java.lang.Enum.valueOf(vg3.b.class, str);
    }

    public static vg3.b[] values() {
        return (vg3.b[]) f436647g.clone();
    }
}
