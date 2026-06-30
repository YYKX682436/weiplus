package yf1;

/* loaded from: classes7.dex */
public class d implements u81.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yf1.e f461637d;

    public d(yf1.e eVar) {
        this.f461637d = eVar;
    }

    @Override // u81.f
    public void D(java.lang.String str, u81.b bVar) {
        final wf.b bVar2;
        yf1.e eVar = this.f461637d;
        if (str.equalsIgnoreCase(eVar.f461640c)) {
            if (bVar != u81.b.BACKGROUND) {
                if (bVar != u81.b.FOREGROUND || (bVar2 = eVar.f461638a) == null) {
                    return;
                }
                bVar2.getClass();
                bVar2.L(new java.lang.Runnable() { // from class: wf.b$$r
                    @Override // java.lang.Runnable
                    public final void run() {
                        java.util.concurrent.atomic.AtomicBoolean atomicBoolean;
                        wf.b bVar3 = wf.b.this;
                        bVar3.G = false;
                        com.tencent.mars.xlog.Log.i(bVar3.w(), "onRuntimeEnterForeground, mIsWebViewInBackground: %b, mPassiveMute: %b", java.lang.Boolean.valueOf(bVar3.H), java.lang.Boolean.valueOf(bVar3.A));
                        if (!bVar3.H && ((bVar3.A && !bVar3.B) || !bVar3.y())) {
                            if (bVar3.A) {
                                com.tencent.mars.xlog.Log.i(bVar3.w(), "onRuntimeEnterForeground, passiveMute, unMute");
                                bVar3.P();
                            }
                            if (bVar3.z()) {
                                com.tencent.mars.xlog.Log.i(bVar3.w(), "onRuntimeEnterForeground, isPlaying, requestFocus");
                                bVar3.f445434z.requestFocus();
                            }
                        }
                        if (bVar3.H || (atomicBoolean = bVar3.I) == null) {
                            return;
                        }
                        boolean z17 = atomicBoolean.get();
                        bVar3.I = null;
                        if (z17) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.SameLayer.LivePlayerPluginHandler", "onRuntimeEnterForeground, isPlayingWhenEnterBackground, try resume");
                            wf.a aVar = bVar3.f445418i;
                            if (aVar == null) {
                                com.tencent.mars.xlog.Log.w(bVar3.w(), "onRuntimeEnterForeground, adapter is null");
                            } else {
                                aVar.c();
                            }
                        }
                    }
                });
                return;
            }
            final wf.b bVar3 = eVar.f461638a;
            if (bVar3 != null) {
                final int b17 = tf1.h.b(str);
                bVar3.getClass();
                bVar3.L(new java.lang.Runnable() { // from class: wf.b$$o
                    @Override // java.lang.Runnable
                    public final void run() {
                        wf.b bVar4 = wf.b.this;
                        bVar4.G = true;
                        wf.a aVar = bVar4.f445418i;
                        if (aVar == null || bVar4.I != null) {
                            return;
                        }
                        boolean isPlaying = ((wf.r) aVar).isPlaying();
                        bVar4.I = new java.util.concurrent.atomic.AtomicBoolean(isPlaying);
                        com.tencent.mars.xlog.Log.i("MicroMsg.SameLayer.LivePlayerPluginHandler", "onRuntimeEnterBackground, isPlayingWhenEnterBackground:%s", java.lang.Boolean.valueOf(isPlaying));
                        com.tencent.mars.xlog.Log.i(bVar4.w(), "onRuntimeEnterBackground, abandonFocus");
                        bVar4.f445434z.a();
                        if (bVar4.T && bVar4.t()) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.SameLayer.LivePlayerPluginHandler", "onRuntimeEnterBackground, background play audio is enabled");
                            return;
                        }
                        if (bVar4.f445421o != null) {
                            com.tencent.mm.plugin.appbrand.AppBrandRuntime a17 = tf1.h.a(bVar4.f445422p);
                            xf1.i iVar = a17 != null ? (xf1.i) a17.k(xf1.i.class) : null;
                            if (iVar != null ? iVar.d(bVar4, b17) : false) {
                                com.tencent.mars.xlog.Log.i(bVar4.w(), "onRuntimeEnterBackground, should intercept enter background, return");
                                return;
                            }
                        }
                        ((wf.r) bVar4.f445418i).d();
                        if (isPlaying) {
                            bVar4.B("stop");
                        }
                    }
                });
            }
        }
    }
}
