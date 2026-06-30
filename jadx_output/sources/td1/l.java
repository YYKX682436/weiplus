package td1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes14.dex */
public final class l {

    /* renamed from: e, reason: collision with root package name */
    public static final td1.l f417608e;

    /* renamed from: f, reason: collision with root package name */
    public static final td1.l f417609f;

    /* renamed from: g, reason: collision with root package name */
    public static final td1.l f417610g;

    /* renamed from: h, reason: collision with root package name */
    public static final td1.l f417611h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ td1.l[] f417612i;

    /* renamed from: d, reason: collision with root package name */
    public final int f417613d;

    static {
        td1.l lVar = new td1.l("OK", 0, 0);
        f417608e = lVar;
        td1.l lVar2 = new td1.l("FAIL_OTHER", 1, 1);
        f417609f = lVar2;
        td1.l lVar3 = new td1.l("FAIL_ADD_STAR_REACHED_MAXIMUM_LIMIT", 2, 2);
        f417610g = lVar3;
        td1.l lVar4 = new td1.l("FAIL_ADD_STAR_BLOCKED", 3, 3);
        f417611h = lVar4;
        td1.l[] lVarArr = {lVar, lVar2, lVar3, lVar4};
        f417612i = lVarArr;
        rz5.b.a(lVarArr);
    }

    public l(java.lang.String str, int i17, int i18) {
        this.f417613d = i18;
    }

    public static td1.l valueOf(java.lang.String str) {
        return (td1.l) java.lang.Enum.valueOf(td1.l.class, str);
    }

    public static td1.l[] values() {
        return (td1.l[]) f417612i.clone();
    }
}
