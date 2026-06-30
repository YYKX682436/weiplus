package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class i80 implements com.tencent.mm.plugin.finder.live.plugin.ep0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f112937d;

    /* renamed from: e, reason: collision with root package name */
    public final gk2.e f112938e;

    /* renamed from: f, reason: collision with root package name */
    public final qo0.c f112939f;

    /* renamed from: g, reason: collision with root package name */
    public final yz5.l f112940g;

    /* renamed from: h, reason: collision with root package name */
    public final cm2.t f112941h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f112942i;

    /* renamed from: m, reason: collision with root package name */
    public final android.view.ViewGroup f112943m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f112944n;

    /* renamed from: o, reason: collision with root package name */
    public kotlinx.coroutines.r2 f112945o;

    /* renamed from: p, reason: collision with root package name */
    public cm2.f0 f112946p;

    public i80(android.content.Context context, gk2.e buContext, qo0.c statusMonitor, yz5.l lVar, cm2.t tVar) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(buContext, "buContext");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        this.f112937d = context;
        this.f112938e = buContext;
        this.f112939f = statusMonitor;
        this.f112940g = lVar;
        this.f112941h = tVar;
        this.f112942i = "FinderLiveRedPacketBubble";
        android.view.View inflate = com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.f488972ay3, (android.view.ViewGroup) null);
        kotlin.jvm.internal.o.e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        this.f112943m = (android.view.ViewGroup) inflate;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.ep0
    public cm2.t A() {
        return this.f112941h;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.ep0
    public void B(android.os.Bundle bundle, java.lang.Object obj, long j17) {
        cm2.f0 f0Var;
        java.lang.String string = bundle != null ? bundle.getString("ACTION_POST_PORTRAIT", "") : null;
        if (!kotlin.jvm.internal.o.b(string != null ? string : "", "POST_PORTRAIT") || (f0Var = this.f112946p) == null) {
            return;
        }
        a(f0Var);
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.ep0
    public void U() {
    }

    public final void a(cm2.f0 f0Var) {
        java.util.LinkedList list;
        r45.wd5 wd5Var;
        xu2.u uVar;
        xu2.v vVar;
        com.tencent.mm.plugin.finder.live.plugin.r60 r60Var;
        android.content.Context context = this.f112937d;
        boolean z17 = context.getResources().getConfiguration().orientation == 2;
        java.lang.String str = this.f112942i;
        com.tencent.mars.xlog.Log.i(str, "goRedPacketCoverPage isLandscape:" + z17);
        java.lang.String str2 = null;
        if (z17) {
            dk2.ef efVar = dk2.ef.f233372a;
            com.tencent.mm.plugin.finder.live.view.k0 k0Var = dk2.ef.f233380e;
            if (k0Var == null || (r60Var = (com.tencent.mm.plugin.finder.live.plugin.r60) k0Var.getPlugin(com.tencent.mm.plugin.finder.live.plugin.r60.class)) == null) {
                return;
            }
            com.tencent.mm.plugin.finder.live.plugin.l.q1(r60Var, "POST_PORTRAIT", null, 2, null);
            return;
        }
        bf2.c.c(bf2.c.f19598a, this.f112938e, 5, 7, null, 0, null, 0, 0, null, 0, 1016, null);
        gk2.e eVar = this.f112938e;
        if (((mm2.c1) eVar.a(mm2.c1.class)).M7()) {
            qo0.c cVar = this.f112939f;
            com.tencent.mm.plugin.finder.live.view.k0 k0Var2 = cVar instanceof com.tencent.mm.plugin.finder.live.view.k0 ? (com.tencent.mm.plugin.finder.live.view.k0) cVar : null;
            if (k0Var2 != null && (uVar = (xu2.u) k0Var2.getPlugin(xu2.u.class)) != null && (vVar = uVar.f457232r) != null) {
                vVar.b();
            }
        }
        com.tencent.mars.xlog.Log.i(str, "needJump:" + f0Var.f43388g);
        if (f0Var.f43388g) {
            this.f112945o = kotlinx.coroutines.l.d(kotlinx.coroutines.i2.f310477d, null, null, new com.tencent.mm.plugin.finder.live.plugin.c80(this, null), 3, null);
            mm2.e1 e1Var = (mm2.e1) eVar.a(mm2.e1.class);
            new ke2.v(e1Var.f328983m, e1Var.f328988r.getLong(0), 7, xy2.c.e(context), ((mm2.e1) eVar.a(mm2.e1.class)).f328985o, f0Var.f43387f, new com.tencent.mm.protobuf.g(f0Var.f43342v.toByteArray()), null, null, null, 512, null).l().K(new com.tencent.mm.plugin.finder.live.plugin.d80(this, f0Var));
        } else {
            r45.e52 e52Var = f0Var.f43342v;
            if (e52Var != null && (list = e52Var.getList(0)) != null && (wd5Var = (r45.wd5) kz5.n0.Z(list)) != null) {
                str2 = wd5Var.getString(4);
            }
            b(str2);
        }
    }

    public final void b(java.lang.String str) {
        com.tencent.mars.xlog.Log.i(this.f112942i, "url: " + str);
        android.content.Intent intent = new android.content.Intent();
        if (str == null) {
            str = "";
        }
        intent.putExtra("rawUrl", str);
        intent.putExtra("convertActivityFromTranslucent", true);
        j45.l.n(this.f112937d, "webview", ".ui.tools.WebViewUI", intent, 1011);
    }

    public final void c(cm2.f0 f0Var) {
        android.view.View view;
        java.lang.Object obj;
        this.f112946p = f0Var;
        android.view.ViewGroup viewGroup = this.f112943m;
        if (viewGroup == null) {
            kotlin.jvm.internal.o.o("root");
            throw null;
        }
        android.widget.TextView textView = (android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.f484798fk4);
        android.widget.TextView textView2 = (android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.f484799fk5);
        android.view.View findViewById = viewGroup.findViewById(com.tencent.mm.R.id.hhj);
        android.view.View findViewById2 = viewGroup.findViewById(com.tencent.mm.R.id.eqy);
        android.widget.TextView textView3 = (android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.obc);
        com.tencent.mm.ui.bk.r0(textView3.getPaint(), 0.8f);
        com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        android.widget.ImageView imageView = (android.widget.ImageView) viewGroup.findViewById(com.tencent.mm.R.id.o6s);
        int i17 = 0;
        java.util.LinkedList list = f0Var.f43342v.getList(0);
        kotlin.jvm.internal.o.f(list, "getInfos(...)");
        r45.wd5 wd5Var = (r45.wd5) kz5.n0.Z(list);
        gk2.e eVar = this.f112938e;
        if (wd5Var != null) {
            mn2.g1 g1Var = mn2.g1.f329975a;
            vo0.d e17 = g1Var.e();
            view = findViewById2;
            mn2.q3 q3Var = new mn2.q3(wd5Var.getString(1), com.tencent.mm.plugin.finder.storage.y90.f128356f);
            kotlin.jvm.internal.o.d(imageView);
            e17.c(q3Var, imageView, g1Var.h(mn2.f1.f329972z));
            textView3.setText(wd5Var.getString(0));
            if (wd5Var.getInteger(6) != 0) {
                java.lang.String string = wd5Var.getString(7);
                if (string == null || string.length() == 0) {
                    string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.otr);
                }
                if (wd5Var.getInteger(8) > 0) {
                    string = string + com.tencent.midas.comm.log.util.APLogFileUtil.SEPARATOR_LOG + com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.ots, java.lang.Integer.valueOf(wd5Var.getInteger(8)));
                }
                textView2.setText(string);
            } else {
                java.lang.String string2 = wd5Var.getString(7);
                if (!(string2 == null || string2.length() == 0)) {
                    textView2.setText(wd5Var.getString(7));
                }
            }
            java.lang.String string3 = wd5Var.getString(2);
            if (string3 != null) {
                kotlin.jvm.internal.o.d(findViewById);
                r45.i52 a17 = com.tencent.mm.plugin.finder.live.util.k0.f115585a.a(string3);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[saveStatus] status:");
                if (a17 == null || (obj = pm0.b0.g(a17)) == null) {
                    obj = "null";
                }
                sb6.append(obj);
                sb6.append(", url:");
                sb6.append(string3);
                com.tencent.mars.xlog.Log.i(this.f112942i, sb6.toString());
                android.content.Context context = this.f112937d;
                if (a17 == null) {
                    textView.setText(context.getString(com.tencent.mm.R.string.e9m));
                    textView.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.BW_0));
                    textView.setBackground(context.getResources().getDrawable(com.tencent.mm.R.drawable.a6d));
                    i17 = 0;
                } else {
                    i17 = 0;
                    if (a17.getBoolean(0)) {
                        textView.setText(context.getString(com.tencent.mm.R.string.e9n));
                        textView.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_5));
                        textView.setBackground(null);
                        if (viewGroup == null) {
                            kotlin.jvm.internal.o.o("root");
                            throw null;
                        }
                        viewGroup.postDelayed(new com.tencent.mm.plugin.finder.live.plugin.e80(f0Var), 5000L);
                    } else if (a17.getInteger(1) == 0) {
                        textView.setText(context.getString(com.tencent.mm.R.string.e9m));
                        textView.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.BW_0));
                        textView.setBackground(context.getResources().getDrawable(com.tencent.mm.R.drawable.a6d));
                    } else {
                        textView.setText(context.getString(com.tencent.mm.R.string.e9o));
                        textView.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_5));
                        textView.setBackground(null);
                        if (viewGroup == null) {
                            kotlin.jvm.internal.o.o("root");
                            throw null;
                        }
                        viewGroup.postDelayed(new com.tencent.mm.plugin.finder.live.plugin.e80(f0Var), 5000L);
                    }
                }
                if (zl2.r4.f473950a.y1(eVar)) {
                    findViewById.setOnClickListener(new com.tencent.mm.plugin.finder.live.plugin.f80(this, f0Var));
                } else {
                    findViewById.setOnClickListener(new com.tencent.mm.plugin.finder.live.plugin.g80(this, f0Var));
                }
            } else {
                i17 = 0;
            }
        } else {
            view = findViewById2;
        }
        if (zl2.r4.f473950a.y1(eVar)) {
            textView.setVisibility(8);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveRedPacketBubble", "refreshView", "(Lcom/tencent/mm/plugin/finder/live/view/convert/PromoteRedPacketItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = view;
            view2.setVisibility(((java.lang.Integer) arrayList.get(i17)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveRedPacketBubble", "refreshView", "(Lcom/tencent/mm/plugin/finder/live/view/convert/PromoteRedPacketItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        int i18 = i17;
        android.view.View view3 = view;
        textView.setVisibility(i18);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(java.lang.Integer.valueOf(i18));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveRedPacketBubble", "refreshView", "(Lcom/tencent/mm/plugin/finder/live/view/convert/PromoteRedPacketItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList2.get(i18)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveRedPacketBubble", "refreshView", "(Lcom/tencent/mm/plugin/finder/live/view/convert/PromoteRedPacketItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setOnClickListener(new com.tencent.mm.plugin.finder.live.plugin.h80(this, f0Var));
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.ep0
    public int e0() {
        return com.tencent.mm.R.id.eqy;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.ep0
    public void f0(java.lang.Object data) {
        kotlin.jvm.internal.o.g(data, "data");
        if (data instanceof cm2.f0) {
            c((cm2.f0) data);
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.ep0
    public android.view.View getView() {
        android.view.ViewGroup viewGroup = this.f112943m;
        if (viewGroup != null) {
            return viewGroup;
        }
        kotlin.jvm.internal.o.o("root");
        throw null;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.ep0
    public void l(java.lang.Object data) {
        kotlin.jvm.internal.o.g(data, "data");
        if (data instanceof cm2.f0) {
            c((cm2.f0) data);
            bf2.c.c(bf2.c.f19598a, this.f112938e, 1, 7, null, 0, null, 0, 0, null, 0, 1016, null);
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
