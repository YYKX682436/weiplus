package td2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final td2.a f417618d;

    /* renamed from: e, reason: collision with root package name */
    public static final td2.a f417619e;

    /* renamed from: f, reason: collision with root package name */
    public static final td2.a f417620f;

    /* renamed from: g, reason: collision with root package name */
    public static final td2.a f417621g;

    /* renamed from: h, reason: collision with root package name */
    public static final td2.a f417622h;

    /* renamed from: i, reason: collision with root package name */
    public static final td2.a f417623i;

    /* renamed from: m, reason: collision with root package name */
    public static final td2.a f417624m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ td2.a[] f417625n;

    static {
        td2.a aVar = new td2.a("ON_CREATE", 0);
        f417618d = aVar;
        td2.a aVar2 = new td2.a("ON_START", 1);
        f417619e = aVar2;
        td2.a aVar3 = new td2.a("ON_RESUME", 2);
        f417620f = aVar3;
        td2.a aVar4 = new td2.a("ON_PAUSE", 3);
        f417621g = aVar4;
        td2.a aVar5 = new td2.a("ON_STOP", 4);
        f417622h = aVar5;
        td2.a aVar6 = new td2.a("ON_DESTROY", 5);
        f417623i = aVar6;
        td2.a aVar7 = new td2.a("ON_ANY", 6);
        f417624m = aVar7;
        td2.a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7};
        f417625n = aVarArr;
        rz5.b.a(aVarArr);
    }

    public a(java.lang.String str, int i17) {
    }

    public static td2.a valueOf(java.lang.String str) {
        return (td2.a) java.lang.Enum.valueOf(td2.a.class, str);
    }

    public static td2.a[] values() {
        return (td2.a[]) f417625n.clone();
    }
}
