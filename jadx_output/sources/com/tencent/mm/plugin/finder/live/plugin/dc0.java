package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class dc0 implements com.tencent.mm.plugin.finder.live.plugin.ep0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f112254d;

    /* renamed from: e, reason: collision with root package name */
    public final gk2.e f112255e;

    /* renamed from: f, reason: collision with root package name */
    public final qo0.c f112256f;

    /* renamed from: g, reason: collision with root package name */
    public final cm2.t f112257g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f112258h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.ViewGroup f112259i;

    /* renamed from: m, reason: collision with root package name */
    public kotlinx.coroutines.r2 f112260m;

    /* renamed from: n, reason: collision with root package name */
    public final long f112261n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f112262o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f112263p;

    /* renamed from: q, reason: collision with root package name */
    public cm2.g0 f112264q;

    /* renamed from: r, reason: collision with root package name */
    public final android.widget.ImageView f112265r;

    /* renamed from: s, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.plugin.sb0 f112266s;

    /* renamed from: t, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.plugin.FinderLiveTingBubble$tingEventListener$1 f112267t;

    /* JADX WARN: Type inference failed for: r3v2, types: [com.tencent.mm.plugin.finder.live.plugin.FinderLiveTingBubble$tingEventListener$1] */
    public dc0(android.content.Context context, gk2.e buContext, qo0.c statusMonitor, yz5.l lVar, cm2.t tVar) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(buContext, "buContext");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        this.f112254d = context;
        this.f112255e = buContext;
        this.f112256f = statusMonitor;
        this.f112257g = tVar;
        this.f112258h = "FinderLiveTingBubble";
        this.f112261n = 5000L;
        java.lang.String string = context.getString(com.tencent.mm.R.string.m5p);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        this.f112262o = string;
        this.f112266s = new com.tencent.mm.plugin.finder.live.plugin.sb0(this);
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f112267t = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.TingCategoryChangeEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.live.plugin.FinderLiveTingBubble$tingEventListener$1
            {
                this.__eventId = -1986766098;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.TingCategoryChangeEvent tingCategoryChangeEvent) {
                r45.qy1 qy1Var;
                r45.qy1 qy1Var2;
                bw5.mb0 P0;
                com.tencent.mm.autogen.events.TingCategoryChangeEvent event = tingCategoryChangeEvent;
                kotlin.jvm.internal.o.g(event, "event");
                com.tencent.mm.plugin.finder.live.plugin.dc0 dc0Var = com.tencent.mm.plugin.finder.live.plugin.dc0.this;
                java.lang.String str = dc0Var.f112258h;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[tingEventListener] action = ");
                am.yy yyVar = event.f54893g;
                sb6.append(yyVar.f8491a);
                sb6.append(", isLike = ");
                sb6.append(yyVar.f8492b);
                sb6.append(", isPublic = ");
                sb6.append(yyVar.f8493c);
                sb6.append(", itemId = ");
                sb6.append(yyVar.f8494d.c());
                com.tencent.mars.xlog.Log.i(str, sb6.toString());
                java.lang.String c17 = yyVar.f8494d.c();
                cm2.g0 g0Var = dc0Var.f112264q;
                byte[] bArr = null;
                java.lang.String b17 = (g0Var == null || (qy1Var2 = g0Var.f43346v) == null || (P0 = zl2.r4.f473950a.P0(qy1Var2)) == null) ? null : P0.b();
                if (kotlin.jvm.internal.o.b(c17, b17)) {
                    int i17 = yyVar.f8491a;
                    if (i17 == 1) {
                        com.tencent.mm.plugin.finder.live.plugin.dc0.a(dc0Var, "tingEventListener", yyVar.f8492b);
                    } else if (i17 == 5) {
                        r45.qy1 qy1Var3 = new r45.qy1();
                        cm2.g0 g0Var2 = dc0Var.f112264q;
                        if (g0Var2 != null && (qy1Var = g0Var2.f43346v) != null) {
                            bArr = qy1Var.toByteArray();
                        }
                        qy1Var3.parseFrom(bArr);
                        cm2.g0 g0Var3 = new cm2.g0(qy1Var3);
                        il4.l lVar2 = il4.l.f292142a;
                        bw5.o50 item = yyVar.f8494d;
                        kotlin.jvm.internal.o.f(item, "item");
                        g0Var3.f43346v.set(0, new com.tencent.mm.protobuf.g(lVar2.n(item).toByteArray()));
                        pm0.v.X(new com.tencent.mm.plugin.finder.live.plugin.cc0(dc0Var, g0Var3));
                    }
                } else {
                    com.tencent.mars.xlog.Log.i(dc0Var.f112258h, "eventCategoryId = " + c17 + ", bubbleCategoryId = " + b17 + ", not same categoryId, do nothing");
                }
                return false;
            }
        };
        android.view.View inflate = com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.f489002dn2, (android.view.ViewGroup) null);
        kotlin.jvm.internal.o.e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) inflate;
        this.f112259i = viewGroup;
        android.view.View findViewById = viewGroup.findViewById(com.tencent.mm.R.id.r3c);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f112265r = (android.widget.ImageView) findViewById;
    }

    public static final void a(com.tencent.mm.plugin.finder.live.plugin.dc0 dc0Var, java.lang.String str, boolean z17) {
        r45.qy1 qy1Var;
        r45.qy1 qy1Var2;
        cm2.g0 g0Var = dc0Var.f112264q;
        boolean z18 = (g0Var == null || (qy1Var2 = g0Var.f43346v) == null) ? false : qy1Var2.getBoolean(2);
        java.lang.String str2 = dc0Var.f112258h;
        com.tencent.mars.xlog.Log.i(str2, "[changeLikeStatus-" + str + "] isLiked = " + z17 + ", currentBubbleLiked = " + z18);
        if (z18 == z17) {
            com.tencent.mars.xlog.Log.i(str2, "[changeLikeStatus-" + str + "] isLiked is same, do nothing");
            return;
        }
        r45.qy1 qy1Var3 = new r45.qy1();
        cm2.g0 g0Var2 = dc0Var.f112264q;
        qy1Var3.parseFrom((g0Var2 == null || (qy1Var = g0Var2.f43346v) == null) ? null : qy1Var.toByteArray());
        cm2.g0 g0Var3 = new cm2.g0(qy1Var3);
        g0Var3.f43346v.set(2, java.lang.Boolean.valueOf(z17));
        pm0.v.X(new com.tencent.mm.plugin.finder.live.plugin.pb0(dc0Var, g0Var3));
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.ep0
    public cm2.t A() {
        return this.f112257g;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.ep0
    public void B(android.os.Bundle bundle, java.lang.Object obj, long j17) {
        jz5.f0 f0Var = null;
        java.lang.String string = bundle != null ? bundle.getString("ACTION_POST_PORTRAIT", "") : null;
        if (kotlin.jvm.internal.o.b(string != null ? string : "", "POST_TING_PORTRAIT")) {
            android.os.Bundle bundle2 = obj instanceof android.os.Bundle ? (android.os.Bundle) obj : null;
            if (bundle2 != null) {
                r45.qy1 qy1Var = new r45.qy1();
                qy1Var.parseFrom(bundle2.getByteArray("POST_TING_PORTRAIT_DATA"));
                zl2.r4 r4Var = zl2.r4.f473950a;
                bw5.mb0 P0 = r4Var.P0(qy1Var);
                if (P0 != null) {
                    android.view.ViewGroup viewGroup = this.f112259i;
                    if (viewGroup == null) {
                        kotlin.jvm.internal.o.o("root");
                        throw null;
                    }
                    android.content.Context context = viewGroup.getContext();
                    kotlin.jvm.internal.o.f(context, "getContext(...)");
                    r4Var.r2(context, P0, bw5.ar0.TingScene_Live_CategoryBubble);
                    f0Var = jz5.f0.f302826a;
                }
                if (f0Var == null) {
                    com.tencent.mars.xlog.Log.i(this.f112258h, "[jumpTing] play info null!");
                }
            }
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.ep0
    public void U() {
    }

    public final void b(java.lang.String str) {
        com.tencent.mars.xlog.Log.i(this.f112258h, str + " [bubble-cleared]");
        kotlinx.coroutines.r2 r2Var = this.f112260m;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        dead();
    }

    public final void c(cm2.g0 g0Var, boolean z17, boolean z18) {
        int parseColor;
        int color;
        android.view.ViewGroup viewGroup = this.f112259i;
        if (viewGroup == null) {
            kotlin.jvm.internal.o.o("root");
            throw null;
        }
        android.widget.TextView textView = (android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.r3g);
        if (viewGroup == null) {
            kotlin.jvm.internal.o.o("root");
            throw null;
        }
        android.widget.TextView textView2 = (android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.r3d);
        if (viewGroup == null) {
            kotlin.jvm.internal.o.o("root");
            throw null;
        }
        android.widget.TextView textView3 = (android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.r3e);
        if (viewGroup == null) {
            kotlin.jvm.internal.o.o("root");
            throw null;
        }
        android.view.View findViewById = viewGroup.findViewById(com.tencent.mm.R.id.r3b);
        r45.ry1 ry1Var = (r45.ry1) g0Var.f43346v.getCustom(5);
        android.widget.ImageView imageView = this.f112265r;
        if (ry1Var != null && !z17) {
            try {
                r45.ry1 ry1Var2 = (r45.ry1) g0Var.f43346v.getCustom(5);
                if (ry1Var2 != null) {
                    int parseColor2 = android.graphics.Color.parseColor(ry1Var2.getString(0));
                    int parseColor3 = android.graphics.Color.parseColor(ry1Var2.getString(1));
                    textView.setTextColor(parseColor2);
                    textView3.setTextColor(parseColor3);
                    int parseColor4 = !z18 ? android.graphics.Color.parseColor(ry1Var2.getString(2)) : android.graphics.Color.parseColor(ry1Var2.getString(4));
                    findViewById.setBackgroundDrawable(null);
                    findViewById.setBackgroundColor(parseColor4);
                    int parseColor5 = !z18 ? android.graphics.Color.parseColor(ry1Var2.getString(3)) : android.graphics.Color.parseColor(ry1Var2.getString(5));
                    textView2.setTextColor(parseColor5);
                    if (imageView == null) {
                        kotlin.jvm.internal.o.o("btnIconView");
                        throw null;
                    }
                    if (viewGroup != null) {
                        imageView.setImageDrawable(com.tencent.mm.ui.uk.e(viewGroup.getContext(), com.tencent.mm.R.raw.icons_filled_done, parseColor5));
                        return;
                    } else {
                        kotlin.jvm.internal.o.o("root");
                        throw null;
                    }
                }
                return;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.i(this.f112258h, "use sp_config err = " + e17.getMessage());
                return;
            }
        }
        if (!z17) {
            parseColor = android.graphics.Color.parseColor("#E6ffffff");
        } else {
            if (viewGroup == null) {
                kotlin.jvm.internal.o.o("root");
                throw null;
            }
            parseColor = viewGroup.getContext().getResources().getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_9);
        }
        if (z17) {
            if (viewGroup == null) {
                kotlin.jvm.internal.o.o("root");
                throw null;
            }
            color = viewGroup.getContext().getResources().getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_5);
        } else {
            if (viewGroup == null) {
                kotlin.jvm.internal.o.o("root");
                throw null;
            }
            color = viewGroup.getContext().getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_5);
        }
        textView.setTextColor(parseColor);
        textView3.setTextColor(color);
        if (z18) {
            parseColor = color;
        }
        textView2.setTextColor(parseColor);
        if (imageView == null) {
            kotlin.jvm.internal.o.o("btnIconView");
            throw null;
        }
        if (viewGroup == null) {
            kotlin.jvm.internal.o.o("root");
            throw null;
        }
        imageView.setImageDrawable(com.tencent.mm.ui.uk.e(viewGroup.getContext(), com.tencent.mm.R.raw.icons_filled_done, parseColor));
        if (z17) {
            if (viewGroup != null) {
                findViewById.setBackgroundDrawable(viewGroup.getContext().getResources().getDrawable(com.tencent.mm.R.drawable.a6d));
                return;
            } else {
                kotlin.jvm.internal.o.o("root");
                throw null;
            }
        }
        if (z18) {
            if (viewGroup != null) {
                findViewById.setBackgroundDrawable(viewGroup.getContext().getResources().getDrawable(com.tencent.mm.R.drawable.f481771a31));
                return;
            } else {
                kotlin.jvm.internal.o.o("root");
                throw null;
            }
        }
        if (viewGroup != null) {
            findViewById.setBackgroundDrawable(viewGroup.getContext().getResources().getDrawable(com.tencent.mm.R.drawable.f481770a30));
        } else {
            kotlin.jvm.internal.o.o("root");
            throw null;
        }
    }

    public final void d(java.lang.String str, android.view.View view, android.graphics.Bitmap bitmap, cm2.g0 g0Var, boolean z17) {
        jz5.f0 f0Var;
        if (bitmap != null) {
            ((dl4.m0) ((ff0.t) i95.n0.c(ff0.t.class))).hj(str, view, bitmap, new com.tencent.mm.plugin.finder.live.plugin.tb0(view, this, g0Var, z17));
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            view.setBackgroundResource(com.tencent.mm.R.drawable.a8s);
            c(g0Var, true, z17);
        }
    }

    public final void e(cm2.g0 g0Var) {
        android.view.View view;
        bw5.mb0 mb0Var;
        r45.qy1 qy1Var;
        r45.qy1 qy1Var2;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("data = ");
        sb6.append(pm0.b0.g(g0Var.f43346v));
        sb6.append(", oldData = ");
        cm2.g0 g0Var2 = this.f112264q;
        sb6.append((g0Var2 == null || (qy1Var2 = g0Var2.f43346v) == null) ? null : pm0.b0.g(qy1Var2));
        java.lang.String sb7 = sb6.toString();
        java.lang.String str = this.f112258h;
        com.tencent.mars.xlog.Log.i(str, sb7);
        android.view.ViewGroup viewGroup = this.f112259i;
        if (viewGroup == null) {
            kotlin.jvm.internal.o.o("root");
            throw null;
        }
        android.view.View findViewById = viewGroup.findViewById(com.tencent.mm.R.id.hhj);
        if (viewGroup == null) {
            kotlin.jvm.internal.o.o("root");
            throw null;
        }
        android.view.View findViewById2 = viewGroup.findViewById(com.tencent.mm.R.id.eqy);
        if (viewGroup == null) {
            kotlin.jvm.internal.o.o("root");
            throw null;
        }
        android.widget.TextView textView = (android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.r3g);
        if (viewGroup == null) {
            kotlin.jvm.internal.o.o("root");
            throw null;
        }
        android.view.View findViewById3 = viewGroup.findViewById(com.tencent.mm.R.id.r3b);
        if (viewGroup == null) {
            kotlin.jvm.internal.o.o("root");
            throw null;
        }
        android.widget.TextView textView2 = (android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.r3e);
        if (viewGroup == null) {
            kotlin.jvm.internal.o.o("root");
            throw null;
        }
        textView2.setTextColor(viewGroup.getContext().getResources().getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_5));
        kotlin.jvm.internal.o.d(textView);
        com.tencent.mm.ui.fk.a(textView);
        zl2.r4 r4Var = zl2.r4.f473950a;
        r45.qy1 qy1Var3 = g0Var.f43346v;
        bw5.mb0 P0 = r4Var.P0(qy1Var3);
        if (viewGroup == null) {
            kotlin.jvm.internal.o.o("root");
            throw null;
        }
        android.widget.ImageView imageView = (android.widget.ImageView) viewGroup.findViewById(com.tencent.mm.R.id.r3f);
        android.content.Context context = this.f112254d;
        this.f112262o = r4Var.d1(context, P0);
        this.f112263p = qy1Var3.getString(3);
        android.graphics.drawable.Drawable e17 = com.tencent.mm.ui.uk.e(context, com.tencent.mm.R.raw.ting_image_empty_lightmode, 0);
        imageView.setImageDrawable(e17);
        kotlin.jvm.internal.o.d(findViewById);
        d("DEFAULT_TING_COLOR_BG_KEY", findViewById, com.tencent.mm.sdk.platformtools.x.K0(e17), g0Var, qy1Var3.getBoolean(2));
        mn2.d1 d1Var = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f353936a.e(zy2.b6.class).c(mn2.i4.class))).H).getValue());
        java.lang.String c17 = P0 != null ? P0.c() : null;
        if (c17 == null) {
            c17 = "";
        }
        wo0.c a17 = d1Var.a(new mn2.q3(c17, com.tencent.mm.plugin.finder.storage.y90.f128356f));
        com.tencent.mm.plugin.finder.live.plugin.wb0 wb0Var = new com.tencent.mm.plugin.finder.live.plugin.wb0(imageView, this, g0Var, findViewById);
        a17.getClass();
        a17.f447873d = wb0Var;
        a17.f();
        textView.setText(P0 != null ? P0.getName() : null);
        int i17 = r4Var.w1() ? 8 : 0;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById3, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveTingBubble", "refreshView", "(Lcom/tencent/mm/plugin/finder/live/view/convert/PromoteTingItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById3.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById3, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveTingBubble", "refreshView", "(Lcom/tencent/mm/plugin/finder/live/view/convert/PromoteTingItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        pm0.v.X(new com.tencent.mm.plugin.finder.live.plugin.ub0(this, qy1Var3.getBoolean(2)));
        boolean z17 = qy1Var3.getBoolean(2);
        gk2.e eVar = this.f112255e;
        if (z17) {
            cm2.g0 g0Var3 = this.f112264q;
            if (!((g0Var3 == null || (qy1Var = g0Var3.f43346v) == null || !qy1Var.getBoolean(2)) ? false : true)) {
                com.tencent.mars.xlog.Log.i(str, "[launchDismissJob]");
                kotlinx.coroutines.r2 r2Var = this.f112260m;
                if (r2Var != null) {
                    kotlinx.coroutines.p2.a(r2Var, null, 1, null);
                }
                yg2.b bVar = eVar.f272475i;
                kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
                kotlinx.coroutines.l.d(bVar, kotlinx.coroutines.internal.b0.f310484a, null, new com.tencent.mm.plugin.finder.live.plugin.rb0(this, null), 2, null);
            }
        } else {
            kotlinx.coroutines.r2 r2Var2 = this.f112260m;
            if (r2Var2 != null) {
                kotlinx.coroutines.p2.a(r2Var2, null, 1, null);
            }
        }
        if (r4Var.y1(eVar)) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(4);
            java.util.Collections.reverse(arrayList2);
            view = findViewById3;
            mb0Var = P0;
            yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveTingBubble", "refreshView", "(Lcom/tencent/mm/plugin/finder/live/view/convert/PromoteTingItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveTingBubble", "refreshView", "(Lcom/tencent/mm/plugin/finder/live/view/convert/PromoteTingItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            view = findViewById3;
            mb0Var = P0;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(findViewById2, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveTingBubble", "refreshView", "(Lcom/tencent/mm/plugin/finder/live/view/convert/PromoteTingItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveTingBubble", "refreshView", "(Lcom/tencent/mm/plugin/finder/live/view/convert/PromoteTingItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setOnClickListener(new com.tencent.mm.plugin.finder.live.plugin.xb0(this, mb0Var, g0Var));
        }
        view.setOnClickListener(new com.tencent.mm.plugin.finder.live.plugin.yb0(g0Var, this, mb0Var));
        findViewById.setOnClickListener(new com.tencent.mm.plugin.finder.live.plugin.zb0(this, mb0Var, g0Var));
        this.f112264q = g0Var;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.ep0
    public int e0() {
        return com.tencent.mm.R.id.eqy;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.ep0
    public void f0(java.lang.Object data) {
        kotlin.jvm.internal.o.g(data, "data");
        if (data instanceof cm2.g0) {
            e((cm2.g0) data);
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.ep0
    public android.view.View getView() {
        android.view.ViewGroup viewGroup = this.f112259i;
        if (viewGroup != null) {
            return viewGroup;
        }
        kotlin.jvm.internal.o.o("root");
        throw null;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.ep0
    public void l(java.lang.Object data) {
        kotlin.jvm.internal.o.g(data, "data");
        if (data instanceof cm2.g0) {
            cm2.g0 g0Var = (cm2.g0) data;
            e(g0Var);
            alive();
            bw5.mb0 P0 = zl2.r4.f473950a.P0(g0Var.f43346v);
            bf2.c cVar = bf2.c.f19598a;
            gk2.e eVar = this.f112255e;
            java.lang.String b17 = P0 != null ? P0.b() : null;
            if (b17 == null) {
                b17 = "";
            }
            bf2.c.c(cVar, eVar, 1, 12, b17, 0, null, 0, 1, null, 0, nd1.y0.CTRL_INDEX, null);
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.ep0
    public void l0() {
        b("onBubbleDel");
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.ep0
    public int p0() {
        return com.tencent.mm.R.id.hhj;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.ep0
    public void t() {
        b("onViewUnMount");
    }
}
