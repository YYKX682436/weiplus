package gy0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class g {

    /* renamed from: d, reason: collision with root package name */
    public static final gy0.g f277509d;

    /* renamed from: e, reason: collision with root package name */
    public static final gy0.g f277510e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ gy0.g[] f277511f;

    static {
        gy0.g gVar = new gy0.g("NormalMove", 0);
        f277509d = gVar;
        gy0.g gVar2 = new gy0.g("AutoScrollMove", 1);
        f277510e = gVar2;
        gy0.g[] gVarArr = {gVar, gVar2};
        f277511f = gVarArr;
        rz5.b.a(gVarArr);
    }

    public g(java.lang.String str, int i17) {
    }

    public static gy0.g valueOf(java.lang.String str) {
        return (gy0.g) java.lang.Enum.valueOf(gy0.g.class, str);
    }

    public static gy0.g[] values() {
        return (gy0.g[]) f277511f.clone();
    }
}
