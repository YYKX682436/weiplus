package w56;

/* loaded from: classes16.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.Object[] f443044a;

    /* renamed from: b, reason: collision with root package name */
    public int f443045b;

    public void a(java.lang.Object obj) {
        int i17 = this.f443045b;
        java.lang.Object[] objArr = this.f443044a;
        if (objArr == null) {
            objArr = new java.lang.Object[16];
            this.f443044a = objArr;
        } else if (i17 == objArr.length) {
            java.lang.Object[] objArr2 = new java.lang.Object[(i17 >> 2) + i17];
            java.lang.System.arraycopy(objArr, 0, objArr2, 0, i17);
            this.f443044a = objArr2;
            objArr = objArr2;
        }
        objArr[i17] = obj;
        this.f443045b = i17 + 1;
    }
}
