package i22;

/* loaded from: classes15.dex */
public final class v extends i22.m implements i22.q0 {
    public final android.widget.ImageView A;
    public final android.view.View B;
    public final android.widget.ProgressBar C;
    public final android.widget.ProgressBar D;
    public final android.view.View E;
    public final android.widget.TextView F;
    public final android.widget.ImageView G;
    public final android.graphics.drawable.Drawable H;
    public final android.graphics.drawable.Drawable I;

    /* renamed from: J, reason: collision with root package name */
    public i22.b0 f288038J;
    public com.tencent.mm.plugin.emoji.model.f0 K;
    public final java.lang.String L;
    public j12.i M;

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Context f288039f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f288040g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f288041h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f288042i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f288043m;

    /* renamed from: n, reason: collision with root package name */
    public final i22.p0 f288044n;

    /* renamed from: o, reason: collision with root package name */
    public final android.view.View f288045o;

    /* renamed from: p, reason: collision with root package name */
    public final android.view.View f288046p;

    /* renamed from: q, reason: collision with root package name */
    public final android.widget.ImageView f288047q;

    /* renamed from: r, reason: collision with root package name */
    public final android.widget.TextView f288048r;

    /* renamed from: s, reason: collision with root package name */
    public final android.view.View f288049s;

    /* renamed from: t, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.button.WeButton f288050t;

    /* renamed from: u, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.button.WeButton f288051u;

    /* renamed from: v, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.button.WeButton f288052v;

    /* renamed from: w, reason: collision with root package name */
    public final android.widget.ImageView f288053w;

    /* renamed from: x, reason: collision with root package name */
    public final android.view.View f288054x;

    /* renamed from: y, reason: collision with root package name */
    public final android.view.ViewGroup f288055y;

