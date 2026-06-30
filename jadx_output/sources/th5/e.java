package th5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes12.dex */
public final class e {

    /* renamed from: e, reason: collision with root package name */
    public static final th5.e f419366e;

    /* renamed from: f, reason: collision with root package name */
    public static final th5.e f419367f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ th5.e[] f419368g;

    /* renamed from: d, reason: collision with root package name */
    public final int f419369d;

    static {
        th5.e eVar = new th5.e("Expose", 0, 1);
        f419366e = eVar;
        th5.e eVar2 = new th5.e("Click", 1, 2);
        f419367f = eVar2;
        th5.e[] eVarArr = {eVar, eVar2};
        f419368g = eVarArr;
        rz5.b.a(eVarArr);
    }

    public e(java.lang.String str, int i17, int i18) {
        this.f419369d = i18;
    }

    public static th5.e valueOf(java.lang.String str) {
        return (th5.e) java.lang.Enum.valueOf(th5.e.class, str);
    }

    public static th5.e[] values() {
        return (th5.e[]) f419368g.clone();
    }
}
