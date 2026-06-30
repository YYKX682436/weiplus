package zw4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class e {

    /* renamed from: e, reason: collision with root package name */
    public static final zw4.e f476910e;

    /* renamed from: f, reason: collision with root package name */
    public static final zw4.e f476911f;

    /* renamed from: g, reason: collision with root package name */
    public static final zw4.e f476912g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ zw4.e[] f476913h;

    /* renamed from: d, reason: collision with root package name */
    public final int f476914d;

    static {
        zw4.e eVar = new zw4.e("ACTION_CACHE_VALID_NOT_NEED_DOWNLOAD", 0, 1);
        f476910e = eVar;
        zw4.e eVar2 = new zw4.e("ACTION_CACHE_EXPIRE_AND_DOWNLOAD", 1, 2);
        f476911f = eVar2;
        zw4.e eVar3 = new zw4.e("ACTION_NO_CACHE_AND_DOWNLOAD", 2, 3);
        f476912g = eVar3;
        zw4.e[] eVarArr = {eVar, eVar2, eVar3};
        f476913h = eVarArr;
        rz5.b.a(eVarArr);
    }

    public e(java.lang.String str, int i17, int i18) {
        this.f476914d = i18;
    }

    public static zw4.e valueOf(java.lang.String str) {
        return (zw4.e) java.lang.Enum.valueOf(zw4.e.class, str);
    }

    public static zw4.e[] values() {
        return (zw4.e[]) f476913h.clone();
    }
}
