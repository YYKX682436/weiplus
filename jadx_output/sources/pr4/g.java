package pr4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class g {

    /* renamed from: d, reason: collision with root package name */
    public static final pr4.g f357997d;

    /* renamed from: e, reason: collision with root package name */
    public static final pr4.g f357998e;

    /* renamed from: f, reason: collision with root package name */
    public static final pr4.g f357999f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ pr4.g[] f358000g;

    static {
        pr4.g gVar = new pr4.g("fail", 0);
        f357997d = gVar;
        pr4.g gVar2 = new pr4.g("cancel", 1);
        f357998e = gVar2;
        pr4.g gVar3 = new pr4.g(ya.b.SUCCESS, 2);
        f357999f = gVar3;
        pr4.g[] gVarArr = {gVar, gVar2, gVar3};
        f358000g = gVarArr;
        rz5.b.a(gVarArr);
    }

    public g(java.lang.String str, int i17) {
    }

    public static pr4.g valueOf(java.lang.String str) {
        return (pr4.g) java.lang.Enum.valueOf(pr4.g.class, str);
    }

    public static pr4.g[] values() {
        return (pr4.g[]) f358000g.clone();
    }
}
