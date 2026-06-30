package g31;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class s {

    /* renamed from: d, reason: collision with root package name */
    public static final g31.s f268112d;

    /* renamed from: e, reason: collision with root package name */
    public static final g31.s f268113e;

    /* renamed from: f, reason: collision with root package name */
    public static final g31.s f268114f;

    /* renamed from: g, reason: collision with root package name */
    public static final g31.s f268115g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ g31.s[] f268116h;

    static {
        g31.s sVar = new g31.s("UNKNOWN", 0);
        f268112d = sVar;
        g31.s sVar2 = new g31.s("RUNNING", 1);
        f268113e = sVar2;
        g31.s sVar3 = new g31.s("FAILED", 2);
        f268114f = sVar3;
        g31.s sVar4 = new g31.s("SUCCESS", 3);
        f268115g = sVar4;
        g31.s[] sVarArr = {sVar, sVar2, sVar3, sVar4};
        f268116h = sVarArr;
        rz5.b.a(sVarArr);
    }

    public s(java.lang.String str, int i17) {
    }

    public static g31.s valueOf(java.lang.String str) {
        return (g31.s) java.lang.Enum.valueOf(g31.s.class, str);
    }

    public static g31.s[] values() {
        return (g31.s[]) f268116h.clone();
    }
}
