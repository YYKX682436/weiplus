package ix5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class s {

    /* renamed from: d, reason: collision with root package name */
    public static final ix5.s f295671d;

    /* renamed from: e, reason: collision with root package name */
    public static final ix5.s f295672e;

    /* renamed from: f, reason: collision with root package name */
    public static final ix5.s f295673f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ ix5.s[] f295674g;

    static {
        ix5.s sVar = new ix5.s("EXITED", 0);
        f295671d = sVar;
        ix5.s sVar2 = new ix5.s("BOOTING", 1);
        f295672e = sVar2;
        ix5.s sVar3 = new ix5.s("BOOTED", 2);
        f295673f = sVar3;
        ix5.s[] sVarArr = {sVar, sVar2, sVar3};
        f295674g = sVarArr;
        rz5.b.a(sVarArr);
    }

    public s(java.lang.String str, int i17) {
    }

    public static ix5.s valueOf(java.lang.String str) {
        return (ix5.s) java.lang.Enum.valueOf(ix5.s.class, str);
    }

    public static ix5.s[] values() {
        return (ix5.s[]) f295674g.clone();
    }
}
