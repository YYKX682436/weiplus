package xx;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class g {

    /* renamed from: e, reason: collision with root package name */
    public static final xx.g f457790e;

    /* renamed from: f, reason: collision with root package name */
    public static final xx.g f457791f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ xx.g[] f457792g;

    /* renamed from: d, reason: collision with root package name */
    public final int f457793d;

    static {
        xx.g gVar = new xx.g("AIRoomTypeAlone", 0, 1);
        f457790e = gVar;
        xx.g gVar2 = new xx.g("AIRoomTypeMultiple", 1, 2);
        f457791f = gVar2;
        xx.g[] gVarArr = {gVar, gVar2};
        f457792g = gVarArr;
        rz5.b.a(gVarArr);
    }

    public g(java.lang.String str, int i17, int i18) {
        this.f457793d = i18;
    }

    public static xx.g valueOf(java.lang.String str) {
        return (xx.g) java.lang.Enum.valueOf(xx.g.class, str);
    }

    public static xx.g[] values() {
        return (xx.g[]) f457792g.clone();
    }
}
