package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class ob0 extends com.tencent.mm.plugin.finder.live.plugin.l {

    /* renamed from: p, reason: collision with root package name */
    public final qo0.c f113732p;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f113733q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.live.core.view.LiveVideoView f113734r;

    /* renamed from: s, reason: collision with root package name */
    public int f113735s;

    /* renamed from: t, reason: collision with root package name */
    public final kotlinx.coroutines.r2 f113736t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f113737u;

    /* renamed from: v, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.plugin.FinderLiveTXLivePlayerPlugin$dragCloseEventListener$1 f113738v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.tencent.mm.plugin.finder.live.plugin.FinderLiveTXLivePlayerPlugin$dragCloseEventListener$1] */
    public ob0(android.view.ViewGroup root, qo0.c statusMonitor) {
        super(root, statusMonitor, null);
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        this.f113732p = statusMonitor;
        this.f113733q = "MicroMsg.FinderLiveTXLivePlayerPlugin@" + hashCode();
        this.f113734r = (com.tencent.mm.live.core.view.LiveVideoView) root.findViewById(com.tencent.mm.R.id.f485643ig5);
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f113738v = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FinderLiveStartDragCloseEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.live.plugin.FinderLiveTXLivePlayerPlugin$dragCloseEventListener$1
            {
                this.__eventId = -1361166058;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FinderLiveStartDragCloseEvent finderLiveStartDragCloseEvent) {
                com.tencent.mm.autogen.events.FinderLiveStartDragCloseEvent event = finderLiveStartDragCloseEvent;
                kotlin.jvm.internal.o.g(event, "event");
                com.tencent.mm.plugin.finder.live.plugin.ob0 ob0Var = com.tencent.mm.plugin.finder.live.plugin.ob0.this;
                com.tencent.mars.xlog.Log.i(ob0Var.f113733q, "rcv FinderLiveStartDragCloseEvent");
                ob0Var.f113734r.setAlpha(0.0f);
                com.tencent.mm.live.core.view.LiveVideoView liveVideoView = ob0Var.f113734r;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(liveVideoView, arrayList.toArray(), "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                int intValue = ((java.lang.Integer) arrayList.get(0)).intValue();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(java.lang.Integer.valueOf(intValue));
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(liveVideoView, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveTXLivePlayerPlugin$dragCloseEventListener$1", "callback", "(Lcom/tencent/mm/autogen/events/FinderLiveStartDragCloseEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                liveVideoView.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(liveVideoView, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveTXLivePlayerPlugin$dragCloseEventListener$1", "callback", "(Lcom/tencent/mm/autogen/events/FinderLiveStartDragCloseEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                yj0.a.f(liveVideoView, "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                com.tencent.mm.live.core.view.LiveVideoView liveVideoView2 = ob0Var.f113734r;
                liveVideoView2.getClass();
                android.view.SurfaceView surfaceView = liveVideoView2.f68622g;
                if (surfaceView != null) {
                    liveVideoView2.removeView(surfaceView);
                }
                liveVideoView2.f68622g = null;
                return false;
            }
        };
        root.setPadding(0, 0, 0, 0);
        this.f113734r.f68620e = null;
        this.f113736t = kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new com.tencent.mm.plugin.finder.live.plugin.cb0(this, null), 3, null);
    }

    public static final com.tencent.mm.plugin.finder.live.plugin.eb0 A1(com.tencent.mm.plugin.finder.live.plugin.ob0 ob0Var, com.tencent.rtmp.TXLivePlayConfig tXLivePlayConfig, com.tencent.mm.live.core.view.LiveVideoView liveVideoView) {
        mn0.b0 b0Var;
        co0.s y17 = ob0Var.y1();
        if (y17 != null) {
            android.content.Context context = ob0Var.f365323d.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            b0Var = y17.Y0(context, tXLivePlayConfig, new com.tencent.mm.plugin.finder.live.plugin.ib0(), ((mm2.c1) ob0Var.P0(mm2.c1.class)).g8());
        } else {
            b0Var = null;
        }
        return new com.tencent.mm.plugin.finder.live.plugin.eb0(b0Var, liveVideoView);
    }

    public static /* synthetic */ void G1(com.tencent.mm.plugin.finder.live.plugin.ob0 ob0Var, int i17, com.tencent.rtmp.TXLivePlayConfig tXLivePlayConfig, int i18, boolean z17, boolean z18, yz5.l lVar, yz5.a aVar, int i19, java.lang.Object obj) {
        ob0Var.F1((i19 & 1) != 0 ? 1 : i17, (i19 & 2) != 0 ? zl2.r4.f473950a.d0(ob0Var.f113733q) : tXLivePlayConfig, i18, (i19 & 8) != 0 ? false : z17, (i19 & 16) != 0 ? true : z18, (i19 & 32) != 0 ? null : lVar, (i19 & 64) != 0 ? null : aVar);
    }

    public static final java.lang.Object t1(com.tencent.mm.plugin.finder.live.plugin.ob0 ob0Var, android.view.SurfaceView surfaceView, kotlin.coroutines.Continuation continuation) {
        ob0Var.getClass();
        kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(continuation), 1);
        rVar.k();
        int width = surfaceView.getWidth();
        int height = surfaceView.getHeight();
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(height));
        arrayList.add(java.lang.Integer.valueOf(width));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveTXLivePlayerPlugin", "requestPixelCopy", "(Landroid/view/SurfaceView;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveTXLivePlayerPlugin", "requestPixelCopy", "(Landroid/view/SurfaceView;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        kotlin.jvm.internal.o.f(createBitmap, "createBitmap(...)");
        android.view.PixelCopy.request(surfaceView, createBitmap, new com.tencent.mm.plugin.finder.live.plugin.jb0(rVar, createBitmap), new android.os.Handler(android.os.Looper.getMainLooper()));
        java.lang.Object j17 = rVar.j();
        pz5.a aVar = pz5.a.f359186d;
        return j17;
    }

    public final mn0.b0 B1() {
        co0.s y17 = y1();
        if (y17 != null) {
            return y17.R1.f282409a;
        }
        return null;
    }

    @Override // qo0.a
    public void C0(java.util.LinkedHashMap micUserMap) {
        android.graphics.RectF rectF;
        kotlin.jvm.internal.o.g(micUserMap, "micUserMap");
        xh2.c cVar = (xh2.c) ((mm2.o4) P0(mm2.o4.class)).A.getValue();
        if (cVar != null) {
            mn0.b0 B1 = B1();
            nn0.c cVar2 = B1 instanceof nn0.c ? (nn0.c) B1 : null;
            if (cVar2 != null) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getBlendAlphaRect list: ");
                java.util.LinkedList linkedList = cVar.f454539i;
                sb6.append(linkedList.size());
                sb6.append(" value: ");
                sb6.append(linkedList);
                java.lang.String sb7 = sb6.toString();
                java.lang.String str = this.f113733q;
                com.tencent.mars.xlog.Log.i(str, sb7);
                if (linkedList.size() <= 0 || !((mm2.o4) P0(mm2.o4.class)).A7()) {
                    rectF = new android.graphics.RectF(-1.0f, -1.0f, -1.0f, -1.0f);
                } else {
                    java.lang.Object obj = linkedList.get(0);
                    kotlin.jvm.internal.o.f(obj, "get(...)");
                    xh2.h hVar = (xh2.h) obj;
                    float f17 = hVar.f454551c;
                    float f18 = hVar.f454549a;
                    float f19 = hVar.f454552d;
                    float f27 = hVar.f454550b;
                    rectF = new android.graphics.RectF(f18, f27, f17 + f18, f19 + f27);
                }
                com.tencent.mars.xlog.Log.i(str, "getBlendAlphaRect rect: " + rectF);
                nn0.o oVar = ((nn0.i) cVar2.p()).f338584b;
                if (oVar != null) {
                    oVar.t3(rectF);
                }
                android.graphics.RectF[] l17 = fj2.r.f263182a.l(cVar.f454534d, cVar.f454535e, cVar.f454536f, cVar.f454533c, cVar.f454531a);
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder("revertAlphaRectList: ");
                sb8.append(l17 != null ? kz5.z.d0(l17, ", ", null, null, 0, null, null, 62, null) : null);
                com.tencent.mars.xlog.Log.i(str, sb8.toString());
                nn0.o oVar2 = ((nn0.i) cVar2.p()).f338584b;
                if (oVar2 != null) {
                    oVar2.Bg(l17);
                }
            }
        }
    }

    public final com.tencent.rtmp.ui.TXCloudVideoView C1() {
        com.tencent.mm.live.core.view.LiveVideoView txLivePlayerPreview = this.f113734r;
        kotlin.jvm.internal.o.f(txLivePlayerPreview, "txLivePlayerPreview");
        return txLivePlayerPreview;
    }

    public final boolean D1() {
        return ((pg2.j0) ((c50.s0) i95.n0.c(c50.s0.class))).wh();
    }

    public final void E1(boolean z17) {
        co0.s y17 = y1();
        if (y17 != null) {
            y17.f1(z17);
        }
        com.tencent.mars.xlog.Log.i(this.f113733q, "txLivePlayer, mute:" + z17);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0492  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x04c1  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0517  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0537  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0542  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0556  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0579  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0587  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0590  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0599  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x05ab  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x04a5  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0460  */
    /* JADX WARN: Type inference failed for: r1v50, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v51, types: [ez2.e] */
    /* JADX WARN: Type inference failed for: r6v53 */
    /* JADX WARN: Type inference failed for: r6v60 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11, types: [r45.nw1] */
    /* JADX WARN: Type inference failed for: r7v40 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void F1(int r30, com.tencent.rtmp.TXLivePlayConfig r31, int r32, boolean r33, boolean r34, yz5.l r35, yz5.a r36) {
        /*
            Method dump skipped, instructions count: 1460
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.plugin.ob0.F1(int, com.tencent.rtmp.TXLivePlayConfig, int, boolean, boolean, yz5.l, yz5.a):void");
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean G() {
        return false;
    }

    public final void H1(boolean z17) {
        com.tencent.mars.xlog.Log.i(this.f113733q, "stopPlay, type:" + this.f113735s);
        co0.s y17 = y1();
        if (y17 != null) {
            y17.T0(z17);
        }
    }

    public final void I1() {
        H1(true);
        zl2.r4 r4Var = zl2.r4.f473950a;
        G1(this, 0, r4Var.d0(this.f113733q), r4Var.R0(S0(), x0(), false), false, !((mm2.c1) P0(mm2.c1.class)).g8(), null, null, 105, null);
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void K0(int i17) {
        super.K0(i17);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0062, code lost:
    
        if (kotlin.jvm.internal.o.b(r12 != null ? java.lang.Long.valueOf(r12.f257879a) : null, r11) != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0094, code lost:
    
        if (kotlin.jvm.internal.o.b(r12 != null ? java.lang.Long.valueOf(r12.f257879a) : null, r11) != false) goto L39;
     */
    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void M0(qo0.b r11, android.os.Bundle r12) {
        /*
            Method dump skipped, instructions count: 464
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.plugin.ob0.M0(qo0.b, android.os.Bundle):void");
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void O0() {
        super.O0();
        dead();
        kotlinx.coroutines.r2 r2Var = this.f113736t;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        co0.s y17 = y1();
        if (y17 != null) {
            y17.f43733a2 = false;
        }
        this.f113737u = false;
        ez2.g.f257902a = null;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean k() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean r() {
        return false;
    }

    public final com.tencent.mm.plugin.finder.live.plugin.db0 u1() {
        android.view.SurfaceView f68622g = this.f113734r.getF68622g();
        if (f68622g == null) {
            return com.tencent.mm.plugin.finder.live.plugin.db0.f112248f;
        }
        android.graphics.Point b17 = com.tencent.mm.ui.bl.b(f68622g.getContext());
        return ((b17.x > b17.y) || !f68622g.getHolder().getSurface().isValid()) ? com.tencent.mm.plugin.finder.live.plugin.db0.f112247e : com.tencent.mm.plugin.finder.live.plugin.db0.f112246d;
    }

    public final void v1() {
        long j17 = V0().f309129d.f68549s;
        ig2.r f17 = ig2.m.f291393a.f(j17);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("detachBlock feedId: ");
        sb6.append(j17);
        sb6.append(" director: ");
        sb6.append(f17);
        sb6.append(" isDetach: ");
        sb6.append(f17 != null ? java.lang.Boolean.valueOf(f17.i()) : null);
        com.tencent.mars.xlog.Log.i(this.f113733q, sb6.toString());
        boolean z17 = false;
        if (f17 != null && !f17.i()) {
            z17 = true;
        }
        if (z17) {
            if (f17 != null) {
                f17.h();
            }
            w1(f17);
            mn0.b0 B1 = B1();
            if (B1 != null) {
                ((mn0.y) B1).J(y1());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w1(ig2.r r5) {
        /*
            r4 = this;
            java.lang.String r0 = r4.f113733q
            java.lang.String r1 = "fluentSwitchLiveRootEnd"
            com.tencent.mars.xlog.Log.i(r0, r1)
            boolean r0 = r5 instanceof ig2.i
            if (r0 == 0) goto Ld
            r0 = 1
            goto Lf
        Ld:
            boolean r0 = r5 instanceof ig2.d
        Lf:
            r1 = 0
            if (r0 == 0) goto L3f
            km2.m r5 = r4.V0()
            com.tencent.mm.live.api.LiveConfig r5 = r5.f309129d
            long r2 = r5.f68549s
            java.lang.Long r5 = java.lang.Long.valueOf(r2)
            if (r5 == 0) goto L35
            ez2.e r0 = ez2.g.f257902a
            if (r0 == 0) goto L2b
            long r2 = r0.f257879a
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            goto L2c
        L2b:
            r0 = r1
        L2c:
            boolean r5 = kotlin.jvm.internal.o.b(r0, r5)
            if (r5 == 0) goto L33
            goto L35
        L33:
            r5 = r1
            goto L37
        L35:
            ez2.e r5 = ez2.g.f257902a
        L37:
            if (r5 == 0) goto L6d
            r0 = 0
            r2 = 0
            r5.h(r2, r0, r2)
            goto L6d
        L3f:
            boolean r5 = r5 instanceof ig2.f
            if (r5 == 0) goto L6d
            km2.m r5 = r4.V0()
            com.tencent.mm.live.api.LiveConfig r5 = r5.f309129d
            long r2 = r5.f68549s
            java.lang.Long r5 = java.lang.Long.valueOf(r2)
            if (r5 == 0) goto L66
            ez2.e r0 = ez2.g.f257902a
            if (r0 == 0) goto L5c
            long r2 = r0.f257879a
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            goto L5d
        L5c:
            r0 = r1
        L5d:
            boolean r5 = kotlin.jvm.internal.o.b(r0, r5)
            if (r5 == 0) goto L64
            goto L66
        L64:
            r5 = r1
            goto L68
        L66:
            ez2.e r5 = ez2.g.f257902a
        L68:
            if (r5 == 0) goto L6d
            r5.j()
        L6d:
            com.tencent.mm.plugin.finder.live.view.k0 r5 = r4.Y0()
            if (r5 != 0) goto L74
            goto L79
        L74:
            r0 = 1065353216(0x3f800000, float:1.0)
            r5.setAlpha(r0)
        L79:
            android.view.ViewGroup r5 = r4.f365323d
            android.content.Context r0 = r5.getContext()
            boolean r2 = r0 instanceof com.tencent.mm.ui.MMActivity
            if (r2 == 0) goto L86
            r1 = r0
            com.tencent.mm.ui.MMActivity r1 = (com.tencent.mm.ui.MMActivity) r1
        L86:
            if (r1 == 0) goto La9
            android.view.Window r0 = r1.getWindow()
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            if (r0 == 0) goto L99
            android.view.View r0 = r0.getDecorView()
            if (r0 == 0) goto L99
            r0.setBackgroundColor(r1)
        L99:
            android.view.View r5 = r5.getRootView()
            r0 = 2131306071(0x7f092657, float:1.823033E38)
            android.view.View r5 = r5.findViewById(r0)
            if (r5 == 0) goto La9
            r5.setBackgroundColor(r1)
        La9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.plugin.ob0.w1(ig2.r):void");
    }

    public final jz5.l x1() {
        com.tencent.rtmp.ui.TXCloudVideoView tXCloudVideoView;
        android.view.TextureView videoView;
        int ordinal = u1().ordinal();
        if (ordinal == 0) {
            android.view.SurfaceView f68622g = this.f113734r.getF68622g();
            if (f68622g != null) {
                return new jz5.l(java.lang.Integer.valueOf(f68622g.getWidth()), java.lang.Integer.valueOf(f68622g.getHeight()));
            }
            return null;
        }
        if (ordinal != 1) {
            if (ordinal != 2) {
                throw new jz5.j();
            }
            android.view.TextureView videoView2 = this.f113734r.getVideoView();
            if (videoView2 != null) {
                return new jz5.l(java.lang.Integer.valueOf(videoView2.getWidth()), java.lang.Integer.valueOf(videoView2.getHeight()));
            }
            return null;
        }
        mn0.b0 B1 = B1();
        if (B1 == null) {
            return null;
        }
        mn0.y yVar = (mn0.y) B1;
        int i17 = 0;
        if (yVar.b(false)) {
            com.tencent.rtmp.TXLivePlayer p17 = yVar.p();
            nn0.i iVar = p17 instanceof nn0.i ? (nn0.i) p17 : null;
            if (iVar != null) {
                nn0.o oVar = iVar.f338584b;
                boolean z17 = iVar.f338583a;
                int videoWidth = (!z17 || oVar == null) ? 0 : oVar.getVideoWidth();
                if (z17 && oVar != null) {
                    i17 = oVar.getVideoHeight();
                }
                if (videoWidth > 0 && i17 > 0) {
                    return new jz5.l(java.lang.Integer.valueOf(videoWidth), java.lang.Integer.valueOf(i17));
                }
            }
        }
        java.lang.ref.WeakReference weakReference = yVar.f329809h;
        if (weakReference == null || (tXCloudVideoView = (com.tencent.rtmp.ui.TXCloudVideoView) weakReference.get()) == null || (videoView = tXCloudVideoView.getVideoView()) == null || videoView.getWidth() <= 0 || videoView.getHeight() <= 0) {
            return null;
        }
        return new jz5.l(java.lang.Integer.valueOf(videoView.getWidth()), java.lang.Integer.valueOf(videoView.getHeight()));
    }

    public final co0.s y1() {
        zl2.r4 r4Var = zl2.r4.f473950a;
        qo0.c cVar = this.f113325g;
        kotlin.jvm.internal.o.e(cVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.view.FinderBaseLivePluginLayout");
        if (!r4Var.W1(((com.tencent.mm.plugin.finder.live.view.k0) cVar).getBuContext())) {
            return co0.b.f43709e2.c(V0().f309129d.f68537e);
        }
        dk2.ef efVar = dk2.ef.f233372a;
        tn0.w0 w0Var = dk2.ef.f233378d;
        if (w0Var instanceof sn0.b) {
            return (sn0.b) w0Var;
        }
        return null;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void z0() {
        super.z0();
        alive();
    }

    /* JADX WARN: Code restructure failed: missing block: B:186:0x04e6, code lost:
    
        if (r1.f427662e == false) goto L179;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0526  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x05a6  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x05d9  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0655  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0684  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0694  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0713  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0680  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x04f2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0511  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.tencent.mm.plugin.finder.live.plugin.eb0 z1(com.tencent.rtmp.TXLivePlayConfig r31, boolean r32, yz5.a r33) {
        /*
            Method dump skipped, instructions count: 1888
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.plugin.ob0.z1(com.tencent.rtmp.TXLivePlayConfig, boolean, yz5.a):com.tencent.mm.plugin.finder.live.plugin.eb0");
    }
}
