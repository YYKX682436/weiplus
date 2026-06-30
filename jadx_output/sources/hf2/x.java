package hf2;

/* loaded from: classes10.dex */
public final class x extends if2.b implements mf2.c {
    public final jz5.g A;
    public final jz5.g B;
    public final jz5.g C;
    public final jz5.g D;
    public final jz5.g E;
    public boolean F;
    public android.animation.ValueAnimator G;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f281181m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f281182n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f281183o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f281184p;

    /* renamed from: q, reason: collision with root package name */
    public r45.ei0 f281185q;

    /* renamed from: r, reason: collision with root package name */
    public r45.h84 f281186r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f281187s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f281188t;

    /* renamed from: u, reason: collision with root package name */
    public hf2.r2 f281189u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f281190v;

    /* renamed from: w, reason: collision with root package name */
    public android.view.ViewGroup f281191w;

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f281192x;

    /* renamed from: y, reason: collision with root package name */
    public final jz5.g f281193y;

    /* renamed from: z, reason: collision with root package name */
    public final jz5.g f281194z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f281181m = "LiveAnchorStickerController";
        this.f281182n = jz5.h.b(hf2.t.f281166d);
        this.f281183o = jz5.h.b(hf2.e.f281049d);
        jz5.g b17 = jz5.h.b(hf2.l.f281097d);
        this.f281184p = jz5.h.b(hf2.k.f281093d);
        this.f281189u = new hf2.r2(new android.graphics.Point(0, 0), new android.util.Size((int) ((java.lang.Number) ((jz5.n) b17).getValue()).floatValue(), (int) i7()));
        this.f281192x = jz5.h.b(new hf2.h(this));
        this.f281193y = jz5.h.b(new hf2.a(this));
        this.f281194z = jz5.h.b(new hf2.v(this));
        this.A = jz5.h.b(new hf2.b(this));
        this.B = jz5.h.b(new hf2.j(this));
        this.C = jz5.h.b(new hf2.u(this));
        this.D = jz5.h.b(new hf2.w(this));
        this.E = jz5.h.b(new hf2.r(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object Z6(hf2.x r8, java.lang.String r9, kotlin.coroutines.Continuation r10) {
        /*
            r8.getClass()
            boolean r0 = r10 instanceof hf2.m
            if (r0 == 0) goto L16
            r0 = r10
            hf2.m r0 = (hf2.m) r0
            int r1 = r0.f281113h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f281113h = r1
            goto L1b
        L16:
            hf2.m r0 = new hf2.m
            r0.<init>(r8, r10)
        L1b:
            r4 = r0
            java.lang.Object r10 = r4.f281111f
            pz5.a r0 = pz5.a.f359186d
            int r1 = r4.f281113h
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L4b
            if (r1 == r3) goto L3e
            if (r1 != r2) goto L36
            java.lang.Object r8 = r4.f281110e
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r9 = r4.f281109d
            hf2.x r9 = (hf2.x) r9
            kotlin.ResultKt.throwOnFailure(r10)
            goto L79
        L36:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3e:
            java.lang.Object r8 = r4.f281110e
            r9 = r8
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r8 = r4.f281109d
            hf2.x r8 = (hf2.x) r8
            kotlin.ResultKt.throwOnFailure(r10)
            goto L5f
        L4b:
            kotlin.ResultKt.throwOnFailure(r10)
            hf2.y0 r10 = r8.g7()
            r4.f281109d = r8
            r4.f281110e = r9
            r4.f281113h = r3
            java.lang.Object r10 = r10.d(r9, r4)
            if (r10 != r0) goto L5f
            goto L87
        L5f:
            hf2.y0 r1 = r8.g7()
            r45.h84 r10 = r8.f281186r
            r3 = 0
            r5 = 2
            r6 = 0
            r4.f281109d = r8
            r4.f281110e = r9
            r4.f281113h = r2
            r2 = r10
            java.lang.Object r10 = hf2.y0.b(r1, r2, r3, r4, r5, r6)
            if (r10 != r0) goto L76
            goto L87
        L76:
            r7 = r9
            r9 = r8
            r8 = r7
        L79:
            android.graphics.Bitmap r10 = (android.graphics.Bitmap) r10
            if (r10 == 0) goto L85
            hf2.n r0 = new hf2.n
            r0.<init>(r9, r8, r10)
            d75.b.g(r0)
        L85:
            jz5.f0 r0 = jz5.f0.f302826a
        L87:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: hf2.x.Z6(hf2.x, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // mf2.c
    public void M2(xh2.b micInfoData) {
        kotlin.jvm.internal.o.g(micInfoData, "micInfoData");
        int size = micInfoData.f454523b.size();
        java.lang.String str = this.f281181m;
        com.tencent.mars.xlog.Log.i(str, "onMicInfoChanged size:" + size);
        boolean z17 = size > 1;
        if (z17 != this.f281188t) {
            com.tencent.mars.xlog.Log.i(str, "set linkMic from " + this.f281188t + " to " + z17);
        }
        this.f281188t = z17;
    }

    public final void a7(java.lang.String source, java.lang.String initTextContent) {
        java.util.LinkedList linkedList;
        java.util.LinkedList linkedList2;
        r45.ji0 ji0Var;
        java.util.LinkedList linkedList3;
        kotlin.jvm.internal.o.g(source, "source");
        kotlin.jvm.internal.o.g(initTextContent, "initTextContent");
        if (this.f281185q == null) {
            t7(source.concat(" buildDefaultStickerTextItem"), new r45.ei0());
        }
        r45.ei0 ei0Var = this.f281185q;
        r45.ji0 ji0Var2 = null;
        java.util.LinkedList linkedList4 = ei0Var != null ? ei0Var.f373529d : null;
        if (linkedList4 == null || linkedList4.isEmpty()) {
            r45.ei0 ei0Var2 = this.f281185q;
            if ((ei0Var2 != null ? ei0Var2.f373529d : null) == null && ei0Var2 != null) {
                ei0Var2.f373529d = new java.util.LinkedList();
            }
            r45.ei0 ei0Var3 = this.f281185q;
            if (ei0Var3 != null && (linkedList3 = ei0Var3.f373529d) != null) {
                r45.ji0 ji0Var3 = new r45.ji0();
                ji0Var3.f377822d = ((je2.g) business(je2.g.class)).f299225m;
                ji0Var3.f377823e = ((je2.g) business(je2.g.class)).f299226n;
                ji0Var3.f377827i = 1.0f;
                android.graphics.Bitmap bitmap = h7().f281012g;
                if (bitmap != null) {
                    ji0Var3.f377830o = bitmap.getWidth();
                    ji0Var3.f377831p = bitmap.getHeight();
                }
                ((je2.g) business(je2.g.class)).getClass();
                linkedList3.add(ji0Var3);
            }
            com.tencent.mars.xlog.Log.i(this.f281181m, source + " buildDefaultStickerTextItem new instance EditorTextItemRestoreData," + je2.g.f299220u.b(this.f281185q) + '!');
        }
        r45.ei0 ei0Var4 = this.f281185q;
        java.lang.String str = (ei0Var4 == null || (linkedList2 = ei0Var4.f373529d) == null || (ji0Var = (r45.ji0) kz5.n0.Z(linkedList2)) == null) ? null : ji0Var.f377829n;
        if (str == null || str.length() == 0) {
            if (initTextContent.length() > 0) {
                r45.ei0 ei0Var5 = this.f281185q;
                if (ei0Var5 != null && (linkedList = ei0Var5.f373529d) != null) {
                    ji0Var2 = (r45.ji0) kz5.n0.Z(linkedList);
                }
                if (ji0Var2 == null) {
                    return;
                }
                ji0Var2.f377829n = initTextContent;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0111  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final r45.ee6 b7(int r12, int r13, java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 453
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hf2.x.b7(int, int, java.lang.String):r45.ee6");
    }

    public final void c7(boolean z17) {
        com.tencent.mm.plugin.finder.live.plugin.o9 o9Var;
        com.tencent.mars.xlog.Log.i(this.f281181m, "enablePreviewScale " + z17);
        com.tencent.mm.plugin.finder.live.view.ub ubVar = this.f291099e;
        if (ubVar == null || (o9Var = (com.tencent.mm.plugin.finder.live.plugin.o9) ubVar.getPlugin(com.tencent.mm.plugin.finder.live.plugin.o9.class)) == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LiveCoreAnchor", "setCameraOptionEnable " + z17);
        o9Var.f113717r.setCameraOptionEnable(z17);
    }

    public final void d7(boolean z17) {
        in0.q liveCore;
        if (z17 != this.f281187s) {
            com.tencent.mars.xlog.Log.i(this.f281181m, "set enableStickerToScreen from " + this.f281187s + " to " + z17);
        }
        this.f281187s = z17;
        com.tencent.mm.plugin.finder.live.view.ub ubVar = this.f291099e;
        com.tencent.mm.plugin.finder.live.view.v1 v1Var = ubVar instanceof com.tencent.mm.plugin.finder.live.view.v1 ? (com.tencent.mm.plugin.finder.live.view.v1) ubVar : null;
        if (v1Var == null || (liveCore = v1Var.getLiveCore()) == null) {
            return;
        }
        go0.f0 f0Var = liveCore.f420771r;
        f0Var.getClass();
        f0Var.l(new go0.m(f0Var, z17));
    }

    public final hf2.r2 e7() {
        com.tencent.mm.plugin.finder.live.plugin.o9 o9Var;
        com.tencent.mm.plugin.finder.live.view.ub ubVar = this.f291099e;
        android.view.ViewGroup viewGroup = (ubVar == null || (o9Var = (com.tencent.mm.plugin.finder.live.plugin.o9) ubVar.getPlugin(com.tencent.mm.plugin.finder.live.plugin.o9.class)) == null) ? null : o9Var.f365323d;
        int[] iArr = new int[2];
        if (viewGroup != null) {
            viewGroup.getLocationOnScreen(iArr);
        }
        hf2.r2 r2Var = new hf2.r2(new android.graphics.Point(iArr[0], iArr[1]), new android.util.Size(viewGroup != null ? viewGroup.getWidth() : 0, viewGroup != null ? viewGroup.getHeight() : 0));
        this.f281189u = r2Var;
        return r2Var;
    }

    public final hf2.h0 f7() {
        return (hf2.h0) ((jz5.n) this.f281193y).getValue();
    }

    public final hf2.y0 g7() {
        return (hf2.y0) ((jz5.n) this.A).getValue();
    }

    public final hf2.b2 h7() {
        return (hf2.b2) ((jz5.n) this.f281192x).getValue();
    }

    public final float i7() {
        return ((java.lang.Number) this.f281184p.getValue()).floatValue();
    }

    public final hf2.e1 k7() {
        return (hf2.e1) ((jz5.n) this.C).getValue();
    }

    public final hf2.l2 l7() {
        return (hf2.l2) ((jz5.n) this.f281194z).getValue();
    }

    public final void m7(java.lang.String source) {
        kotlin.jvm.internal.o.g(source, "source");
        com.tencent.mars.xlog.Log.i(this.f281181m, source.concat(" hideStickerEdit!"));
        d7(true);
        u7(false);
        s7();
        release();
    }

    public final void n7(java.lang.String source) {
        kotlin.jvm.internal.o.g(source, "source");
        com.tencent.mars.xlog.Log.i(this.f281181m, source.concat(" hideStickerOperation!"));
        d7(true);
        u7(false);
        s7();
        release();
    }

    public final void o7(java.lang.String source) {
        r45.ei0 ei0Var;
        kotlin.jvm.internal.o.g(source, "source");
        je2.g gVar = (je2.g) business(je2.g.class);
        r45.ei0 ei0Var2 = gVar.f299222g;
        if (ei0Var2 != null) {
            ei0Var = new r45.ei0();
            byte[] byteArray = ei0Var2.toByteArray();
            if (byteArray != null) {
                try {
                    ei0Var.parseFrom(byteArray);
                } catch (java.lang.Exception e17) {
                    com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
                }
            }
        } else {
            ei0Var = null;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("cloneRestoreData stickerRestoreData:");
        r45.ei0 ei0Var3 = gVar.f299222g;
        sb6.append(ei0Var3 != null ? ei0Var3.hashCode() : 0);
        sb6.append(",cloneRestoreData:");
        sb6.append(ei0Var != null ? ei0Var.hashCode() : 0);
        com.tencent.mars.xlog.Log.i("Finder.LiveAnchorStickerSlice", sb6.toString());
        t7(source, ei0Var);
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveActivate() {
        com.tencent.mars.xlog.Log.i(this.f281181m, "startPolling");
        dk2.ef.f233392k.e(18, new r45.xc2(), new hf2.s(this, r45.yc2.class), false);
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveDeactivate() {
        super.onLiveDeactivate();
        com.tencent.mars.xlog.Log.i(this.f281181m, "stopPolling");
        dk2.ef.f233392k.f(18);
        f7().a();
        android.graphics.Bitmap bitmap = h7().f281012g;
        if (bitmap != null) {
            bitmap.recycle();
        }
        ((hf2.p1) ((jz5.n) this.E).getValue()).a().clear();
        hf2.y0 g76 = g7();
        kotlinx.coroutines.r2 r2Var = g76.f281210k;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        hf2.l0 l0Var = g76.f281209j;
        if (l0Var != null) {
            l0Var.a("onLiveDeactivate");
        }
        g76.f281209j = null;
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveStart(r45.hc1 hc1Var) {
        jz5.f0 f0Var;
        hf2.e1 k76 = k7();
        hf2.x xVar = k76.f281051a;
        r45.ei0 ei0Var = ((je2.g) xVar.business(je2.g.class)).f299222g;
        if (ei0Var != null) {
            if ((k76.f281054d.length() > 0) && kotlin.jvm.internal.o.b(k76.f281054d, com.tencent.mm.sdk.platformtools.w2.a(pm0.b0.g(ei0Var).toString()))) {
                java.lang.String str = "upload StickTask When LiveStart:" + k76.f281054d + '!';
                java.lang.String str2 = k76.f281052b;
                com.tencent.mars.xlog.Log.i(str2, str);
                k76.f281054d = "";
                com.tencent.mm.ui.MMActivity N6 = xVar.N6();
                if (N6 != null) {
                    k76.b("before:", N6, ei0Var);
                    f0Var = jz5.f0.f302826a;
                } else {
                    f0Var = null;
                }
                if (f0Var == null) {
                    com.tencent.mars.xlog.Log.e(str2, "upload StickTask When LiveStart but activity is null!");
                }
            }
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewMount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        super.onViewMount(pluginLayout);
        hf2.y0 g76 = g7();
        com.tencent.mm.plugin.finder.live.util.y.o(g76.f281200a, null, null, new hf2.q0(g76, null), 3, null);
        hf2.p1 p1Var = (hf2.p1) ((jz5.n) this.E).getValue();
        com.tencent.mm.plugin.finder.live.util.y.o(p1Var.f281136a, null, null, new hf2.o1(p1Var, null), 3, null);
        hf2.q2 q2Var = (hf2.q2) ((jz5.n) this.D).getValue();
        if (((je2.g) q2Var.f281148a.business(je2.g.class)).T6()) {
            q2Var.d();
            q2Var.a();
        }
        com.tencent.mm.plugin.finder.live.util.y.o(this, null, null, new hf2.g(this, null), 3, null);
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewUnmount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        com.tencent.mars.xlog.Log.i(this.f281181m, "onViewUnmount");
        m7("onViewUnmount");
    }

    public final void p7(java.util.LinkedList linkedList, float f17, float f18) {
        android.animation.ValueAnimator valueAnimator = this.G;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        android.animation.ValueAnimator duration = android.animation.ValueAnimator.ofFloat(f17, f18).setDuration(300L);
        duration.addListener(new hf2.c(this, f17, f18));
        duration.addUpdateListener(new hf2.d(linkedList));
        duration.setInterpolator(new android.view.animation.DecelerateInterpolator());
        this.G = duration;
        duration.start();
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x01db, code lost:
    
        if (kz5.n0.Z(r3) == null) goto L76;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q7(java.lang.String r24, android.graphics.Bitmap r25, boolean r26, r45.ei0 r27, boolean r28) {
        /*
            Method dump skipped, instructions count: 536
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hf2.x.q7(java.lang.String, android.graphics.Bitmap, boolean, r45.ei0, boolean):void");
    }

    public final java.lang.Boolean r7() {
        if (this.f281191w != null) {
            com.tencent.mars.xlog.Log.i(this.f281181m, "prepareContainer but have init!");
            return java.lang.Boolean.TRUE;
        }
        com.tencent.mm.ui.MMActivity N6 = N6();
        com.tencent.mm.plugin.finder.live.view.ub ubVar = this.f291099e;
        com.tencent.mm.plugin.finder.live.view.v1 v1Var = ubVar instanceof com.tencent.mm.plugin.finder.live.view.v1 ? (com.tencent.mm.plugin.finder.live.view.v1) ubVar : null;
        if (N6 == null || v1Var == null) {
            return null;
        }
        com.tencent.mm.plugin.finder.live.view.FinderDisallowInterceptRelativeLayout finderDisallowInterceptRelativeLayout = new com.tencent.mm.plugin.finder.live.view.FinderDisallowInterceptRelativeLayout(N6, null);
        finderDisallowInterceptRelativeLayout.setOnClickListener(new hf2.i(this));
        v1Var.addView(finderDisallowInterceptRelativeLayout, new android.view.ViewGroup.LayoutParams(-1, -1));
        this.f281191w = finderDisallowInterceptRelativeLayout;
        return java.lang.Boolean.TRUE;
    }

    public final void release() {
        this.f281190v = false;
        hf2.h0 f76 = f7();
        qc0.g1 g1Var = f76.f281072c;
        if (g1Var != null) {
            com.tencent.mm.plugin.recordvideo.ui.editor.sticker.StickerEditorContainer stickerEditorContainer = (com.tencent.mm.plugin.recordvideo.ui.editor.sticker.StickerEditorContainer) g1Var;
            ym5.y5 y5Var = stickerEditorContainer.f156428f;
            l45.q presenter = y5Var != null ? y5Var.getPresenter() : null;
            if (presenter != null) {
                ((l45.n) presenter).f316475p = null;
            }
            stickerEditorContainer.f156429g = null;
        }
        f76.f281073d = null;
        hf2.y0 g76 = g7();
        com.tencent.mm.ui.tools.f5 f5Var = g76.f281203d;
        if (f5Var != null) {
            f5Var.d();
        }
        com.tencent.mm.ui.tools.f5 f5Var2 = g76.f281203d;
        if (f5Var2 != null) {
            f5Var2.f210400e = null;
        }
        g76.f281203d = null;
        g76.c(g76.f281205f);
        g76.f281204e = null;
        g76.f281205f = null;
        g76.f281206g = null;
        g76.f281207h = null;
        g76.f281208i = null;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("launchMaasReleaseJob maasReleaseJob is activate:");
        kotlinx.coroutines.r2 r2Var = g76.f281210k;
        sb6.append(r2Var != null ? java.lang.Boolean.valueOf(((kotlinx.coroutines.a) r2Var).a()) : null);
        com.tencent.mars.xlog.Log.i(g76.f281201b, sb6.toString());
        kotlinx.coroutines.r2 r2Var2 = g76.f281210k;
        if (r2Var2 != null) {
            kotlinx.coroutines.p2.a(r2Var2, null, 1, null);
        }
        g76.f281210k = com.tencent.mm.plugin.finder.live.util.y.d(g76.f281200a, null, null, new hf2.n0(g76, null), 3, null);
        android.view.ViewGroup viewGroup = this.f281191w;
        if (viewGroup != null) {
            zl2.r4.f473950a.Q2(viewGroup);
        }
        android.view.ViewGroup viewGroup2 = this.f281191w;
        if (viewGroup2 != null) {
            viewGroup2.removeAllViews();
        }
        this.f281191w = null;
        hf2.b2 h76 = h7();
        android.view.View view = h76.f281014i;
        if (view != null) {
            zl2.r4.f473950a.Q2(view);
        }
        h76.f281014i = null;
        hf2.l2 l76 = l7();
        android.view.View view2 = l76.f281106c;
        if (view2 != null) {
            zl2.r4.f473950a.Q2(view2);
        }
        l76.f281106c = null;
        com.tencent.mm.ui.widget.LiveBottomSheetPanel liveBottomSheetPanel = l76.f281107d;
        if (liveBottomSheetPanel != null) {
            liveBottomSheetPanel.setOnVisibilityListener(null);
        }
        ((hf2.q2) ((jz5.n) this.D).getValue()).getClass();
    }

    public final void s7() {
        com.tencent.mm.plugin.finder.live.plugin.o9 o9Var;
        com.tencent.mars.xlog.Log.i(this.f281181m, "resumePreviewScaleState");
        com.tencent.mm.plugin.finder.live.view.ub ubVar = this.f291099e;
        if (ubVar == null || (o9Var = (com.tencent.mm.plugin.finder.live.plugin.o9) ubVar.getPlugin(com.tencent.mm.plugin.finder.live.plugin.o9.class)) == null) {
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("resumeCameraOptionState ");
        sb6.append(o9Var.f113721v == 1);
        com.tencent.mars.xlog.Log.i("MicroMsg.LiveCoreAnchor", sb6.toString());
        o9Var.f113717r.setCameraOptionEnable(o9Var.f113721v == 1);
    }

    public final void t7(java.lang.String source, r45.ei0 ei0Var) {
        kotlin.jvm.internal.o.g(source, "source");
        this.f281185q = ei0Var;
        com.tencent.mars.xlog.Log.i(this.f281181m, source + " saveTmpRestoreData " + je2.g.f299220u.b(ei0Var));
    }

    public final void u7(boolean z17) {
        if (z17 != this.F) {
            boolean T7 = ((mm2.c1) business(mm2.c1.class)).T7();
            com.tencent.mars.xlog.Log.i(this.f281181m, "modify editing from " + this.F + " to " + z17 + ",is beforeLive:" + T7 + ", liveState:" + ((mm2.c1) business(mm2.c1.class)).f328813h2);
            if (z17) {
                com.tencent.mm.plugin.finder.live.view.ub ubVar = this.f291099e;
                if (ubVar != null) {
                    ubVar.onPluginAlphaModify(1.0f, 0.3f);
                }
            } else {
                com.tencent.mm.plugin.finder.live.view.ub ubVar2 = this.f291099e;
                if (ubVar2 != null) {
                    ubVar2.onPluginAlphaModify(0.3f, 1.0f);
                }
            }
            if (T7) {
                java.util.LinkedList linkedList = null;
                if (z17) {
                    com.tencent.mm.plugin.finder.live.plugin.qa qaVar = (com.tencent.mm.plugin.finder.live.plugin.qa) R6(com.tencent.mm.plugin.finder.live.plugin.qa.class);
                    if (qaVar != null) {
                        linkedList = new java.util.LinkedList();
                        linkedList.add(qaVar);
                    }
                    p7(linkedList, 1.0f, 0.3f);
                } else {
                    com.tencent.mm.plugin.finder.live.plugin.qa qaVar2 = (com.tencent.mm.plugin.finder.live.plugin.qa) R6(com.tencent.mm.plugin.finder.live.plugin.qa.class);
                    if (qaVar2 != null) {
                        linkedList = new java.util.LinkedList();
                        linkedList.add(qaVar2);
                    }
                    p7(linkedList, 0.3f, 1.0f);
                }
            }
        }
        if (!z17) {
            hf2.p1 p1Var = (hf2.p1) ((jz5.n) this.E).getValue();
            com.tencent.mars.xlog.Log.i(p1Var.f281137b, "runDropTask size:" + p1Var.a().size());
            if (!p1Var.a().isEmpty()) {
                synchronized (p1Var.a()) {
                    java.util.Iterator it = p1Var.a().iterator();
                    kotlin.jvm.internal.o.f(it, "iterator(...)");
                    while (it.hasNext()) {
                        java.lang.Object next = it.next();
                        kotlin.jvm.internal.o.f(next, "next(...)");
                        ((java.lang.Runnable) next).run();
                        it.remove();
                    }
                }
            }
        }
        this.F = z17;
    }

    public final void v7(r45.h84 h84Var) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("set selectTextSticker:");
        sb6.append(h84Var != null ? je2.g.f299220u.d(h84Var) : null);
        com.tencent.mars.xlog.Log.i(this.f281181m, sb6.toString());
        this.f281186r = h84Var;
    }

    public final void w7(int i17, java.lang.String pictureFilePath) {
        kotlin.jvm.internal.o.g(pictureFilePath, "pictureFilePath");
        boolean z17 = i17 == 2 || i17 == 1;
        java.lang.String str = this.f281181m;
        if (!z17) {
            com.tencent.mars.xlog.Log.e(str, "showStickerEdit fail,stickerType:" + i17 + " invalid!");
            return;
        }
        if (this.f281188t) {
            db5.t7.m(O6(), O6().getResources().getString(com.tencent.mm.R.string.lju));
            com.tencent.mars.xlog.Log.i(str, "showStickerEdit is linking!");
        } else if (!kotlin.jvm.internal.o.b(r7(), java.lang.Boolean.TRUE)) {
            com.tencent.mars.xlog.Log.e(str, "showStickerEdit fail,sticker edit container is null!");
            m7("showStickerEdit fail");
        } else {
            if (i17 == 1) {
                com.tencent.mm.plugin.finder.live.util.y.o(this, null, null, new hf2.q(this, i17, pictureFilePath, null), 3, null);
            } else {
                f7().b(i17, 1, pictureFilePath);
            }
            u7(true);
        }
    }
}
