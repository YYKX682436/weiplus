package kh5;

/* loaded from: classes7.dex */
public final class h extends wp0.c {

    /* renamed from: h, reason: collision with root package name */
    public final yb5.d f308071h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.magicbrush.plugin.emoji.ui.MEHolderView f308072i;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.FrameLayout f308073m;

    /* renamed from: n, reason: collision with root package name */
    public final yz5.l f308074n;

    /* renamed from: o, reason: collision with root package name */
    public final android.os.Handler f308075o;

    /* renamed from: p, reason: collision with root package name */
    public kh5.a f308076p;

    /* renamed from: q, reason: collision with root package name */
    public jh5.b f308077q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f308078r;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.ArrayList f308079s;

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.Runnable f308080t;

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.Runnable f308081u;

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.Runnable f308082v;

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f308083w;

    public h(yb5.d chattingContext, com.tencent.mm.magicbrush.plugin.emoji.ui.MEHolderView holder, android.widget.FrameLayout beneathInputHolder, yz5.l checkMsgExist) {
        kotlin.jvm.internal.o.g(chattingContext, "chattingContext");
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(beneathInputHolder, "beneathInputHolder");
        kotlin.jvm.internal.o.g(checkMsgExist, "checkMsgExist");
        this.f308071h = chattingContext;
        this.f308072i = holder;
        this.f308073m = beneathInputHolder;
        this.f308074n = checkMsgExist;
        holder.setClickHandler(new kh5.b(this));
        this.f308075o = new android.os.Handler(android.os.Looper.getMainLooper());
        jh5.b bVar = jh5.b.f299866d;
        this.f308077q = jh5.b.f299866d;
        this.f308079s = new java.util.ArrayList();
        this.f308080t = new kh5.f(this);
        this.f308081u = new kh5.g(this);
        this.f308082v = new kh5.d(this);
        this.f308083w = jz5.h.b(kh5.e.f308068d);
    }

    @Override // lc3.e
    public android.app.Activity B0() {
        android.app.Activity g17 = this.f308071h.g();
        kotlin.jvm.internal.o.f(g17, "getContext(...)");
        return g17;
    }

    @Override // wp0.c, lc3.s
    public jc3.m F0(java.lang.String containerTag) {
        kotlin.jvm.internal.o.g(containerTag, "containerTag");
        if (this.f448375f == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MEChattingMgr", "trigger show but already destroyed");
            return null;
        }
        int hashCode = containerTag.hashCode();
        if (hashCode != -1791438311) {
            com.tencent.mm.magicbrush.plugin.emoji.ui.MEHolderView mEHolderView = this.f308072i;
            if (hashCode != 116147433) {
                if (hashCode == 1894816597 && containerTag.equals("aboveCanvas")) {
                    return new tp0.m(mEHolderView.a(false));
                }
            } else if (containerTag.equals("belowCanvas")) {
                return new tp0.m(mEHolderView.a(true));
            }
        } else if (containerTag.equals("belowInput")) {
            android.widget.FrameLayout parentView = this.f308073m;
            kotlin.jvm.internal.o.g(parentView, "parentView");
            return new tp0.m(parentView);
        }
        throw new java.lang.IllegalArgumentException("Not legal containerTag");
    }

    @Override // wp0.c
    public java.util.List G0() {
        return kz5.n0.t0(super.G0(), kz5.c0.i(new lh5.f(), new lh5.c(), new lh5.b(), new up0.b(), new up0.e(), new up0.c()));
    }

    @Override // wp0.c
    public jz5.l H0() {
        int[] iArr = new int[2];
        com.tencent.mm.magicbrush.plugin.emoji.ui.MEHolderView mEHolderView = this.f308072i;
        mEHolderView.getLocationOnScreen(iArr);
        int i17 = iArr[1];
        return new jz5.l(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(B0().getResources().getDisplayMetrics().heightPixels - (mEHolderView.getBottom() + i17)));
    }

    @Override // wp0.c
    public com.tencent.mm.magicbrush.plugin.emoji.ui.MEHolderView K0() {
        return this.f308072i;
    }

    @Override // wp0.c
    public wp0.b M0(java.lang.String msgTalker, java.lang.String id6, boolean z17) {
        kotlin.jvm.internal.o.g(msgTalker, "msgTalker");
        kotlin.jvm.internal.o.g(id6, "id");
        java.lang.Long j17 = r26.h0.j(id6);
        if (j17 != null) {
            return mh5.a.b(msgTalker, j17.longValue(), id6, "", z17, true, this.f308071h, this.f308072i);
        }
        return null;
    }

