package on2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class e {

    /* renamed from: d, reason: collision with root package name */
    public static final on2.e f346880d;

    /* renamed from: e, reason: collision with root package name */
    public static final on2.e f346881e;

    /* renamed from: f, reason: collision with root package name */
    public static final on2.e f346882f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ on2.e[] f346883g;

    static {
        on2.e eVar = new on2.e("NONE", 0);
        f346880d = eVar;
        on2.e eVar2 = new on2.e("COUPON_NOT_USED", 1);
        f346881e = eVar2;
        on2.e eVar3 = new on2.e("COUPON_USED", 2);
        f346882f = eVar3;
        on2.e[] eVarArr = {eVar, eVar2, eVar3};
        f346883g = eVarArr;
        rz5.b.a(eVarArr);
    }

    public e(java.lang.String str, int i17) {
    }

    public static on2.e valueOf(java.lang.String str) {
        return (on2.e) java.lang.Enum.valueOf(on2.e.class, str);
    }

    public static on2.e[] values() {
        return (on2.e[]) f346883g.clone();
    }
}
