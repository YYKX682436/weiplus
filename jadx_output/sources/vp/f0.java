package vp;

/* loaded from: classes16.dex */
public class f0 implements android.os.Handler.Callback {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f438771d;

    public f0(vp.d dVar, vp.e0 e0Var) {
        this.f438771d = new java.lang.ref.WeakReference(dVar);
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(android.os.Message message) {
        long a17;
        xp.a aVar;
        vp.d dVar = (vp.d) this.f438771d.get();
        if (dVar == null) {
            return false;
        }
        switch (message.what) {
            case 1:
                dVar.f438742e = false;
                dVar.f438754t = true;
                yp.b bVar = dVar.f438740J.f438724d;
                if (!bVar.f464372a) {
                    com.tencent.mars.xlog.Log.i("DanmakuDrawer", java.lang.String.format("set AsyncDrawContextValid:%b", java.lang.Boolean.TRUE));
                }
                bVar.f464372a = true;
                java.lang.Object obj = message.obj;
                if (obj != null) {
                    dVar.f438753s = ((java.lang.Long) obj).longValue();
                } else {
                    dVar.f438753s = 0L;
                }
                dVar.f438759y = 0;
                dVar.f438760z = 0;
                dVar.A = 0;
                zp.e eVar = dVar.f438751q;
                eVar.getClass();
                eVar.f474910c = android.os.SystemClock.uptimeMillis();
                zp.e eVar2 = dVar.f438751q;
                eVar2.f474908a = 0L;
                eVar2.f474909b = 0L;
                if (com.tencent.mars.xlog.Log.getLogLevel() <= 2) {
                    com.tencent.mars.xlog.Log.i(dVar.f438741d, "message start:startTime:" + dVar.f438753s);
                }
                dVar.m();
                break;
            case 2:
                dVar.m();
                break;
            case 3:
                dVar.l();
                break;
            case 4:
                dVar.r();
                if (dVar.f438744g && !dVar.f438742e && dVar.f438743f) {
                    if (dVar.M == 0 && dVar.N != null) {
                        android.view.Choreographer.getInstance().postFrameCallback(dVar.N);
                    }
                    long uptimeMillis = android.os.SystemClock.uptimeMillis();
                    if (dVar.G.g()) {
                        a17 = android.os.SystemClock.uptimeMillis() - dVar.f438752r;
                    } else {
                        long uptimeMillis2 = android.os.SystemClock.uptimeMillis();
                        long j17 = dVar.E;
                        if (uptimeMillis2 - j17 >= 200 || dVar.R) {
                            dVar.R = false;
                            dVar.E = uptimeMillis2;
                            xp.g gVar = dVar.G.f455835c;
                            a17 = gVar == null ? -1L : gVar.a();
                            dVar.F = a17;
                        } else {
                            a17 = (dVar.F + uptimeMillis2) - j17;
                        }
                    }
                    dVar.f438750p.f474914a = a17;
                    zp.e eVar3 = dVar.f438751q;
                    eVar3.getClass();
                    long uptimeMillis3 = android.os.SystemClock.uptimeMillis() - eVar3.f474910c;
                    eVar3.f474909b = uptimeMillis3;
                    eVar3.f474908a += uptimeMillis3;
                    eVar3.f474910c = android.os.SystemClock.uptimeMillis();
                    com.tencent.mars.xlog.Log.getLogLevel();
                    if (dVar.f438754t) {
                        dVar.f438740J.a();
                        dVar.f438754t = false;
                    }
                    try {
                        if (com.tencent.mars.xlog.Log.getLogLevel() <= 1) {
                            dVar.f438756v = android.os.SystemClock.uptimeMillis();
                        }
                        dVar.t();
                        if (com.tencent.mars.xlog.Log.getLogLevel() <= 1) {
                            dVar.f438757w = android.os.SystemClock.uptimeMillis();
                        }
                        dVar.o();
                        if (com.tencent.mars.xlog.Log.getLogLevel() <= 1) {
                            dVar.f438758x = android.os.SystemClock.uptimeMillis();
                        }
                        dVar.g();
                        dVar.p();
                    } catch (java.lang.Throwable th6) {
                        com.tencent.mars.xlog.Log.e(dVar.f438741d, th6.toString() + th6);
                    }
                    dVar.s((16 + uptimeMillis) - android.os.SystemClock.uptimeMillis());
                    break;
                }
                break;
            case 5:
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleSeek() msg.obj is null = ");
                sb6.append(message.obj == null);
                com.tencent.mars.xlog.Log.i(dVar.f438741d, sb6.toString());
                java.lang.Object obj2 = message.obj;
                if (obj2 != null) {
                    dVar.f438753s = ((java.lang.Long) obj2).longValue();
                    dVar.f438754t = true;
                    dVar.m();
                }
                com.tencent.mars.xlog.Log.getLogLevel();
                break;
            case 6:
                com.tencent.mars.xlog.Log.i(dVar.f438741d, "handleQuit()");
                dVar.f438742e = true;
                dVar.p();
                dVar.G.a();
                dVar.f438746i.b();
                dVar.f438748n.a();
                com.tencent.mars.xlog.Log.i(dVar.f438741d, "message quit");
                break;
            case 7:
                java.lang.Object obj3 = message.obj;
                if (!(obj3 instanceof xp.d)) {
                    java.lang.String str = dVar.f438741d;
                    com.tencent.mars.xlog.Log.i(str, "handleConfigChanged()");
                    dVar.f438740J.d();
                    dVar.f438746i.d();
                    com.tencent.mars.xlog.Log.i(str, "message config changed");
                    break;
                } else {
                    xp.d dVar2 = (xp.d) obj3;
                    java.lang.String str2 = dVar.f438741d;
                    com.tencent.mars.xlog.Log.i(str2, "handleConfigChanged with context!");
                    dVar.G = dVar2;
                    dVar.f438749o.f438766d = dVar2;
                    dVar.f438747m.f438836a = dVar2;
                    vp.a aVar2 = dVar.f438740J;
                    aVar2.f438725e = dVar2;
                    if (!(dVar.f438745h instanceof yp.l) && (aVar = dVar2.f455840h) != null) {
                        dVar.L.f438777e = aVar.f455811i;
                    }
                    aVar2.d();
                    dVar.f438746i.d();
                    com.tencent.mars.xlog.Log.i(str2, "message config changed with context!");
                    break;
                }
            case 8:
                com.tencent.mars.xlog.Log.i(dVar.f438741d, "handleRelease()");
                vp.g0 g0Var = dVar.L;
                if (g0Var.f438774b != null && !g0Var.f438775c.booleanValue()) {
                    g0Var.f438774b.quitSafely();
                }
                g0Var.f438774b = null;
                dVar.f438749o.getClass();
                dVar.f438748n.getClass();
                break;
            case 9:
                com.tencent.mars.xlog.Log.i(dVar.f438741d, "handleClear()");
                dVar.f438740J.a();
                dVar.G.a();
                dVar.f438746i.b();
                break;
            case 10:
                dVar.k();
                break;
            case 11:
                com.tencent.mars.xlog.Log.i("surface_lock", "handleClearDrawingCache");
                dVar.r();
                if (dVar.f438744g) {
                    dVar.e();
                    break;
                }
                break;
            case 12:
                dVar.p();
                dVar.s(4L);
                break;
            case 13:
                dVar.g();
                break;
            case 14:
                vp.a aVar3 = dVar.f438740J;
                if (aVar3 instanceof vp.z0) {
                    vp.z0 z0Var = (vp.z0) aVar3;
                    z0Var.getClass();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.util.Iterator it = ((java.util.ArrayList) z0Var.f438879n).iterator();
                    while (it.hasNext()) {
                        arrayList.addAll((java.util.List) it.next());
                    }
                    com.tencent.mars.xlog.Log.i(z0Var.f438874i, "getDrawingDanmakuList: size = %d" + arrayList.size());
                    java.util.Iterator it6 = arrayList.iterator();
                    while (it6.hasNext()) {
                        wp.a aVar4 = (wp.a) it6.next();
                        dVar.G.c(aVar4).h(aVar4, false, null);
                    }
                    break;
                }
                break;
            case 15:
                java.lang.Object obj4 = message.obj;
                if (obj4 instanceof wp.e) {
                    wp.e eVar4 = (wp.e) obj4;
                    dVar.P = eVar4;
                    yp.j jVar = dVar.f438745h;
                    if (jVar.getView() instanceof com.tencent.mm.danmaku.render.NativeDanmakuView) {
                        ((com.tencent.mm.danmaku.render.NativeDanmakuView) jVar.getView()).setDrawMask(eVar4);
                        break;
                    }
                }
                break;
        }
        return false;
    }
}