    @Override // wp0.c
    public java.util.Map N0(boolean z17) {
        wp0.b a17;
        yb5.d dVar = this.f308071h;
        java.util.List<android.util.Pair> c17 = mh5.a.c(dVar, false);
        java.util.HashMap hashMap = new java.util.HashMap();
        if (c17 == null || ((java.util.ArrayList) c17).size() <= 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MEChattingMgr", "getVisibleMetaDict failed");
            return hashMap;
        }
        for (android.util.Pair pair : c17) {
            xq.b bVar = ((com.tencent.mm.ui.chatting.component.ta) ((sb5.p0) dVar.f460708c.a(sb5.p0.class))).f199989x;
            java.lang.Object first = pair.first;
            kotlin.jvm.internal.o.f(first, "first");
            com.tencent.mm.storage.f9 f9Var = (com.tencent.mm.storage.f9) first;
            com.tencent.mm.ui.chatting.component.sa saVar = (com.tencent.mm.ui.chatting.component.sa) bVar;
            saVar.getClass();
            java.util.LinkedList linkedList = new java.util.LinkedList();
            com.tencent.mm.ui.chatting.component.ta taVar = saVar.f199932b;
            if (((java.lang.Boolean) ((com.tencent.mm.ui.chatting.component.qa) taVar.f199983r).invoke(f9Var)).booleanValue()) {
                java.util.List c18 = xq.s.f456015a.c(f9Var);
                java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(c18, 10));
                int i17 = 0;
                for (java.lang.Object obj : c18) {
                    int i18 = i17 + 1;
                    if (i17 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    sb6.append(f9Var.getMsgId());
                    sb6.append('_');
                    sb6.append(i17);
                    arrayList.add(sb6.toString());
                    i17 = i18;
                }
                linkedList.addAll(arrayList);
            } else if (((java.lang.Boolean) ((com.tencent.mm.ui.chatting.component.ea) taVar.f199982q).invoke(f9Var)).booleanValue()) {
                linkedList.add(java.lang.String.valueOf(f9Var.getMsgId()));
            }
            boolean isEmpty = linkedList.isEmpty();
            java.util.Collection<java.lang.String> collection = linkedList;
            if (isEmpty) {
                collection = kz5.b0.c("");
            }
            for (java.lang.String str : collection) {
                if (z17) {
                    android.graphics.RectF d17 = mh5.a.d((com.tencent.mm.storage.f9) pair.first, str, true, dVar, this.f308072i);
                    a17 = d17 != null ? mh5.a.a((com.tencent.mm.storage.f9) pair.first, str, "", d17) : null;
                } else {
                    a17 = mh5.a.a((com.tencent.mm.storage.f9) pair.first, str, "", null);
                }
                if (a17 != null) {
                    hashMap.put(java.lang.String.valueOf(((com.tencent.mm.storage.f9) pair.first).getMsgId()), a17);
                }
            }
        }
        return hashMap;
    }

    @Override // wp0.c
    public void O0() {
        ((com.tencent.mm.feature.performance.q) ((ob0.c3) i95.n0.c(ob0.c3.class))).Ai("ME");
    }

    @Override // wp0.c
    public void S0(com.tencent.mm.plugin.magicbrush.MBBuildConfig config) {
        kotlin.jvm.internal.o.g(config, "config");
        java.lang.String name = lh5.a.class.getName();
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        config.f147818e.add(name);
    }

    public final void X0(jh5.b meta, int i17) {
        jz5.f0 f0Var;
        kotlin.jvm.internal.o.g(meta, "meta");
        if (s1()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MEChattingMgr", "[ME] forceMagicEggStop, meta = " + meta + ", reason = " + i17);
            java.lang.String a17 = new zp0.b(meta.f299867a, meta.f299868b, meta.f299869c, i17).a();
            jc3.j0 j0Var = this.f448375f;
            if (j0Var != null) {
                ((rc3.w0) j0Var).k("OnClientEvent", a17);
                g1();
                f0Var = jz5.f0.f302826a;
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MEChattingMgr", "forceMagicEggStop without biz");
            }
        }
    }

    public void Y0() {
        ((com.tencent.mm.feature.performance.q) ((ob0.c3) i95.n0.c(ob0.c3.class))).Bi("ME");
    }

