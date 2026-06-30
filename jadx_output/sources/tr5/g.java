package tr5;

/* loaded from: classes13.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f421490a;

    /* renamed from: b, reason: collision with root package name */
    public final int f421491b;

    public g(java.lang.String str, int i17) {
        if (android.text.TextUtils.isEmpty(str)) {
            throw new java.lang.IllegalArgumentException("channel".concat(" can not be empty"));
        }
        if ((1 == i17 || 2 == i17 || 3 == i17) ? false : true) {
            throw new java.lang.IllegalArgumentException("family".concat(" is invalid"));
        }
        this.f421490a = str;
        this.f421491b = i17;
    }

    public java.lang.String toString() {
        return this.f421490a + "Dns(" + this.f421491b + ")";
    }
}
