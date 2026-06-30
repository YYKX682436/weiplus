package gx0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class fd {

    /* renamed from: d, reason: collision with root package name */
    public static final gx0.ed f276428d;

    /* renamed from: e, reason: collision with root package name */
    public static final gx0.fd f276429e;

    /* renamed from: f, reason: collision with root package name */
    public static final gx0.fd f276430f;

    /* renamed from: g, reason: collision with root package name */
    public static final gx0.fd f276431g;

    /* renamed from: h, reason: collision with root package name */
    public static final gx0.fd f276432h;

    /* renamed from: i, reason: collision with root package name */
    public static final gx0.fd f276433i;

    /* renamed from: m, reason: collision with root package name */
    public static final gx0.fd f276434m;

    /* renamed from: n, reason: collision with root package name */
    public static final gx0.fd f276435n;

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ gx0.fd[] f276436o;

    static {
        gx0.fd fdVar = new gx0.fd("Uninitialized", 0);
        f276429e = fdVar;
        gx0.fd fdVar2 = new gx0.fd("Preparing", 1);
        f276430f = fdVar2;
        gx0.fd fdVar3 = new gx0.fd("Ready", 2);
        f276431g = fdVar3;
        gx0.fd fdVar4 = new gx0.fd("Playing", 3);
        f276432h = fdVar4;
        gx0.fd fdVar5 = new gx0.fd("Paused", 4);
        f276433i = fdVar5;
        gx0.fd fdVar6 = new gx0.fd("TearingDown", 5);
        f276434m = fdVar6;
        gx0.fd fdVar7 = new gx0.fd("Error", 6);
        f276435n = fdVar7;
        gx0.fd[] fdVarArr = {fdVar, fdVar2, fdVar3, fdVar4, fdVar5, fdVar6, fdVar7};
        f276436o = fdVarArr;
        rz5.b.a(fdVarArr);
        f276428d = new gx0.ed(null);
    }

    public fd(java.lang.String str, int i17) {
    }

    public static gx0.fd valueOf(java.lang.String str) {
        return (gx0.fd) java.lang.Enum.valueOf(gx0.fd.class, str);
    }

    public static gx0.fd[] values() {
        return (gx0.fd[]) f276436o.clone();
    }
}
