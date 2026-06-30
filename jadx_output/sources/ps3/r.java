package ps3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class r {

    /* renamed from: d, reason: collision with root package name */
    public static final ps3.r f358120d;

    /* renamed from: e, reason: collision with root package name */
    public static final ps3.r f358121e;

    /* renamed from: f, reason: collision with root package name */
    public static final ps3.r f358122f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ ps3.r[] f358123g;

    static {
        ps3.r rVar = new ps3.r("SEARCHING", 0);
        f358120d = rVar;
        ps3.r rVar2 = new ps3.r("SEARCH_RETRUN", 1);
        f358121e = rVar2;
        ps3.r rVar3 = new ps3.r("RALATIONCHAIN", 2);
        ps3.r rVar4 = new ps3.r("RALATIONCHAIN_RETRUN", 3);
        f358122f = rVar4;
        ps3.r[] rVarArr = {rVar, rVar2, rVar3, rVar4, new ps3.r("CREATING_CHAT", 4)};
        f358123g = rVarArr;
        rz5.b.a(rVarArr);
    }

    public r(java.lang.String str, int i17) {
    }

    public static ps3.r valueOf(java.lang.String str) {
        return (ps3.r) java.lang.Enum.valueOf(ps3.r.class, str);
    }

    public static ps3.r[] values() {
        return (ps3.r[]) f358123g.clone();
    }
}
