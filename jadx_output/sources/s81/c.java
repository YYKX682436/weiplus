package s81;

/* loaded from: classes7.dex */
public class c extends dm.l0 implements qj1.d {
    public static final l75.e0 A;

    /* renamed from: z, reason: collision with root package name */
    public static final java.lang.String[] f404727z;

    static {
        java.lang.String[] strArr = {"appId", "version", "packageType", "packageKey"};
        f404727z = strArr;
        l75.e0 initAutoDBInfo = dm.l0.initAutoDBInfo(dm.l0.class);
        A = initAutoDBInfo;
        initAutoDBInfo.f316956e += qj1.c.a(strArr);
    }

    @Override // dm.l0, l75.f0
    public l75.e0 getDBInfo() {
        return A;
    }

    @Override // qj1.d
    public java.lang.String[] getKeys() {
        return f404727z;
    }
}
