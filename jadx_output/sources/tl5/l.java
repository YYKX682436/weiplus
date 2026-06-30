package tl5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class l {

    /* renamed from: d, reason: collision with root package name */
    public static final tl5.l f420369d;

    /* renamed from: e, reason: collision with root package name */
    public static final tl5.l f420370e;

    /* renamed from: f, reason: collision with root package name */
    public static final tl5.l f420371f;

    /* renamed from: g, reason: collision with root package name */
    public static final tl5.l f420372g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ tl5.l[] f420373h;

    static {
        tl5.l lVar = new tl5.l("IDLE", 0);
        f420369d = lVar;
        tl5.l lVar2 = new tl5.l("PREPARING", 1);
        f420370e = lVar2;
        tl5.l lVar3 = new tl5.l("MANUAL", 2);
        f420371f = lVar3;
        tl5.l lVar4 = new tl5.l("AUTO", 3);
        f420372g = lVar4;
        tl5.l[] lVarArr = {lVar, lVar2, lVar3, lVar4};
        f420373h = lVarArr;
        rz5.b.a(lVarArr);
    }

    public l(java.lang.String str, int i17) {
    }

    public static tl5.l valueOf(java.lang.String str) {
        return (tl5.l) java.lang.Enum.valueOf(tl5.l.class, str);
    }

    public static tl5.l[] values() {
        return (tl5.l[]) f420373h.clone();
    }
}
