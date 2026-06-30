package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class z40 implements com.tencent.mm.plugin.finder.live.plugin.ep0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f115281d;

    /* renamed from: e, reason: collision with root package name */
    public final gk2.e f115282e;

    /* renamed from: f, reason: collision with root package name */
    public final qo0.c f115283f;

    /* renamed from: g, reason: collision with root package name */
    public final cm2.t f115284g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f115285h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.ViewGroup f115286i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f115287m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f115288n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f115289o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f115290p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f115291q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f115292r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f115293s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f115294t;

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f115295u;

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.String f115296v;

    /* renamed from: w, reason: collision with root package name */
    public final long f115297w;

    /* renamed from: x, reason: collision with root package name */
    public kotlinx.coroutines.r2 f115298x;

    public z40(android.content.Context context, gk2.e buContext, qo0.c statusMonitor, yz5.l lVar, cm2.t tVar) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(buContext, "buContext");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        this.f115281d = context;
        this.f115282e = buContext;
        this.f115283f = statusMonitor;
        this.f115284g = tVar;
        this.f115285h = "FinderLivePlayListBubble";
        this.f115287m = jz5.h.b(new com.tencent.mm.plugin.finder.live.plugin.y40(this));
        this.f115288n = jz5.h.b(new com.tencent.mm.plugin.finder.live.plugin.x40(this));
        jz5.h.b(new com.tencent.mm.plugin.finder.live.plugin.l40(this));
        this.f115289o = jz5.h.b(new com.tencent.mm.plugin.finder.live.plugin.m40(this));
        this.f115290p = jz5.h.b(new com.tencent.mm.plugin.finder.live.plugin.n40(this));
        this.f115291q = jz5.h.b(new com.tencent.mm.plugin.finder.live.plugin.o40(this));
        this.f115292r = jz5.h.b(new com.tencent.mm.plugin.finder.live.plugin.i40(this));
        this.f115293s = jz5.h.b(new com.tencent.mm.plugin.finder.live.plugin.j40(this));
        this.f115294t = jz5.h.b(new com.tencent.mm.plugin.finder.live.plugin.k40(this));
        this.f115295u = "PORTRAIT_ACTION_FINDER_PLAY_LIST_CLICK";
        this.f115296v = "PORTRAIT_ACTION_BUNDLE_OPEN_PLAY_LIST";
        this.f115297w = 5000L;
        android.view.View inflate = com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.f488964ax4, (android.view.ViewGroup) null);
        kotlin.jvm.internal.o.e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        this.f115286i = (android.view.ViewGroup) inflate;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.ep0
    public cm2.t A() {
        return this.f115284g;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.ep0
    public void B(android.os.Bundle bundle, java.lang.Object obj, long j17) {
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = null;
        java.lang.String string = bundle != null ? bundle.getString("ACTION_POST_PORTRAIT", "") : null;
        if (string == null) {
            string = "";
        }
        if (kotlin.jvm.internal.o.b(string, this.f115295u)) {
            com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo2 = new com.tencent.mm.protocal.protobuf.FinderJumpInfo();
            android.os.Bundle bundle2 = obj instanceof android.os.Bundle ? (android.os.Bundle) obj : null;
            byte[] byteArray = bundle2 != null ? bundle2.getByteArray(this.f115296v) : null;
            if (byteArray != null) {
                try {
                    finderJumpInfo2.parseFrom(byteArray);
                    finderJumpInfo = finderJumpInfo2;
                } catch (java.lang.Exception e17) {
                    com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
                }
            }
            if (finderJumpInfo != null) {
                ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                android.content.Context context = this.f115281d;
                kotlin.jvm.internal.o.g(context, "context");
                xc2.y2 y2Var = xc2.y2.f453343a;
                xc2.p0 p0Var = new xc2.p0(finderJumpInfo);
                p0Var.f453252n = 0;
                xc2.y2.i(y2Var, context, p0Var, 0, null, 8, null);
            }
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.ep0
    public void U() {
    }

    public final void a(cm2.d0 d0Var) {
        ((android.widget.TextView) ((jz5.n) this.f115287m).getValue()).setText(d0Var.f43335v.getString(1));
        android.widget.TextView textView = (android.widget.TextView) ((jz5.n) this.f115288n).getValue();
        android.view.ViewGroup viewGroup = this.f115286i;
        if (viewGroup == null) {
            kotlin.jvm.internal.o.o("root");
            throw null;
        }
        android.content.Context context = viewGroup.getContext();
        r45.v42 v42Var = d0Var.f43335v;
        textView.setText(context.getString(com.tencent.mm.R.string.e4r, k35.m1.d("HH:mm", v42Var.getInteger(2))));
        int integer = v42Var.getInteger(4);
        jz5.g gVar = this.f115290p;
        jz5.g gVar2 = this.f115289o;
        gk2.e eVar = this.f115282e;
        if (integer == 0) {
            android.view.View view = (android.view.View) ((jz5.n) gVar2).getValue();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLivePlayListBubble", "refreshView", "(Lcom/tencent/mm/plugin/finder/live/view/convert/PromotePlayListItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/plugin/FinderLivePlayListBubble", "refreshView", "(Lcom/tencent/mm/plugin/finder/live/view/convert/PromotePlayListItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ((android.widget.TextView) ((jz5.n) gVar).getValue()).setText(viewGroup.getContext().getString(com.tencent.mm.R.string.e4q));
            kotlinx.coroutines.r2 r2Var = this.f115298x;
            if (r2Var != null) {
                kotlinx.coroutines.p2.a(r2Var, null, 1, null);
            }
        } else {
            android.view.View view2 = (android.view.View) ((jz5.n) gVar2).getValue();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLivePlayListBubble", "refreshView", "(Lcom/tencent/mm/plugin/finder/live/view/convert/PromotePlayListItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/plugin/FinderLivePlayListBubble", "refreshView", "(Lcom/tencent/mm/plugin/finder/live/view/convert/PromotePlayListItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ((android.widget.TextView) ((jz5.n) gVar).getValue()).setText(viewGroup.getContext().getString(com.tencent.mm.R.string.e4s));
            yg2.b bVar = eVar.f272475i;
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.l.d(bVar, kotlinx.coroutines.internal.b0.f310484a, null, new com.tencent.mm.plugin.finder.live.plugin.q40(this, d0Var, null), 2, null);
        }
        boolean y17 = zl2.r4.f473950a.y1(eVar);
        jz5.g gVar3 = this.f115294t;
        jz5.g gVar4 = this.f115293s;
        jz5.g gVar5 = this.f115291q;
        if (y17) {
            android.view.View view3 = (android.view.View) ((jz5.n) gVar5).getValue();
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLivePlayListBubble", "refreshView", "(Lcom/tencent/mm/plugin/finder/live/view/convert/PromotePlayListItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/plugin/FinderLivePlayListBubble", "refreshView", "(Lcom/tencent/mm/plugin/finder/live/view/convert/PromotePlayListItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ((android.view.View) ((jz5.n) gVar5).getValue()).setOnClickListener(null);
            ((android.widget.TextView) ((jz5.n) gVar4).getValue()).setVisibility(0);
            ((android.widget.TextView) ((jz5.n) gVar4).getValue()).setText(this.f115281d.getString(com.tencent.mm.R.string.e8k, java.lang.Long.valueOf(v42Var.getLong(3))));
            android.view.View view4 = (android.view.View) ((jz5.n) gVar3).getValue();
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(4);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLivePlayListBubble", "refreshView", "(Lcom/tencent/mm/plugin/finder/live/view/convert/PromotePlayListItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/finder/live/plugin/FinderLivePlayListBubble", "refreshView", "(Lcom/tencent/mm/plugin/finder/live/view/convert/PromotePlayListItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View view5 = (android.view.View) ((jz5.n) gVar5).getValue();
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            arrayList5.add(0);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLivePlayListBubble", "refreshView", "(Lcom/tencent/mm/plugin/finder/live/view/convert/PromotePlayListItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/finder/live/plugin/FinderLivePlayListBubble", "refreshView", "(Lcom/tencent/mm/plugin/finder/live/view/convert/PromotePlayListItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ((android.widget.TextView) ((jz5.n) gVar4).getValue()).setVisibility(8);
            android.view.View view6 = (android.view.View) ((jz5.n) gVar3).getValue();
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            arrayList6.add(0);
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(view6, arrayList6.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLivePlayListBubble", "refreshView", "(Lcom/tencent/mm/plugin/finder/live/view/convert/PromotePlayListItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(view6, "com/tencent/mm/plugin/finder/live/plugin/FinderLivePlayListBubble", "refreshView", "(Lcom/tencent/mm/plugin/finder/live/view/convert/PromotePlayListItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ((android.view.View) ((jz5.n) gVar5).getValue()).setOnClickListener(new com.tencent.mm.plugin.finder.live.plugin.u40(this, d0Var));
            ((android.view.View) ((jz5.n) gVar3).getValue()).setOnClickListener(new com.tencent.mm.plugin.finder.live.plugin.v40(this, d0Var));
        }
        ((android.view.View) ((jz5.n) this.f115292r).getValue()).setOnClickListener(new com.tencent.mm.plugin.finder.live.plugin.w40(this, d0Var));
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.ep0
    public int e0() {
        return com.tencent.mm.R.id.bys;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.ep0
    public void f0(java.lang.Object data) {
        kotlin.jvm.internal.o.g(data, "data");
        if (data instanceof cm2.d0) {
            a((cm2.d0) data);
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.ep0
    public android.view.View getView() {
        android.view.ViewGroup viewGroup = this.f115286i;
        if (viewGroup != null) {
            return viewGroup;
        }
        kotlin.jvm.internal.o.o("root");
        throw null;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.ep0
    public void l(java.lang.Object data) {
        kotlin.jvm.internal.o.g(data, "data");
        if (data instanceof cm2.d0) {
            a((cm2.d0) data);
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.ep0
    public void l0() {
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.ep0
    public int p0() {
        return com.tencent.mm.R.id.hhj;
    }
}
