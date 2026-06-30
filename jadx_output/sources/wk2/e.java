package wk2;

/* loaded from: classes3.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wk2.j f446941d;

    public e(wk2.j jVar) {
        this.f446941d = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mars.xlog.Log.i("MultiStreamAutoPlay", "checkAutoPlay autoPlayRunnable doing");
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        wk2.j jVar = this.f446941d;
        jVar.f446951g.u(iArr);
        jVar.f446951g.v(iArr2);
        jVar.getClass();
        int[] iArr3 = new int[4];
        iArr3[0] = iArr[0];
        iArr3[1] = iArr[1];
        int i17 = iArr[0];
        java.lang.Integer valueOf = java.lang.Integer.valueOf(iArr2[0]);
        int intValue = valueOf.intValue();
        int i18 = iArr2[1];
        if (!(intValue > i18)) {
            valueOf = null;
        }
        if (valueOf != null) {
            i18 = valueOf.intValue();
        }
        com.tencent.mars.xlog.Log.w("MultiStreamAutoPlay", "findAutoPlayItem firstVisibleItemIndex: " + i17 + " lastVisibleItemIndex： " + i18);
        java.util.HashMap hashMap = new java.util.HashMap();
        if (i17 <= i18) {
            while (true) {
                if (jVar.c(i17) == null) {
                    com.tencent.mars.xlog.Log.w("MultiStreamAutoPlay", "findAutoPlayItem invalid data = null,  index:" + i17);
                } else {
                    android.view.View findViewByPosition = jVar.f446951g.findViewByPosition(i17);
                    if (findViewByPosition != null) {
                        android.graphics.Rect rect = new android.graphics.Rect();
                        findViewByPosition.getHitRect(rect);
                        int i19 = rect.top;
                        if (i19 < 0) {
                            i19 = 0;
                        }
                        int i27 = rect.bottom;
                        int i28 = jVar.f446946b;
                        if (i27 > i28) {
                            i27 = i28;
                        }
                        hashMap.put(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i27 - i19));
                        com.tencent.mars.xlog.Log.w("MultiStreamAutoPlay", "findAutoPlayItem viewSize index: " + i17 + " viewSize[index]: " + hashMap.get(java.lang.Integer.valueOf(i17)));
                    }
                }
                if (i17 == i18) {
                    break;
                } else {
                    i17++;
                }
            }
        }
        java.util.Set entrySet = hashMap.entrySet();
        kotlin.jvm.internal.o.f(entrySet, "<get-entries>(...)");
        int i29 = 0;
        for (java.util.Map.Entry entry : kz5.n0.F0(entrySet, new wk2.f())) {
            if (i29 < 4) {
                java.lang.Object key = entry.getKey();
                kotlin.jvm.internal.o.f(key, "<get-key>(...)");
                iArr3[i29] = ((java.lang.Number) key).intValue();
                i29++;
            }
        }
        java.util.HashSet hashSet = jVar.f446950f;
        java.util.ArrayList<wk2.d> arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : hashSet) {
            if (!kz5.z.F(iArr3, ((wk2.d) obj).f446938a)) {
                arrayList.add(obj);
            }
        }
        for (wk2.d dVar : arrayList) {
            jVar.e(dVar);
            jVar.f446950f.remove(dVar);
        }
        for (int i37 = 0; i37 < 4; i37++) {
            jVar.a(iArr3[i37]);
        }
    }
}
