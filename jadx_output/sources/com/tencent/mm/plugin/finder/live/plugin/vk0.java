package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class vk0 extends com.tencent.mm.plugin.finder.live.plugin.l implements he2.b {

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f114784p;

    /* renamed from: q, reason: collision with root package name */
    public long f114785q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f114786r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f114787s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f114788t;

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f114789u;

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f114790v;

    /* renamed from: w, reason: collision with root package name */
    public int f114791w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f114792x;

    static {
        jz5.h.b(com.tencent.mm.plugin.finder.live.plugin.lk0.f113409d);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vk0(android.view.ViewGroup root, qo0.c statusMonitor) {
        super(root, statusMonitor, null);
        int i17;
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        this.f114784p = jz5.h.b(new com.tencent.mm.plugin.finder.live.plugin.uk0(root, this));
        this.f114786r = true;
        this.f114787s = jz5.h.b(new com.tencent.mm.plugin.finder.live.plugin.tk0(this));
        this.f114788t = jz5.h.b(new com.tencent.mm.plugin.finder.live.plugin.pk0(root, this));
        this.f114789u = jz5.h.b(new com.tencent.mm.plugin.finder.live.plugin.qk0(root));
        this.f114790v = jz5.h.b(new com.tencent.mm.plugin.finder.live.plugin.nk0(this));
        if (x0()) {
            i17 = (int) (com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a).y * 0.22d);
            com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a);
        } else {
            i17 = (int) (com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a).y * 0.25d);
            com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a);
        }
        com.tencent.mm.plugin.finder.live.view.FinderMaxSizeLayout finderMaxSizeLayout = (com.tencent.mm.plugin.finder.live.view.FinderMaxSizeLayout) root.findViewById(com.tencent.mm.R.id.s5t);
        finderMaxSizeLayout.b(i17, false);
        finderMaxSizeLayout.setForbidHorizontalScroll(true);
        com.tencent.mm.view.recyclerview.WxRecyclerView u17 = u1();
        u17.setLayoutManager(new com.tencent.mm.plugin.finder.live.plugin.FinderLiveVisitorShopMsgPlugin$2$1(u17.getRootView().getContext()));
        u17.N(new com.tencent.mm.plugin.finder.live.plugin.kk0(root));
        this.f114792x = true;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean G() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void M0(qo0.b status, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(status, "status");
        if (com.tencent.mm.plugin.finder.live.plugin.mk0.f113525a[status.ordinal()] == 1) {
            this.f114792x = !(bundle != null ? bundle.getBoolean("PARAM_IS_ENTERING_COMMENT") : false);
        }
    }

    @Override // he2.b
    public android.view.View W() {
        return this.f365323d;
    }

    @Override // he2.b
    public void j(boolean z17) {
        df2.xw xwVar = (df2.xw) U0(df2.xw.class);
        if (xwVar == null) {
            return;
        }
        xwVar.f231815s = z17;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean k() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean r() {
        return x0() || this.f114792x;
    }

    public final bm2.a8 t1() {
        return (bm2.a8) ((jz5.n) this.f114790v).getValue();
    }

    public final com.tencent.mm.view.recyclerview.WxRecyclerView u1() {
        java.lang.Object value = this.f114784p.getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (com.tencent.mm.view.recyclerview.WxRecyclerView) value;
    }

    public final void v1(java.util.List liveAppMsgList) {
        java.lang.String string;
        kotlin.jvm.internal.o.g(liveAppMsgList, "liveAppMsgList");
        bm2.a8 t17 = t1();
        t17.getClass();
        java.util.ArrayList arrayList = t17.f21779m;
        int size = arrayList.size();
        arrayList.addAll(liveAppMsgList);
        t17.notifyItemInserted(size);
        if (this.f114786r) {
            com.tencent.mm.view.recyclerview.WxRecyclerView u17 = u1();
            int itemCount = t1().getItemCount() - 1;
            if (itemCount < 0) {
                itemCount = 0;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList2.add(java.lang.Integer.valueOf(itemCount));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(u17, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorShopMsgPlugin", "onReceiveNewMsg", "(Ljava/util/List;)V", "Undefined", "smoothScrollToPosition", "(I)V");
            u17.c1(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(u17, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorShopMsgPlugin", "onReceiveNewMsg", "(Ljava/util/List;)V", "Undefined", "smoothScrollToPosition", "(I)V");
            this.f114791w = 0;
            return;
        }
        android.view.View view = (android.view.View) ((jz5.n) this.f114788t).getValue();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorShopMsgPlugin", "onReceiveNewMsg", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorShopMsgPlugin", "onReceiveNewMsg", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int size2 = this.f114791w + liveAppMsgList.size();
        this.f114791w = size2;
        android.view.ViewGroup viewGroup = this.f365323d;
        if (size2 <= 99) {
            string = java.lang.String.valueOf(size2);
        } else {
            string = viewGroup.getContext().getResources().getString(com.tencent.mm.R.string.dyj);
            kotlin.jvm.internal.o.d(string);
        }
        android.widget.TextView textView = (android.widget.TextView) ((jz5.n) this.f114789u).getValue();
        java.lang.String string2 = viewGroup.getContext().getResources().getString(com.tencent.mm.R.string.dzs);
        kotlin.jvm.internal.o.f(string2, "getString(...)");
        java.lang.String format = java.lang.String.format(string2, java.util.Arrays.copyOf(new java.lang.Object[]{string}, 1));
        kotlin.jvm.internal.o.f(format, "format(...)");
        textView.setText(format);
    }

    @Override // he2.b
    public void w(int i17) {
        com.tencent.mm.plugin.finder.live.view.FinderMaxSizeLayout finderMaxSizeLayout = (com.tencent.mm.plugin.finder.live.view.FinderMaxSizeLayout) this.f365323d.findViewById(com.tencent.mm.R.id.s5t);
        finderMaxSizeLayout.b(finderMaxSizeLayout.getHeight(), false);
    }

    public final void w1(r45.d54 status, java.lang.String clientMsgId) {
        kotlin.jvm.internal.o.g(status, "status");
        kotlin.jvm.internal.o.g(clientMsgId, "clientMsgId");
        bm2.a8 t17 = t1();
        t17.getClass();
        java.util.ArrayList arrayList = t17.f21779m;
        java.util.Iterator it = arrayList.iterator();
        boolean z17 = false;
        int i17 = 0;
        while (true) {
            if (!it.hasNext()) {
                i17 = -1;
                break;
            } else if (kotlin.jvm.internal.o.b(((dk2.zf) it.next()).v(), clientMsgId)) {
                break;
            } else {
                i17++;
            }
        }
        if (i17 >= 0 && i17 < arrayList.size()) {
            z17 = true;
        }
        if (z17) {
            java.lang.Object obj = arrayList.get(i17);
            dk2.dg dgVar = obj instanceof dk2.dg ? (dk2.dg) obj : null;
            if (dgVar != null) {
                dgVar.t(status);
            }
            t17.notifyItemChanged(i17);
        }
    }
}
