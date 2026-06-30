package ng3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class s {

    /* renamed from: d, reason: collision with root package name */
    public static final ng3.s f337028d;

    /* renamed from: e, reason: collision with root package name */
    public static final ng3.s f337029e;

    /* renamed from: f, reason: collision with root package name */
    public static final ng3.s f337030f;

    /* renamed from: g, reason: collision with root package name */
    public static final ng3.s f337031g;

    /* renamed from: h, reason: collision with root package name */
    public static final ng3.s f337032h;

    /* renamed from: i, reason: collision with root package name */
    public static final ng3.s f337033i;

    /* renamed from: m, reason: collision with root package name */
    public static final ng3.s f337034m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ ng3.s[] f337035n;

    static {
        ng3.s sVar = new ng3.s("IDLE", 0);
        f337028d = sVar;
        ng3.s sVar2 = new ng3.s("IDLE_VERTICAL_MOVE_ING", 1);
        f337029e = sVar2;
        ng3.s sVar3 = new ng3.s("PREVIEW_IDLE", 2);
        f337030f = sVar3;
        ng3.s sVar4 = new ng3.s("PREVIEW_SCALE_ING", 3);
        f337031g = sVar4;
        ng3.s sVar5 = new ng3.s("PREVIEW_SCALE_WAIT", 4);
        f337032h = sVar5;
        ng3.s sVar6 = new ng3.s("PREVIEW_MOVE_ING", 5);
        f337033i = sVar6;
        ng3.s sVar7 = new ng3.s("DRAG_EXIT_ING", 6);
        f337034m = sVar7;
        ng3.s[] sVarArr = {sVar, sVar2, sVar3, sVar4, sVar5, sVar6, sVar7};
        f337035n = sVarArr;
        rz5.b.a(sVarArr);
    }

    public s(java.lang.String str, int i17) {
    }

    public static ng3.s valueOf(java.lang.String str) {
        return (ng3.s) java.lang.Enum.valueOf(ng3.s.class, str);
    }

    public static ng3.s[] values() {
        return (ng3.s[]) f337035n.clone();
    }
}
