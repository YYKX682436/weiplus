package yg;

/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.magicbrush.MagicBrush f462025a;

    public b(com.tencent.magicbrush.MagicBrush magicbrush) {
        kotlin.jvm.internal.o.g(magicbrush, "magicbrush");
        this.f462025a = magicbrush;
    }

    public static android.graphics.Bitmap e(yg.b bVar, android.graphics.Bitmap bitmap, int i17, java.lang.Object obj) {
        android.graphics.Bitmap a17;
        if ((i17 & 1) != 0) {
            bitmap = null;
        }
        com.tencent.magicbrush.ui.MagicBrushView f17 = bVar.f(0);
        if (f17 == null) {
            return null;
        }
        gh.r rVar = f17.f48652e;
        if (rVar instanceof android.view.TextureView) {
            ah.i.b("MagicBrushView", "hy: trigger get bitmap in texture view. need sync ui thread", new java.lang.Object[0]);
            android.os.Handler handler = hh.i.f281443a;
            hh.h hVar = new hh.h(new hh.i$$a(new gh.b0(bitmap, rVar)));
            hh.i.b(hVar);
            a17 = (android.graphics.Bitmap) hVar.b();
        } else {
            ah.i.b("MagicBrushView", "hy: trigger get bitmap int other views", new java.lang.Object[0]);
            com.tencent.magicbrush.MagicBrush magicBrush = f17.f48658n;
            if (magicBrush == null) {
                kotlin.jvm.internal.o.o("magicbrush");
                throw null;
            }
            a17 = magicBrush.f48591o.a(f17.virtualElementId, -1, true);
        }
        return a17;
    }

    public final android.graphics.Bitmap a(int i17, int i18, boolean z17) {
        return b(i17, i18, z17, 2500L);
    }

    public final android.graphics.Bitmap b(final int i17, final int i18, final boolean z17, long j17) {
        java.lang.Object obj = null;
        if (i18 <= 0 && !z17) {
            return null;
        }
        if (this.f462025a.f48583g.g()) {
            return c(i17, i18, z17);
        }
        if (!z17) {
            ah.i.b("MagicBrush", "captureCanvasOnOtherThread", new java.lang.Object[0]);
            ch.g gVar = this.f462025a.f48583g;
            java.util.concurrent.Callable callable = new java.util.concurrent.Callable() { // from class: yg.b$$a
                @Override // java.util.concurrent.Callable
                public final java.lang.Object call() {
                    yg.b this$0 = yg.b.this;
                    kotlin.jvm.internal.o.g(this$0, "this$0");
                    return this$0.c(i17, i18, z17);
                }
            };
            gVar.getClass();
            hh.h hVar = new hh.h(callable);
            ch.a aVar = gVar.f41184d;
            if (aVar.g()) {
                hVar.run();
            } else {
                aVar.k(hVar, false);
            }
            android.graphics.Bitmap bitmap = (android.graphics.Bitmap) hVar.b();
            java.lang.Object[] objArr = new java.lang.Object[1];
            objArr[0] = java.lang.Boolean.valueOf(bitmap == null);
            ah.i.b("MagicBrush", "ca done %b", objArr);
            return bitmap;
        }
        ah.i.b("MagicBrush", "hy: captureCanvasOnOtherThreadWaitingSwapDone", new java.lang.Object[0]);
        yg.c cVar = new yg.c(j17, this, i17, i18, z17);
        ch.g gVar2 = this.f462025a.f48583g;
        if (gVar2 == null) {
            ah.i.f4715a.d("MicroMsg.SDK.SyncTask", "null handler, task in exec thread, return now", new java.lang.Object[0]);
            cVar.a();
        } else {
            ah.i.b("MicroMsg.SDK.SyncTask", "sync task exec...", new java.lang.Object[0]);
            cVar.f281437c = android.os.SystemClock.elapsedRealtime();
            try {
                synchronized (cVar.f281436b) {
                    ah.i.b("MicroMsg.SDK.SyncTask", "sync task exec at synchronized", new java.lang.Object[0]);
                    gVar2.k(cVar.f281440f, false);
                    cVar.f281436b.wait(j17);
                }
            } catch (java.lang.InterruptedException e17) {
                ah.i.c("MicroMsg.SDK.SyncTask", e17, "", new java.lang.Object[0]);
            }
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - cVar.f281437c;
            ah.i.b("MicroMsg.SDK.SyncTask", "sync task done, return=%s, cost=%d(wait=%d, run=%d)", "" + cVar.f281435a, java.lang.Long.valueOf(elapsedRealtime), java.lang.Long.valueOf(cVar.f281438d), java.lang.Long.valueOf(elapsedRealtime - cVar.f281438d));
            obj = cVar.f281435a;
        }
        android.graphics.Bitmap bitmap2 = (android.graphics.Bitmap) obj;
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        objArr2[0] = java.lang.Boolean.valueOf(bitmap2 == null);
        ah.i.b("MagicBrush.MBCanvasHandler", "hy: is ret bitmap is null? %b", objArr2);
        return bitmap2;
    }

    public final android.graphics.Bitmap c(int i17, int i18, boolean z17) {
        com.tencent.magicbrush.MagicBrush magicBrush = this.f462025a;
        if (magicBrush.f48577a == 0) {
            return null;
        }
        return z17 ? magicBrush.nativeCaptureScreen(magicBrush.f48577a, i17) : magicBrush.nativeCaptureCanvas(magicBrush.f48577a, i18);
    }

    public final android.graphics.Bitmap d() {
        return e(this, null, 1, null);
    }

    public final com.tencent.magicbrush.ui.MagicBrushView f(int i17) {
        com.tencent.magicbrush.ui.MagicBrushView findOrNull = this.f462025a.f48590n.findOrNull(i17);
        if (findOrNull != null) {
            return findOrNull;
        }
        g8.g.a("MagicBrush", "findView [%d] but can not find. thread = [%s]", java.lang.Integer.valueOf(i17), java.lang.Thread.currentThread());
        return null;
    }
}
