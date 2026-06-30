package lx2;

/* loaded from: classes2.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.view.FinderHomeTabRedDotTipsBubbleView f322050a;

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Context f322051b;

    /* renamed from: c, reason: collision with root package name */
    public final android.content.res.Resources f322052c;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f322053d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f322054e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f322055f;

    /* renamed from: g, reason: collision with root package name */
    public r45.px2 f322056g;

    /* renamed from: h, reason: collision with root package name */
    public org.json.JSONObject f322057h;

    /* renamed from: i, reason: collision with root package name */
    public long f322058i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.Long f322059j;

    public d(com.tencent.mm.plugin.finder.view.FinderHomeTabRedDotTipsBubbleView tipsLayout) {
        kotlin.jvm.internal.o.g(tipsLayout, "tipsLayout");
        this.f322050a = tipsLayout;
        android.content.Context context = tipsLayout.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        this.f322051b = context;
        android.content.res.Resources resources = tipsLayout.getContext().getResources();
        kotlin.jvm.internal.o.f(resources, "getResources(...)");
        this.f322052c = resources;
        this.f322053d = jz5.h.b(new lx2.c(this));
        this.f322054e = jz5.h.b(new lx2.b(this));
        this.f322055f = jz5.h.b(lx2.a.f322047d);
    }

    public final void a(android.content.Context context, android.view.View tipsLayout, android.widget.FrameLayout.LayoutParams layoutParams, int i17) {
        android.widget.TextView textView;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(tipsLayout, "tipsLayout");
        kotlin.jvm.internal.o.g(layoutParams, "layoutParams");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.tencent.mm.plugin.finder.viewmodel.component.gi X6 = ((com.tencent.mm.plugin.finder.viewmodel.component.bl) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.bl.class)).X6(i17);
        if (X6 == null || (textView = X6.f134528e) == null) {
            return;
        }
        if (!(textView.getVisibility() == 0)) {
            textView = null;
        }
        if (textView == null) {
            return;
        }
        int[] iArr = new int[2];
        textView.getLocationInWindow(iArr);
        java.lang.Integer valueOf = java.lang.Integer.valueOf(iArr[0]);
        if (!(valueOf.intValue() > 0)) {
            valueOf = null;
        }
        if (valueOf != null) {
            int intValue = valueOf.intValue();
            java.lang.Integer valueOf2 = java.lang.Integer.valueOf(tipsLayout.getWidth());
            if (!(valueOf2.intValue() > 0)) {
                valueOf2 = null;
            }
            if (valueOf2 != null) {
                java.lang.Integer valueOf3 = java.lang.Integer.valueOf((intValue + (textView.getWidth() / 2)) - (valueOf2.intValue() / 2));
                java.lang.Integer num = valueOf3.intValue() > 0 ? valueOf3 : null;
                if (num != null) {
                    int intValue2 = num.intValue();
                    layoutParams.gravity = 8388659;
                    layoutParams.setMarginStart(intValue2);
                    com.tencent.mars.xlog.Log.i(f(), "adjustTabBubbleLayout leftMargin=" + intValue2 + ", tabType: " + i17);
                }
            }
        }
    }

    public final void b() {
        java.lang.Long l17 = this.f322059j;
        if (l17 != null) {
            long longValue = l17.longValue();
            this.f322059j = null;
            long currentTimeMillis = java.lang.System.currentTimeMillis() - longValue;
            this.f322058i = currentTimeMillis;
            org.json.JSONObject jSONObject = this.f322057h;
            if (jSONObject != null) {
                jSONObject.put("expose_time_ms", java.lang.String.valueOf(currentTimeMillis));
            }
        }
    }

    public abstract r45.qt2 c();

    public abstract java.lang.String d();

    public abstract java.lang.String e();

    public abstract java.lang.String f();

    /* JADX WARN: Code restructure failed: missing block: B:60:0x00b1, code lost:
    
        if (r1 == null) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map g(java.lang.Integer r11) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lx2.d.g(java.lang.Integer):java.util.Map");
    }

    public void h() {
        b();
        r45.qt2 c17 = c();
        com.tencent.mm.plugin.finder.report.b6.d(com.tencent.mm.plugin.finder.report.b6.f124969a, c17, e(), 1, this.f322057h, false, null, 48, null);
        java.lang.Object value = ((jz5.n) this.f322055f).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        ((cy1.a) ((dy1.r) value)).yj("view_clk", null, g(c17 != null ? java.lang.Integer.valueOf(c17.getInteger(5)) : null), 1, false);
    }

    public void i(android.view.View arrow, android.widget.LinearLayout.LayoutParams arrowParams, android.widget.FrameLayout.LayoutParams tipsParams) {
        kotlin.jvm.internal.o.g(arrow, "arrow");
        kotlin.jvm.internal.o.g(arrowParams, "arrowParams");
        kotlin.jvm.internal.o.g(tipsParams, "tipsParams");
        android.content.Context context = this.f322051b;
        tipsParams.topMargin = ((int) context.getResources().getDimension(com.tencent.mm.R.dimen.f479623ay)) + ((int) context.getResources().getDimension(com.tencent.mm.R.dimen.f479644bj)) + ((java.lang.Number) ((jz5.n) this.f322053d).getValue()).intValue();
        tipsParams.width = -2;
        tipsParams.height = -2;
        arrow.setLayoutParams(arrowParams);
        this.f322050a.setLayoutParams(tipsParams);
    }

    public com.tencent.mm.plugin.finder.view.jb j(r45.px2 px2Var, java.lang.ref.WeakReference weakReference) {
        boolean z17;
        java.lang.String string;
        android.widget.ImageView imageView;
        java.lang.String str;
        r45.lb lbVar;
        r45.v80 v80Var;
        java.lang.String str2;
        r45.f03 f03Var;
        r45.ya0 ya0Var;
        r45.fz2 fz2Var;
        r45.f03 f03Var2;
        r45.ya0 ya0Var2;
        com.tencent.mm.plugin.finder.view.FinderHomeTabRedDotTipsBubbleView finderHomeTabRedDotTipsBubbleView = this.f322050a;
        finderHomeTabRedDotTipsBubbleView.getClass();
        com.tencent.mm.plugin.finder.view.qb qbVar = new com.tencent.mm.plugin.finder.view.qb(weakReference);
        if (px2Var == null || (f03Var = (r45.f03) px2Var.getCustom(1)) == null || (ya0Var = f03Var.B) == null || (fz2Var = ya0Var.f390918d) == null) {
            z17 = false;
        } else {
            r45.px2 px2Var2 = finderHomeTabRedDotTipsBubbleView.f131146g;
            if (fz2Var.compareContent((px2Var2 == null || (f03Var2 = (r45.f03) px2Var2.getCustom(1)) == null || (ya0Var2 = f03Var2.B) == null) ? null : ya0Var2.f390918d)) {
                qbVar.a(new oc2.j(oc2.i.f344202d, true, (r45.f03) px2Var.getCustom(1), null));
            } else {
                android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) finderHomeTabRedDotTipsBubbleView.findViewById(com.tencent.mm.R.id.f484136d52);
                if (frameLayout != null) {
                    frameLayout.setVisibility(0);
                    frameLayout.removeAllViews();
                    com.tencent.mm.plugin.finder.extension.reddot.render.RenderView renderView = new com.tencent.mm.plugin.finder.extension.reddot.render.RenderView(finderHomeTabRedDotTipsBubbleView.getContext());
                    oc2.h hVar = new oc2.h((int) renderView.getResources().getDimension(com.tencent.mm.R.dimen.f480443y2), false, false);
                    hVar.f344192d = oc2.f.f344165d;
                    renderView.f("Finder.HomeTabRedDotTipsBubbleView", hVar, fz2Var, qbVar);
                    frameLayout.addView(renderView, new android.widget.FrameLayout.LayoutParams(-2, -2));
                }
                android.view.View findViewById = finderHomeTabRedDotTipsBubbleView.findViewById(com.tencent.mm.R.id.oa8);
                if (findViewById != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(8);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/FinderHomeTabRedDotTipsBubbleView", "updateDsl", "(Lcom/tencent/mm/protocal/protobuf/FinderStreamTipsShowInfo;Lcom/tencent/mm/plugin/finder/extension/reddot/render/INodeRender$RenderCallback;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/view/FinderHomeTabRedDotTipsBubbleView", "updateDsl", "(Lcom/tencent/mm/protocal/protobuf/FinderStreamTipsShowInfo;Lcom/tencent/mm/plugin/finder/extension/reddot/render/INodeRender$RenderCallback;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
            z17 = true;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("update is dslRender=");
        sb6.append(z17);
        sb6.append(",rRenderCallback is null:");
        sb6.append(weakReference == null);
        com.tencent.mars.xlog.Log.i("Finder.HomeTabRedDotTipsBubbleView", sb6.toString());
        if (z17) {
            return com.tencent.mm.plugin.finder.view.jb.f132433e;
        }
        finderHomeTabRedDotTipsBubbleView.f131146g = px2Var;
        r45.f03 f03Var3 = px2Var != null ? (r45.f03) px2Var.getCustom(1) : null;
        java.util.LinkedList linkedList = f03Var3 != null ? f03Var3.f373896p : null;
        if (linkedList == null) {
            linkedList = new java.util.LinkedList();
        }
        java.lang.String str3 = "";
        if (linkedList.isEmpty()) {
            java.lang.String str4 = f03Var3 != null ? f03Var3.f373890g : null;
            if (!(str4 == null || str4.length() == 0)) {
                if (f03Var3 == null || (str2 = f03Var3.f373890g) == null) {
                    str2 = "";
                }
                linkedList.add(str2);
            }
        }
        if (linkedList.isEmpty()) {
            finderHomeTabRedDotTipsBubbleView.setVisibility(8);
        }
        android.view.View findViewById2 = finderHomeTabRedDotTipsBubbleView.findViewById(com.tencent.mm.R.id.gex);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        android.widget.ImageView imageView2 = (android.widget.ImageView) findViewById2;
        android.view.View findViewById3 = finderHomeTabRedDotTipsBubbleView.findViewById(com.tencent.mm.R.id.gey);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        android.widget.ImageView imageView3 = (android.widget.ImageView) findViewById3;
        android.view.View findViewById4 = finderHomeTabRedDotTipsBubbleView.findViewById(com.tencent.mm.R.id.gez);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        android.widget.ImageView imageView4 = (android.widget.ImageView) findViewById4;
        imageView2.setVisibility(8);
        imageView3.setVisibility(8);
        imageView4.setVisibility(8);
        android.view.View findViewById5 = finderHomeTabRedDotTipsBubbleView.findViewById(com.tencent.mm.R.id.f487334ob5);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById5;
        if (f03Var3 == null || (string = f03Var3.f373889f) == null) {
            string = finderHomeTabRedDotTipsBubbleView.getContext().getResources().getString(com.tencent.mm.R.string.cvt);
        }
        textView.setText(string);
        com.tencent.mm.ui.fk.a(textView);
        textView.setMaxWidth((int) textView.getResources().getDimension(linkedList.size() > 1 ? com.tencent.mm.R.dimen.f479681ch : com.tencent.mm.R.dimen.f480439xy));
        android.view.View findViewById6 = finderHomeTabRedDotTipsBubbleView.findViewById(com.tencent.mm.R.id.oag);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById6;
        r45.eh6 eh6Var = (f03Var3 == null || (lbVar = f03Var3.f373904x) == null || (v80Var = lbVar.f379284d) == null) ? null : v80Var.f387982e;
        if (eh6Var != null && (str = eh6Var.f373502e) != null) {
            str3 = str;
        }
        int color = finderHomeTabRedDotTipsBubbleView.getContext().getResources().getColor(com.tencent.mm.R.color.f479246ty);
        boolean z18 = !com.tencent.mm.sdk.platformtools.t8.K0(str3);
        mn2.g1 g1Var = mn2.g1.f329975a;
        if (z18) {
            weImageView.setVisibility(0);
            com.tencent.mars.xlog.Log.i("Finder.HomeTabRedDotTipsBubbleView", "loadHighLightIcon: iconUrl" + str3 + " highLightColor:" + color);
            wo0.c b17 = g1Var.e().b(new mn2.q3(str3, com.tencent.mm.plugin.finder.storage.y90.f128356f), g1Var.h(mn2.f1.f329964r));
            com.tencent.mm.plugin.finder.view.mb mbVar = new com.tencent.mm.plugin.finder.view.mb(weImageView, color, str3);
            b17.getClass();
            b17.f447873d = mbVar;
            b17.f447879j = new com.tencent.mm.plugin.finder.view.ob(str3, weImageView, color);
            b17.f447878i = new com.tencent.mm.plugin.finder.view.pb(weImageView);
            b17.f();
            weImageView.setIconColor(color);
        } else {
            weImageView.setVisibility(8);
        }
        int i17 = 0;
        for (java.lang.Object obj : linkedList) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            java.lang.String str5 = (java.lang.String) obj;
            if (i17 == 0) {
                imageView2.setVisibility(0);
                imageView = imageView2;
            } else if (i17 != 1) {
                imageView4.setVisibility(0);
                imageView = imageView4;
            } else {
                imageView3.setVisibility(0);
                imageView = imageView3;
            }
            if (f03Var3 != null && f03Var3.f373887d == 4) {
                g1Var.a().c(new mn2.n(str5, com.tencent.mm.plugin.finder.storage.y90.W), imageView, g1Var.h(mn2.f1.f329957h));
            } else {
                g1Var.l().c(new mn2.n(str5, com.tencent.mm.plugin.finder.storage.y90.W), imageView, g1Var.h(mn2.f1.f329961o));
            }
            i17 = i18;
        }
        return com.tencent.mm.plugin.finder.view.jb.f132432d;
    }
}
