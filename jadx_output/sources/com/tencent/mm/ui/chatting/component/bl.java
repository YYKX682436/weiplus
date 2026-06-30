package com.tencent.mm.ui.chatting.component;

@yn.c(exportInterface = sb5.b2.class)
/* loaded from: classes5.dex */
public final class bl extends com.tencent.mm.ui.chatting.component.a implements sb5.b2 {

    /* renamed from: e, reason: collision with root package name */
    public android.widget.HorizontalScrollView f198834e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.LinearLayout f198835f;

    /* renamed from: g, reason: collision with root package name */
    public sb5.a2 f198836g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.List f198837h = kz5.p0.f313996d;

    /* renamed from: i, reason: collision with root package name */
    public int f198838i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f198839m;

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void K() {
        sb5.a2 a2Var;
        android.widget.HorizontalScrollView horizontalScrollView = this.f198834e;
        if ((horizontalScrollView != null && horizontalScrollView.getVisibility() == 0) && (a2Var = this.f198836g) != null) {
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = ((com.tencent.mm.pluginsdk.ui.chat.r2) a2Var).f190595a;
            chatFooter.f190065t = false;
            chatFooter.M1();
        }
        android.widget.HorizontalScrollView horizontalScrollView2 = this.f198834e;
        if (horizontalScrollView2 == null) {
            return;
        }
        horizontalScrollView2.setVisibility(8);
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void a() {
        java.lang.String x17 = this.f198580d.x();
        if (!com.tencent.mm.storage.z3.L4(x17)) {
            m0();
            return;
        }
        if (!(j62.e.g().c(new com.tencent.mm.repairer.config.chatbot.RepairerConfigWeClawShortcutCommand()) == 1)) {
            m0();
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ShortcutCommandTagComponent", "onChattingInit: WeClaw username=%s", x17);
        android.widget.HorizontalScrollView horizontalScrollView = this.f198834e;
        if ((horizontalScrollView != null ? horizontalScrollView.getParent() : null) == null) {
            android.view.View c17 = this.f198580d.c(com.tencent.mm.R.id.bl8);
            if (c17 instanceof android.view.ViewGroup) {
                android.app.Activity g17 = this.f198580d.g();
                android.widget.HorizontalScrollView horizontalScrollView2 = this.f198834e;
                if (horizontalScrollView2 == null) {
                    horizontalScrollView2 = new android.widget.HorizontalScrollView(g17);
                    horizontalScrollView2.setHorizontalScrollBarEnabled(false);
                    horizontalScrollView2.setVerticalScrollBarEnabled(false);
                    horizontalScrollView2.setOverScrollMode(2);
                    horizontalScrollView2.setBackgroundColor(g17.getResources().getColor(com.tencent.mm.R.color.f478490b, g17.getTheme()));
                    int dimensionPixelSize = g17.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479738dv);
                    horizontalScrollView2.setPadding(0, dimensionPixelSize, 0, dimensionPixelSize);
                    android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(g17);
                    linearLayout.setOrientation(0);
                    linearLayout.setLayoutParams(new android.view.ViewGroup.LayoutParams(-2, -2));
                    int dimensionPixelSize2 = g17.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479738dv);
                    linearLayout.setPadding(dimensionPixelSize2, 0, dimensionPixelSize2, 0);
                    horizontalScrollView2.addView(linearLayout);
                    this.f198834e = horizontalScrollView2;
                    this.f198835f = linearLayout;
                }
                horizontalScrollView2.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -2));
                horizontalScrollView2.setVisibility(8);
                ((android.view.ViewGroup) c17).addView(horizontalScrollView2, 0);
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.ShortcutCommandTagComponent", "initView: chatting_foot_bar_container not found or not ViewGroup");
            }
        }
        n0();
    }

    public final void m0() {
        android.widget.HorizontalScrollView horizontalScrollView = this.f198834e;
        if (horizontalScrollView != null) {
            horizontalScrollView.setVisibility(8);
        }
        android.widget.LinearLayout linearLayout = this.f198835f;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
        }
        this.f198837h = kz5.p0.f313996d;
        sb5.a2 a2Var = this.f198836g;
        if (a2Var != null) {
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = ((com.tencent.mm.pluginsdk.ui.chat.r2) a2Var).f190595a;
            chatFooter.f190065t = false;
            chatFooter.M1();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [android.widget.LinearLayout, android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r25v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.List, java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r6v5, types: [android.widget.LinearLayout, android.view.View, android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r6v7 */
    public void n0() {
        ?? arrayList;
        android.widget.HorizontalScrollView horizontalScrollView;
        int i17;
        int i18;
        java.lang.String x17 = this.f198580d.x();
        if (!com.tencent.mm.storage.z3.L4(x17)) {
            m0();
            return;
        }
        int i19 = 0;
        if (!(j62.e.g().c(new com.tencent.mm.repairer.config.chatbot.RepairerConfigWeClawShortcutCommand()) == 1)) {
            m0();
            return;
        }
        java.lang.String fj6 = ((vh0.i2) ((vh0.g1) i95.n0.c(vh0.g1.class))).fj(x17);
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(fj6);
        kz5.p0 p0Var = kz5.p0.f313996d;
        java.lang.String str = "MicroMsg.ShortcutCommandTagComponent";
        if (K0) {
            arrayList = p0Var;
        } else {
            arrayList = new java.util.ArrayList();
            try {
                org.json.JSONArray jSONArray = new org.json.JSONArray(fj6);
                int length = jSONArray.length();
                for (int i27 = 0; i27 < length; i27++) {
                    org.json.JSONObject optJSONObject = jSONArray.optJSONObject(i27);
                    if (optJSONObject != null) {
                        java.lang.String optString = optJSONObject.optString("content", "");
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
                            int optInt = optJSONObject.optInt(dm.i4.COL_ID, 0);
                            java.lang.String optString2 = optJSONObject.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, "");
                            kotlin.jvm.internal.o.f(optString2, "optString(...)");
                            kotlin.jvm.internal.o.d(optString);
                            arrayList.add(new com.tencent.mm.plugin.weclaw.shortcut.ShortcutCommandItem(optInt, optString2, optString));
                        }
                    }
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ShortcutCommandTagComponent", e17, "loadCommands: parse failed", new java.lang.Object[0]);
            }
        }
        if (arrayList.isEmpty()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ShortcutCommandTagComponent", "refreshTags: no commands for %s, hide tags", x17);
            this.f198837h = p0Var;
            m0();
            return;
        }
        if (kotlin.jvm.internal.o.b(arrayList, this.f198837h)) {
            android.widget.HorizontalScrollView horizontalScrollView2 = this.f198834e;
            if (horizontalScrollView2 != null && horizontalScrollView2.getVisibility() == 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ShortcutCommandTagComponent", "refreshTags: commands unchanged, skip rebuild");
                sb5.a2 a2Var = this.f198836g;
                if (a2Var != null) {
                    com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = ((com.tencent.mm.pluginsdk.ui.chat.r2) a2Var).f190595a;
                    chatFooter.f190065t = true;
                    chatFooter.M1();
                    return;
                }
                return;
            }
        }
        this.f198837h = arrayList;
        ?? r07 = this.f198835f;
        if (r07 == 0 || (horizontalScrollView = this.f198834e) == null) {
            return;
        }
        r07.removeAllViews();
        android.app.Activity g17 = this.f198580d.g();
        int dimensionPixelSize = g17.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479738dv);
        int dimensionPixelSize2 = g17.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479714d7);
        int dimensionPixelSize3 = g17.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479672c9);
        int dimensionPixelSize4 = g17.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479738dv);
        int dimensionPixelSize5 = g17.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn);
        int dimensionPixelSize6 = g17.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.j_);
        int i28 = (((((int) ((160 * g17.getResources().getDisplayMetrics().density) + 0.5f)) - dimensionPixelSize3) - dimensionPixelSize4) - dimensionPixelSize5) - dimensionPixelSize6;
        float dimension = g17.getResources().getDimension(com.tencent.mm.R.dimen.f479628b3);
        float q17 = i65.a.q(g17);
        if (q17 > 1.0f) {
            dimension *= q17;
        }
        java.util.Iterator it = arrayList.iterator();
        int i29 = 0;
        java.util.List list = arrayList;
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            int i37 = i29 + 1;
            java.lang.String str2 = null;
            if (i29 < 0) {
                kz5.c0.p();
                throw null;
            }
            com.tencent.mm.plugin.weclaw.shortcut.ShortcutCommandItem shortcutCommandItem = (com.tencent.mm.plugin.weclaw.shortcut.ShortcutCommandItem) next;
            java.util.Iterator it6 = it;
            int size = list.size();
            java.lang.String str3 = str;
            android.app.Activity g18 = this.f198580d.g();
            java.util.List list2 = list;
            ?? linearLayout = new android.widget.LinearLayout(g18);
            android.widget.HorizontalScrollView horizontalScrollView3 = horizontalScrollView;
            linearLayout.setOrientation(0);
            linearLayout.setGravity(16);
            linearLayout.setBackgroundResource(com.tencent.mm.R.drawable.cxx);
            linearLayout.setPadding(dimensionPixelSize3, 0, dimensionPixelSize4, 0);
            android.widget.TextView textView = new android.widget.TextView(g18);
            int i38 = dimensionPixelSize4;
            java.lang.String str4 = shortcutCommandItem.f188080e;
            if (!(!r26.n0.N(str4))) {
                str4 = shortcutCommandItem.f188081f;
            }
            java.util.Iterator it7 = r26.n0.Q(str4).iterator();
            while (true) {
                if (!it7.hasNext()) {
                    break;
                }
                ?? next2 = it7.next();
                if (((java.lang.String) next2).length() > 0) {
                    str2 = next2;
                    break;
                }
            }
            java.lang.String str5 = str2;
            if (str5 == null) {
                str5 = (java.lang.String) kz5.n0.X(r26.n0.Q(str4));
            }
            int i39 = dimensionPixelSize3;
            java.lang.String str6 = str5;
            int i47 = dimensionPixelSize;
            if (str6.length() > 20) {
                i17 = 0;
                java.lang.String substring = str6.substring(0, 20);
                kotlin.jvm.internal.o.f(substring, "substring(...)");
                str6 = substring.concat("…");
            } else {
                i17 = 0;
            }
            textView.setText(str6);
            textView.setTextSize(i17, dimension);
            textView.setTextColor(g18.getResources().getColor(com.tencent.mm.R.color.FG_0, g18.getTheme()));
            textView.setMaxLines(1);
            textView.setEllipsize(android.text.TextUtils.TruncateAt.END);
            textView.setMaxWidth(i28);
            textView.setIncludeFontPadding(false);
            linearLayout.addView(textView, new android.widget.LinearLayout.LayoutParams(-2, -2));
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = new com.tencent.mm.ui.widget.imageview.WeImageView(g18);
            weImageView.s(com.tencent.mm.R.raw.arrow_up_left_medium, com.tencent.mm.R.color.f478520a84);
            weImageView.setRotation(270.0f);
            android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(dimensionPixelSize5, dimensionPixelSize5);
            layoutParams.setMarginStart(dimensionPixelSize6);
            layoutParams.gravity = 16;
            weImageView.setLayoutParams(layoutParams);
            linearLayout.addView(weImageView);
            linearLayout.setOnClickListener(new com.tencent.mm.ui.chatting.component.al(this, shortcutCommandItem, i29, size));
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = new android.view.ViewGroup.MarginLayoutParams(-2, dimensionPixelSize2);
            if (r07.getChildCount() > 0) {
                i18 = i47;
                marginLayoutParams.leftMargin = i18;
            } else {
                i18 = i47;
            }
            linearLayout.setLayoutParams(marginLayoutParams);
            r07.addView(linearLayout);
            dimensionPixelSize = i18;
            it = it6;
            i29 = i37;
            str = str3;
            list = list2;
            horizontalScrollView = horizontalScrollView3;
            dimensionPixelSize4 = i38;
            dimensionPixelSize3 = i39;
            i19 = 0;
        }
        android.widget.HorizontalScrollView horizontalScrollView4 = horizontalScrollView;
        java.util.List list3 = list;
        java.lang.String str7 = str;
        horizontalScrollView4.setVisibility(i19);
        sb5.a2 a2Var2 = this.f198836g;
        if (a2Var2 != null) {
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter2 = ((com.tencent.mm.pluginsdk.ui.chat.r2) a2Var2).f190595a;
            chatFooter2.f190065t = true;
            chatFooter2.M1();
        }
        com.tencent.mars.xlog.Log.i(str7, "buildTagViews: built %d tags", java.lang.Integer.valueOf(list3.size()));
        this.f198839m = false;
        horizontalScrollView4.post(new com.tencent.mm.ui.chatting.component.zk(this, list3));
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void x() {
        if (!com.tencent.mm.storage.z3.L4(this.f198580d.x())) {
            m0();
            return;
        }
        if (j62.e.g().c(new com.tencent.mm.repairer.config.chatbot.RepairerConfigWeClawShortcutCommand()) == 1) {
            n0();
        } else {
            m0();
        }
    }
}
