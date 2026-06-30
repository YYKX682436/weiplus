package xx;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes14.dex */
public final class e {

    /* renamed from: e, reason: collision with root package name */
    public static final xx.e f457784e;

    /* renamed from: f, reason: collision with root package name */
    public static final xx.e f457785f;

    /* renamed from: g, reason: collision with root package name */
    public static final xx.e f457786g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ xx.e[] f457787h;

    /* renamed from: d, reason: collision with root package name */
    public final int f457788d;

    static {
        xx.e eVar = new xx.e("AITalkingDone", 0, 1);
        f457784e = eVar;
        xx.e eVar2 = new xx.e("UserInterrupt", 1, 2);
        f457785f = eVar2;
        xx.e eVar3 = new xx.e("UserExitRoom", 2, 3);
        f457786g = eVar3;
        xx.e[] eVarArr = {eVar, eVar2, eVar3};
        f457787h = eVarArr;
        rz5.b.a(eVarArr);
    }

    public e(java.lang.String str, int i17, int i18) {
        this.f457788d = i18;
    }

    public static xx.e valueOf(java.lang.String str) {
        return (xx.e) java.lang.Enum.valueOf(xx.e.class, str);
    }

    public static xx.e[] values() {
        return (xx.e[]) f457787h.clone();
    }
}
