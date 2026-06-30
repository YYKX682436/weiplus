package es2;

/* loaded from: classes2.dex */
public final class g extends fc2.d implements cs2.j {

    /* renamed from: g, reason: collision with root package name */
    public int f256346g;

    /* renamed from: h, reason: collision with root package name */
    public final cw2.w9 f256347h;

    /* renamed from: i, reason: collision with root package name */
    public final vr2.e f256348i;

    /* renamed from: m, reason: collision with root package name */
    public final androidx.lifecycle.y f256349m;

    /* renamed from: n, reason: collision with root package name */
    public final es2.h0 f256350n;

    /* renamed from: o, reason: collision with root package name */
    public final wr2.a f256351o;

    /* renamed from: p, reason: collision with root package name */
    public cs2.a f256352p;

    /* renamed from: q, reason: collision with root package name */
    public cs2.c f256353q;

    /* renamed from: r, reason: collision with root package name */
    public java.util.List f256354r;

    /* renamed from: s, reason: collision with root package name */
    public cw2.wa f256355s;

    /* renamed from: t, reason: collision with root package name */
    public fc2.c f256356t;

    /* renamed from: u, reason: collision with root package name */
    public int f256357u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f256358v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f256359w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f256360x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f256361y;

    /* renamed from: z, reason: collision with root package name */
    public yz5.p f256362z;

    public g(int i17, cw2.w9 preloadCore, vr2.e eVar, androidx.lifecycle.y lifecycleOwner) {
        kotlin.jvm.internal.o.g(preloadCore, "preloadCore");
        kotlin.jvm.internal.o.g(lifecycleOwner, "lifecycleOwner");
        this.f256346g = i17;
        this.f256347h = preloadCore;
        this.f256348i = eVar;
        this.f256349m = lifecycleOwner;
        jz5.g b17 = jz5.h.b(es2.d.f256339d);
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        this.f256350n = t70Var.Z2() ? new es2.h0((yr2.k) ((jz5.n) b17).getValue(), java.lang.String.valueOf(this.f256346g)) : null;
        this.f256351o = t70Var.Y2() ? new wr2.a() : null;
    }

    public static final void I0(es2.g gVar, int i17, int i18) {
        if (i18 <= 0) {
            gVar.getClass();
            pm0.v.X(new es2.b(gVar, i17, i18));
            return;
        }
        com.tencent.mars.xlog.Log.i(gVar.M0(), "onPreloadComplete return loading:" + i17 + " waiting:" + i18);
    }

