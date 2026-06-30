package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes11.dex */
public final class w1 extends android.widget.FrameLayout implements bi4.s0 {

    /* renamed from: d, reason: collision with root package name */
    public final bi4.m0 f174385d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f174386e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f174387f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f174388g;

    /* renamed from: h, reason: collision with root package name */
    public final bi4.k1 f174389h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f174390i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f174391m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f174392n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f174393o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f174394p;

    /* renamed from: q, reason: collision with root package name */
    public ij4.i f174395q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f174396r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f174397s;

    /* renamed from: t, reason: collision with root package name */
    public int f174398t;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public w1(android.content.Context r3, android.util.AttributeSet r4, bi4.m0 r5, java.lang.String r6, java.util.ArrayList r7, boolean r8, bi4.k1 r9, int r10, kotlin.jvm.internal.i r11) {
        /*
            Method dump skipped, instructions count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.textstatus.ui.w1.<init>(android.content.Context, android.util.AttributeSet, bi4.m0, java.lang.String, java.util.ArrayList, boolean, bi4.k1, int, kotlin.jvm.internal.i):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.tencent.mm.plugin.textstatus.ui.card.TextStatusCardFeedUIC getCardFeedUIC() {
        return (com.tencent.mm.plugin.textstatus.ui.card.TextStatusCardFeedUIC) ((jz5.n) this.f174396r).getValue();
    }

    private final com.tencent.mm.plugin.textstatus.ui.StatusIndicator getIndicator() {
        java.lang.Object value = ((jz5.n) this.f174394p).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (com.tencent.mm.plugin.textstatus.ui.StatusIndicator) value;
    }

    private final com.tencent.mm.view.recyclerview.WxRecyclerView getRecyclerView() {
        java.lang.Object value = ((jz5.n) this.f174392n).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (com.tencent.mm.view.recyclerview.WxRecyclerView) value;
    }

    private final com.tencent.mm.plugin.textstatus.ui.a getRvAdapter() {
        return (com.tencent.mm.plugin.textstatus.ui.a) ((jz5.n) this.f174393o).getValue();
    }

    @Override // bi4.s0
    public void I5(java.lang.String str) {
        com.tencent.mars.xlog.Log.i(this.f174390i, "updateByStatusId: " + str);
    }

    public final boolean b() {
        return !(getCardFeedUIC() != null ? r0.f173785s : false);
    }

    @Override // bi4.s0
    public void b4(java.lang.String str) {
        com.tencent.mars.xlog.Log.i(this.f174390i, "update: db notify " + str);
        j(ai4.m0.f5173a.G().q(str));
    }

    public final void c(yz5.a aVar) {
        getRecyclerView().post(new com.tencent.mm.plugin.textstatus.ui.k1(this, aVar));
    }

    public final void d(yz5.l matchFilter, yz5.l checkRefreshListCallback) {
        kotlin.jvm.internal.o.g(matchFilter, "matchFilter");
        kotlin.jvm.internal.o.g(checkRefreshListCallback, "checkRefreshListCallback");
        int size = getRvAdapter().I.size();
        java.lang.String str = this.f174390i;
        if (size <= 0) {
            com.tencent.mars.xlog.Log.i(str, "findDeleteStatusByFilter: no data");
            checkRefreshListCallback.invoke(0);
            return;
        }
        int size2 = getRvAdapter().I.size();
        for (int i17 = 0; i17 < size2; i17++) {
            java.lang.Object obj = getRvAdapter().I.get(i17);
            kotlin.jvm.internal.o.f(obj, "get(...)");
            in5.c cVar = (in5.c) obj;
            if ((cVar instanceof ij4.d) && ((java.lang.Boolean) matchFilter.invoke(((ij4.d) cVar).f291717d)).booleanValue()) {
                getRvAdapter().I.remove(cVar);
                if (((java.lang.Boolean) checkRefreshListCallback.invoke(java.lang.Integer.valueOf(getRealDataSize()))).booleanValue()) {
                    com.tencent.mars.xlog.Log.i(str, "findDeleteStatusByFilter: refresh pos=" + i17);
                    getRvAdapter().notifyDataSetChanged();
                    this.f174397s = "";
                    h(getInitScrollIndex());
                    return;
                }
                return;
            }
        }
    }

    public final void e(java.lang.String statusId, int i17) {
        kotlin.jvm.internal.o.g(statusId, "statusId");
        java.util.Iterator it = getRvAdapter().I.iterator();
        while (it.hasNext()) {
            in5.c cVar = (in5.c) it.next();
            if (cVar instanceof ij4.d) {
                ij4.d dVar = (ij4.d) cVar;
                if (kotlin.jvm.internal.o.b(((mj4.k) dVar.f291717d).l(), statusId)) {
                    com.tencent.mars.xlog.Log.i(this.f174390i, "markStatusExpired[" + dVar.f291717d.hashCode() + "]: " + statusId + ", " + i17);
                    mj4.k kVar = (mj4.k) dVar.f291717d;
                    kVar.getClass();
                    mj4.j jVar = new mj4.j(kVar);
                    jVar.f327066b.put("field_ExpireTime", java.lang.Integer.valueOf(i17));
                    dVar.f291717d = jVar.a();
                    getRvAdapter().notifyDataSetChanged();
                    return;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0075, code lost:
    
        if (kotlin.jvm.internal.o.b(r2, ((com.tencent.mm.plugin.textstatus.ui.w1) r3).getIdentify()) == false) goto L69;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(int r7) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.textstatus.ui.w1.f(int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:162:0x0186, code lost:
    
        if (kotlin.jvm.internal.o.b(r4 != null ? r4.f355139d : null, "15") != false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0051, code lost:
    
        if (kotlin.jvm.internal.o.b(r3, ((com.tencent.mm.plugin.textstatus.ui.w1) r4).getIdentify()) == false) goto L180;
     */
    /* JADX WARN: Removed duplicated region for block: B:166:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0209  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(int r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 681
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.textstatus.ui.w1.g(int, boolean):void");
    }

    public final java.util.ArrayList<in5.c> getAdapterConvertData() {
        return getRvAdapter().I;
    }

    public final bi4.m0 getCardEventListener() {
        return this.f174385d;
    }

    public final android.view.View getContentView$plugin_textstatus_release() {
        java.lang.Object value = ((jz5.n) this.f174391m).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.view.View) value;
    }

    public final bi4.k1 getCustomShowParam() {
        return this.f174389h;
    }

    public final java.lang.String getIdentify() {
        return java.lang.String.valueOf(hashCode());
    }

    public final int getInitScrollIndex() {
        if (getRealDataSize() <= getRvAdapter().f173705J) {
            return 0;
        }
        return 1073741823 - (1073741823 % getRealDataSize());
    }

    public final java.lang.String getKeyForListenDB() {
        java.lang.Object Z = kz5.n0.Z(getRvAdapter().I);
        ij4.d dVar = Z instanceof ij4.d ? (ij4.d) Z : null;
        mj4.h hVar = dVar != null ? dVar.f291717d : null;
        java.lang.String o17 = hVar != null ? ((mj4.k) hVar).o() : "";
        java.lang.Boolean valueOf = hVar != null ? java.lang.Boolean.valueOf(((mj4.k) hVar).w()) : null;
        if (kotlin.jvm.internal.o.b(o17, bk4.k1.a()) && kotlin.jvm.internal.o.b(valueOf, java.lang.Boolean.FALSE)) {
            return o17;
        }
        return null;
    }

    public final java.util.ArrayList<java.lang.String> getLikedStatusIdList() {
        return this.f174387f;
    }

    public final int getRealDataSize() {
        return getRvAdapter().I.size();
    }

    public final java.lang.String getScene() {
        return this.f174386e;
    }

    public final boolean getShouldMultipleStatusCardViewListenDB() {
        return this.f174388g;
    }

    public final void h(int i17) {
        this.f174398t = i17;
        int realDataSize = getRealDataSize();
        int realDataSize2 = getRealDataSize() == 0 ? 0 : i17 % getRealDataSize();
        getIndicator().setSelect(realDataSize2);
        java.lang.Object a07 = kz5.n0.a0(getRvAdapter().I, realDataSize2);
        ij4.d dVar = a07 instanceof ij4.d ? (ij4.d) a07 : null;
        mj4.h hVar = dVar != null ? dVar.f291717d : null;
        this.f174397s = hVar != null ? ((mj4.k) hVar).l() : "";
        com.tencent.mars.xlog.Log.i(this.f174390i, "refreshIndicator: to " + i17 + ", realPos=" + realDataSize2 + ", realDataSize=" + realDataSize + ", curDisplayStatusId=" + this.f174397s);
        if (realDataSize > 1) {
            getIndicator().setVisibility(0);
        } else {
            getIndicator().setVisibility(8);
        }
    }

    public final void i(int i17, boolean z17, boolean z18) {
        java.lang.String str = "scrollToPosition: pos=" + i17 + ", itemCount=" + getRvAdapter().x();
        java.lang.String str2 = this.f174390i;
        com.tencent.mars.xlog.Log.i(str2, str);
        if (getRvAdapter().x() <= i17) {
            return;
        }
        int realDataSize = getRealDataSize() == 0 ? 0 : i17 % getRealDataSize();
        java.lang.Object a07 = kz5.n0.a0(getRvAdapter().I, realDataSize);
        ij4.d dVar = a07 instanceof ij4.d ? (ij4.d) a07 : null;
        mj4.h hVar = dVar != null ? dVar.f291717d : null;
        if (kotlin.jvm.internal.o.b(hVar != null ? ((mj4.k) hVar).l() : "", this.f174397s)) {
            com.tencent.mars.xlog.Log.i(str2, "scrollToPosition: statusId same=" + this.f174397s + ", realPos=" + realDataSize + ", forceNotifyPageSettle=" + z17 + ", skip");
            if (z17) {
                g(i17, false);
                return;
            }
            return;
        }
        if (z18) {
            com.tencent.mm.view.recyclerview.WxRecyclerView recyclerView = getRecyclerView();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(recyclerView, arrayList.toArray(), "com/tencent/mm/plugin/textstatus/ui/MultipleStatusCardView", "scrollToPosition", "(IZZ)V", "Undefined", "smoothScrollToPosition", "(I)V");
            recyclerView.c1(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(recyclerView, "com/tencent/mm/plugin/textstatus/ui/MultipleStatusCardView", "scrollToPosition", "(IZZ)V", "Undefined", "smoothScrollToPosition", "(I)V");
        } else {
            com.tencent.mm.view.recyclerview.WxRecyclerView recyclerView2 = getRecyclerView();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(recyclerView2, arrayList2.toArray(), "com/tencent/mm/plugin/textstatus/ui/MultipleStatusCardView", "scrollToPosition", "(IZZ)V", "Undefined", "scrollToPosition", "(I)V");
            recyclerView2.a1(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(recyclerView2, "com/tencent/mm/plugin/textstatus/ui/MultipleStatusCardView", "scrollToPosition", "(IZZ)V", "Undefined", "scrollToPosition", "(I)V");
        }
        getRecyclerView().post(new com.tencent.mm.plugin.textstatus.ui.t1(this, i17));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean j(java.util.List r14) {
        /*
            Method dump skipped, instructions count: 638
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.textstatus.ui.w1.j(java.util.List):boolean");
    }

    public final void k() {
        com.tencent.mm.plugin.textstatus.ui.card.TextStatusCardFeedUIC cardFeedUIC = getCardFeedUIC();
        if (cardFeedUIC != null ? cardFeedUIC.f173773d : false) {
            com.tencent.mm.ui.kk.d(getIndicator(), i65.a.h(getContext(), com.tencent.mm.R.dimen.f479659bw));
            return;
        }
        int h17 = i65.a.h(getContext(), com.tencent.mm.R.dimen.f479738dv);
        java.lang.String str = this.f174386e;
        if (!kotlin.jvm.internal.o.b(str, "SCENE_MULTIPLE_DIALOG") && !kotlin.jvm.internal.o.b(str, "SCENE_MORE_TAB") && !kotlin.jvm.internal.o.b(str, "SCENE_CONTACT_PROFILE")) {
            h17 += com.tencent.mm.ui.bl.c(getContext());
        }
        com.tencent.mm.ui.kk.d(getIndicator(), h17);
    }
}
