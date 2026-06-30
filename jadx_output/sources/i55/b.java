package i55;

/* loaded from: classes8.dex */
public abstract class b {

    /* renamed from: d, reason: collision with root package name */
    public final int f288831d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f288832e;

    /* renamed from: g, reason: collision with root package name */
    public long f288834g;

    /* renamed from: m, reason: collision with root package name */
    public kotlinx.coroutines.y0 f288837m;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f288833f = "";

    /* renamed from: h, reason: collision with root package name */
    public final java.util.Map f288835h = new java.util.LinkedHashMap();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.Map f288836i = new java.util.LinkedHashMap();

    /* renamed from: n, reason: collision with root package name */
    public final android.view.View.OnLayoutChangeListener f288838n = new i55.a(this);

    public b(int i17) {
        this.f288831d = i17;
    }

    public static void d(i55.b bVar, java.lang.String source, long j17, android.view.View view, boolean z17, int i17, java.lang.Object obj) {
        java.lang.String str;
        java.util.Map map;
        java.util.ArrayList arrayList;
        java.lang.String str2;
        java.util.Iterator it;
        java.util.ArrayList arrayList2;
        g55.j jVar;
        int i18;
        g55.j jVar2;
        i55.b bVar2 = bVar;
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onViewChange");
        }
        jz5.f0 f0Var = null;
        android.view.View view2 = (i17 & 4) != 0 ? null : view;
        bVar.getClass();
        kotlin.jvm.internal.o.g(source, "source");
        java.util.Map map2 = bVar2.f288835h;
        java.util.Map map3 = bVar2.f288836i;
        if (view2 != null) {
            int hashCode = view2.hashCode();
            java.lang.String str3 = (java.lang.String) ((java.util.LinkedHashMap) map2).get(java.lang.Integer.valueOf(hashCode));
            if (str3 != null && (jVar2 = (g55.j) ((java.util.LinkedHashMap) map3).get(str3)) != null) {
                java.lang.String str4 = jVar2.f269004c;
                bVar.e(source, j17, bVar2.f288832e && bVar2.b(view2), jVar2, view2.hashCode());
                if (!kotlin.jvm.internal.o.b(jVar2.f269004c, str4)) {
                    map2.put(java.lang.Integer.valueOf(hashCode), jVar2.f269004c);
                    map3.put(jVar2.f269004c, jVar2);
                    map3.remove(str4);
                }
            }
            f0Var = jz5.f0.f302826a;
        }
        if (f0Var == null) {
            java.util.LinkedHashMap linkedHashMap = (java.util.LinkedHashMap) map3;
            java.util.Iterator it6 = linkedHashMap.entrySet().iterator();
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            while (it6.hasNext()) {
                java.util.Map.Entry entry = (java.util.Map.Entry) it6.next();
                java.lang.String str5 = (java.lang.String) entry.getKey();
                g55.j viewInfo = (g55.j) entry.getValue();
                kotlin.jvm.internal.o.g(viewInfo, "viewInfo");
                java.util.Map map4 = viewInfo.f269002a;
                java.util.Iterator it7 = ((java.util.LinkedHashMap) map4).entrySet().iterator();
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                java.lang.String str6 = viewInfo.f269004c;
                while (true) {
                    if (!it7.hasNext()) {
                        str = str6;
                        map = map4;
                        arrayList = arrayList5;
                        str2 = str5;
                        it = it6;
                        arrayList2 = arrayList4;
                        jVar = viewInfo;
                        i18 = 0;
                        break;
                    }
                    java.util.Map.Entry entry2 = (java.util.Map.Entry) it7.next();
                    android.view.View view3 = (android.view.View) ((java.lang.ref.WeakReference) entry2.getValue()).get();
                    if (view3 == null) {
                        arrayList5.add(entry2.getKey());
                        com.tencent.mars.xlog.Log.i("MicroMsg.BaseRedDotExposureMonitorLogic", ((java.lang.Number) entry2.getKey()).intValue() + " is null remove");
                    } else {
                        boolean z18 = bVar2.f288832e && bVar2.b(view3);
                        str = str6;
                        map = map4;
                        arrayList = arrayList5;
                        g55.j jVar3 = viewInfo;
                        str2 = str5;
                        it = it6;
                        arrayList2 = arrayList4;
                        if (bVar.e(source, j17, z18, jVar3, view3.hashCode())) {
                            i18 = view3.hashCode();
                            jVar = jVar3;
                            break;
                        }
                        viewInfo = jVar3;
                        map4 = map;
                        str5 = str2;
                        str6 = str;
                        arrayList4 = arrayList2;
                        arrayList5 = arrayList;
                        bVar2 = bVar;
                        it6 = it;
                    }
                }
                if (!kotlin.jvm.internal.o.b(jVar.f269004c, str)) {
                    map2.put(java.lang.Integer.valueOf(i18), jVar.f269004c);
                }
                java.util.Iterator it8 = arrayList.iterator();
                while (it8.hasNext()) {
                    int intValue = ((java.lang.Number) it8.next()).intValue();
                    map2.remove(java.lang.Integer.valueOf(intValue));
                    map.remove(java.lang.Integer.valueOf(intValue));
                }
                if (!kotlin.jvm.internal.o.b(((g55.j) entry.getValue()).f269004c, str2)) {
                    arrayList2.add(str2);
                }
                if (((g55.j) entry.getValue()).f269002a.isEmpty()) {
                    arrayList3.add(entry.getKey());
                }
                bVar2 = bVar;
                arrayList4 = arrayList2;
                it6 = it;
            }
            java.util.ArrayList arrayList6 = arrayList4;
            java.util.Iterator it9 = arrayList3.iterator();
            while (it9.hasNext()) {
                java.lang.String str7 = (java.lang.String) it9.next();
                map3.remove(str7);
                com.tencent.mars.xlog.Log.i("MicroMsg.FindFriendTabExposureLogic", str7 + " is clear");
            }
            java.util.Iterator it10 = arrayList6.iterator();
            while (it10.hasNext()) {
                java.lang.String str8 = (java.lang.String) it10.next();
                g55.j jVar4 = (g55.j) linkedHashMap.get(str8);
                if (jVar4 != null) {
                    map3.put(jVar4.f269004c, jVar4);
                    map3.remove(str8);
                }
            }
        }
    }

    public final void a(java.lang.String str) {
        if (this.f288837m == null) {
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            this.f288837m = kotlinx.coroutines.z0.a(kotlinx.coroutines.internal.b0.f310484a);
            com.tencent.mars.xlog.Log.i("MicroMsg.BaseRedDotExposureMonitorLogic", "mMainScope start " + str);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0071, code lost:
    
        r7 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean b(android.view.View r7) {
        /*
            r6 = this;
            r0 = 0
            if (r7 != 0) goto L4
            return r0
        L4:
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            boolean r2 = r7.isAttachedToWindow()
            if (r2 == 0) goto L75
            boolean r2 = r7.getGlobalVisibleRect(r1)
            if (r2 == 0) goto L75
            int r2 = r7.getVisibility()
            if (r2 != 0) goto L75
            float r2 = r7.getAlpha()
            r3 = 0
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 <= 0) goto L75
            int r2 = r7.getWidth()
            if (r2 <= 0) goto L75
            int r2 = r7.getHeight()
            if (r2 <= 0) goto L75
            int r2 = r7.getHeight()
            int r3 = r7.getWidth()
            int r4 = r1.width()
            r5 = 1
            if (r4 != r3) goto L47
            int r1 = r1.height()
            if (r1 != r2) goto L47
            r1 = r5
            goto L48
        L47:
            r1 = r0
        L48:
            if (r1 == 0) goto L75
            android.view.ViewParent r7 = r7.getParent()
            r1 = r0
        L4f:
            boolean r2 = r7 instanceof android.view.View
            if (r2 == 0) goto L71
            r3 = 50
            if (r1 >= r3) goto L71
            android.view.View r7 = (android.view.View) r7
            int r3 = r7.getVisibility()
            if (r3 == 0) goto L61
            r7 = r0
            goto L72
        L61:
            int r1 = r1 + 1
            r3 = 0
            if (r2 == 0) goto L67
            goto L68
        L67:
            r7 = r3
        L68:
            if (r7 == 0) goto L6f
            android.view.ViewParent r7 = r7.getParent()
            goto L4f
        L6f:
            r7 = r3
            goto L4f
        L71:
            r7 = r5
        L72:
            if (r7 == 0) goto L75
            r0 = r5
        L75:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i55.b.b(android.view.View):boolean");
    }

    public void c(long j17) {
        a("onPageResume");
        this.f288834g = j17;
        this.f288832e = true;
        this.f288833f = "";
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseRedDotExposureMonitorLogic", "on resume");
        d(this, "onPageResume", j17, null, false, 12, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean e(java.lang.String r24, long r25, boolean r27, g55.j r28, int r29) {
        /*
            Method dump skipped, instructions count: 614
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i55.b.e(java.lang.String, long, boolean, g55.j, int):boolean");
    }
}
