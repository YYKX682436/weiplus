package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class FinderDescPanelUIC extends com.tencent.mm.ui.component.UIComponent implements zy2.j6 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f133515d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f133516e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.model.BaseFinderFeed f133517f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.ref.WeakReference f133518g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.viewmodel.component.f9 f133519h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.viewmodel.component.FinderDescPanelUIC$videoFinishListener$1 f133520i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f133521m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f133522n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f133523o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f133524p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f133525q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f133526r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f133527s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f133528t;

    /* renamed from: u, reason: collision with root package name */
    public final java.util.List f133529u;

    /* renamed from: v, reason: collision with root package name */
    public final java.util.Map f133530v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f133531w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f133532x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f133533y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f133534z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x015f  */
    /* JADX WARN: Type inference failed for: r4v5, types: [com.tencent.mm.plugin.finder.viewmodel.component.FinderDescPanelUIC$videoFinishListener$1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public FinderDescPanelUIC(androidx.appcompat.app.AppCompatActivity r7) {
        /*
            Method dump skipped, instructions count: 383
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.viewmodel.component.FinderDescPanelUIC.<init>(androidx.appcompat.app.AppCompatActivity):void");
    }

    public final void O6(com.tencent.mm.plugin.finder.viewmodel.component.mb0 mb0Var) {
        if (mb0Var == null) {
            return;
        }
        ((java.util.ArrayList) this.f133529u).add(mb0Var.S6());
        this.f133530v.put(mb0Var.S6(), mb0Var);
    }

    public final void P6(in5.s0 holder) {
        android.view.View p17;
        android.view.View p18;
        androidx.recyclerview.widget.RecyclerView o17;
        androidx.recyclerview.widget.f2 adapter;
        kotlin.jvm.internal.o.g(holder, "holder");
        so2.j5 j5Var = (so2.j5) holder.f293125i;
        if (j5Var instanceof so2.u1) {
            if (holder.getAdapterPosition() < 0 || (o17 = holder.o()) == null || (adapter = o17.getAdapter()) == null) {
                return;
            }
            adapter.notifyItemChanged(holder.getAdapterPosition(), new jz5.l(47, null));
            return;
        }
        if (!(j5Var instanceof so2.d1) || (p17 = holder.p(com.tencent.mm.R.id.g1y)) == null || (p18 = holder.p(com.tencent.mm.R.id.h8n)) == null) {
            return;
        }
        p18.post(new com.tencent.mm.plugin.finder.viewmodel.component.k9(holder, p18, p17));
    }

    public final jz5.l Q6(so2.c cVar) {
        jz5.l lVar;
        switch (cVar.ordinal()) {
            case 0:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                java.lang.Boolean bool = java.lang.Boolean.TRUE;
                return new jz5.l(bool, bool);
            case 1:
                lVar = new jz5.l(java.lang.Boolean.valueOf(this.f133534z), java.lang.Boolean.valueOf(this.f133533y));
                break;
            case 2:
                lVar = new jz5.l(java.lang.Boolean.valueOf(this.f133532x), java.lang.Boolean.valueOf(this.f133531w));
                break;
            default:
                throw new jz5.j();
        }
        return lVar;
    }

    public final void R6() {
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f133517f;
        if (baseFinderFeed != null) {
            baseFinderFeed.H1(null);
        }
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed2 = this.f133517f;
        if (baseFinderFeed2 != null) {
            baseFinderFeed2.b1(so2.c.f410277d);
        }
        com.tencent.mm.plugin.finder.viewmodel.component.xc U6 = U6();
        if (U6 != null) {
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed3 = this.f133517f;
            U6.e7(baseFinderFeed3 != null ? baseFinderFeed3.getItemId() : 0L);
        }
    }

    public final void S6() {
        com.tencent.mars.xlog.Log.i("Finder.DescPanelUIC", "Disable carousel timer");
        com.tencent.mm.plugin.finder.viewmodel.component.f9 f9Var = this.f133519h;
        f9Var.removeCallbacksAndMessages(null);
        f9Var.f134374a = false;
    }

    public final com.tencent.mm.plugin.finder.viewmodel.component.mb0 T6(in5.s0 s0Var, so2.c cVar) {
        java.util.List list = this.f133529u;
        int indexOf = ((java.util.ArrayList) list).indexOf(cVar);
        int size = ((java.util.ArrayList) list).size() - 1;
        for (int i17 = 0; i17 < size; i17++) {
            indexOf++;
            so2.c cVar2 = (so2.c) ((java.util.ArrayList) list).get(indexOf % ((java.util.ArrayList) list).size());
            com.tencent.mm.plugin.finder.viewmodel.component.mb0 mb0Var = (com.tencent.mm.plugin.finder.viewmodel.component.mb0) ((java.util.LinkedHashMap) this.f133530v).get(cVar2);
            if (mb0Var == null) {
                break;
            }
            boolean X6 = mb0Var.X6(s0Var, this.f133528t);
            com.tencent.mars.xlog.Log.i("Finder.DescPanelUIC", "findNextItem findItemType = " + cVar2 + ", isNeedShow = " + X6);
            if (X6) {
                boolean booleanValue = ((java.lang.Boolean) Q6(cVar2).f302834e).booleanValue();
                if (this.f133528t || booleanValue) {
                    return mb0Var;
                }
            }
        }
        return null;
    }

    public final com.tencent.mm.plugin.finder.viewmodel.component.xc U6() {
        return (com.tencent.mm.plugin.finder.viewmodel.component.xc) ((jz5.n) this.f133524p).getValue();
    }

    public final boolean V6() {
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f133517f;
        if (baseFinderFeed != null) {
            return baseFinderFeed != null && baseFinderFeed.getIsResetCarouselItemToDesc();
        }
        return false;
    }

    public final boolean W6() {
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f133517f;
        if (baseFinderFeed != null) {
            if ((baseFinderFeed != null ? baseFinderFeed.getCurrentCarouselItemType() : null) != so2.c.f410277d) {
                return true;
            }
        }
        return false;
    }

    public final void X6(in5.s0 holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        this.f133518g = new java.lang.ref.WeakReference(holder);
        java.lang.Object obj = holder.f293125i;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = obj instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) obj : null;
        if (baseFinderFeed == null) {
            return;
        }
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed2 = this.f133517f;
        this.f133517f = baseFinderFeed;
        boolean z17 = false;
        if (baseFinderFeed2 != null && baseFinderFeed2.getItemId() == baseFinderFeed.getItemId()) {
            z17 = true;
        }
        boolean z18 = true ^ z17;
        long itemId = baseFinderFeed2 != null ? baseFinderFeed2.getItemId() : -1L;
        java.util.Iterator it = this.f133529u.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.finder.viewmodel.component.mb0 mb0Var = (com.tencent.mm.plugin.finder.viewmodel.component.mb0) ((java.util.LinkedHashMap) this.f133530v).get((so2.c) it.next());
            if (mb0Var != null) {
                mb0Var.Z6(holder, z18, itemId, baseFinderFeed.getItemId());
            }
        }
        if (z18) {
            a7();
            e7();
        }
        if (baseFinderFeed2 != null) {
            Z6(baseFinderFeed2.getItemId(), getActivity());
        }
        if (!this.f133528t) {
            long itemId2 = baseFinderFeed.getItemId();
            androidx.appcompat.app.AppCompatActivity activity = getActivity();
            com.tencent.mm.plugin.finder.viewmodel.component.xc U6 = U6();
            if (U6 != null) {
                pm0.v.y(U6.f7(itemId2), activity, new com.tencent.mm.plugin.finder.viewmodel.component.o9(this));
            }
        }
        long itemId3 = baseFinderFeed.getItemId();
        androidx.appcompat.app.AppCompatActivity activity2 = getActivity();
        androidx.lifecycle.c1 a17 = pf5.u.f353936a.e(zy2.b6.class).a(xc2.k0.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        xc2.k0 k0Var = (xc2.k0) a17;
        pm0.v.y(k0Var.U6(itemId3), activity2, new com.tencent.mm.plugin.finder.viewmodel.component.p9(this));
        pm0.v.y(k0Var.c7(itemId3), activity2, new com.tencent.mm.plugin.finder.viewmodel.component.q9(this));
        i7();
        com.tencent.mars.xlog.Log.i("Finder.DescPanelUIC", "jumpInfo observe focus item: " + baseFinderFeed.getItemId());
    }

    public final void Y6() {
        com.tencent.mars.xlog.Log.i("Finder.DescPanelUIC", "Pause carousel timer");
        com.tencent.mm.plugin.finder.viewmodel.component.f9 f9Var = this.f133519h;
        f9Var.removeMessages(1);
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        long j17 = f9Var.f134375b;
        if (j17 > 0) {
            f9Var.f134376c = true;
            f9Var.f134377d = java.lang.Math.max(0L, j17 - uptimeMillis);
        }
    }

    public final void Z6(long j17, androidx.lifecycle.y yVar) {
        androidx.lifecycle.c1 a17 = pf5.u.f353936a.e(zy2.b6.class).a(xc2.k0.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        xc2.k0 k0Var = (xc2.k0) a17;
        k0Var.U6(j17).removeObservers(yVar);
        k0Var.c7(j17).removeObservers(yVar);
        com.tencent.mm.plugin.finder.viewmodel.component.xc U6 = U6();
        if (U6 != null) {
            U6.f7(j17).removeObservers(yVar);
        }
    }

    public final void a7() {
        com.tencent.mars.xlog.Log.i("Finder.DescPanelUIC", "Reset carousel timer");
        S6();
        com.tencent.mm.plugin.finder.viewmodel.component.f9 f9Var = this.f133519h;
        f9Var.f134375b = -1L;
        f9Var.f134377d = -1L;
        f9Var.f134376c = false;
        f9Var.f134378e = 0L;
        com.tencent.mars.xlog.Log.i("Finder.DescPanelUIC", "Enable carousel timer");
        f9Var.f134374a = true;
    }

    public final void b7(in5.s0 s0Var) {
        com.tencent.mars.xlog.Log.i("Finder.DescPanelUIC", "resetToDescItem");
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f133517f;
        com.tencent.mm.plugin.finder.viewmodel.component.f9 f9Var = this.f133519h;
        if (baseFinderFeed != null && W6() && !V6()) {
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed2 = this.f133517f;
            if (baseFinderFeed2 != null) {
                baseFinderFeed2.Q1(true);
            }
            f9Var.f134375b = -1L;
            com.tencent.mars.xlog.Log.i("Finder.DescPanelUIC", "resetToDescItem didShow=" + h7(so2.c.f410277d, s0Var, com.tencent.mm.plugin.finder.viewmodel.component.db0.f134118d));
            return;
        }
        com.tencent.mars.xlog.Log.i("Finder.DescPanelUIC", "resetToDescItem isTimerEnable:" + f9Var.f134374a + " bindingFeed:" + this.f133517f + " isShowingDescPanel():" + W6() + " isResetToDesc:" + V6());
    }

    public final void c7(in5.s0 holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mars.xlog.Log.i("Finder.DescPanelUIC", "Resume carousel timer");
        com.tencent.mm.plugin.finder.viewmodel.component.f9 f9Var = this.f133519h;
        if (f9Var.f134376c) {
            long j17 = f9Var.f134377d;
            if (j17 > 0) {
                f9Var.f134376c = false;
                f9Var.removeMessages(1);
                long uptimeMillis = android.os.SystemClock.uptimeMillis() + j17;
                f9Var.sendMessageAtTime(f9Var.obtainMessage(1, new java.lang.ref.WeakReference(holder)), uptimeMillis);
                f9Var.f134375b = uptimeMillis;
            }
        }
    }

    public final void d7(long j17, int i17) {
        if (this.f133516e.contains(java.lang.Integer.valueOf(i17))) {
            com.tencent.mars.xlog.Log.i("Finder.DescPanelUIC", "setLinkShowing linkBit = " + i17 + " hit white list, feedId=" + pm0.v.u(j17));
            return;
        }
        java.util.Map map = this.f133515d;
        java.lang.Long valueOf = java.lang.Long.valueOf(j17);
        java.util.LinkedHashMap linkedHashMap = (java.util.LinkedHashMap) map;
        java.lang.Object obj = linkedHashMap.get(valueOf);
        if (obj == null) {
            obj = 0;
            linkedHashMap.put(valueOf, obj);
        }
        int intValue = ((java.lang.Number) obj).intValue() | i17;
        com.tencent.mars.xlog.Log.i("Finder.DescPanelUIC", "setLinkShowing linkBit=" + i17 + ", result=" + intValue + ", feedId=" + pm0.v.u(j17));
        map.put(java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(intValue));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0131  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e7() {
        /*
            Method dump skipped, instructions count: 466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.viewmodel.component.FinderDescPanelUIC.e7():void");
    }

    public final void f7(in5.s0 s0Var) {
        com.tencent.mars.xlog.Log.i("Finder.DescPanelUIC", "show next");
        java.lang.Object obj = s0Var.f293125i;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = obj instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) obj : null;
        if (baseFinderFeed == null || W6() || V6()) {
            return;
        }
        this.f133519h.f134375b = -1L;
        com.tencent.mm.plugin.finder.viewmodel.component.mb0 T6 = T6(s0Var, baseFinderFeed.getCurrentCarouselItemType());
        if (T6 == null) {
            return;
        }
        boolean h76 = h7(T6.S6(), s0Var, com.tencent.mm.plugin.finder.viewmodel.component.db0.f134119e);
        com.tencent.mars.xlog.Log.i("Finder.DescPanelUIC", "SHOW_NEXT item.desc = " + baseFinderFeed.getFeedObject().getDescription() + " nextItemType = " + T6.S6() + ", didShow=" + h76);
        if (h76) {
            S6();
            if (this.f133528t) {
                return;
            }
            java.util.Iterator it = ((java.util.ArrayList) this.f133529u).iterator();
            while (it.hasNext()) {
                so2.c cVar = (so2.c) it.next();
                if (cVar != so2.c.f410277d) {
                    jz5.l Q6 = Q6(cVar);
                    boolean booleanValue = ((java.lang.Boolean) Q6.f302833d).booleanValue();
                    com.tencent.mars.xlog.Log.i("Finder.DescPanelUIC", "tryReport: findItemType=" + cVar + ", isHit=" + booleanValue + ", isShow=" + ((java.lang.Boolean) Q6.f302834e).booleanValue());
                    if (booleanValue) {
                        int ordinal = cVar.ordinal();
                        e42.d0 d0Var = ordinal != 1 ? ordinal != 2 ? null : e42.d0.hotcomment_flag_kv : e42.d0.ringtone_flag_kv;
                        if (d0Var != null) {
                            com.tencent.mars.xlog.Log.i("Finder.DescPanelUIC", "hitReport itemType = " + cVar);
                            e42.e0 e0Var = (e42.e0) i95.n0.c(e42.e0.class);
                            if (e0Var != null) {
                                ((h62.d) e0Var).Ni(d0Var, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    public final void g7(com.tencent.mm.plugin.finder.viewmodel.component.g9 triggerType, in5.s0 holder, boolean z17) {
        kotlin.jvm.internal.o.g(triggerType, "triggerType");
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.Td).getValue()).r()).intValue();
        int i17 = triggerType.f134482d;
        if ((i17 & intValue) == 0) {
            com.tencent.mars.xlog.Log.w("Finder.DescPanelUIC", "Cannot show carousel item for triggerType=" + i17 + ", configTriggerType=" + intValue);
            return;
        }
        java.lang.Object obj = holder.f293125i;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = obj instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) obj : null;
        if (baseFinderFeed == null) {
            return;
        }
        if (W6() || V6()) {
            com.tencent.mars.xlog.Log.w("Finder.DescPanelUIC", "Already show carousel item type:" + baseFinderFeed.getCurrentCarouselItemType());
            return;
        }
        com.tencent.mm.plugin.finder.viewmodel.component.mb0 T6 = T6(holder, baseFinderFeed.getCurrentCarouselItemType());
        if (T6 != null || z17) {
            if (((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.Ud).getValue()).r()).intValue() != 0) {
                if ((T6 != null ? T6.S6() : null) != so2.c.f410279f) {
                    return;
                }
            }
            f7(holder);
            return;
        }
        com.tencent.mm.plugin.finder.viewmodel.component.xc U6 = U6();
        if (U6 != null) {
            com.tencent.mm.plugin.finder.viewmodel.component.x9 x9Var = new com.tencent.mm.plugin.finder.viewmodel.component.x9(holder, baseFinderFeed, this, triggerType);
            java.lang.Object obj2 = holder.f293125i;
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed2 = obj2 instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) obj2 : null;
            if (baseFinderFeed2 == null) {
                return;
            }
            jz5.l lVar = (jz5.l) U6.f7(baseFinderFeed2.getItemId()).getValue();
            if (!com.tencent.mm.sdk.platformtools.t8.L0(lVar != null ? (java.util.LinkedList) lVar.f302833d : null)) {
                x9Var.invoke();
                return;
            }
            U6.f7(baseFinderFeed2.getItemId()).removeObservers(U6.getActivity());
            pm0.v.y(U6.f7(baseFinderFeed2.getItemId()), U6.getActivity(), new com.tencent.mm.plugin.finder.viewmodel.component.vc(U6, baseFinderFeed2, x9Var));
            com.tencent.mm.plugin.finder.feed.model.l0 l0Var = U6.f136446q;
            if (l0Var != null) {
                l0Var.O0(baseFinderFeed2.getItemId(), baseFinderFeed2.w(), baseFinderFeed2.getFeedObject().getObjectNonceId(), l0Var.f108129n, baseFinderFeed2.getFeedObject().isOldVersion(), baseFinderFeed2.getFeedObject().getUserName(), l0Var.f108130o, com.tencent.mm.plugin.finder.feed.model.z.f108499g);
            }
        }
    }

    public final boolean h7(so2.c cVar, in5.s0 s0Var, com.tencent.mm.plugin.finder.viewmodel.component.db0 animationType) {
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed;
        com.tencent.mm.plugin.finder.viewmodel.component.mb0 mb0Var;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed2;
        if ((((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.N0().r()).booleanValue() && cVar != so2.c.f410277d && cVar != so2.c.f410279f) || (baseFinderFeed = this.f133517f) == null || baseFinderFeed.getCurrentCarouselItemType() == cVar) {
            return false;
        }
        java.util.Map map = this.f133530v;
        com.tencent.mm.plugin.finder.viewmodel.component.mb0 mb0Var2 = (com.tencent.mm.plugin.finder.viewmodel.component.mb0) ((java.util.LinkedHashMap) map).get(baseFinderFeed.getCurrentCarouselItemType());
        if (mb0Var2 == null || (mb0Var = (com.tencent.mm.plugin.finder.viewmodel.component.mb0) ((java.util.LinkedHashMap) map).get(cVar)) == null) {
            return false;
        }
        android.app.Activity context = getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.tencent.mm.plugin.finder.viewmodel.component.hs hsVar = (com.tencent.mm.plugin.finder.viewmodel.component.hs) zVar.a((androidx.appcompat.app.AppCompatActivity) context).e(com.tencent.mm.plugin.finder.viewmodel.component.hs.class);
        boolean e76 = hsVar != null ? hsVar.e7(s0Var) : false;
        java.util.Map map2 = this.f133515d;
        java.lang.Long valueOf = java.lang.Long.valueOf(baseFinderFeed.getItemId());
        java.util.LinkedHashMap linkedHashMap = (java.util.LinkedHashMap) map2;
        java.lang.Object obj = linkedHashMap.get(valueOf);
        if (obj == null) {
            obj = 0;
            linkedHashMap.put(valueOf, obj);
        }
        int intValue = ((java.lang.Number) obj).intValue();
        boolean z17 = intValue > 0;
        com.tencent.mars.xlog.Log.i("Finder.DescPanelUIC", "isShowingBlackListLink bitset = " + intValue + ", whiteList=" + this.f133516e + " result = " + z17);
        boolean z18 = z17 || hc2.o0.E(baseFinderFeed.getFeedObject().getFeedObject(), false, 1, null) || baseFinderFeed.getFeedObject().isDisableFeedCarousel();
        if (e76 || z18 || !mb0Var.X6(s0Var, this.f133528t) || !((java.lang.Boolean) Q6(cVar).f302834e).booleanValue()) {
            return false;
        }
        so2.c cVar2 = so2.c.f410283m;
        if (cVar != cVar2) {
            baseFinderFeed.b1(cVar);
        }
        java.lang.Object obj2 = s0Var.f293125i;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed3 = obj2 instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) obj2 : null;
        if (baseFinderFeed3 != null && (this.f133528t || ((java.lang.Boolean) Q6(mb0Var.S6()).f302834e).booleanValue())) {
            android.view.View R6 = mb0Var2.R6(s0Var);
            android.view.View R62 = mb0Var.R6(s0Var);
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) s0Var.p(com.tencent.mm.R.id.f484485ee2);
            viewGroup.setClipChildren(false);
            if (R62 == null || R6 == null) {
                baseFinderFeed2 = baseFinderFeed3;
            } else {
                baseFinderFeed2 = baseFinderFeed3;
                com.tencent.mm.plugin.finder.viewmodel.component.w9 w9Var = new com.tencent.mm.plugin.finder.viewmodel.component.w9(mb0Var, mb0Var2, baseFinderFeed3, R62, R6, viewGroup, s0Var, animationType, this);
                kotlin.jvm.internal.o.g(animationType, "animationType");
                mb0Var.Q6(s0Var, animationType);
                mb0Var.b7(true, s0Var, animationType, w9Var);
                mb0Var.P6(s0Var, animationType);
            }
            if (mb0Var.S6() != cVar2) {
                baseFinderFeed2.b1(mb0Var.S6());
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00aa, code lost:
    
        r6.W6(r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i7() {
        /*
            r8 = this;
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r0 = r8.f133517f
            if (r0 != 0) goto L5
            return
        L5:
            java.lang.ref.WeakReference r1 = r8.f133518g
            if (r1 == 0) goto Lae
            java.lang.Object r1 = r1.get()
            in5.s0 r1 = (in5.s0) r1
            if (r1 != 0) goto L13
            goto Lae
        L13:
            java.util.Map r2 = r8.f133530v
            so2.c r3 = r0.getCurrentCarouselItemType()
            r4 = r2
            java.util.LinkedHashMap r4 = (java.util.LinkedHashMap) r4
            java.lang.Object r3 = r4.get(r3)
            com.tencent.mm.plugin.finder.viewmodel.component.mb0 r3 = (com.tencent.mm.plugin.finder.viewmodel.component.mb0) r3
            r4 = 0
            if (r3 == 0) goto L2f
            boolean r5 = r8.f133528t
            boolean r5 = r3.X6(r1, r5)
            r6 = 1
            if (r5 != r6) goto L2f
            r4 = r6
        L2f:
            if (r4 != 0) goto L3a
            r4 = 0
            r0.H1(r4)
            so2.c r4 = so2.c.f410277d
            r0.b1(r4)
        L3a:
            java.util.List r4 = r8.f133529u
            java.util.Iterator r4 = r4.iterator()
        L40:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto Lae
            java.lang.Object r5 = r4.next()
            so2.c r5 = (so2.c) r5
            r6 = r2
            java.util.LinkedHashMap r6 = (java.util.LinkedHashMap) r6
            java.lang.Object r6 = r6.get(r5)
            com.tencent.mm.plugin.finder.viewmodel.component.mb0 r6 = (com.tencent.mm.plugin.finder.viewmodel.component.mb0) r6
            so2.c r7 = r0.getCurrentCarouselItemType()
            if (r5 != r7) goto L79
            if (r6 == 0) goto L60
            r6.c7(r1)
        L60:
            so2.c r5 = r0.getPreviousNotHiddenCarouselItemType()
            if (r5 == 0) goto L40
            so2.c r5 = r0.getPreviousNotHiddenCarouselItemType()
            r6 = r2
            java.util.LinkedHashMap r6 = (java.util.LinkedHashMap) r6
            java.lang.Object r5 = r6.get(r5)
            com.tencent.mm.plugin.finder.viewmodel.component.mb0 r5 = (com.tencent.mm.plugin.finder.viewmodel.component.mb0) r5
            if (r5 == 0) goto L40
            r5.c7(r1)
            goto L40
        L79:
            boolean r5 = r3 instanceof com.tencent.mm.plugin.finder.viewmodel.component.e9
            if (r5 == 0) goto La8
            if (r6 == 0) goto La8
            r5 = r3
            com.tencent.mm.plugin.finder.viewmodel.component.e9 r5 = (com.tencent.mm.plugin.finder.viewmodel.component.e9) r5
            so2.c r7 = r6.S6()
            boolean r5 = r5.a7(r7)
            if (r5 != 0) goto La8
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r7 = "updatePanelItems don't hide "
            r5.<init>(r7)
            r5.append(r6)
            java.lang.String r6 = " for "
            r5.append(r6)
            r5.append(r3)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "Finder.DescPanelUIC"
            com.tencent.mars.xlog.Log.w(r6, r5)
            goto L40
        La8:
            if (r6 == 0) goto L40
            r6.W6(r1)
            goto L40
        Lae:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.viewmodel.component.FinderDescPanelUIC.i7():void");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onConfigurationChanged(android.content.res.Configuration newConfig) {
        in5.s0 s0Var;
        kotlin.jvm.internal.o.g(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        java.lang.ref.WeakReference weakReference = this.f133518g;
        if (weakReference == null || (s0Var = (in5.s0) weakReference.get()) == null) {
            return;
        }
        java.util.Iterator it = this.f133529u.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.finder.viewmodel.component.mb0 mb0Var = (com.tencent.mm.plugin.finder.viewmodel.component.mb0) ((java.util.LinkedHashMap) this.f133530v).get((so2.c) it.next());
            if (mb0Var != null) {
                mb0Var.Y6(s0Var, newConfig);
            }
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        S6();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onPause() {
        super.onPause();
        dead();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        alive();
    }
}
