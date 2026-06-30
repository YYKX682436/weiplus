package vp;

/* loaded from: classes16.dex */
public class i0 implements android.os.Handler.Callback {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f438779d;

    public i0(vp.k kVar, vp.h0 h0Var) {
        this.f438779d = new java.lang.ref.WeakReference(kVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.os.Handler.Callback
    public boolean handleMessage(android.os.Message message) {
        xp.a aVar;
        vp.k kVar = (vp.k) this.f438779d.get();
        if (kVar == null) {
            return false;
        }
        switch (message.what) {
            case 1:
                kVar.f438788d = false;
                kVar.f438800s = true;
                yp.b bVar = kVar.I.f438855c;
                if (!bVar.f464372a) {
                    com.tencent.mars.xlog.Log.i("DanmakuDrawer", java.lang.String.format("set AsyncDrawContextValid:%b", java.lang.Boolean.TRUE));
                }
                bVar.f464372a = true;
                java.lang.Object obj = message.obj;
                if (obj != null) {
                    kVar.f438799r = ((java.lang.Long) obj).longValue();
                } else {
                    kVar.f438799r = 0L;
                }
                kVar.f438805x = 0;
                kVar.f438806y = 0;
                kVar.f438807z = 0;
                zp.e eVar = kVar.f438797p;
                eVar.getClass();
                eVar.f474910c = android.os.SystemClock.uptimeMillis();
                zp.e eVar2 = kVar.f438797p;
                eVar2.f474908a = 0L;
                eVar2.f474909b = 0L;
                vp.v0 v0Var = kVar.f438792h;
                if (v0Var.f438850l) {
                    v0Var.e();
                    v0Var.f438850l = false;
                    com.tencent.mars.xlog.Log.i("DanmakuAsyncDataSource", "Open: dataSource reopened with new channel and consumer job");
                } else {
                    com.tencent.mars.xlog.Log.i("DanmakuAsyncDataSource", "Open: dataSource is already open");
                }
                if (com.tencent.mars.xlog.Log.getLogLevel() <= 2) {
                    com.tencent.mars.xlog.Log.i("DanmakuControllerAsync", "message start:startTime:" + kVar.f438799r);
                }
                kVar.o();
                return false;
            case 2:
                kVar.o();
                return false;
            case 3:
                kVar.m();
                return false;
            case 4:
                kVar.r();
                if (kVar.f438790f && !kVar.f438788d && kVar.f438789e) {
                    if (kVar.L == 0 && kVar.M != null) {
                        android.view.Choreographer.getInstance().postFrameCallback(kVar.M);
                    }
                    long uptimeMillis = android.os.SystemClock.uptimeMillis();
                    kVar.f438796o.f474914a = kVar.k();
                    zp.e eVar3 = kVar.f438797p;
                    eVar3.getClass();
                    long uptimeMillis2 = android.os.SystemClock.uptimeMillis() - eVar3.f474910c;
                    eVar3.f474909b = uptimeMillis2;
                    eVar3.f474908a += uptimeMillis2;
                    eVar3.f474910c = android.os.SystemClock.uptimeMillis();
                    com.tencent.mars.xlog.Log.getLogLevel();
                    if (kVar.f438800s) {
                        kVar.I.a();
                        kVar.f438800s = false;
                    }
                    try {
                        if (com.tencent.mars.xlog.Log.getLogLevel() <= 1) {
                            kVar.f438802u = android.os.SystemClock.uptimeMillis();
                        }
                        kVar.t();
                        if (com.tencent.mars.xlog.Log.getLogLevel() <= 1) {
                            kVar.f438803v = android.os.SystemClock.uptimeMillis();
                        }
                        if (com.tencent.mars.xlog.Log.getLogLevel() <= 1) {
                            kVar.f438804w = android.os.SystemClock.uptimeMillis();
                        }
                        kVar.g();
                        kVar.p();
                    } catch (java.lang.Throwable th6) {
                        com.tencent.mars.xlog.Log.e("DanmakuControllerAsync", th6.toString() + th6);
                    }
                    kVar.s((16 + uptimeMillis) - android.os.SystemClock.uptimeMillis());
                }
                return false;
            case 5:
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleSeek() msg.obj is null = ");
                sb6.append(message.obj == null);
                com.tencent.mars.xlog.Log.i("DanmakuControllerAsync", sb6.toString());
                java.lang.Object obj2 = message.obj;
                if (obj2 != null) {
                    kVar.f438799r = ((java.lang.Long) obj2).longValue();
                    kVar.f438800s = true;
                    kVar.o();
                }
                com.tencent.mars.xlog.Log.getLogLevel();
                return false;
            case 6:
                com.tencent.mars.xlog.Log.i("DanmakuControllerAsync", "handleQuit()");
                kVar.f438788d = true;
                vp.d0 d0Var = kVar.f438795n;
                com.tencent.mm.sdk.platformtools.n3 n3Var = d0Var.f438767e;
                if (n3Var != null) {
                    n3Var.removeCallbacksAndMessages(null);
                    d0Var.f438767e = null;
                }
                android.os.Handler handler = d0Var.f438765c;
                if (handler != null) {
                    handler.removeCallbacksAndMessages(null);
                    d0Var.f438765c = null;
                }
                kVar.p();
                kVar.F.a();
                vp.v0 v0Var2 = kVar.f438792h;
                v0Var2.f438850l = true;
                kotlinx.coroutines.r2 r2Var = v0Var2.f438846h;
                if (r2Var == null) {
                    kotlin.jvm.internal.o.o("consumerJob");
                    throw null;
                }
                kotlinx.coroutines.p2.a(r2Var, null, 1, null);
                u26.w wVar = v0Var2.f438845g;
                if (wVar == null) {
                    kotlin.jvm.internal.o.o("taskChannel");
                    throw null;
                }
                u26.x0.a(wVar, null, 1, null);
                kotlinx.coroutines.r2 r2Var2 = (kotlinx.coroutines.r2) ((kotlinx.coroutines.internal.h) v0Var2.f438849k).f310496d.get(kotlinx.coroutines.q2.f310571d);
                if (r2Var2 != null) {
                    java.util.Iterator it = r2Var2.c().iterator();
                    while (it.hasNext()) {
                        ((kotlinx.coroutines.r2) it.next()).b(null);
                    }
                }
                kotlinx.coroutines.l.d(v0Var2.f438849k, null, null, new vp.p0(v0Var2, null), 3, null);
                com.tencent.mars.xlog.Log.i("DanmakuAsyncDataSource", "Close: cancelled consumer job, closed channel and cleared data");
                kVar.f438794m.a();
                com.tencent.mars.xlog.Log.i("DanmakuControllerAsync", "message quit");
                return false;
            case 7:
                java.lang.Object obj3 = message.obj;
                if (obj3 instanceof xp.d) {
                    xp.d dVar = (xp.d) obj3;
                    com.tencent.mars.xlog.Log.i("DanmakuControllerAsync", "handleConfigChanged with context!");
                    kVar.F = dVar;
                    kVar.f438795n.f438766d = dVar;
                    kVar.f438793i.f438836a = dVar;
                    vp.x0 x0Var = kVar.I;
                    x0Var.f438856d = dVar;
                    if (!(kVar.f438791g instanceof yp.l) && (aVar = dVar.f455840h) != null) {
                        kVar.K.f438785e = aVar.f455811i;
                    }
                    x0Var.e();
                    kVar.f438792h.f();
                    com.tencent.mars.xlog.Log.i("DanmakuControllerAsync", "message config changed with context!");
                } else {
                    com.tencent.mars.xlog.Log.i("DanmakuControllerAsync", "handleConfigChanged()");
                    kVar.I.e();
                    kVar.f438792h.f();
                    com.tencent.mars.xlog.Log.i("DanmakuControllerAsync", "message config changed");
                }
                return false;
            case 8:
                com.tencent.mars.xlog.Log.i("DanmakuControllerAsync", "handleRelease()");
                vp.j0 j0Var = kVar.K;
                if (j0Var.f438782b != null && !j0Var.f438783c.booleanValue()) {
                    j0Var.f438782b.quitSafely();
                }
                j0Var.f438782b = null;
                kVar.f438795n.getClass();
                kVar.f438794m.getClass();
                return false;
            case 9:
                com.tencent.mars.xlog.Log.i("DanmakuControllerAsync", "handleClear()");
                kVar.I.a();
                kVar.F.a();
                vp.v0 v0Var3 = kVar.f438792h;
                kotlinx.coroutines.l.d(v0Var3.f438849k, null, null, new vp.p0(v0Var3, null), 3, null);
                return false;
            case 10:
                kVar.l();
                return false;
            case 11:
                com.tencent.mars.xlog.Log.i("surface_lock", "handleClearDrawingCache");
                kVar.r();
                if (kVar.f438790f) {
                    kVar.e();
                }
                return false;
            case 12:
                kVar.p();
                kVar.s(4L);
                return false;
            case 13:
                kVar.g();
                return false;
            case 14:
                vp.x0 x0Var2 = kVar.I;
                if (x0Var2 instanceof vp.y0) {
                    vp.y0 y0Var = (vp.y0) x0Var2;
                    y0Var.getClass();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.util.Iterator it6 = ((java.util.ArrayList) y0Var.f438867k).iterator();
                    while (it6.hasNext()) {
                        arrayList.addAll((java.util.List) it6.next());
                    }
                    com.tencent.mars.xlog.Log.i(y0Var.f438863g, "getDrawingDanmakuList: size = %d" + arrayList.size());
                    java.util.Iterator it7 = arrayList.iterator();
                    while (it7.hasNext()) {
                        wp.a aVar2 = (wp.a) it7.next();
                        kVar.F.c(aVar2).h(aVar2, false, null);
                    }
                }
                return false;
            case 15:
                java.lang.Object obj4 = message.obj;
                if (obj4 instanceof wp.e) {
                    wp.e eVar4 = (wp.e) obj4;
                    kVar.N = eVar4;
                    yp.j jVar = kVar.f438791g;
                    if (jVar.getView() instanceof com.tencent.mm.danmaku.render.NativeDanmakuView) {
                        ((com.tencent.mm.danmaku.render.NativeDanmakuView) jVar.getView()).setDrawMask(eVar4);
                    }
                }
                return false;
            default:
                return false;
        }
    }
}
