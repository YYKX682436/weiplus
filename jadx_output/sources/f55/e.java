package f55;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class e {

    /* renamed from: e, reason: collision with root package name */
    public static final f55.e f259771e;

    /* renamed from: f, reason: collision with root package name */
    public static final f55.e f259772f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ f55.e[] f259773g;

    /* renamed from: d, reason: collision with root package name */
    public final int f259774d;

    static {
        f55.e eVar = new f55.e("MainUI", 0, 0);
        f55.e eVar2 = new f55.e("MvvmAddressUI", 1, 1);
        f55.e eVar3 = new f55.e("FindMoreFriendsUI", 2, 2);
        f259771e = eVar3;
        f55.e eVar4 = new f55.e("MoreTabUI", 3, 3);
        f259772f = eVar4;
        f55.e[] eVarArr = {eVar, eVar2, eVar3, eVar4};
        f259773g = eVarArr;
        rz5.b.a(eVarArr);
    }

    public e(java.lang.String str, int i17, int i18) {
        this.f259774d = i18;
    }

    public static f55.e valueOf(java.lang.String str) {
        return (f55.e) java.lang.Enum.valueOf(f55.e.class, str);
    }

    public static f55.e[] values() {
        return (f55.e[]) f259773g.clone();
    }
}
