package ps3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class s {

    /* renamed from: d, reason: collision with root package name */
    public static final ps3.s f358124d;

    /* renamed from: e, reason: collision with root package name */
    public static final ps3.s f358125e;

    /* renamed from: f, reason: collision with root package name */
    public static final ps3.s f358126f;

    /* renamed from: g, reason: collision with root package name */
    public static final ps3.s f358127g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ ps3.s[] f358128h;

    static {
        ps3.s sVar = new ps3.s("Stopped", 0);
        f358124d = sVar;
        ps3.s sVar2 = new ps3.s("Locating", 1);
        f358125e = sVar2;
        ps3.s sVar3 = new ps3.s("RadarSearching", 2);
        f358126f = sVar3;
        ps3.s sVar4 = new ps3.s("Waiting", 3);
        f358127g = sVar4;
        ps3.s[] sVarArr = {sVar, sVar2, sVar3, sVar4};
        f358128h = sVarArr;
        rz5.b.a(sVarArr);
    }

    public s(java.lang.String str, int i17) {
    }

    public static ps3.s valueOf(java.lang.String str) {
        return (ps3.s) java.lang.Enum.valueOf(ps3.s.class, str);
    }

    public static ps3.s[] values() {
        return (ps3.s[]) f358128h.clone();
    }
}
