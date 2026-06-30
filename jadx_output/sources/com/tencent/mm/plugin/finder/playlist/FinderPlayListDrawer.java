package com.tencent.mm.plugin.finder.playlist;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001.B\u001b\b\u0016\u0012\u0006\u0010'\u001a\u00020&\u0012\b\u0010)\u001a\u0004\u0018\u00010(¢\u0006\u0004\b*\u0010+B#\b\u0016\u0012\u0006\u0010'\u001a\u00020&\u0012\b\u0010)\u001a\u0004\u0018\u00010(\u0012\u0006\u0010,\u001a\u00020\u0012¢\u0006\u0004\b*\u0010-R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0019\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\u001d\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0014\u001a\u0004\b\u001b\u0010\u0016\"\u0004\b\u001c\u0010\u0018R$\u0010%\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006/"}, d2 = {"Lcom/tencent/mm/plugin/finder/playlist/FinderPlayListDrawer;", "Lcom/tencent/mm/view/drawer/RecyclerViewDrawer;", "Lcom/tencent/mm/plugin/finder/playlist/d2;", "y", "Lcom/tencent/mm/plugin/finder/playlist/d2;", "getInitParam", "()Lcom/tencent/mm/plugin/finder/playlist/d2;", "setInitParam", "(Lcom/tencent/mm/plugin/finder/playlist/d2;)V", "initParam", "", "z", "Z", "getUseCache", "()Z", "setUseCache", "(Z)V", "useCache", "", androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "I", "getScene", "()I", "setScene", "(I)V", com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "B", "getPosition", "setPosition", "position", "Lcom/tencent/mm/plugin/finder/playlist/s1;", "D", "Lcom/tencent/mm/plugin/finder/playlist/s1;", "getMPresenter", "()Lcom/tencent/mm/plugin/finder/playlist/s1;", "setMPresenter", "(Lcom/tencent/mm/plugin/finder/playlist/s1;)V", "mPresenter", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "com/tencent/mm/plugin/finder/playlist/k", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderPlayListDrawer extends com.tencent.mm.view.drawer.RecyclerViewDrawer {
    public static final com.tencent.mm.plugin.finder.playlist.k G = new com.tencent.mm.plugin.finder.playlist.k(null);
    public static final com.tencent.mm.plugin.finder.assist.g2 H = new com.tencent.mm.plugin.finder.assist.g2(1);

    /* renamed from: A, reason: from kotlin metadata */
    public int scene;

    /* renamed from: B, reason: from kotlin metadata */
    public int position;
    public com.tencent.mm.plugin.finder.playlist.o0 C;

    /* renamed from: D, reason: from kotlin metadata */
    public com.tencent.mm.plugin.finder.playlist.s1 mPresenter;
    public boolean E;
    public final com.tencent.mm.plugin.finder.playlist.c2 F;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    public com.tencent.mm.plugin.finder.playlist.d2 initParam;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    public boolean useCache;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderPlayListDrawer(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.useCache = !((com.tencent.mm.plugin.finder.storage.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).isTeenMode();
        this.scene = -1;
        this.position = -1;
        i95.m c17 = i95.n0.c(cq.k.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        this.F = ((cq.k) c17).f221227h;
    }

    public final com.tencent.mm.plugin.finder.playlist.d2 getInitParam() {
        com.tencent.mm.plugin.finder.playlist.d2 d2Var = this.initParam;
        if (d2Var != null) {
            return d2Var;
        }
        kotlin.jvm.internal.o.o("initParam");
        throw null;
    }

    public final com.tencent.mm.plugin.finder.playlist.s1 getMPresenter() {
        return this.mPresenter;
    }

    public final int getPosition() {
        return this.position;
    }

    public final int getScene() {
        return this.scene;
    }

    public final boolean getUseCache() {
        return this.useCache;
    }

    public final void setInitParam(com.tencent.mm.plugin.finder.playlist.d2 d2Var) {
        kotlin.jvm.internal.o.g(d2Var, "<set-?>");
        this.initParam = d2Var;
    }

    public final void setMPresenter(com.tencent.mm.plugin.finder.playlist.s1 s1Var) {
        this.mPresenter = s1Var;
    }

    public final void setPosition(int i17) {
        this.position = i17;
    }

    public final void setScene(int i17) {
        this.scene = i17;
    }

    public final void setUseCache(boolean z17) {
        this.useCache = z17;
    }

    public final void u() {
        if (q()) {
            n(true);
        }
    }

    public final java.lang.Integer v(com.tencent.mm.plugin.finder.playlist.z1 z1Var) {
        r45.vx0 vx0Var;
        r45.dm2 object_extend = z1Var.getFeedObject().getFeedObject().getObject_extend();
        if (object_extend == null || (vx0Var = (r45.vx0) object_extend.getCustom(0)) == null) {
            return null;
        }
        return java.lang.Integer.valueOf(vx0Var.getInteger(6));
    }

    public final void w(com.tencent.mm.plugin.finder.playlist.d2 initParam, int i17, int i18, int i19) {
        kotlin.jvm.internal.o.g(initParam, "initParam");
        com.tencent.mars.xlog.Log.i("Finder.FinderPlayListDrawer", "openDrawer, isDrawerOpen = " + q());
        if (q()) {
            return;
        }
        setInitParam(initParam);
        this.E = false;
        r45.vx0 vx0Var = initParam.f122285e;
        com.tencent.mm.plugin.finder.playlist.c2 c2Var = this.F;
        long j17 = initParam.f122281a;
        c2Var.a(vx0Var, j17);
        com.tencent.mm.plugin.finder.playlist.o0 o0Var = this.C;
        if (o0Var != null) {
            o0Var.d(null, null, 4);
        }
        this.scene = i17;
        this.position = i18;
        if (j17 == 0) {
            setChangeBackgroundAlpha(true);
            setBackgroundColorRes(com.tencent.mm.R.color.UN_BW_0_Alpha_0_5);
            setBackgroundResource(getBackgroundColorRes());
        }
        if (i19 > 0) {
            int h17 = com.tencent.mm.ui.bl.h(getContext());
            int g17 = com.tencent.mm.ui.bl.g(getContext());
            com.tencent.mm.plugin.finder.assist.e8 e8Var = com.tencent.mm.plugin.finder.assist.e8.f102131a;
            int a17 = (e8Var.a() - h17) - g17;
            android.content.Context context = getContext();
            kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
            android.view.View decorView = ((android.app.Activity) context).getWindow().getDecorView();
            kotlin.jvm.internal.o.f(decorView, "getDecorView(...)");
            setTopOffset((decorView.getSystemUiVisibility() & 1024) > 0 ? e8Var.b(getContext()) - i19 : java.lang.Math.min((int) (e8Var.a() * 0.4f), (a17 - i19) + h17));
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderPlayListDrawer", "call super.openDrawer(), isDrawerOpen = " + q());
        r(true, true, 0);
    }

    public final boolean x() {
        java.lang.Integer num;
        java.lang.Integer num2;
        java.lang.Integer v17;
        androidx.recyclerview.widget.RecyclerView recyclerView = getRecyclerView();
        com.tencent.mm.plugin.finder.playlist.o0 o0Var = this.C;
        if (!(o0Var != null && o0Var.f122386m) && (num = this.F.f122278c) != null) {
            if (!(num.intValue() > 0)) {
                num = null;
            }
            if (num != null) {
                int intValue = num.intValue();
                androidx.recyclerview.widget.f2 adapter = recyclerView.getAdapter();
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = adapter instanceof com.tencent.mm.view.recyclerview.WxRecyclerAdapter ? (com.tencent.mm.view.recyclerview.WxRecyclerAdapter) adapter : null;
                java.util.List data = wxRecyclerAdapter != null ? wxRecyclerAdapter.getData() : null;
                if (data != null) {
                    java.util.Iterator it = data.iterator();
                    int i17 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i17 = -1;
                            break;
                        }
                        in5.c cVar = (in5.c) it.next();
                        if ((cVar instanceof com.tencent.mm.plugin.finder.playlist.z1) && (v17 = v((com.tencent.mm.plugin.finder.playlist.z1) cVar)) != null && v17.intValue() == intValue) {
                            break;
                        }
                        i17++;
                    }
                    num2 = java.lang.Integer.valueOf(i17);
                } else {
                    num2 = null;
                }
                if (num2 == null || num2.intValue() < 0) {
                    return true;
                }
                androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager finderLinearLayoutManager = layoutManager instanceof com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager ? (com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager) layoutManager : null;
                if (finderLinearLayoutManager == null) {
                    return false;
                }
                r45.vx0 vx0Var = getInitParam().f122285e;
                if ((vx0Var != null ? vx0Var.getInteger(4) : 0) - num2.intValue() > 2) {
                    if (num2.intValue() - 1 >= 0) {
                        int intValue2 = num2.intValue() - 1;
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                        arrayList.add(0);
                        arrayList.add(java.lang.Integer.valueOf(intValue2));
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(finderLinearLayoutManager, arrayList.toArray(), "com/tencent/mm/plugin/finder/playlist/FinderPlayListDrawer", "realScrollToLastWatched", "()Z", "Undefined", "scrollToPositionWithOffset", "(II)V");
                        finderLinearLayoutManager.P(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
                        yj0.a.f(finderLinearLayoutManager, "com/tencent/mm/plugin/finder/playlist/FinderPlayListDrawer", "realScrollToLastWatched", "()Z", "Undefined", "scrollToPositionWithOffset", "(II)V");
                    }
                } else if (num2.intValue() >= 0) {
                    int intValue3 = num2.intValue();
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList2.add(0);
                    arrayList2.add(java.lang.Integer.valueOf(intValue3));
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(finderLinearLayoutManager, arrayList2.toArray(), "com/tencent/mm/plugin/finder/playlist/FinderPlayListDrawer", "realScrollToLastWatched", "()Z", "Undefined", "scrollToPositionWithOffset", "(II)V");
                    finderLinearLayoutManager.P(((java.lang.Integer) arrayList2.get(0)).intValue(), ((java.lang.Integer) arrayList2.get(1)).intValue());
                    yj0.a.f(finderLinearLayoutManager, "com/tencent/mm/plugin/finder/playlist/FinderPlayListDrawer", "realScrollToLastWatched", "()Z", "Undefined", "scrollToPositionWithOffset", "(II)V");
                }
                pm0.v.V(500L, new com.tencent.mm.plugin.finder.playlist.m(this));
                return false;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if ((r2.intValue() > 0) != false) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0087 A[EDGE_INSN: B:34:0x0087->B:35:0x0087 BREAK  A[LOOP:0: B:23:0x005f->B:51:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[LOOP:0: B:23:0x005f->B:51:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void y() {
        /*
            r12 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r12.getRecyclerView()
            com.tencent.mm.plugin.finder.playlist.o0 r1 = r12.C
            if (r1 != 0) goto L9
            return
        L9:
            com.tencent.mm.plugin.finder.playlist.c2 r2 = r12.F
            java.lang.Integer r2 = r2.f122278c
            r3 = 1
            r4 = 0
            r5 = 0
            if (r2 == 0) goto L1e
            int r6 = r2.intValue()
            if (r6 <= 0) goto L1a
            r6 = r3
            goto L1b
        L1a:
            r6 = r4
        L1b:
            if (r6 == 0) goto L1e
            goto L1f
        L1e:
            r2 = r5
        L1f:
            androidx.recyclerview.widget.RecyclerView$LayoutManager r6 = r0.getLayoutManager()
            boolean r7 = r6 instanceof androidx.recyclerview.widget.LinearLayoutManager
            if (r7 == 0) goto L2a
            androidx.recyclerview.widget.LinearLayoutManager r6 = (androidx.recyclerview.widget.LinearLayoutManager) r6
            goto L2b
        L2a:
            r6 = r5
        L2b:
            if (r2 == 0) goto Ld5
            if (r6 != 0) goto L31
            goto Ld5
        L31:
            jz5.l r6 = hc2.f1.s(r0, r4)
            java.lang.Object r7 = r6.f302833d
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            java.lang.Object r6 = r6.f302834e
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            androidx.recyclerview.widget.f2 r0 = r0.getAdapter()
            boolean r8 = r0 instanceof com.tencent.mm.view.recyclerview.WxRecyclerAdapter
            if (r8 == 0) goto L50
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter r0 = (com.tencent.mm.view.recyclerview.WxRecyclerAdapter) r0
            goto L51
        L50:
            r0 = r5
        L51:
            if (r0 == 0) goto L58
            java.util.List r0 = r0.getData()
            goto L59
        L58:
            r0 = r5
        L59:
            if (r0 == 0) goto L8a
            java.util.Iterator r8 = r0.iterator()
        L5f:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L86
            java.lang.Object r9 = r8.next()
            r10 = r9
            in5.c r10 = (in5.c) r10
            boolean r11 = r10 instanceof com.tencent.mm.plugin.finder.playlist.z1
            if (r11 == 0) goto L82
            com.tencent.mm.plugin.finder.playlist.z1 r10 = (com.tencent.mm.plugin.finder.playlist.z1) r10
            boolean r11 = r10.f122508d
            if (r11 == 0) goto L82
            java.lang.Integer r10 = r12.v(r10)
            boolean r10 = kotlin.jvm.internal.o.b(r10, r2)
            if (r10 == 0) goto L82
            r10 = r3
            goto L83
        L82:
            r10 = r4
        L83:
            if (r10 == 0) goto L5f
            goto L87
        L86:
            r9 = r5
        L87:
            in5.c r9 = (in5.c) r9
            goto L8b
        L8a:
            r9 = r5
        L8b:
            com.tencent.mm.plugin.finder.playlist.k r8 = com.tencent.mm.plugin.finder.playlist.FinderPlayListDrawer.G
            java.lang.Integer r7 = r8.b(r0, r7)
            java.lang.Integer r0 = r8.b(r0, r6)
            if (r9 != 0) goto Lcf
            if (r7 == 0) goto Lcf
            if (r0 != 0) goto L9c
            goto Lcf
        L9c:
            e06.k r6 = new e06.k
            int r8 = r7.intValue()
            int r0 = r0.intValue()
            r6.<init>(r8, r0)
            int r0 = r2.intValue()
            boolean r0 = r6.m(r0)
            if (r0 == 0) goto Lb9
            int r0 = com.tencent.mm.plugin.finder.playlist.o0.f122379o
            r1.d(r5, r5, r5)
            goto Lce
        Lb9:
            int r0 = r2.intValue()
            int r6 = r7.intValue()
            if (r0 >= r6) goto Lc4
            goto Lc5
        Lc4:
            r3 = r4
        Lc5:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            int r3 = com.tencent.mm.plugin.finder.playlist.o0.f122379o
            r1.d(r2, r0, r5)
        Lce:
            return
        Lcf:
            int r0 = com.tencent.mm.plugin.finder.playlist.o0.f122379o
            r1.d(r5, r5, r5)
            return
        Ld5:
            int r0 = com.tencent.mm.plugin.finder.playlist.o0.f122379o
            r1.d(r5, r5, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.playlist.FinderPlayListDrawer.y():void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderPlayListDrawer(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.useCache = !((com.tencent.mm.plugin.finder.storage.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).isTeenMode();
        this.scene = -1;
        this.position = -1;
        i95.m c17 = i95.n0.c(cq.k.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        this.F = ((cq.k) c17).f221227h;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderPlayListDrawer(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.useCache = !((com.tencent.mm.plugin.finder.storage.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).isTeenMode();
        this.scene = -1;
        this.position = -1;
        i95.m c17 = i95.n0.c(cq.k.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        this.F = ((cq.k) c17).f221227h;
    }
}
