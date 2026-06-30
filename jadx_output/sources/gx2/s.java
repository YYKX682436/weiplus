package gx2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class s {

    /* renamed from: d, reason: collision with root package name */
    public static final gx2.s f277380d;

    /* renamed from: e, reason: collision with root package name */
    public static final gx2.s f277381e;

    /* renamed from: f, reason: collision with root package name */
    public static final gx2.s f277382f;

    /* renamed from: g, reason: collision with root package name */
    public static final gx2.s f277383g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ gx2.s[] f277384h;

    static {
        gx2.s sVar = new gx2.s("Closed", 0);
        f277380d = sVar;
        gx2.s sVar2 = new gx2.s("Peeked", 1);
        f277381e = sVar2;
        gx2.s sVar3 = new gx2.s("Expanded", 2);
        f277382f = sVar3;
        gx2.s sVar4 = new gx2.s("Custom", 3);
        f277383g = sVar4;
        gx2.s[] sVarArr = {sVar, sVar2, sVar3, sVar4};
        f277384h = sVarArr;
        rz5.b.a(sVarArr);
    }

    public s(java.lang.String str, int i17) {
    }

    public static gx2.s valueOf(java.lang.String str) {
        return (gx2.s) java.lang.Enum.valueOf(gx2.s.class, str);
    }

    public static gx2.s[] values() {
        return (gx2.s[]) f277384h.clone();
    }
}
