package yf1;

/* loaded from: classes7.dex */
public class e implements xf.a {

    /* renamed from: a, reason: collision with root package name */
    public wf.b f461638a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.extendplugin.b f461639b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f461640c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f461641d = false;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f461642e = false;

    /* renamed from: f, reason: collision with root package name */
    public final u81.f f461643f = new yf1.d(this);

    public java.lang.String a(boolean z17, androidx.lifecycle.y yVar, tf.w wVar) {
        fb1.c ec6 = fb1.e.f260836e.ec(fb1.d.f260834i, z17, new yf1.c(this, yVar, wVar));
        com.tencent.mars.xlog.Log.i("MicroMsg.SameLayer.AppBrandLivePlayerCustomHandler", "checkCanInsertLivePlayer, status: %s", ec6);
        if (ec6 instanceof fb1.a) {
            return ((fb1.a) ec6).f260827a;
        }
        return null;
    }

    public void b(sf.f fVar, android.os.Bundle bundle) {
        com.tencent.mm.plugin.appbrand.AppBrandRuntime a17 = tf1.h.a(fVar);
        if (a17 != null) {
            this.f461640c = a17.f74803n;
            a17.N.a(this.f461643f);
            boolean z17 = bundle.getBoolean(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.IS_VOIP, this.f461641d);
            this.f461641d = z17;
            if (z17) {
                xf1.i iVar = (xf1.i) a17.k(xf1.i.class);
                if (iVar != null) {
                    wf.b bVar = this.f461638a;
                    iVar.f454240g.add(bVar);
                    com.tencent.mars.xlog.Log.i(iVar.f454237d, "registerLivePlayer:%s", bVar.g());
                    return;
                }
                xf1.i iVar2 = new xf1.i(a17);
                a17.l(iVar2);
                wf.b bVar2 = this.f461638a;
                iVar2.f454240g.add(bVar2);
                com.tencent.mars.xlog.Log.i(iVar2.f454237d, "registerLivePlayer:%s", bVar2.g());
            }
        }
    }

    public void c(int i17, int i18, android.os.Bundle bundle) {
        com.tencent.mm.plugin.appbrand.extendplugin.b bVar;
        com.tencent.mm.plugin.appbrand.extendplugin.b bVar2;
        if (this.f461642e) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SameLayer.AppBrandLivePlayerCustomHandler", "onXWebLivePlayerEvent, released");
            return;
        }
        if (i18 != -2301) {
            if (i18 == 2004) {
                if (this.f461641d) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.SameLayer.AppBrandLivePlayerCustomHandler", "markVideoPlayStart, is voip mode");
                    return;
                }
                if (this.f461638a == null || (bVar2 = this.f461639b) == null) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.SameLayer.AppBrandLivePlayerCustomHandler", "markVideoPlayStart, mPluginHandler or mInvokeContext is null");
                    return;
                }
                tf1.f a17 = tf.k.a(bVar2);
                if (a17 == null) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.SameLayer.AppBrandLivePlayerCustomHandler", "markVideoPlayStart, audioOfVideoBackgroundPlayManager is null");
                    return;
                } else {
                    a17.n(this.f461638a);
                    return;
                }
            }
            if (i18 != 2006) {
                return;
            }
        }
        if (this.f461641d) {
            com.tencent.mars.xlog.Log.w("MicroMsg.SameLayer.AppBrandLivePlayerCustomHandler", "markVideoPlayPauseOrStop, is voip mode");
            return;
        }
        if (this.f461638a == null || (bVar = this.f461639b) == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.SameLayer.AppBrandLivePlayerCustomHandler", "markVideoPlayPauseOrStop, pluginHandler or invokeContext is null");
            return;
        }
        tf1.f a18 = tf.k.a(bVar);
        if (a18 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.SameLayer.AppBrandLivePlayerCustomHandler", "markVideoPlayPauseOrStop, audioOfVideoBackgroundPlayManager is null");
        } else {
            a18.m(this.f461638a, true);
        }
    }

    public void d(sf.f fVar, android.graphics.Bitmap bitmap) {
        if (fVar instanceof com.tencent.mm.plugin.appbrand.extendplugin.b) {
            if (bitmap == null || bitmap.isRecycled()) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SameLayer.AppBrandLivePlayerCustomHandler", "operateSnapshot, bitmap is null");
                fVar.a(jc1.g.f298934f);
                return;
            }
            com.tencent.mm.plugin.appbrand.jsapi.l m17 = fVar.m();
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            ik1.b0 b0Var = new ik1.b0();
            if (m17.getFileSystem() == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SameLayer.AppBrandLivePlayerCustomHandler", "operateSnapshot, file system is null");
                e(bitmap);
                fVar.a(jc1.f.f298915d);
                return;
            }
            com.tencent.mm.vfs.r6 allocTempFile = m17.getFileSystem().allocTempFile("liveplayer_" + java.lang.System.currentTimeMillis() + com.tencent.kinda.framework.widget.tools.ResourcesUtils.JPG);
            jc1.d dVar = jc1.g.f298935g;
            if (allocTempFile == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SameLayer.AppBrandLivePlayerCustomHandler", "operateSnapshot, tempFile is null");
                e(bitmap);
                fVar.a(dVar);
                return;
            }
            try {
                com.tencent.mm.sdk.platformtools.x.D0(bitmap, 90, android.graphics.Bitmap.CompressFormat.JPEG, allocTempFile.o(), true);
                if (m17.getFileSystem().createTempFileFrom(allocTempFile, "jpg", true, b0Var) != com.tencent.mm.plugin.appbrand.appstorage.j1.OK) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.SameLayer.AppBrandLivePlayerCustomHandler", "operateSnapshot, save snapshot failed");
                    e(bitmap);
                    fVar.a(dVar);
                    return;
                }
                com.tencent.mm.vfs.r6 absoluteFile = m17.getFileSystem().getAbsoluteFile((java.lang.String) b0Var.f291824a);
                com.tencent.mars.xlog.Log.i("MicroMsg.SameLayer.AppBrandLivePlayerCustomHandler", "operateSnapshot, realPath: %s, path:%s", (absoluteFile == null || !absoluteFile.m()) ? "" : com.tencent.mm.vfs.w6.i(absoluteFile.o(), false), b0Var.f291824a);
                e(bitmap);
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put("tempImagePath", b0Var.f291824a);
                hashMap.put("width", java.lang.Integer.valueOf(width));
                hashMap.put("height", java.lang.Integer.valueOf(height));
                fVar.b(jc1.f.f298912a, hashMap);
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SameLayer.AppBrandLivePlayerCustomHandler", "operateSnapshot, save bitmap exception", e17);
                e(bitmap);
                fVar.a(dVar);
            }
        }
    }

    public final void e(android.graphics.Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SameLayer.AppBrandLivePlayerCustomHandler", "bitmap recycle " + bitmap.toString());
        bitmap.recycle();
    }
}
