package o0;

/* loaded from: classes14.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.Object[] f341833a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.Object[] f341834b;

    /* renamed from: c, reason: collision with root package name */
    public int f341835c;

    public b(int i17, int i18, kotlin.jvm.internal.i iVar) {
        i17 = (i18 & 1) != 0 ? 16 : i17;
        this.f341833a = new java.lang.Object[i17];
        this.f341834b = new java.lang.Object[i17];
    }

    public final int a(java.lang.Object obj) {
        int identityHashCode = java.lang.System.identityHashCode(obj);
        int i17 = this.f341835c - 1;
        int i18 = 0;
        while (i18 <= i17) {
            int i19 = (i18 + i17) >>> 1;
            java.lang.Object obj2 = this.f341833a[i19];
            int identityHashCode2 = java.lang.System.identityHashCode(obj2);
            if (identityHashCode2 < identityHashCode) {
                i18 = i19 + 1;
            } else {
                if (identityHashCode2 <= identityHashCode) {
                    if (obj == obj2) {
                        return i19;
                    }
                    for (int i27 = i19 - 1; -1 < i27; i27--) {
                        java.lang.Object obj3 = this.f341833a[i27];
                        if (obj3 == obj) {
                            return i27;
                        }
                        if (java.lang.System.identityHashCode(obj3) != identityHashCode) {
                            break;
                        }
                    }
                    int i28 = i19 + 1;
                    int i29 = this.f341835c;
                    while (true) {
                        if (i28 >= i29) {
                            i28 = this.f341835c;
                            break;
                        }
                        java.lang.Object obj4 = this.f341833a[i28];
                        if (obj4 == obj) {
                            return i28;
                        }
                        if (java.lang.System.identityHashCode(obj4) != identityHashCode) {
                            break;
                        }
                        i28++;
                    }
                    return -(i28 + 1);
                }
                i17 = i19 - 1;
            }
        }
        return -(i18 + 1);
    }

    public final void b(java.lang.Object key, java.lang.Object obj) {
        kotlin.jvm.internal.o.g(key, "key");
        int a17 = a(key);
        if (a17 >= 0) {
            this.f341834b[a17] = obj;
            return;
        }
        int i17 = -(a17 + 1);
        int i18 = this.f341835c;
        java.lang.Object[] objArr = this.f341833a;
        boolean z17 = i18 == objArr.length;
        java.lang.Object[] objArr2 = z17 ? new java.lang.Object[i18 * 2] : objArr;
        int i19 = i17 + 1;
        kz5.v.k(objArr, objArr2, i19, i17, i18);
        if (z17) {
            kz5.v.p(this.f341833a, objArr2, 0, 0, i17, 6, null);
        }
        objArr2[i17] = key;
        this.f341833a = objArr2;
        java.lang.Object[] objArr3 = z17 ? new java.lang.Object[this.f341835c * 2] : this.f341834b;
        kz5.v.k(this.f341834b, objArr3, i19, i17, this.f341835c);
        if (z17) {
            kz5.v.p(this.f341834b, objArr3, 0, 0, i17, 6, null);
        }
        objArr3[i17] = obj;
        this.f341834b = objArr3;
        this.f341835c++;
    }
}