    @Override // cs2.j
    public void B(java.lang.String mediaId, boolean z17, int i17) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        com.tencent.mars.xlog.Log.i(M0(), J0("onPreloadStop :".concat(mediaId)));
        wr2.a aVar = this.f256351o;
        es2.h0 h0Var = this.f256350n;
        if (h0Var != null) {
            h0Var.g(mediaId, z17, i17);
        }
    }

    @Override // cs2.j
    public void C0() {
        pm0.v.X(new es2.e(this));
    }

    @Override // fc2.d
    public boolean E0() {
        return false;
    }

    @Override // fc2.d
    public boolean F0(fc2.c dispatcher, fc2.a event) {
        kotlin.jvm.internal.o.g(dispatcher, "dispatcher");
        kotlin.jvm.internal.o.g(event, "event");
        return (event instanceof fc2.t) && ((fc2.t) event).f260985d == 5;
    }

    @Override // cs2.j
    public void G(vr2.i callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mars.xlog.Log.w(M0(), J0("unregisterCallback  disable on v2"));
    }

    @Override // fc2.d
    public void G0(fc2.a event) {
        kotlin.jvm.internal.o.g(event, "event");
        if ((event instanceof fc2.t) && ((fc2.t) event).f260985d == 5) {
            N0("onEventHappen");
        }
    }

    @Override // fc2.d
    public void H0() {
        es2.h0 h0Var = this.f256350n;
        if (h0Var != null) {
            h0Var.f256370c = true;
            h0Var.f();
        }
        cs2.a aVar = this.f256352p;
        if (aVar != null) {
            aVar.f222058a.clear();
            ((c00.z3) i95.n0.c(c00.z3.class)).getClass();
        }
        cs2.c cVar = this.f256353q;
        if (cVar != null) {
            pm0.v.C(cVar.f222062c);
            com.tencent.mars.xlog.Log.i("FinderPreloadSearchWorker", "preload search onRelease");
        }
        this.f256353q = null;
    }

    public final java.lang.String J0(java.lang.String str) {
        return hc2.b0.c(this.f256355s) + ' ' + str;
    }

    public final java.util.List L0() {
        bs2.b0 b0Var;
        db2.c3 c3Var;
        java.util.LinkedList list;
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        if (((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f1if).getValue()).r()).booleanValue()) {
            java.util.List list2 = this.f256354r;
            if (list2 == null) {
                kotlin.jvm.internal.o.o(ya.b.SOURCE);
                throw null;
            }
            if (((java.util.ArrayList) list2).isEmpty()) {
                bs2.n1 R6 = ((com.tencent.mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore) pf5.u.f353936a.e(c61.l7.class).a(com.tencent.mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore.class)).R6(this.f256357u);
                int i17 = ((c61.l7) i95.n0.c(c61.l7.class)).ek().S;
                if (i17 < 2) {
                    i17 = 2;
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                if (R6 != null && (b0Var = R6.f23925s) != null && (c3Var = b0Var.f23806b) != null && (list = c3Var.getList(1)) != null) {
                    int size = list.size();
                    if (i17 <= size) {
                        size = i17;
                    }
                    int i18 = 0;
                    java.util.List subList = list.subList(0, size);
                    kotlin.jvm.internal.o.f(subList, "subList(...)");
                    for (java.lang.Object obj : subList) {
                        int i19 = i18 + 1;
                        if (i18 < 0) {
                            kz5.c0.p();
                            throw null;
                        }
                        com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) obj;
                        com.tencent.mm.plugin.finder.storage.h90 h90Var = com.tencent.mm.plugin.finder.storage.FinderItem.Companion;
                        kotlin.jvm.internal.o.d(finderObject);
                        com.tencent.mm.plugin.finder.model.BaseFinderFeed p17 = cu2.u.f222441a.p(h90Var.a(finderObject, hc2.d0.d(this.f256357u)));
                        com.tencent.mars.xlog.Log.i(M0(), "getSourceList return cache " + i18 + ' ' + hc2.b0.f(p17, true) + " size:" + i17);
                        arrayList.add(p17);
                        i18 = i19;
                    }
                }
                return arrayList;
            }
        }
        java.util.List list3 = this.f256354r;
        if (list3 != null) {
            return list3;
        }
        kotlin.jvm.internal.o.o(ya.b.SOURCE);
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x011c A[EDGE_INSN: B:76:0x011c->B:53:0x011c BREAK  A[LOOP:1: B:31:0x00d5->B:71:?], SYNTHETIC] */
    @Override // cs2.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void M(cw2.wa r10) {
        /*
            Method dump skipped, instructions count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: es2.g.M(cw2.wa):void");
    }

    public final java.lang.String M0() {
        return "FMPIS2." + this.f256346g + '.' + hashCode();
    }

    public final void N0(java.lang.String str) {
        java.lang.Object obj;
        com.tencent.mars.xlog.Log.i(M0(), J0("onSourceListChange source:" + L0().size() + ' ' + str));
        if (!this.f256347h.V0()) {
            com.tencent.mars.xlog.Log.i(M0(), J0("onSourceListChange return for isPlayFeedBufferAboveWater"));
            return;
        }
        cw2.wa waVar = this.f256355s;
        jz5.f0 f0Var = null;
        if (waVar != null) {
            C0();
            java.util.Iterator it = L0().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((so2.j5) obj).getItemId() == waVar.f224099f.getFeedId()) {
                        break;
                    }
                }
            }
            so2.j5 j5Var = (so2.j5) obj;
            if (j5Var != null) {
                O0(j5Var, "onSourceListChange");
                f0Var = jz5.f0.f302826a;
            }
        }
        if (f0Var == null && !this.f256359w && this.f256360x) {
            p("onSourceListChange");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0226 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e2 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void O0(so2.j5 r41, java.lang.String r42) {
        /*
            Method dump skipped, instructions count: 1400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: es2.g.O0(so2.j5, java.lang.String):void");
    }

    @Override // cs2.j
    public void P(java.lang.String source) {
        kotlin.jvm.internal.o.g(source, "source");
        com.tencent.mars.xlog.Log.i(M0(), J0("onPreloadStart :".concat(source)));
        es2.h0 h0Var = this.f256350n;
        if (h0Var != null && h0Var.f256378k.compareAndSet(true, false)) {
            h0Var.h();
        }
        cs2.a aVar = this.f256352p;
        if (aVar != null) {
            aVar.a(m());
        }
    }

    public void P0(com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer dataList, int i17, final int i18, fc2.c cVar) {
        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue;
        kotlin.jvm.internal.o.g(dataList, "dataList");
        this.f256357u = i18;
        this.f256354r = dataList;
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        if ((t70Var.Z2() || t70Var.Y2()) && cVar != null) {
            cVar.a(this);
        }
        this.f256356t = cVar;
        this.f256346g = i17;
        com.tencent.mars.xlog.Log.i(M0(), "setup commentScene:" + i17 + " tabType:" + i18 + " isPreloadMediaEnable=" + t70Var.Z2() + " isPreloadImageEnable=" + t70Var.Y2());
        es2.h0 h0Var = this.f256350n;
        if (h0Var != null && (concurrentLinkedQueue = h0Var.f256374g) != null) {
            concurrentLinkedQueue.add(new es2.f(this));
        }
        final androidx.lifecycle.y yVar = this.f256349m;
        new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FinderNextTabPreloadEvent>(yVar) { // from class: com.tencent.mm.plugin.finder.preload.video.v2.FinderMediaPreloadInStream$setup$2
            {
                this.__eventId = 1338237085;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FinderNextTabPreloadEvent finderNextTabPreloadEvent) {
                com.tencent.mm.autogen.events.FinderNextTabPreloadEvent event = finderNextTabPreloadEvent;
                kotlin.jvm.internal.o.g(event, "event");
                if (event.f54313g.f7892a != i18) {
                    return false;
                }
                this.N0("callback");
                return true;
            }
        }.alive();
        this.f256361y = true;
    }

    @Override // cs2.j
    public void V(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f256353q = new cs2.c(context);
    }

    @Override // cs2.j
    public void f(java.lang.String mediaId, int i17, int i18) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
    }

    @Override // cs2.j
    public int getCommentScene() {
        return this.f256346g;
    }

    @Override // cs2.j
    public void i0(cw2.wa mediaSource) {
        int i17;
        kotlin.jvm.internal.o.g(mediaSource, "mediaSource");
        this.f256358v = false;
        com.tencent.mars.xlog.Log.i(M0(), J0("onPlayFeedBufferBelowWater " + hc2.b0.c(mediaSource)));
        p0("onPlayFeedBufferBelowWater");
        vr2.e eVar = this.f256348i;
        if (eVar == null || (i17 = this.f256346g) != eVar.a()) {
            return;
        }
        com.tencent.mars.xlog.Log.i("FMTPScheduler", "onPlayFeedBufferBelowWater " + i17);
        java.util.Iterator it = eVar.b(eVar.a()).iterator();
        while (it.hasNext()) {
            cs2.j jVar = ((cs2.k) it.next()).f222076d;
            if (jVar != null) {
                jVar.p0("FMTPScheduler.onPlayFeedBufferBelowWater." + eVar.a());
            }
        }
    }

    @Override // cs2.j
    public int m() {
        es2.h0 h0Var = this.f256350n;
        if (h0Var != null) {
            return h0Var.f256371d.size() + h0Var.f256372e.size();
        }
        return 0;
    }

    @Override // cs2.j
    public void p(java.lang.String invokeSource) {
        es2.h0 h0Var;
        kotlin.jvm.internal.o.g(invokeSource, "invokeSource");
        com.tencent.mars.xlog.Log.i(M0(), J0("onNextPageComplete " + invokeSource + ' ' + this.f256359w + " source:" + L0().size()));
        if (this.f256359w) {
            return;
        }
        if (!this.f256347h.V0()) {
            com.tencent.mars.xlog.Log.i(M0(), J0("onNextPageComplete return for isPlayFeedBufferAboveWater"));
            this.f256360x = true;
            return;
        }
        java.util.List L0 = L0();
        jz5.f0 f0Var = null;
        if (!(!L0.isEmpty())) {
            L0 = null;
        }
        if (L0 != null && (h0Var = this.f256350n) != null) {
            h0Var.i(new ek4.b(1, -1, this.f256346g, 3, 0L, null, 1, 48, null), kz5.n0.V0(L0), 0, "FinderMediaPreloadInStreamV2");
            f0Var = jz5.f0.f302826a;
        }
        if (f0Var == null) {
            this.f256360x = true;
        }
    }

    @Override // cs2.j
    public void p0(java.lang.String source) {
        kotlin.jvm.internal.o.g(source, "source");
        com.tencent.mars.xlog.Log.i(M0(), J0("onPreloadStop :".concat(source)));
        es2.h0 h0Var = this.f256350n;
        if (h0Var != null && h0Var.f256378k.compareAndSet(false, true)) {
            h0Var.j("resetRunningTask", new es2.f0(h0Var));
        }
        cs2.a aVar = this.f256352p;
        if (aVar != null) {
            aVar.b();
        }
    }

    @Override // cs2.j
    public void q(yz5.p pVar) {
        this.f256362z = pVar;
    }

    @Override // cs2.j
    public void u0(java.lang.String mediaId, boolean z17) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        com.tencent.mars.xlog.Log.i(M0(), J0("onMediaFocusDownload :" + mediaId + " isFocused:" + z17));
        wr2.a aVar = this.f256351o;
        es2.h0 h0Var = this.f256350n;
        if (h0Var != null) {
            h0Var.g(mediaId, z17, -1);
        }
    }

    @Override // cs2.j
    public void x0(cw2.wa mediaSource) {
        so2.e eVar;
        java.lang.Object obj;
        so2.d contextInStream;
        kotlin.jvm.internal.o.g(mediaSource, "mediaSource");
        java.util.Iterator it = L0().iterator();
        while (true) {
            eVar = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((so2.j5) obj).getItemId() == mediaSource.f224099f.getFeedId()) {
                    break;
                }
            }
        }
        so2.j5 j5Var = (so2.j5) obj;
        if (j5Var != null) {
            so2.u1 u1Var = j5Var instanceof so2.u1 ? (so2.u1) j5Var : null;
            if (u1Var != null && (contextInStream = u1Var.getContextInStream()) != null) {
                eVar = contextInStream.f410305d;
            }
            if (eVar != null) {
                eVar.f410317a = true;
            }
            com.tencent.mars.xlog.Log.i(M0(), J0("onPreRenderToFirstFrame " + hc2.b0.c(mediaSource)));
        }
    }

    @Override // cs2.j
    public void z(cw2.wa mediaSource, java.lang.String invokeSource) {
        so2.e eVar;
        java.lang.Object obj;
        so2.d contextInStream;
        kotlin.jvm.internal.o.g(mediaSource, "mediaSource");
        kotlin.jvm.internal.o.g(invokeSource, "invokeSource");
        this.f256358v = false;
        com.tencent.mars.xlog.Log.i(M0(), J0("onFeedSelectToPlay " + invokeSource + ' ' + hc2.b0.c(mediaSource)));
        this.f256355s = mediaSource;
        java.util.Iterator it = L0().iterator();
        while (true) {
            eVar = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((so2.j5) obj).getItemId() == mediaSource.f224099f.getFeedId()) {
                    break;
                }
            }
        }
        so2.j5 j5Var = (so2.j5) obj;
        if (j5Var != null) {
            so2.u1 u1Var = j5Var instanceof so2.u1 ? (so2.u1) j5Var : null;
            if (u1Var != null && (contextInStream = u1Var.getContextInStream()) != null) {
                eVar = contextInStream.f410305d;
            }
            if (eVar == null) {
                return;
            }
            eVar.f410317a = false;
        }
    }
}
