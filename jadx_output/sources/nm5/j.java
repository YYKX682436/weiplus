package nm5;

/* loaded from: classes13.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.Object[] f338513a;

    public static nm5.a b(java.lang.Object obj) {
        nm5.a aVar = new nm5.a();
        aVar.f338513a = new java.lang.Object[]{obj};
        return aVar;
    }

    public static nm5.b c(java.lang.Object obj, java.lang.Object obj2) {
        nm5.b bVar = new nm5.b();
        bVar.f338513a = new java.lang.Object[]{obj, obj2};
        return bVar;
    }

    public static nm5.c d(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        nm5.c cVar = new nm5.c();
        cVar.f338513a = new java.lang.Object[]{obj, obj2, obj3};
        return cVar;
    }

    public static nm5.d e(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        nm5.d dVar = new nm5.d();
        dVar.f338513a = new java.lang.Object[]{obj, obj2, obj3, obj4};
        return dVar;
    }

    public static nm5.e f(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
        nm5.e eVar = new nm5.e();
        eVar.f338513a = new java.lang.Object[]{obj, obj2, obj3, obj4, obj5};
        return eVar;
    }

    public static nm5.f g(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6) {
        nm5.f fVar = new nm5.f();
        fVar.f338513a = new java.lang.Object[]{obj, obj2, obj3, obj4, obj5, obj6};
        return fVar;
    }

    public java.lang.Object a(int i17) {
        java.lang.Object[] objArr = this.f338513a;
        if (objArr.length <= i17) {
            return null;
        }
        return objArr[i17];
    }

    public int h() {
        java.lang.Object[] objArr = this.f338513a;
        if (objArr == null) {
            return 0;
        }
        return objArr.length;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        boolean z17 = true;
        for (java.lang.Object obj : this.f338513a) {
            if (z17) {
                z17 = false;
            } else {
                sb6.append(",");
            }
            sb6.append(obj);
        }
        return sb6.toString();
    }
}
