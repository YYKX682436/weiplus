package m3;

/* loaded from: classes15.dex */
public class f implements m3.e {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object[] f323094a;

    /* renamed from: b, reason: collision with root package name */
    public int f323095b;

    public f(int i17) {
        if (i17 <= 0) {
            throw new java.lang.IllegalArgumentException("The max pool size must be > 0");
        }
        this.f323094a = new java.lang.Object[i17];
    }

    @Override // m3.e
    public java.lang.Object a() {
        int i17 = this.f323095b;
        if (i17 <= 0) {
            return null;
        }
        int i18 = i17 - 1;
        java.lang.Object[] objArr = this.f323094a;
        java.lang.Object obj = objArr[i18];
        objArr[i18] = null;
        this.f323095b = i17 - 1;
        return obj;
    }

    @Override // m3.e
    public boolean b(java.lang.Object obj) {
        int i17;
        java.lang.Object[] objArr;
        boolean z17;
        int i18 = 0;
        while (true) {
            i17 = this.f323095b;
            objArr = this.f323094a;
            if (i18 >= i17) {
                z17 = false;
                break;
            }
            if (objArr[i18] == obj) {
                z17 = true;
                break;
            }
            i18++;
        }
        if (z17) {
            throw new java.lang.IllegalStateException("Already in the pool!");
        }
        if (i17 >= objArr.length) {
            return false;
        }
        objArr[i17] = obj;
        this.f323095b = i17 + 1;
        return true;
    }
}
