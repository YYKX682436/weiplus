package p52;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class g {

    /* renamed from: d, reason: collision with root package name */
    public static final p52.g f352010d;

    /* renamed from: e, reason: collision with root package name */
    public static final p52.g f352011e;

    /* renamed from: f, reason: collision with root package name */
    public static final p52.g f352012f;

    /* renamed from: g, reason: collision with root package name */
    public static final p52.g f352013g;

    /* renamed from: h, reason: collision with root package name */
    public static final p52.g f352014h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ p52.g[] f352015i;

    static {
        p52.g gVar = new p52.g("VISIABLE_ON_SCROLL", 0, 0);
        f352010d = gVar;
        p52.g gVar2 = new p52.g("INVISIABLE_ON_SCROLL", 1, 1);
        f352011e = gVar2;
        p52.g gVar3 = new p52.g("VISIABLE_ON_RESUME", 2, 2);
        f352012f = gVar3;
        p52.g gVar4 = new p52.g("INVISIABLE_ON_PAUSE", 3, 3);
        f352013g = gVar4;
        p52.g gVar5 = new p52.g("EVENT_ON_DESTROY", 4, 4);
        f352014h = gVar5;
        p52.g[] gVarArr = {gVar, gVar2, gVar3, gVar4, gVar5};
        f352015i = gVarArr;
        rz5.b.a(gVarArr);
    }

    public g(java.lang.String str, int i17, int i18) {
    }

    public static p52.g valueOf(java.lang.String str) {
        return (p52.g) java.lang.Enum.valueOf(p52.g.class, str);
    }

    public static p52.g[] values() {
        return (p52.g[]) f352015i.clone();
    }
}