    /* renamed from: z, reason: collision with root package name */
    public final android.widget.TextView f288056z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public v(android.content.Context r11, android.view.View r12, java.util.List r13, boolean r14, boolean r15, i22.p0 r16, int r17, kotlin.jvm.internal.i r18) {
        /*
            Method dump skipped, instructions count: 391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i22.v.<init>(android.content.Context, android.view.View, java.util.List, boolean, boolean, i22.p0, int, kotlin.jvm.internal.i):void");
    }

    @Override // i22.q0
    public void b(int i17, java.lang.String productId) {
        kotlin.jvm.internal.o.g(productId, "productId");
        j12.i iVar = this.M;
        if (iVar == null) {
            return;
        }
        k(iVar, productId, i17);
        if (iVar.f297171f == -1) {
            com.tencent.mars.xlog.Log.i(this.L, "force refresh status");
            boolean y17 = c01.z1.y();
            com.tencent.mm.plugin.emoji.model.f0 f0Var = this.K;
            iVar.b(y17, f0Var != null ? ((com.tencent.mm.plugin.emoji.model.q) f0Var).b(productId) : null, com.tencent.mm.plugin.emoji.model.q.f97591c.a(productId));
        }
        f();
    }

    @Override // i22.q0
    public j12.i d() {
        return this.M;
    }

    @Override // i22.q0
    public void e(java.lang.String productId) {
        kotlin.jvm.internal.o.g(productId, "productId");
        j12.i iVar = this.M;
        if (iVar == null) {
            return;
        }
        iVar.c(-1);
        boolean y17 = c01.z1.y();
        com.tencent.mm.plugin.emoji.model.f0 f0Var = this.K;
        iVar.b(y17, f0Var != null ? ((com.tencent.mm.plugin.emoji.model.q) f0Var).b(productId) : null, com.tencent.mm.plugin.emoji.model.q.f97591c.a(productId));
    }

    @Override // i22.q0
    public void f() {
        j12.i iVar = this.M;
        if (iVar == null) {
            return;
        }
        o(8);
        int i17 = iVar.f297171f;
        if (i17 == 0) {
            j();
            return;
        }
        if (i17 == 3) {
            j();
            return;
        }
        com.tencent.mm.ui.widget.button.WeButton weButton = this.f288050t;
        android.widget.ProgressBar progressBar = this.D;
        android.widget.ImageView imageView = this.A;
        if (i17 != 4) {
            if (i17 == 6) {
                j12.i iVar2 = this.M;
                if (iVar2 == null) {
                    return;
                }
                progressBar.setVisibility(8);
                o(8);
                imageView.setVisibility(8);
                android.widget.ProgressBar progressBar2 = this.C;
                progressBar2.setVisibility(0);
                progressBar2.setProgress(iVar2.f297170e);
                java.lang.String g17 = com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.f491097bw2);
                kotlin.jvm.internal.o.f(g17, "getString(...)");
                java.lang.String format = java.lang.String.format(g17, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(iVar2.f297170e)}, 1));
                kotlin.jvm.internal.o.f(format, "format(...)");
                progressBar2.setContentDescription(format);
                android.view.View view = this.B;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/emoji/ui/v3/model/EmojiStoreV3HomeMainHolder", "dealDownloadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/emoji/ui/v3/model/EmojiStoreV3HomeMainHolder", "dealDownloadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            if (i17 == 7) {
                if (!iVar.f297175j || !j12.g.b(iVar.f297167b.f392135n, 64)) {
                    progressBar.setVisibility(8);
                    l(false);
                    imageView.setVisibility(4);
                    android.view.View view2 = this.B;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList2.add(4);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/emoji/ui/v3/model/EmojiStoreV3HomeMainHolder", "dealDownloadedView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/plugin/emoji/ui/v3/model/EmojiStoreV3HomeMainHolder", "dealDownloadedView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    return;
                }
                l(true);
                o(8);
                this.f288052v.setVisibility(0);
                imageView.setVisibility(4);
                android.view.View view3 = this.B;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                arrayList3.add(4);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/emoji/ui/v3/model/EmojiStoreV3HomeMainHolder", "dealRewardView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/emoji/ui/v3/model/EmojiStoreV3HomeMainHolder", "dealRewardView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            if (i17 == 8) {
                progressBar.setVisibility(8);
                l(true);
                weButton.setText(com.tencent.mm.R.string.byq);
                weButton.setEnabled(false);
                imageView.setVisibility(4);
                android.view.View view4 = this.B;
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
                arrayList4.add(4);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/emoji/ui/v3/model/EmojiStoreV3HomeMainHolder", "dealExpiredView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(view4, "com/tencent/mm/plugin/emoji/ui/v3/model/EmojiStoreV3HomeMainHolder", "dealExpiredView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            switch (i17) {
                case 10:
                    progressBar.setVisibility(8);
                    l(true);
                    weButton.setText(com.tencent.mm.R.string.f491112bz3);
                    imageView.setVisibility(4);
                    weButton.setEnabled(true);
                    android.view.View view5 = this.B;
                    java.util.ArrayList arrayList5 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal5 = zj0.c.f473285a;
                    arrayList5.add(4);
                    java.util.Collections.reverse(arrayList5);
                    yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/emoji/ui/v3/model/EmojiStoreV3HomeMainHolder", "dealLoadGoogleMarketFailView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                    yj0.a.f(view5, "com/tencent/mm/plugin/emoji/ui/v3/model/EmojiStoreV3HomeMainHolder", "dealLoadGoogleMarketFailView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    return;
                case 11:
                    progressBar.setVisibility(0);
                    o(8);
                    imageView.setVisibility(4);
                    android.view.View view6 = this.B;
                    java.util.ArrayList arrayList6 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal6 = zj0.c.f473285a;
                    arrayList6.add(4);
                    java.util.Collections.reverse(arrayList6);
                    yj0.a.d(view6, arrayList6.toArray(), "com/tencent/mm/plugin/emoji/ui/v3/model/EmojiStoreV3HomeMainHolder", "dealLoadingGoogleMarketView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                    yj0.a.f(view6, "com/tencent/mm/plugin/emoji/ui/v3/model/EmojiStoreV3HomeMainHolder", "dealLoadingGoogleMarketView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    return;
                case 12:
                    break;
                default:
                    com.tencent.mars.xlog.Log.w(this.L, "unknown product status:%d", java.lang.Integer.valueOf(i17));
                    return;
            }
        }
        j12.i iVar3 = this.M;
        if (iVar3 == null) {
            return;
        }
        progressBar.setVisibility(8);
        android.view.View view7 = this.B;
        java.util.ArrayList arrayList7 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal7 = zj0.c.f473285a;
        arrayList7.add(4);
        java.util.Collections.reverse(arrayList7);
        yj0.a.d(view7, arrayList7.toArray(), "com/tencent/mm/plugin/emoji/ui/v3/model/EmojiStoreV3HomeMainHolder", "dealWaitForPayView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view7.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
        yj0.a.f(view7, "com/tencent/mm/plugin/emoji/ui/v3/model/EmojiStoreV3HomeMainHolder", "dealWaitForPayView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        l(true);
        imageView.setVisibility(4);
        r45.zj0 zj0Var = iVar3.f297167b;
        if (zj0Var != null) {
            n22.i iVar4 = n22.j.f334293a;
            if ((zj0Var.f392135n & 512) == 512) {
                int i18 = zj0Var.A;
                android.content.Context context = this.f288039f;
                weButton.setText(iVar4.d(context, i18, "", context.getColor(com.tencent.mm.R.color.aaq)));
                java.lang.String g18 = com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.c0n);
                kotlin.jvm.internal.o.f(g18, "getString(...)");
                java.lang.String format2 = java.lang.String.format(g18, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(iVar3.f297167b.A)}, 1));
                kotlin.jvm.internal.o.f(format2, "format(...)");
                weButton.setContentDescription(format2);
            } else {
                weButton.setText(zj0Var.f392133i);
                java.lang.String g19 = com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.bxc);
                kotlin.jvm.internal.o.f(g19, "getString(...)");
                java.lang.String format3 = java.lang.String.format(g19, java.util.Arrays.copyOf(new java.lang.Object[]{weButton.getText()}, 1));
                kotlin.jvm.internal.o.f(format3, "format(...)");
                weButton.setContentDescription(format3);
            }
        }
        weButton.setEnabled(true);
    }

    @Override // i22.q0
    public void h(int i17, java.lang.String productId) {
        kotlin.jvm.internal.o.g(productId, "productId");
        j12.i iVar = this.M;
        if (iVar == null) {
            return;
        }
        boolean z17 = false;
        if (i17 >= 0 && i17 < 100) {
            z17 = true;
        }
        if (z17) {
            k(iVar, productId, 6);
            iVar.f297170e = i17;
        }
        if (i17 >= 100) {
            k(iVar, productId, 7);
        }
        f();
    }

    @Override // i22.m
    public void i(i22.n0 item, java.util.List payloads) {
        j12.i iVar;
        boolean z17;
        r45.zj0 zj0Var;
        kotlin.jvm.internal.o.g(item, "item");
        kotlin.jvm.internal.o.g(payloads, "payloads");
        super.i(item, payloads);
        if (!payloads.isEmpty()) {
            f();
            return;
        }
        i22.m0 m0Var = item instanceof i22.m0 ? (i22.m0) item : null;
        if (m0Var == null || (iVar = m0Var.f288004a) == null) {
            return;
        }
        this.M = iVar;
        if (this.f288042i) {
            iVar.f297175j = true;
            iVar.f297173h = true;
            iVar.f297174i = false;
        }
        iVar.f297174i = this.f288043m;
        android.widget.TextView textView = this.f288048r;
        android.widget.ImageView imageView = this.f288047q;
        android.widget.ImageView imageView2 = this.f288053w;
        r45.kj0 kj0Var = iVar.f297169d;
        if (kj0Var == null) {
            android.view.View view = this.f288049s;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/emoji/ui/v3/model/EmojiStoreV3HomeMainHolder", "dellCellSet", "(Lcom/tencent/mm/plugin/emoji/adapter/data/EmotionItem;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/emoji/ui/v3/model/EmojiStoreV3HomeMainHolder", "dellCellSet", "(Lcom/tencent/mm/plugin/emoji/adapter/data/EmotionItem;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            z17 = false;
        } else {
            textView.setText(kj0Var.f378727e);
            n(kj0Var.f378733n);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(kj0Var.f378732m)) {
                n11.a b17 = n11.a.b();
                java.lang.String str = kj0Var.f378732m;
                b17.h(str, imageView, y12.f.b("", str));
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(kj0Var.f378735p)) {
                imageView2.setVisibility(8);
            } else {
                n11.a b18 = n11.a.b();
                java.lang.String str2 = kj0Var.f378735p;
                b18.h(str2, imageView2, y12.f.b("", str2));
                imageView2.setVisibility(0);
            }
            android.view.View view2 = this.f288049s;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/emoji/ui/v3/model/EmojiStoreV3HomeMainHolder", "dellCellSet", "(Lcom/tencent/mm/plugin/emoji/adapter/data/EmotionItem;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/emoji/ui/v3/model/EmojiStoreV3HomeMainHolder", "dellCellSet", "(Lcom/tencent/mm/plugin/emoji/adapter/data/EmotionItem;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            z17 = true;
        }
        if (z17 || (zj0Var = iVar.f297167b) == null) {
            return;
        }
        textView.setText(zj0Var.f392130f);
        if (n22.l.c(zj0Var)) {
            n11.a.b().g("", imageView);
            imageView.setImageResource(com.tencent.mm.R.drawable.icon_002_cover);
        } else {
            n11.a b19 = n11.a.b();
            java.lang.String str3 = zj0Var.f392129e;
            b19.h(str3, imageView, y12.f.b(zj0Var.f392128d, str3));
        }
        boolean b27 = j12.g.b(zj0Var.f392134m, 2);
        if (!android.text.TextUtils.isEmpty(zj0Var.f392146y)) {
            imageView2.setImageDrawable(null);
            imageView2.setVisibility(0);
            n11.a b28 = n11.a.b();
            java.lang.String str4 = zj0Var.f392146y;
            b28.h(str4, imageView2, y12.f.b("", str4));
        } else if (b27) {
            imageView2.setVisibility(0);
            imageView2.setImageResource(com.tencent.mm.R.drawable.bhy);
        } else {
            imageView2.setVisibility(8);
        }
        android.view.View view3 = this.f288054x;
        int i17 = this.f288041h.contains(zj0Var.f392128d) ? 0 : 8;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/emoji/ui/v3/model/EmojiStoreV3HomeMainHolder", "onBind", "(Lcom/tencent/mm/plugin/emoji/ui/v3/model/IEmojiStoreTypeItem;Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/emoji/ui/v3/model/EmojiStoreV3HomeMainHolder", "onBind", "(Lcom/tencent/mm/plugin/emoji/ui/v3/model/IEmojiStoreTypeItem;Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        n(!com.tencent.mm.sdk.platformtools.t8.K0(zj0Var.f392147z) ? zj0Var.f392147z : zj0Var.f392145x);
        f();
        this.f288046p.setBackgroundResource(com.tencent.mm.R.drawable.f481310q6);
        boolean z18 = ((i22.m0) item).f288005b;
        android.view.View view4 = this.f288045o;
        if (z18) {
            view4.setBackground(this.H);
        } else {
            view4.setBackground(this.I);
        }
        this.f288050t.setOnClickListener(new i22.t(this, item));
        this.f288052v.setOnClickListener(new i22.u(this, item));
        r45.tj0 tj0Var = zj0Var.D;
        if (!com.tencent.mm.plugin.emoji.model.EmojiLogic.v(tj0Var)) {
            android.view.View view5 = this.E;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view5, arrayList4.toArray(), "com/tencent/mm/plugin/emoji/ui/v3/model/EmojiStoreV3HomeMainHolder", "onBind", "(Lcom/tencent/mm/plugin/emoji/ui/v3/model/IEmojiStoreTypeItem;Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/emoji/ui/v3/model/EmojiStoreV3HomeMainHolder", "onBind", "(Lcom/tencent/mm/plugin/emoji/ui/v3/model/IEmojiStoreTypeItem;Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view6 = this.E;
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        arrayList5.add(0);
        java.util.Collections.reverse(arrayList5);
        yj0.a.d(view6, arrayList5.toArray(), "com/tencent/mm/plugin/emoji/ui/v3/model/EmojiStoreV3HomeMainHolder", "onBind", "(Lcom/tencent/mm/plugin/emoji/ui/v3/model/IEmojiStoreTypeItem;Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view6.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
        yj0.a.f(view6, "com/tencent/mm/plugin/emoji/ui/v3/model/EmojiStoreV3HomeMainHolder", "onBind", "(Lcom/tencent/mm/plugin/emoji/ui/v3/model/IEmojiStoreTypeItem;Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.lang.String str5 = tj0Var.f386496e;
        if (!(str5 == null || str5.length() == 0)) {
            vo0.e eVar = vo0.e.f438467a;
            vo0.a aVar = vo0.e.f438468b;
            java.lang.String IconUrl = tj0Var.f386496e;
            kotlin.jvm.internal.o.f(IconUrl, "IconUrl");
            wo0.c a17 = aVar.a(IconUrl);
            yo0.f fVar = new yo0.f();
            fVar.f464078b = true;
            a17.f447872c = fVar.a();
            ((wo0.b) a17).c(this.G);
            this.F.setText(tj0Var.f386497f);
        }
        this.f288055y.setVisibility(8);
    }

    public void j() {
        this.D.setVisibility(8);
        android.view.View view = this.B;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/emoji/ui/v3/model/EmojiStoreV3HomeMainHolder", "dealWaitForDownloadView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/emoji/ui/v3/model/EmojiStoreV3HomeMainHolder", "dealWaitForDownloadView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        l(true);
        com.tencent.mm.ui.widget.button.WeButton weButton = this.f288050t;
        weButton.setText(com.tencent.mm.R.string.byn);
        weButton.setEnabled(true);
        this.A.setVisibility(8);
    }

    public final void k(j12.i iVar, java.lang.String str, int i17) {
        com.tencent.mm.storage.f5 f5Var;
        if (iVar == null || str == null || kotlin.jvm.internal.o.b(str, "")) {
            return;
        }
        iVar.c(i17);
        com.tencent.mm.plugin.emoji.model.f0 f0Var = this.K;
        if (f0Var == null || (f5Var = (com.tencent.mm.storage.f5) ((com.tencent.mm.plugin.emoji.model.q) f0Var).f97596b.get(str)) == null) {
            return;
        }
        f5Var.a(i17);
    }

    public final void l(boolean z17) {
        com.tencent.mm.ui.widget.button.WeButton weButton = this.f288051u;
        if (weButton.isEnabled()) {
            weButton.setText(com.tencent.mm.R.string.byp);
            weButton.setIcon(com.tencent.mm.R.raw.icons_filled_done);
            weButton.setEnabled(false);
            weButton.setBackgroundColor(0);
        }
        com.tencent.mm.ui.widget.button.WeButton weButton2 = this.f288050t;
        if (z17) {
            weButton.setVisibility(8);
            weButton2.setVisibility(0);
        } else {
            weButton2.setVisibility(8);
            weButton.setVisibility(0);
        }
        this.f288052v.setVisibility(8);
    }

    public final void n(java.lang.String str) {
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(str);
        android.view.ViewGroup viewGroup = this.f288055y;
        android.widget.TextView textView = this.f288056z;
        if (K0) {
            viewGroup.setVisibility(8);
            textView.setVisibility(8);
        } else {
            viewGroup.setVisibility(0);
            textView.setVisibility(0);
            textView.setText(str);
        }
    }

    public final void o(int i17) {
        this.f288050t.setVisibility(i17);
        this.f288051u.setVisibility(i17);
        this.f288052v.setVisibility(i17);
    }
}
