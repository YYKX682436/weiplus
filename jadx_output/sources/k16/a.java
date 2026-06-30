package k16;

/* loaded from: classes12.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final int[] f303424a;

    /* renamed from: b, reason: collision with root package name */
    public final int f303425b;

    /* renamed from: c, reason: collision with root package name */
    public final int f303426c;

    /* renamed from: d, reason: collision with root package name */
    public final int f303427d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f303428e;

    public a(int... numbers) {
        java.util.List list;
        kotlin.jvm.internal.o.g(numbers, "numbers");
        this.f303424a = numbers;
        java.lang.Integer S = kz5.z.S(numbers, 0);
        this.f303425b = S != null ? S.intValue() : -1;
        java.lang.Integer S2 = kz5.z.S(numbers, 1);
        this.f303426c = S2 != null ? S2.intValue() : -1;
        java.lang.Integer S3 = kz5.z.S(numbers, 2);
        this.f303427d = S3 != null ? S3.intValue() : -1;
        if (numbers.length <= 3) {
            list = kz5.p0.f313996d;
        } else {
            if (numbers.length > 1024) {
                throw new java.lang.IllegalArgumentException("BinaryVersion with length more than 1024 are not supported. Provided length " + numbers.length + '.');
            }
            list = kz5.n0.S0(((kz5.h) kz5.v.e(numbers)).subList(3, numbers.length));
        }
        this.f303428e = list;
    }

    public final boolean a(int i17, int i18, int i19) {
        int i27 = this.f303425b;
        if (i27 > i17) {
            return true;
        }
        if (i27 < i17) {
            return false;
        }
        int i28 = this.f303426c;
        if (i28 > i18) {
            return true;
        }
        return i28 >= i18 && this.f303427d >= i19;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj != null && kotlin.jvm.internal.o.b(getClass(), obj.getClass())) {
            k16.a aVar = (k16.a) obj;
            if (this.f303425b == aVar.f303425b && this.f303426c == aVar.f303426c && this.f303427d == aVar.f303427d && kotlin.jvm.internal.o.b(this.f303428e, aVar.f303428e)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i17 = this.f303425b;
        int i18 = i17 + (i17 * 31) + this.f303426c;
        int i19 = i18 + (i18 * 31) + this.f303427d;
        return i19 + (i19 * 31) + this.f303428e.hashCode();
    }

    public java.lang.String toString() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int[] iArr = this.f303424a;
        int length = iArr.length;
        for (int i17 = 0; i17 < length; i17++) {
            int i18 = iArr[i17];
            if (!(i18 != -1)) {
                break;
            }
            arrayList.add(java.lang.Integer.valueOf(i18));
        }
        return arrayList.isEmpty() ? com.eclipsesource.mmv8.Platform.UNKNOWN : kz5.n0.g0(arrayList, ".", null, null, 0, null, null, 62, null);
    }
}
