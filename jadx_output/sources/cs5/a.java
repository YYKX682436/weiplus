package cs5;

/* loaded from: classes13.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final cs5.a f222126d;

    /* renamed from: e, reason: collision with root package name */
    public static final cs5.a f222127e;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f222128a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String[] f222129b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Map f222130c;

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.String[] strArr = tr5.c.f421455a;
        f222126d = new cs5.a("0", strArr, hashMap);
        f222127e = new cs5.a("0", strArr, hashMap);
    }

    public a(int i17, java.lang.String str, java.lang.String[] strArr, java.util.Map map) {
        i17 = 2 != i17 ? 1 : i17;
        if (!android.text.TextUtils.isEmpty(str)) {
            if (!sr5.a.c(strArr)) {
                java.lang.String[] a17 = a(i17, strArr);
                if (!map.isEmpty()) {
                    this.f222128a = str;
                    this.f222129b = a17;
                    this.f222130c = map;
                    return;
                }
                throw new java.lang.IllegalArgumentException("ttl".concat(" is invalid"));
            }
            throw new java.lang.IllegalArgumentException("ips".concat(" can not be empty"));
        }
        throw new java.lang.IllegalArgumentException("clientIp".concat(" can not be empty"));
    }

    public static java.lang.String[] a(int i17, java.lang.String[] strArr) {
        int length = strArr.length;
        int i18 = length;
        for (int i19 = 0; i19 < length; i19++) {
            java.lang.String str = strArr[i19];
            if (2 == i17) {
                if (!sr5.e.b(str)) {
                    strArr[i19] = "0";
                    i18--;
                }
            } else if (!sr5.e.a(str)) {
                strArr[i19] = "0";
                i18--;
            }
        }
        if (i18 == length) {
            return strArr;
        }
        if (i18 <= 0) {
            return tr5.c.f421455a;
        }
        java.lang.String[] strArr2 = new java.lang.String[i18];
        int i27 = i18 - 1;
        for (int i28 = length - 1; i28 >= 0 && i27 >= 0; i28--) {
            java.lang.String str2 = strArr[i28];
            if (!"0".equals(str2)) {
                strArr2[i27] = str2;
                i27--;
            }
        }
        return strArr2;
    }

    public a(java.lang.String str, java.lang.String[] strArr, java.lang.String[] strArr2, java.util.Map map) {
        if (!android.text.TextUtils.isEmpty(str)) {
            if (sr5.a.c(strArr) && sr5.a.c(strArr2)) {
                throw new java.lang.IllegalArgumentException("ips".concat(" can not be empty"));
            }
            java.lang.String[] a17 = a(1, strArr);
            java.lang.String[] a18 = a(2, strArr2);
            if (!map.isEmpty()) {
                int length = a17.length;
                int length2 = a18.length;
                java.lang.String[] strArr3 = (java.lang.String[]) java.util.Arrays.copyOf(a17, length + length2);
                java.lang.System.arraycopy(a18, 0, strArr3, length, length2);
                this.f222128a = str;
                this.f222129b = strArr3;
                this.f222130c = map;
                return;
            }
            throw new java.lang.IllegalArgumentException("ttl".concat(" is invalid"));
        }
        throw new java.lang.IllegalArgumentException("clientIp".concat(" can not be empty"));
    }

    public a(java.lang.String str, java.lang.String[] strArr, java.util.Map map) {
        this.f222128a = str;
        this.f222129b = strArr;
        this.f222130c = map;
    }
}
