package gk4;

/* loaded from: classes10.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gk4.r f272590d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(gk4.r rVar) {
        super(1);
        this.f272590d = rVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean z17;
        java.lang.Object obj2;
        um5.a0 a0Var;
        dk4.a aVar;
        android.graphics.Bitmap bitmap;
        java.lang.Object[] objArr;
        dk4.a aVar2;
        hk4.a it = (hk4.a) obj;
        kotlin.jvm.internal.o.g(it, "it");
        int a17 = gk4.r.a(this.f272590d, it);
        com.tencent.mars.xlog.Log.i(this.f272590d.f272602g, "onPlayStarted, playerMediaIndex:" + a17 + ", playStatus:" + this.f272590d.f272611p);
        gk4.r rVar = this.f272590d;
        rVar.getClass();
        java.lang.String str = "setPlayerSurface type:" + it.d();
        java.lang.String str2 = rVar.f272602g;
        com.tencent.mars.xlog.Log.i(str2, str);
        hk4.b d17 = it.d();
        hk4.b bVar = hk4.b.f281933e;
        um5.i0 i0Var = rVar.f272603h;
        android.graphics.SurfaceTexture surfaceTexture = null;
        r9 = null;
        java.lang.String str3 = null;
        surfaceTexture = null;
        if (d17 == bVar) {
            hk4.n nVar = (hk4.n) it;
            gk4.s sVar = it.f281929h;
            if (sVar != null && (aVar2 = sVar.f272629h) != null) {
                str3 = aVar2.f234482s;
            }
            if (str3 != null && (bitmap = nVar.f281963r) != null) {
                com.tencent.mars.xlog.Log.i(str2, "set imagePlayer surface key:".concat(str3));
                i0Var.getClass();
                java.lang.String str4 = i0Var.f429167t;
                xm5.b.c(str4, "newBitmapInputTexture:".concat(str3), new java.lang.Object[0]);
                java.util.concurrent.ConcurrentLinkedDeque concurrentLinkedDeque = i0Var.f429168u;
                if (!(concurrentLinkedDeque instanceof java.util.Collection) || !concurrentLinkedDeque.isEmpty()) {
                    java.util.Iterator it6 = concurrentLinkedDeque.iterator();
                    while (it6.hasNext()) {
                        if (kotlin.jvm.internal.o.b(((um5.z) it6.next()).f429228a, str3)) {
                            objArr = true;
                            break;
                        }
                    }
                }
                objArr = false;
                if (objArr == true) {
                    xm5.b.c(str4, "newBitmapInputTexture, already contains same key", new java.lang.Object[0]);
                } else {
                    i0Var.f(new um5.d0(i0Var, bitmap, str3, nVar.f281964s));
                }
                it.f281930i = str3;
                it.f281931j = true;
                rVar.l();
            }
        } else {
            hk4.x xVar = (hk4.x) it;
            int i17 = xVar.f281989o;
            int i18 = xVar.f281990p;
            int i19 = xVar.f281991q;
            hk4.o oVar = new hk4.o(i17, i18, i19);
            gk4.s sVar2 = it.f281929h;
            java.lang.String str5 = (sVar2 == null || (aVar = sVar2.f272629h) == null) ? null : aVar.f234482s;
            if (str5 != null) {
                com.tencent.mars.xlog.Log.i(str2, "set videoPlayer surface key:" + str5 + ", video mediaInfo:" + oVar);
                gk4.k kVar = new gk4.k(rVar, xVar, it);
                i0Var.getClass();
                java.lang.String str6 = i0Var.f429167t;
                xm5.b.c(str6, "newVideoInputTexture:".concat(str5), new java.lang.Object[0]);
                java.util.concurrent.ConcurrentLinkedDeque concurrentLinkedDeque2 = i0Var.f429168u;
                if (!(concurrentLinkedDeque2 instanceof java.util.Collection) || !concurrentLinkedDeque2.isEmpty()) {
                    java.util.Iterator it7 = concurrentLinkedDeque2.iterator();
                    while (it7.hasNext()) {
                        if (kotlin.jvm.internal.o.b(((um5.z) it7.next()).f429228a, str5)) {
                            z17 = true;
                            break;
                        }
                    }
                }
                z17 = false;
                if (z17) {
                    xm5.b.c(str6, "newVideoInputTexture, already contains same key", new java.lang.Object[0]);
                    java.util.Iterator it8 = concurrentLinkedDeque2.iterator();
                    while (true) {
                        if (!it8.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it8.next();
                        if (kotlin.jvm.internal.o.b(((um5.z) obj2).f429228a, str5)) {
                            break;
                        }
                    }
                    um5.z zVar = (um5.z) obj2;
                    if (zVar != null && (a0Var = zVar.f429229b) != null) {
                        surfaceTexture = a0Var.f429133f;
                    }
                    kVar.invoke(surfaceTexture);
                } else {
                    i0Var.f(new um5.g0(i0Var, i17, i18, i19, str5, kVar));
                }
                it.f281930i = str5;
            }
        }
        this.f272590d.d(a17 + 1);
        if (this.f272590d.f272611p == gk4.e.f272546h) {
            this.f272590d.f272611p = gk4.e.f272543e;
        }
        if (this.f272590d.f272611p == gk4.e.f272543e) {
            gk4.r rVar2 = this.f272590d;
            if (a17 >= 0) {
                java.util.ArrayList arrayList = rVar2.f272610o;
                if (a17 < arrayList.size()) {
                    com.tencent.mars.xlog.Log.i(rVar2.f272602g, "callNextMediaChange index:" + a17);
                    java.lang.Object obj3 = arrayList.get(a17);
                    kotlin.jvm.internal.o.f(obj3, "get(...)");
                    dk4.a aVar3 = (dk4.a) obj3;
                    pk4.u uVar = rVar2.f272597b;
                    if (uVar != null) {
                        uVar.a(a17, aVar3);
                    }
                }
            } else {
                rVar2.getClass();
            }
        }
        gk4.r rVar3 = this.f272590d;
        if (rVar3.f272598c) {
            rVar3.c();
        }
        return jz5.f0.f302826a;
    }
}
