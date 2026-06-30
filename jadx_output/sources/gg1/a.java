package gg1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final gg1.a f271520d;

    /* renamed from: e, reason: collision with root package name */
    public static final gg1.a f271521e;

    /* renamed from: f, reason: collision with root package name */
    public static final gg1.a f271522f;

    /* renamed from: g, reason: collision with root package name */
    public static final gg1.a f271523g;

    /* renamed from: h, reason: collision with root package name */
    public static final gg1.a f271524h;

    /* renamed from: i, reason: collision with root package name */
    public static final gg1.a f271525i;

    /* renamed from: m, reason: collision with root package name */
    public static final gg1.a f271526m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ gg1.a[] f271527n;

    static {
        gg1.a aVar = new gg1.a("ACTION_EMPTY", 0);
        gg1.a aVar2 = new gg1.a("ACTION_ADD_DEVICE", 1);
        gg1.a aVar3 = new gg1.a("ACTION_REMOVE_DEVICE", 2);
        gg1.a aVar4 = new gg1.a("ACTION_UPDATE_DEVICE", 3);
        gg1.a aVar5 = new gg1.a("ACTION_SET_VOLUME", 4);
        gg1.a aVar6 = new gg1.a("ACTION_PLAYING", 5);
        f271520d = aVar6;
        gg1.a aVar7 = new gg1.a("ACTION_PAUSED", 6);
        f271521e = aVar7;
        gg1.a aVar8 = new gg1.a("ACTION_STOPPED", 7);
        f271522f = aVar8;
        gg1.a aVar9 = new gg1.a("ACTION_VOLUME", 8);
        f271523g = aVar9;
        gg1.a aVar10 = new gg1.a("ACTION_MUTE", 9);
        f271524h = aVar10;
        gg1.a aVar11 = new gg1.a("ACTION_PROGRESS", 10);
        f271525i = aVar11;
        gg1.a aVar12 = new gg1.a("ACTION_ERROR", 11);
        f271526m = aVar12;
        gg1.a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12};
        f271527n = aVarArr;
        rz5.b.a(aVarArr);
    }

    public a(java.lang.String str, int i17) {
    }

    public static gg1.a valueOf(java.lang.String str) {
        return (gg1.a) java.lang.Enum.valueOf(gg1.a.class, str);
    }

    public static gg1.a[] values() {
        return (gg1.a[]) f271527n.clone();
    }
}
