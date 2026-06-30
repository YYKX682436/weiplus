package xx;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class d {

    /* renamed from: e, reason: collision with root package name */
    public static final xx.d f457780e;

    /* renamed from: f, reason: collision with root package name */
    public static final xx.d f457781f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ xx.d[] f457782g;

    /* renamed from: d, reason: collision with root package name */
    public final int f457783d;

    static {
        xx.d dVar = new xx.d("AIMicInputEndTypeOther", 0, 0);
        xx.d dVar2 = new xx.d("AIMicInputEndTypeCLK", 1, 1);
        f457780e = dVar2;
        xx.d dVar3 = new xx.d("AIMicInputEndTypeKeyBoard", 2, 2);
        f457781f = dVar3;
        xx.d[] dVarArr = {dVar, dVar2, dVar3};
        f457782g = dVarArr;
        rz5.b.a(dVarArr);
    }

    public d(java.lang.String str, int i17, int i18) {
        this.f457783d = i18;
    }

    public static xx.d valueOf(java.lang.String str) {
        return (xx.d) java.lang.Enum.valueOf(xx.d.class, str);
    }

    public static xx.d[] values() {
        return (xx.d[]) f457782g.clone();
    }
}
