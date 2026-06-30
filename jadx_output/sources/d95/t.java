package d95;

/* loaded from: classes16.dex */
public abstract /* synthetic */ class t {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f227705a;

    static {
        int[] iArr = new int[com.tencent.wcdb.base.WCDBException.Level.values().length];
        f227705a = iArr;
        try {
            iArr[com.tencent.wcdb.base.WCDBException.Level.Fatal.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused) {
        }
        try {
            f227705a[com.tencent.wcdb.base.WCDBException.Level.Error.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused2) {
        }
        try {
            f227705a[com.tencent.wcdb.base.WCDBException.Level.Warning.ordinal()] = 3;
        } catch (java.lang.NoSuchFieldError unused3) {
        }
        try {
            f227705a[com.tencent.wcdb.base.WCDBException.Level.Notice.ordinal()] = 4;
        } catch (java.lang.NoSuchFieldError unused4) {
        }
    }
}