    public final void g1() {
        android.os.Handler handler = this.f308075o;
        java.lang.Runnable runnable = this.f308082v;
        handler.removeCallbacks(runnable);
        handler.postDelayed(runnable, ((java.lang.Number) ((jz5.n) this.f308083w).getValue()).longValue());
    }

    public final void m1(jh5.b bVar, boolean z17, jh5.a aVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MEChattingMgr", "[ME]: sendMagicEgg: " + bVar + ", " + z17 + ", " + aVar);
        if (z17 && this.f308078r) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MEChattingMgr", "[ME]: only one clickable in a session");
            return;
        }
        if (z17) {
            this.f308078r = true;
        }
        java.lang.String a17 = new zp0.d(bVar.f299867a, bVar.f299868b, bVar.f299869c, z17, aVar.a()).a();
        jc3.j0 j0Var = this.f448375f;
        jz5.f0 f0Var = null;
        if (j0Var != null) {
            java.lang.ref.WeakReference weakReference = vb5.l.f434855q;
            vb5.l lVar = weakReference != null ? (vb5.l) weakReference.get() : null;
            if (lVar != null) {
                int paddingTop = lVar.f198580d.p().getPaddingTop();
                yb5.d dVar = this.f308071h;
                jc3.j0.d(j0Var, "GameGlobal.backgroudParentTopInset=" + i65.a.c(dVar.g(), fp.a.c(dVar.g()) + paddingTop) + ";GameGlobal.androidTipsBarHeight=" + i65.a.c(dVar.g(), paddingTop) + ';', null, 2, null);
            }
            int i17 = z17 ? 11 : 10;
            java.lang.String eggKey = bVar.f299867a;
            kotlin.jvm.internal.o.g(eggKey, "eggKey");
            java.lang.String eggId = bVar.f299868b;
            kotlin.jvm.internal.o.g(eggId, "eggId");
            java.lang.String sceneId = bVar.f299869c;
            kotlin.jvm.internal.o.g(sceneId, "sceneId");
            com.tencent.mm.autogen.mmdata.rpt.MagicEmojiEasterEggReportStruct magicEmojiEasterEggReportStruct = new com.tencent.mm.autogen.mmdata.rpt.MagicEmojiEasterEggReportStruct();
            magicEmojiEasterEggReportStruct.f59086e = magicEmojiEasterEggReportStruct.b("sessionid", eggId, true);
            magicEmojiEasterEggReportStruct.f59088g = magicEmojiEasterEggReportStruct.b("chatid", sceneId, true);
            magicEmojiEasterEggReportStruct.f59089h = magicEmojiEasterEggReportStruct.b("activityid", eggKey, true);
            magicEmojiEasterEggReportStruct.f59087f = i17;
            magicEmojiEasterEggReportStruct.k();
            ((rc3.w0) j0Var).k("OnClientEvent", a17);
            g1();
            f0Var = jz5.f0.f302826a;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MEChattingMgr", "sendMagicEgg without biz");
        }
    }

    public final void prepare() {
        if (this.f448375f != null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MEChattingMgr", "[ME] prepare biz ok: " + V0());
        g1();
    }

    public final boolean s1() {
        jh5.b bVar = this.f308077q;
        jh5.b bVar2 = jh5.b.f299866d;
        jh5.b bVar3 = jh5.b.f299866d;
        if (kotlin.jvm.internal.o.b(bVar, bVar3)) {
            return false;
        }
        this.f308072i.f68647d = com.tencent.mm.magicbrush.plugin.emoji.ui.MEHolderView.f68646h;
        android.os.Handler handler = this.f308075o;
        handler.removeCallbacks(this.f308080t);
        handler.removeCallbacks(this.f308081u);
        this.f308079s.clear();
        kh5.a aVar = this.f308076p;
        if (aVar != null) {
            jh5.b bVar4 = this.f308077q;
            com.tencent.mars.xlog.Log.i("MicroMsg.EggMgr", "onEnd: %s, %s", bVar4.f299868b, bVar4.f299867a);
            com.tencent.mm.ui.chatting.n9 n9Var = ((com.tencent.mm.ui.chatting.o9) aVar).f202069a;
            n9Var.f202036s = false;
            n9Var.f202027j = false;
            n9Var.f202035r = null;
        }
        this.f308077q = bVar3;
        this.f308078r = false;
        return true;
    }
}
