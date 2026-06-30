package pd1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class g {

    /* renamed from: d, reason: collision with root package name */
    public static final pd1.g f353536d;

    /* renamed from: e, reason: collision with root package name */
    public static final pd1.g f353537e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ pd1.g[] f353538f;

    static {
        pd1.g gVar = new pd1.g("LANDSCAPE", 0);
        f353536d = gVar;
        pd1.g gVar2 = new pd1.g("PORTRAIT", 1);
        f353537e = gVar2;
        pd1.g[] gVarArr = {gVar, gVar2};
        f353538f = gVarArr;
        rz5.b.a(gVarArr);
    }

    public g(java.lang.String str, int i17) {
    }

    public static pd1.g valueOf(java.lang.String str) {
        return (pd1.g) java.lang.Enum.valueOf(pd1.g.class, str);
    }

    public static pd1.g[] values() {
        return (pd1.g[]) f353538f.clone();
    }
}
