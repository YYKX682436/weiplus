package xh3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes12.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final xh3.a f454560d;

    /* renamed from: e, reason: collision with root package name */
    public static final xh3.a f454561e;

    /* renamed from: f, reason: collision with root package name */
    public static final xh3.a f454562f;

    /* renamed from: g, reason: collision with root package name */
    public static final xh3.a f454563g;

    /* renamed from: h, reason: collision with root package name */
    public static final xh3.a f454564h;

    /* renamed from: i, reason: collision with root package name */
    public static final xh3.a f454565i;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ xh3.a[] f454566m;

    static {
        xh3.a aVar = new xh3.a("IDLE", 0);
        f454560d = aVar;
        xh3.a aVar2 = new xh3.a("WAITING", 1);
        f454561e = aVar2;
        xh3.a aVar3 = new xh3.a("PROGRESS", 2);
        f454562f = aVar3;
        xh3.a aVar4 = new xh3.a("CANCEL", 3);
        f454563g = aVar4;
        xh3.a aVar5 = new xh3.a("SUCCESS", 4);
        f454564h = aVar5;
        xh3.a aVar6 = new xh3.a("FAILED", 5);
        f454565i = aVar6;
        xh3.a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6};
        f454566m = aVarArr;
        rz5.b.a(aVarArr);
    }

    public a(java.lang.String str, int i17) {
    }

    public static xh3.a valueOf(java.lang.String str) {
        return (xh3.a) java.lang.Enum.valueOf(xh3.a.class, str);
    }

    public static xh3.a[] values() {
        return (xh3.a[]) f454566m.clone();
    }
}
