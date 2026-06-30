package ml2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class y {

    /* renamed from: d, reason: collision with root package name */
    public static final ml2.y f328239d;

    /* renamed from: e, reason: collision with root package name */
    public static final ml2.y f328240e;

    /* renamed from: f, reason: collision with root package name */
    public static final ml2.y f328241f;

    /* renamed from: g, reason: collision with root package name */
    public static final ml2.y f328242g;

    /* renamed from: h, reason: collision with root package name */
    public static final ml2.y f328243h;

    /* renamed from: i, reason: collision with root package name */
    public static final ml2.y f328244i;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ ml2.y[] f328245m;

    static {
        ml2.y yVar = new ml2.y("EVENT_INVALIDATE", 0);
        ml2.y yVar2 = new ml2.y("EVENT_ON_SCROLL", 1);
        f328239d = yVar2;
        ml2.y yVar3 = new ml2.y("EVENT_ON_RESUME", 2);
        f328240e = yVar3;
        ml2.y yVar4 = new ml2.y("EVENT_ON_PAUSE", 3);
        f328241f = yVar4;
        ml2.y yVar5 = new ml2.y("EVENT_ON_REFRESH", 4);
        f328242g = yVar5;
        ml2.y yVar6 = new ml2.y("EVENT_ON_CREATE", 5);
        ml2.y yVar7 = new ml2.y("EVENT_ON_LOADMORE", 6);
        ml2.y yVar8 = new ml2.y("EVENT_ON_SCROLL_HORIZONTAL", 7);
        f328243h = yVar8;
        ml2.y yVar9 = new ml2.y("EVENT_ON_DESTROY", 8);
        f328244i = yVar9;
        ml2.y[] yVarArr = {yVar, yVar2, yVar3, yVar4, yVar5, yVar6, yVar7, yVar8, yVar9};
        f328245m = yVarArr;
        rz5.b.a(yVarArr);
    }

    public y(java.lang.String str, int i17) {
    }

    public static ml2.y valueOf(java.lang.String str) {
        return (ml2.y) java.lang.Enum.valueOf(ml2.y.class, str);
    }

    public static ml2.y[] values() {
        return (ml2.y[]) f328245m.clone();
    }
}
