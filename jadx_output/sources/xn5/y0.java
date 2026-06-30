package xn5;

/* loaded from: classes13.dex */
public final class y0 implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f455734d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.ref.WeakReference f455735e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f455736f;

    public y0(java.lang.String taskId, java.lang.ref.WeakReference contextRef, java.lang.String actName) {
        kotlin.jvm.internal.o.g(taskId, "taskId");
        kotlin.jvm.internal.o.g(contextRef, "contextRef");
        kotlin.jvm.internal.o.g(actName, "actName");
        this.f455734d = taskId;
        this.f455735e = contextRef;
        this.f455736f = actName;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        jz5.f0 f0Var;
        android.content.res.Configuration configuration;
        android.content.res.Configuration configuration2;
        j65.f fVar;
        android.util.DisplayMetrics e17;
        j65.f fVar2;
        android.util.DisplayMetrics e18;
        byte[] j17;
        java.lang.String str;
        jz5.f0 f0Var2;
        java.util.Iterator it;
        android.view.View inflate;
        android.content.Context context;
        android.view.LayoutInflater layoutInflater;
        java.lang.String str2;
        android.content.res.Configuration configuration3;
        android.content.res.Configuration configuration4;
        j65.f fVar3;
        android.util.DisplayMetrics e19;
        android.content.res.Configuration configuration5;
        android.content.res.Configuration configuration6;
        j65.f fVar4;
        android.util.DisplayMetrics e27;
        j65.f fVar5;
        android.util.DisplayMetrics e28;
        xn5.p0 p0Var = xn5.q0.f455702a;
        boolean z17 = xn5.q0.f455707f;
        jz5.f0 f0Var3 = jz5.f0.f302826a;
        if (z17) {
            xn5.e1 e1Var = xn5.e1.f455663a;
            try {
                java.lang.reflect.Field declaredField = android.os.Looper.class.getDeclaredField("sThreadLocal");
                declaredField.setAccessible(true);
                java.lang.Object obj = declaredField.get(android.os.Looper.getMainLooper());
                if (obj instanceof java.lang.ThreadLocal) {
                    java.lang.ThreadLocal threadLocal = obj instanceof java.lang.ThreadLocal ? (java.lang.ThreadLocal) obj : null;
                    if (threadLocal != null) {
                        threadLocal.set(android.os.Looper.getMainLooper());
                    }
                }
            } catch (java.lang.Throwable unused) {
            }
            xn5.e1 e1Var2 = xn5.e1.f455663a;
            com.tencent.mars.xlog.Log.i("MicroMsg.X2C.X2CLayoutCachePool", "start to preload taskId" + this.f455734d);
            android.content.Context context2 = (android.content.Context) this.f455735e.get();
            if (context2 != null && (context2 instanceof androidx.appcompat.app.AppCompatActivity)) {
                android.view.LayoutInflater b17 = com.tencent.mm.ui.id.b(context2);
                java.lang.String u17 = com.tencent.mm.sdk.platformtools.t8.u1(this.f455736f, context2.getClass().getSimpleName());
                kotlin.jvm.internal.o.d(u17);
                xn5.p0 p0Var2 = xn5.q0.f455702a;
                if (p0Var2.b().d().c(u17)) {
                    androidx.appcompat.app.AppCompatActivity appCompatActivity = (androidx.appcompat.app.AppCompatActivity) context2;
                    android.content.res.Resources resources = appCompatActivity.getResources();
                    j65.j jVar = resources instanceof j65.j ? (j65.j) resources : null;
                    android.content.res.Resources resources2 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources();
                    j65.j jVar2 = resources2 instanceof j65.j ? (j65.j) resources2 : null;
                    java.lang.Float valueOf = (jVar == null || (fVar5 = jVar.f297961e) == null || (e28 = fVar5.e()) == null) ? null : java.lang.Float.valueOf(e28.density);
                    java.lang.Float valueOf2 = (jVar2 == null || (fVar4 = jVar2.f297961e) == null || (e27 = fVar4.e()) == null) ? null : java.lang.Float.valueOf(e27.density);
                    if (valueOf != null ? !(valueOf2 == null || valueOf.floatValue() != valueOf2.floatValue()) : valueOf2 == null) {
                        f0Var = f0Var3;
                        if (kotlin.jvm.internal.o.b((jVar == null || (configuration6 = jVar.getConfiguration()) == null) ? null : java.lang.Integer.valueOf(configuration6.densityDpi), (jVar2 == null || (configuration5 = jVar2.getConfiguration()) == null) ? null : java.lang.Integer.valueOf(configuration5.densityDpi))) {
                            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("PreloadLayoutTask inflate context:");
                            sb6.append(context2);
                            sb6.append(" resource:");
                            sb6.append(jVar);
                            sb6.append(", density: ");
                            sb6.append((jVar == null || (fVar3 = jVar.f297961e) == null || (e19 = fVar3.e()) == null) ? null : java.lang.Float.valueOf(e19.density));
                            sb6.append(" uimode:");
                            sb6.append((jVar == null || (configuration4 = jVar.getConfiguration()) == null) ? null : java.lang.Integer.valueOf(configuration4.uiMode));
                            sb6.append(" densityDpi:");
                            sb6.append((jVar == null || (configuration3 = jVar.getConfiguration()) == null) ? null : java.lang.Integer.valueOf(configuration3.densityDpi));
                            com.tencent.mars.xlog.Log.i("MicroMsg.X2C.X2CLayoutCachePool", sb6.toString());
                            xn5.e1 e1Var3 = xn5.e1.f455663a;
                            java.util.HashMap hashMap = xn5.e1.f455667e;
                            r45.hg7 hg7Var = (r45.hg7) hashMap.get(u17);
                            if (hg7Var == null) {
                                try {
                                    com.tencent.mm.sdk.platformtools.o4 e29 = e1Var3.e();
                                    if (e29 == null || (j17 = e29.j(u17)) == null) {
                                        r45.hg7 hg7Var2 = new r45.hg7();
                                        hg7Var2.f376140d = u17;
                                        hashMap.put(u17, hg7Var2);
                                        hg7Var2.f376141e = new java.util.LinkedList();
                                        for (java.util.Map.Entry entry : p0Var2.b().d().a(u17).entrySet()) {
                                            int intValue = ((java.lang.Number) entry.getKey()).intValue();
                                            int intValue2 = ((java.lang.Number) entry.getValue()).intValue();
                                            java.util.LinkedList layoutList = hg7Var2.f376141e;
                                            kotlin.jvm.internal.o.f(layoutList, "layoutList");
                                            java.util.ArrayList arrayList = new java.util.ArrayList(intValue2);
                                            for (int i17 = 0; i17 < intValue2; i17++) {
                                                r45.ig7 ig7Var = new r45.ig7();
                                                ig7Var.f377040d = intValue;
                                                ig7Var.f377041e = 0;
                                                arrayList.add(ig7Var);
                                            }
                                            kz5.h0.u(layoutList, arrayList);
                                        }
                                        hg7Var = hg7Var2;
                                    } else {
                                        r45.hg7 hg7Var3 = new r45.hg7();
                                        hg7Var3.parseFrom(j17);
                                        hg7Var3.f376140d = u17;
                                        hashMap.put(u17, hg7Var3);
                                        java.util.LinkedList layoutList2 = hg7Var3.f376141e;
                                        kotlin.jvm.internal.o.f(layoutList2, "layoutList");
                                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                                        for (java.lang.Object obj2 : layoutList2) {
                                            if (xn5.q0.f455702a.b().d().b(u17, ((r45.ig7) obj2).f377040d)) {
                                                arrayList2.add(obj2);
                                            }
                                        }
                                        java.util.LinkedList linkedList = new java.util.LinkedList(arrayList2);
                                        hg7Var3.f376141e = linkedList;
                                        java.util.Map a17 = kz5.t0.a(new xn5.c1(linkedList));
                                        for (java.util.Map.Entry entry2 : xn5.q0.f455702a.b().d().a(u17).entrySet()) {
                                            int intValue3 = ((java.lang.Number) entry2.getKey()).intValue();
                                            int intValue4 = ((java.lang.Number) entry2.getValue()).intValue();
                                            java.lang.Integer num = (java.lang.Integer) a17.get(java.lang.Integer.valueOf(intValue3));
                                            int intValue5 = num != null ? num.intValue() : 0;
                                            if (intValue5 < intValue4) {
                                                int i18 = intValue4 - intValue5;
                                                java.util.LinkedList layoutList3 = hg7Var3.f376141e;
                                                kotlin.jvm.internal.o.f(layoutList3, "layoutList");
                                                java.util.ArrayList arrayList3 = new java.util.ArrayList(i18);
                                                int i19 = 0;
                                                while (i19 < i18) {
                                                    r45.ig7 ig7Var2 = new r45.ig7();
                                                    ig7Var2.f377040d = intValue3;
                                                    ig7Var2.f377041e = 0;
                                                    arrayList3.add(ig7Var2);
                                                    i19++;
                                                    a17 = a17;
                                                }
                                                kz5.h0.u(layoutList3, arrayList3);
                                                com.tencent.mars.xlog.Log.i("MicroMsg.X2C.X2CLayoutCachePool", "X2C loadX2CPreloadData diff[" + i18 + "] load: " + intValue3 + ' ' + com.tencent.mm.accessibility.uitl.IdUtil.INSTANCE.getName(intValue3) + ' ' + u17);
                                                a17 = a17;
                                            }
                                        }
                                        hg7Var = hg7Var3;
                                    }
                                } catch (java.lang.Exception e37) {
                                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.X2C.X2CLayoutCachePool", e37, "loadX2CPreloadData", new java.lang.Object[0]);
                                    hg7Var = null;
                                }
                            }
                            if (hg7Var != null) {
                                long c17 = c01.id.c();
                                if (com.tencent.mars.xlog.Log.isDebug()) {
                                    xn5.e1 e1Var4 = xn5.e1.f455663a;
                                    xn5.g1.b(hg7Var);
                                }
                                java.util.LinkedList layoutList4 = hg7Var.f376141e;
                                kotlin.jvm.internal.o.f(layoutList4, "layoutList");
                                java.util.Iterator it6 = layoutList4.iterator();
                                while (it6.hasNext()) {
                                    r45.ig7 ig7Var3 = (r45.ig7) it6.next();
                                    if (appCompatActivity.isFinishing() || appCompatActivity.mo133getLifecycle().b() == androidx.lifecycle.n.DESTROYED) {
                                        str = u17;
                                        xn5.e1 e1Var5 = xn5.e1.f455663a;
                                        com.tencent.mars.xlog.Log.i("MicroMsg.X2C.X2CLayoutCachePool", "context is Finishing or Destroy");
                                        break;
                                    }
                                    xn5.p0 p0Var3 = xn5.q0.f455702a;
                                    xn5.q0.f455708g.set(java.lang.Boolean.TRUE);
                                    c01.id.c();
                                    long nanoTime = java.lang.System.nanoTime();
                                    if (com.tencent.mars.xlog.Log.isDebug()) {
                                        xn5.e1 e1Var6 = xn5.e1.f455663a;
                                        appCompatActivity.getResources().getResourceName(ig7Var3.f377040d);
                                    }
                                    if (ig7Var3.f377041e == 1) {
                                        it = it6;
                                        inflate = b17.inflate(ig7Var3.f377040d, (android.view.ViewGroup) xn5.e1.f455665c, false);
                                    } else {
                                        it = it6;
                                        inflate = b17.inflate(ig7Var3.f377040d, (android.view.ViewGroup) null);
                                    }
                                    if (inflate != null) {
                                        inflate.setTag(com.tencent.mm.R.id.psd, inflate.getLayoutParams());
                                        long nanoTime2 = java.lang.System.nanoTime() - nanoTime;
                                        java.util.concurrent.ConcurrentHashMap concurrentHashMap = xn5.e1.f455664b;
                                        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                                        layoutInflater = b17;
                                        sb7.append(context2.hashCode());
                                        sb7.append('_');
                                        context = context2;
                                        sb7.append(ig7Var3.f377040d);
                                        sb7.append('_');
                                        sb7.append(ig7Var3.f377041e);
                                        java.lang.String sb8 = sb7.toString();
                                        java.lang.Object obj3 = concurrentHashMap.get(sb8);
                                        if (obj3 == null) {
                                            str2 = u17;
                                            obj3 = new xn5.a1(null, 1, null);
                                            java.lang.Object putIfAbsent = concurrentHashMap.putIfAbsent(sb8, obj3);
                                            if (putIfAbsent != null) {
                                                obj3 = putIfAbsent;
                                            }
                                        } else {
                                            str2 = u17;
                                        }
                                        ((xn5.a1) obj3).f455646a.add(new xn5.b1(inflate, nanoTime2));
                                    } else {
                                        context = context2;
                                        layoutInflater = b17;
                                        str2 = u17;
                                    }
                                    if (com.tencent.mars.xlog.Log.isDebug()) {
                                        xn5.e1 e1Var7 = xn5.e1.f455663a;
                                        appCompatActivity.getResources().getResourceName(ig7Var3.f377040d);
                                        c01.id.c();
                                    }
                                    xn5.q0.f455708g.set(java.lang.Boolean.FALSE);
                                    u17 = str2;
                                    it6 = it;
                                    b17 = layoutInflater;
                                    context2 = context;
                                }
                                str = u17;
                                xn5.e1 e1Var8 = xn5.e1.f455663a;
                                com.tencent.mars.xlog.Log.i("MicroMsg.X2C.X2CLayoutCachePool", "preload taskId:" + this.f455734d + " activityName:" + hg7Var.f376140d + " size:" + hg7Var.f376141e.size() + " cost:" + (c01.id.c() - c17));
                                f0Var2 = f0Var;
                            } else {
                                str = u17;
                                f0Var2 = null;
                            }
                            if (f0Var2 != null) {
                                return f0Var;
                            }
                            xn5.e1 e1Var9 = xn5.e1.f455663a;
                            com.tencent.mars.xlog.Log.i("MicroMsg.X2C.X2CLayoutCachePool", "preload taskId:" + this.f455734d + " not found layoutStrategy " + str);
                            return f0Var;
                        }
                    } else {
                        f0Var = f0Var3;
                    }
                    java.lang.StringBuilder sb9 = new java.lang.StringBuilder("PreloadLayoutTask inflate context:");
                    sb9.append(context2);
                    sb9.append(" resource:");
                    sb9.append(jVar);
                    sb9.append(", density: ");
                    sb9.append((jVar == null || (fVar2 = jVar.f297961e) == null || (e18 = fVar2.e()) == null) ? null : java.lang.Float.valueOf(e18.density));
                    sb9.append(" appDensity:");
                    sb9.append((jVar2 == null || (fVar = jVar2.f297961e) == null || (e17 = fVar.e()) == null) ? null : java.lang.Float.valueOf(e17.density));
                    sb9.append(" uimode:");
                    sb9.append((jVar == null || (configuration2 = jVar.getConfiguration()) == null) ? null : java.lang.Integer.valueOf(configuration2.uiMode));
                    sb9.append(" densityDpi:");
                    sb9.append((jVar == null || (configuration = jVar.getConfiguration()) == null) ? null : java.lang.Integer.valueOf(configuration.densityDpi));
                    com.tencent.mars.xlog.Log.e("MicroMsg.X2C.X2CLayoutCachePool", sb9.toString());
                    return f0Var;
                }
            }
        }
        return f0Var3;
    }
}
