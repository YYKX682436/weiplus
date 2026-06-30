package x3;

/* loaded from: classes15.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final int[] f451588a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object[] f451589b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Object[] f451590c;

    public q(java.lang.Object[] objArr, java.lang.Object[] objArr2) {
        int length = objArr.length;
        int[] iArr = new int[length];
        java.util.HashMap hashMap = new java.util.HashMap();
        for (int i17 = 0; i17 < length; i17++) {
            java.lang.Object obj = objArr[i17];
            java.lang.Integer num = (java.lang.Integer) hashMap.get(obj);
            if (num == null) {
                num = java.lang.Integer.valueOf(hashMap.size());
                hashMap.put(obj, num);
            }
            iArr[i17] = num.intValue();
        }
        this.f451588a = iArr;
        this.f451589b = a(objArr, iArr);
        this.f451590c = a(objArr2, iArr);
    }

    public static java.lang.Object[] a(java.lang.Object[] objArr, int[] iArr) {
        int length = objArr.length;
        java.lang.Class<?> componentType = objArr.getClass().getComponentType();
        android.util.Printer printer = androidx.gridlayout.widget.GridLayout.f11530o;
        int i17 = -1;
        for (int i18 : iArr) {
            i17 = java.lang.Math.max(i17, i18);
        }
        java.lang.Object[] objArr2 = (java.lang.Object[]) java.lang.reflect.Array.newInstance(componentType, i17 + 1);
        for (int i19 = 0; i19 < length; i19++) {
            objArr2[iArr[i19]] = objArr[i19];
        }
        return objArr2;
    }
}
