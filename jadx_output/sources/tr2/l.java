package tr2;

/* loaded from: classes5.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.dialog.y1 f421389a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.View f421390b;

    /* renamed from: c, reason: collision with root package name */
    public final android.widget.Button f421391c;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f421392d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f421393e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f421394f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f421395g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f421396h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.View f421397i;

    /* renamed from: j, reason: collision with root package name */
    public final android.view.View f421398j;

    /* renamed from: k, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.view.FinderEmojiView f421399k;

    /* renamed from: l, reason: collision with root package name */
    public final com.tencent.mm.api.SmileyPanel f421400l;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.api.IEmojiInfo f421401m;

    public l(androidx.appcompat.app.AppCompatActivity activity, com.tencent.mm.api.IEmojiInfo iEmojiInfo, yz5.l onEmojiChanged) {
        int i17;
        java.lang.CharSequence j17;
        java.lang.CharSequence j18;
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(onEmojiChanged, "onEmojiChanged");
        int c17 = com.tencent.mm.ui.bl.c(activity);
        android.graphics.Point b17 = com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a);
        int i18 = b17.x;
        int i19 = b17.y;
        java.lang.System.nanoTime();
        boolean z17 = com.tencent.mm.ui.bk.y() || com.tencent.mm.ui.bk.Q() || com.tencent.mm.ui.bk.A();
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (z17) {
            i17 = i19 - c17;
        } else {
            i17 = (i19 >= i18 ? i19 : i18) - c17;
        }
        boolean z18 = i17 < 680;
        com.tencent.mm.ui.widget.dialog.y1 y1Var = new com.tencent.mm.ui.widget.dialog.y1(activity, 0, true, false, com.tencent.mm.R.style.f494236yq);
        this.f421389a = y1Var;
        com.tencent.mm.api.SmileyPanel b18 = qk.w9.b(activity);
        this.f421400l = b18;
        this.f421401m = iEmojiInfo;
        activity.mo133getLifecycle().a(new androidx.lifecycle.f() { // from class: com.tencent.mm.plugin.finder.post.interactioneasteregg.InteractionEasterEggAddHalfScreen$1
            @Override // androidx.lifecycle.f, androidx.lifecycle.h
            public void onDestroy(androidx.lifecycle.y owner) {
                kotlin.jvm.internal.o.g(owner, "owner");
                tr2.l lVar = tr2.l.this;
                lVar.f421400l.getClass();
                lVar.f421400l.a();
            }
        });
        android.view.View inflate = android.view.LayoutInflater.from(activity).inflate(com.tencent.mm.R.layout.e7r, (android.view.ViewGroup) null);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        this.f421390b = inflate;
        b(inflate, 32, null);
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.oqh);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        com.tencent.mm.ui.fk.b((android.widget.TextView) findViewById);
        android.view.View findViewById2 = inflate.findViewById(com.tencent.mm.R.id.f483491sm2);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        android.widget.Button button = (android.widget.Button) findViewById2;
        this.f421391c = button;
        if (iEmojiInfo == null) {
            button.setEnabled(false);
        }
        button.setOnClickListener(new tr2.a(onEmojiChanged, this));
        b(button, 8, 1);
        android.view.View findViewById3 = inflate.findViewById(com.tencent.mm.R.id.f483482b02);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f421392d = findViewById3;
        findViewById3.setOnClickListener(new tr2.b(this));
        b(findViewById3, 8, 2);
        android.view.View findViewById4 = inflate.findViewById(com.tencent.mm.R.id.ned);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f421397i = findViewById4;
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.om7);
        java.lang.String string = activity.getString(com.tencent.mm.R.string.oly);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        int K = r26.n0.K(string, '#', 0, false, 6, null);
        int K2 = r26.n0.K(string, '#', K + 1, false, 4, null);
        int dimensionPixelSize = activity.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn);
        j17 = hc2.x0.j(string, activity, K, com.tencent.mm.R.raw.icons_outlined_like, com.tencent.mm.R.color.FG_0, dimensionPixelSize, dimensionPixelSize, (r23 & 64) != 0 ? 0 : 0, (r23 & 128) != 0 ? 0 : 0, (r23 & 256) != 0 ? 1 : 0);
        j18 = hc2.x0.j(j17, activity, K2, com.tencent.mm.R.raw.icons_outlined_star_new, com.tencent.mm.R.color.FG_0, dimensionPixelSize, dimensionPixelSize, (r23 & 64) != 0 ? 0 : 0, (r23 & 128) != 0 ? 0 : 0, (r23 & 256) != 0 ? 1 : 0);
        textView.setText(j18);
        android.view.View findViewById5 = inflate.findViewById(com.tencent.mm.R.id.rme);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f421398j = findViewById5;
        findViewById5.setOnClickListener(new tr2.c(this));
        android.view.View findViewById6 = inflate.findViewById(com.tencent.mm.R.id.cgz);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        this.f421395g = findViewById6;
        if (z18) {
            android.view.ViewGroup.LayoutParams layoutParams = findViewById6.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.topMargin = activity.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn);
                findViewById6.setLayoutParams(marginLayoutParams);
            }
        }
        android.view.View findViewById7 = inflate.findViewById(com.tencent.mm.R.id.skx);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        this.f421396h = findViewById7;
        android.view.View findViewById8 = inflate.findViewById(com.tencent.mm.R.id.vif);
        kotlin.jvm.internal.o.f(findViewById8, "findViewById(...)");
        this.f421393e = findViewById8;
        findViewById8.setOnClickListener(new tr2.d(this));
        b(findViewById8, 8, 3);
        android.view.View findViewById9 = inflate.findViewById(com.tencent.mm.R.id.f487458vj1);
        kotlin.jvm.internal.o.f(findViewById9, "findViewById(...)");
        this.f421394f = findViewById9;
        findViewById9.setOnClickListener(new tr2.e(activity, this));
        b(findViewById9, 8, 4);
        android.view.View findViewById10 = inflate.findViewById(com.tencent.mm.R.id.det);
        kotlin.jvm.internal.o.f(findViewById10, "findViewById(...)");
        this.f421399k = (com.tencent.mm.plugin.finder.view.FinderEmojiView) findViewById10;
        android.view.View findViewById11 = inflate.findViewById(com.tencent.mm.R.id.t7r);
        kotlin.jvm.internal.o.f(findViewById11, "findViewById(...)");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) findViewById11;
        int i27 = com.tencent.mm.pluginsdk.ui.ChatFooterPanel.f189765e;
        b18.setEntranceScene(113);
        b18.setSearchSource(4);
        b18.c();
        b18.setShowSend(false);
        b18.setShowSmiley(false);
        b18.p(true, false);
        b18.o(true, false);
        b18.setShowSearch(true);
        b18.setShowGame(false);
        b18.setShowStore(true);
        b18.setCallback(new tr2.f(this));
        b18.setVisibility(8);
        viewGroup.addView(b18, new android.widget.FrameLayout.LayoutParams(-1, z18 ? java.lang.Math.min(activity.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479702cy), qk.w9.a(activity)) : qk.w9.a(activity)));
        y1Var.l(inflate, new android.widget.FrameLayout.LayoutParams(-1, -2));
        y1Var.f212037s = new tr2.g(this);
        a(iEmojiInfo, true);
        c();
    }

    public final void a(com.tencent.mm.api.IEmojiInfo iEmojiInfo, boolean z17) {
        this.f421401m = iEmojiInfo;
        if (!z17) {
            this.f421391c.setEnabled(true);
        }
        com.tencent.mm.plugin.finder.view.FinderEmojiView finderEmojiView = this.f421399k;
        if (iEmojiInfo != null) {
            android.view.View view = this.f421396h;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            int intValue = ((java.lang.Integer) arrayList.get(0)).intValue();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(java.lang.Integer.valueOf(intValue));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/finder/post/interactioneasteregg/InteractionEasterEggAddHalfScreen", "onPreviewEmojiChanged", "(Lcom/tencent/mm/api/IEmojiInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/post/interactioneasteregg/InteractionEasterEggAddHalfScreen", "onPreviewEmojiChanged", "(Lcom/tencent/mm/api/IEmojiInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            yj0.a.f(view, "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = this.f421398j;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view2, arrayList3.toArray(), "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            int intValue2 = ((java.lang.Integer) arrayList3.get(0)).intValue();
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(java.lang.Integer.valueOf(intValue2));
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view2, arrayList4.toArray(), "com/tencent/mm/plugin/finder/post/interactioneasteregg/InteractionEasterEggAddHalfScreen", "onPreviewEmojiChanged", "(Lcom/tencent/mm/api/IEmojiInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/post/interactioneasteregg/InteractionEasterEggAddHalfScreen", "onPreviewEmojiChanged", "(Lcom/tencent/mm/api/IEmojiInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            yj0.a.f(view2, "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.tencent.mm.api.IEmojiInfo emojiInfo = finderEmojiView.getEmojiInfo();
            if (kotlin.jvm.internal.o.b(emojiInfo != null ? emojiInfo.getMd5() : null, iEmojiInfo.getMd5())) {
                return;
            }
            finderEmojiView.setStatusListener(new tr2.j(iEmojiInfo, this));
            finderEmojiView.setEmojiInfo(iEmojiInfo);
            finderEmojiView.requestLayout();
            return;
        }
        android.view.View view3 = this.f421396h;
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList5.add(4);
        java.util.Collections.reverse(arrayList5);
        yj0.a.d(view3, arrayList5.toArray(), "com/tencent/mm/kt/CommonKt", "invisible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int intValue3 = ((java.lang.Integer) arrayList5.get(0)).intValue();
        java.util.ArrayList arrayList6 = new java.util.ArrayList();
        arrayList6.add(java.lang.Integer.valueOf(intValue3));
        java.util.Collections.reverse(arrayList6);
        yj0.a.d(view3, arrayList6.toArray(), "com/tencent/mm/plugin/finder/post/interactioneasteregg/InteractionEasterEggAddHalfScreen", "onPreviewEmojiChanged", "(Lcom/tencent/mm/api/IEmojiInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/finder/post/interactioneasteregg/InteractionEasterEggAddHalfScreen", "onPreviewEmojiChanged", "(Lcom/tencent/mm/api/IEmojiInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        yj0.a.f(view3, "com/tencent/mm/kt/CommonKt", "invisible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        finderEmojiView.setStatusListener(null);
        finderEmojiView.setEmojiInfo(null);
        com.tencent.mm.plugin.finder.view.FinderEmojiView finderEmojiView2 = this.f421399k;
        java.util.ArrayList arrayList7 = new java.util.ArrayList();
        arrayList7.add(8);
        java.util.Collections.reverse(arrayList7);
        yj0.a.d(finderEmojiView2, arrayList7.toArray(), "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int intValue4 = ((java.lang.Integer) arrayList7.get(0)).intValue();
        java.util.ArrayList arrayList8 = new java.util.ArrayList();
        arrayList8.add(java.lang.Integer.valueOf(intValue4));
        java.util.Collections.reverse(arrayList8);
        yj0.a.d(finderEmojiView2, arrayList8.toArray(), "com/tencent/mm/plugin/finder/post/interactioneasteregg/InteractionEasterEggAddHalfScreen", "onPreviewEmojiChanged", "(Lcom/tencent/mm/api/IEmojiInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        finderEmojiView2.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
        yj0.a.f(finderEmojiView2, "com/tencent/mm/plugin/finder/post/interactioneasteregg/InteractionEasterEggAddHalfScreen", "onPreviewEmojiChanged", "(Lcom/tencent/mm/api/IEmojiInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        yj0.a.f(finderEmojiView2, "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view4 = this.f421398j;
        java.util.ArrayList arrayList9 = new java.util.ArrayList();
        arrayList9.add(0);
        java.util.Collections.reverse(arrayList9);
        yj0.a.d(view4, arrayList9.toArray(), "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int intValue5 = ((java.lang.Integer) arrayList9.get(0)).intValue();
        java.util.ArrayList arrayList10 = new java.util.ArrayList();
        arrayList10.add(java.lang.Integer.valueOf(intValue5));
        java.util.Collections.reverse(arrayList10);
        yj0.a.d(view4, arrayList10.toArray(), "com/tencent/mm/plugin/finder/post/interactioneasteregg/InteractionEasterEggAddHalfScreen", "onPreviewEmojiChanged", "(Lcom/tencent/mm/api/IEmojiInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((java.lang.Integer) arrayList10.get(0)).intValue());
        yj0.a.f(view4, "com/tencent/mm/plugin/finder/post/interactioneasteregg/InteractionEasterEggAddHalfScreen", "onPreviewEmojiChanged", "(Lcom/tencent/mm/api/IEmojiInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        yj0.a.f(view4, "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void b(android.view.View view, int i17, java.lang.Integer num) {
        com.tencent.mm.plugin.finder.report.d2 d2Var = com.tencent.mm.plugin.finder.report.d2.f124994a;
        lz5.m mVar = new lz5.m();
        com.tencent.mm.plugin.finder.report.p2 p2Var = com.tencent.mm.plugin.finder.report.p2.f125237a;
        com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject = com.tencent.mm.plugin.finder.report.p2.f125238b;
        mVar.put("enterscene", finderFeedReportObject != null ? java.lang.Integer.valueOf(finderFeedReportObject.getEnterScene()) : null);
        com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject2 = com.tencent.mm.plugin.finder.report.p2.f125238b;
        mVar.put("finder_post_sessionid", finderFeedReportObject2 != null ? finderFeedReportObject2.getSessionId() : null);
        d2Var.n(view, "set_like_easter_egg_half_screen", (r20 & 4) != 0 ? 40 : i17, (r20 & 8) != 0 ? 25496 : 0, (r20 & 16) != 0 ? false : false, (r20 & 32) != 0 ? false : false, (r20 & 64) != 0 ? null : kz5.b1.b(mVar), (r20 & 128) != 0 ? null : new tr2.k(this, num));
    }

    public final void c() {
        com.tencent.mm.api.SmileyPanel smileyPanel = this.f421400l;
        smileyPanel.setVisibility(0);
        android.view.View view = this.f421397i;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int intValue = ((java.lang.Integer) arrayList.get(0)).intValue();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Integer.valueOf(intValue));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/finder/post/interactioneasteregg/InteractionEasterEggAddHalfScreen", "showEmojiPanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/post/interactioneasteregg/InteractionEasterEggAddHalfScreen", "showEmojiPanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        yj0.a.f(view, "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        smileyPanel.i();
    }
}
