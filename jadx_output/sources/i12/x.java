package i12;

/* loaded from: classes15.dex */
public final class x extends i22.m implements i22.q0 {
    public final android.widget.TextView A;
    public final android.widget.TextView B;
    public final android.widget.LinearLayout C;
    public final java.lang.String D;
    public j12.i E;

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Context f287251f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f287252g;

    /* renamed from: h, reason: collision with root package name */
    public final i22.p0 f287253h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f287254i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f287255m;

    /* renamed from: n, reason: collision with root package name */
    public final int f287256n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f287257o;

    /* renamed from: p, reason: collision with root package name */
    public final android.widget.TextView f287258p;

    /* renamed from: q, reason: collision with root package name */
    public final android.widget.TextView f287259q;

    /* renamed from: r, reason: collision with root package name */
    public final com.google.android.flexbox.FlexboxLayout f287260r;

    /* renamed from: s, reason: collision with root package name */
    public final android.view.View f287261s;

    /* renamed from: t, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.button.WeButton f287262t;

    /* renamed from: u, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.button.WeButton f287263u;

    /* renamed from: v, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.button.WeButton f287264v;

    /* renamed from: w, reason: collision with root package name */
    public final android.widget.ImageView f287265w;

    /* renamed from: x, reason: collision with root package name */
    public final android.view.View f287266x;

    /* renamed from: y, reason: collision with root package name */
    public final android.widget.ProgressBar f287267y;

    /* renamed from: z, reason: collision with root package name */
    public final android.widget.ProgressBar f287268z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(android.content.Context context, android.view.View itemView, i22.p0 p0Var, java.lang.String finderUserName, java.lang.String sdkRequestID, int i17, java.lang.String pageSessionID, boolean z17) {
        super(itemView, p0Var);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(itemView, "itemView");
        kotlin.jvm.internal.o.g(finderUserName, "finderUserName");
        kotlin.jvm.internal.o.g(sdkRequestID, "sdkRequestID");
        kotlin.jvm.internal.o.g(pageSessionID, "pageSessionID");
        this.f287251f = context;
        this.f287252g = itemView;
        this.f287253h = p0Var;
        this.f287254i = finderUserName;
        this.f287255m = sdkRequestID;
        this.f287256n = i17;
        this.f287257o = z17;
        android.view.View findViewById = itemView.findViewById(com.tencent.mm.R.id.omi);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f287258p = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = itemView.findViewById(com.tencent.mm.R.id.omh);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f287259q = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = itemView.findViewById(com.tencent.mm.R.id.f484190hq4);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f287260r = (com.google.android.flexbox.FlexboxLayout) findViewById3;
        android.view.View findViewById4 = itemView.findViewById(com.tencent.mm.R.id.f485387hj0);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f287261s = findViewById4;
        android.view.View findViewById5 = itemView.findViewById(com.tencent.mm.R.id.r9r);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f287262t = (com.tencent.mm.ui.widget.button.WeButton) findViewById5;
        android.view.View findViewById6 = itemView.findViewById(com.tencent.mm.R.id.r9s);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        this.f287263u = (com.tencent.mm.ui.widget.button.WeButton) findViewById6;
        android.view.View findViewById7 = itemView.findViewById(com.tencent.mm.R.id.r9t);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        this.f287264v = (com.tencent.mm.ui.widget.button.WeButton) findViewById7;
        android.view.View findViewById8 = itemView.findViewById(com.tencent.mm.R.id.hjh);
        kotlin.jvm.internal.o.f(findViewById8, "findViewById(...)");
        this.f287265w = (android.widget.ImageView) findViewById8;
        android.view.View findViewById9 = itemView.findViewById(com.tencent.mm.R.id.hj_);
        kotlin.jvm.internal.o.f(findViewById9, "findViewById(...)");
        this.f287266x = findViewById9;
        android.view.View findViewById10 = itemView.findViewById(com.tencent.mm.R.id.hhl);
        kotlin.jvm.internal.o.f(findViewById10, "findViewById(...)");
        this.f287267y = (android.widget.ProgressBar) findViewById10;
        android.view.View findViewById11 = itemView.findViewById(com.tencent.mm.R.id.f486416l53);
        kotlin.jvm.internal.o.f(findViewById11, "findViewById(...)");
        this.f287268z = (android.widget.ProgressBar) findViewById11;
        android.view.View findViewById12 = itemView.findViewById(com.tencent.mm.R.id.hob);
        kotlin.jvm.internal.o.f(findViewById12, "findViewById(...)");
        this.A = (android.widget.TextView) findViewById12;
        android.view.View findViewById13 = itemView.findViewById(com.tencent.mm.R.id.sak);
        kotlin.jvm.internal.o.f(findViewById13, "findViewById(...)");
        this.B = (android.widget.TextView) findViewById13;
        android.view.View findViewById14 = itemView.findViewById(com.tencent.mm.R.id.sah);
        kotlin.jvm.internal.o.f(findViewById14, "findViewById(...)");
        this.C = (android.widget.LinearLayout) findViewById14;
        this.D = "MicroMsg.EmojiStoreV3HomeMainHolder";
    }

    @Override // i22.q0
    public void b(int i17, java.lang.String productId) {
        kotlin.jvm.internal.o.g(productId, "productId");
        j12.i iVar = this.E;
        if (iVar == null) {
            return;
        }
        k(iVar, productId, i17);
        if (i17 == 7) {
            com.tencent.mm.plugin.emoji.model.p pVar = com.tencent.mm.plugin.emoji.model.q.f97591c;
            com.tencent.mm.plugin.emoji.model.q.f97593e.put(productId, 7);
        }
        if (iVar.f297171f == -1) {
            com.tencent.mars.xlog.Log.i(this.D, "force refresh status");
            iVar.b(c01.z1.y(), null, com.tencent.mm.plugin.emoji.model.q.f97591c.a(productId));
        }
        f();
    }

    @Override // i22.q0
    public j12.i d() {
        return this.E;
    }

    @Override // i22.q0
    public void e(java.lang.String productId) {
        kotlin.jvm.internal.o.g(productId, "productId");
        j12.i iVar = this.E;
        if (iVar == null) {
            return;
        }
        iVar.c(-1);
        iVar.b(c01.z1.y(), null, com.tencent.mm.plugin.emoji.model.q.f97591c.a(productId));
    }

    @Override // i22.q0
    public void f() {
        j12.i iVar = this.E;
        if (iVar == null) {
            return;
        }
        n(8);
        int i17 = iVar.f297171f;
        if (i17 == 0) {
            j();
            return;
        }
        if (i17 == 3) {
            j();
            return;
        }
        com.tencent.mm.ui.widget.button.WeButton weButton = this.f287262t;
        android.widget.ProgressBar progressBar = this.f287268z;
        android.widget.ImageView imageView = this.f287265w;
        if (i17 != 4) {
            if (i17 == 6) {
                j12.i iVar2 = this.E;
                if (iVar2 == null) {
                    return;
                }
                progressBar.setVisibility(8);
                n(8);
                imageView.setVisibility(8);
                android.widget.ProgressBar progressBar2 = this.f287267y;
                progressBar2.setVisibility(0);
                progressBar2.setProgress(iVar2.f297170e);
                java.lang.String g17 = com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.f491097bw2);
                kotlin.jvm.internal.o.f(g17, "getString(...)");
                java.lang.String format = java.lang.String.format(g17, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(iVar2.f297170e)}, 1));
                kotlin.jvm.internal.o.f(format, "format(...)");
                progressBar2.setContentDescription(format);
                android.view.View view = this.f287266x;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/emoji/adapter/EmojiStoreV3HomeMainForFinderHolder", "dealDownloadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/emoji/adapter/EmojiStoreV3HomeMainForFinderHolder", "dealDownloadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            if (i17 == 7) {
                if (!iVar.f297175j || !j12.g.b(iVar.f297168c.f32461i, 64)) {
                    progressBar.setVisibility(8);
                    l(false);
                    imageView.setVisibility(4);
                    android.view.View view2 = this.f287266x;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList2.add(4);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/emoji/adapter/EmojiStoreV3HomeMainForFinderHolder", "dealDownloadedView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/plugin/emoji/adapter/EmojiStoreV3HomeMainForFinderHolder", "dealDownloadedView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    return;
                }
                l(true);
                n(8);
                this.f287264v.setVisibility(0);
                imageView.setVisibility(4);
                android.view.View view3 = this.f287266x;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                arrayList3.add(4);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/emoji/adapter/EmojiStoreV3HomeMainForFinderHolder", "dealRewardView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/emoji/adapter/EmojiStoreV3HomeMainForFinderHolder", "dealRewardView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            if (i17 == 8) {
                progressBar.setVisibility(8);
                l(true);
                weButton.setText(com.tencent.mm.R.string.byq);
                weButton.setEnabled(false);
                imageView.setVisibility(4);
                android.view.View view4 = this.f287266x;
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
                arrayList4.add(4);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/emoji/adapter/EmojiStoreV3HomeMainForFinderHolder", "dealExpiredView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(view4, "com/tencent/mm/plugin/emoji/adapter/EmojiStoreV3HomeMainForFinderHolder", "dealExpiredView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            switch (i17) {
                case 10:
                    progressBar.setVisibility(8);
                    l(true);
                    weButton.setText(com.tencent.mm.R.string.f491112bz3);
                    imageView.setVisibility(4);
                    weButton.setEnabled(true);
                    android.view.View view5 = this.f287266x;
                    java.util.ArrayList arrayList5 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal5 = zj0.c.f473285a;
                    arrayList5.add(4);
                    java.util.Collections.reverse(arrayList5);
                    yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/emoji/adapter/EmojiStoreV3HomeMainForFinderHolder", "dealLoadGoogleMarketFailView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                    yj0.a.f(view5, "com/tencent/mm/plugin/emoji/adapter/EmojiStoreV3HomeMainForFinderHolder", "dealLoadGoogleMarketFailView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    return;
                case 11:
                    progressBar.setVisibility(0);
                    n(8);
                    imageView.setVisibility(4);
                    android.view.View view6 = this.f287266x;
                    java.util.ArrayList arrayList6 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal6 = zj0.c.f473285a;
                    arrayList6.add(4);
                    java.util.Collections.reverse(arrayList6);
                    yj0.a.d(view6, arrayList6.toArray(), "com/tencent/mm/plugin/emoji/adapter/EmojiStoreV3HomeMainForFinderHolder", "dealLoadingGoogleMarketView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                    yj0.a.f(view6, "com/tencent/mm/plugin/emoji/adapter/EmojiStoreV3HomeMainForFinderHolder", "dealLoadingGoogleMarketView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    return;
                case 12:
                    break;
                default:
                    com.tencent.mars.xlog.Log.w(this.D, "unknown product status:%d", java.lang.Integer.valueOf(i17));
                    return;
            }
        }
        j12.i iVar3 = this.E;
        if (iVar3 == null) {
            return;
        }
        progressBar.setVisibility(8);
        android.view.View view7 = this.f287266x;
        java.util.ArrayList arrayList7 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal7 = zj0.c.f473285a;
        arrayList7.add(4);
        java.util.Collections.reverse(arrayList7);
        yj0.a.d(view7, arrayList7.toArray(), "com/tencent/mm/plugin/emoji/adapter/EmojiStoreV3HomeMainForFinderHolder", "dealWaitForPayView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view7.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
        yj0.a.f(view7, "com/tencent/mm/plugin/emoji/adapter/EmojiStoreV3HomeMainForFinderHolder", "dealWaitForPayView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        l(true);
        imageView.setVisibility(4);
        bw5.ra raVar = iVar3.f297168c;
        if (raVar != null) {
            n22.i iVar4 = n22.j.f334293a;
            if ((raVar.f32461i & 512) == 512) {
                int i18 = raVar.f32470u;
                android.content.Context context = this.f287251f;
                weButton.setText(iVar4.d(context, i18, "", context.getColor(com.tencent.mm.R.color.aaq)));
                java.lang.String g18 = com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.c0n);
                kotlin.jvm.internal.o.f(g18, "getString(...)");
                java.lang.String format2 = java.lang.String.format(g18, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(raVar.f32470u)}, 1));
                kotlin.jvm.internal.o.f(format2, "format(...)");
                weButton.setContentDescription(format2);
            }
        }
        weButton.setEnabled(true);
    }

    @Override // i22.q0
    public void h(int i17, java.lang.String productId) {
        kotlin.jvm.internal.o.g(productId, "productId");
        j12.i iVar = this.E;
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
        bw5.ra raVar;
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
        this.E = iVar;
        android.widget.TextView textView = this.f287258p;
        r45.kj0 kj0Var = iVar.f297169d;
        if (kj0Var == null) {
            android.view.View view = this.f287261s;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/emoji/adapter/EmojiStoreV3HomeMainForFinderHolder", "dellCellSet", "(Lcom/tencent/mm/plugin/emoji/adapter/data/EmotionItem;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/emoji/adapter/EmojiStoreV3HomeMainForFinderHolder", "dellCellSet", "(Lcom/tencent/mm/plugin/emoji/adapter/data/EmotionItem;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            z17 = false;
        } else {
            textView.setText(kj0Var.f378727e);
            android.view.View view2 = this.f287261s;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/emoji/adapter/EmojiStoreV3HomeMainForFinderHolder", "dellCellSet", "(Lcom/tencent/mm/plugin/emoji/adapter/data/EmotionItem;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/emoji/adapter/EmojiStoreV3HomeMainForFinderHolder", "dellCellSet", "(Lcom/tencent/mm/plugin/emoji/adapter/data/EmotionItem;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            z17 = true;
        }
        if (z17 || (raVar = iVar.f297168c) == null) {
            return;
        }
        textView.setText(raVar.f32458f);
        java.lang.Object[] objArr = {java.lang.Integer.valueOf(raVar.E)};
        android.content.Context context = this.f287251f;
        this.f287259q.setText(context.getString(com.tencent.mm.R.string.d7s, objArr));
        this.f287260r.post(new i12.u(this, raVar));
        n22.f fVar = n22.f.f334290a;
        this.B.setText(context.getString(com.tencent.mm.R.string.d7q, fVar.c(raVar.S.f390163e)));
        this.A.setText(context.getString(com.tencent.mm.R.string.d7q, fVar.c(raVar.S.f390162d)));
        android.widget.LinearLayout linearLayout = this.C;
        boolean z18 = this.f287257o;
        if (z18) {
            linearLayout.setVisibility(0);
        } else {
            linearLayout.setVisibility(8);
        }
        f();
        i12.v vVar = new i12.v(this, item);
        com.tencent.mm.ui.widget.button.WeButton weButton = this.f287262t;
        weButton.setOnClickListener(vVar);
        this.f287264v.setOnClickListener(new i12.w(this, item));
        java.lang.String str = this.f287255m;
        if (str.length() > 0) {
            cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
            android.view.View view3 = this.f287252g;
            aVar.pk(view3, "finder_profile_emoticon_cell");
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Tj(view3, 40, 10, false);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(weButton, "finder_profile_emoticon_cell_add");
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Tj(weButton, 8, 10, false);
            java.util.HashMap hashMap = new java.util.HashMap();
            java.util.HashMap hashMap2 = new java.util.HashMap();
            if (!(str.length() == 0)) {
                j12.i iVar2 = this.E;
                bw5.ra raVar2 = iVar2 != null ? iVar2.f297168c : null;
                if (raVar2 != null) {
                    java.lang.String ProductID = raVar2.f32456d;
                    kotlin.jvm.internal.o.f(ProductID, "ProductID");
                    hashMap.put("pid", ProductID);
                    hashMap.put("emoticon_type", 2);
                    hashMap.put("emoticon_enter_scene", java.lang.Integer.valueOf(this.f287256n));
                    hashMap.put("pos_id", java.lang.Integer.valueOf(getAdapterPosition()));
                    hashMap.put("emoticon_sessionid", str);
                    hashMap.put("emoticon_user_type", z18 ? "1" : "2");
                    iy1.c cVar = iy1.c.MainUI;
                    hashMap2.put("page_id", 50103);
                    hashMap2.put("page_name", "FinderProfileEmoticonTab");
                    hashMap.put("cur_page", hashMap2);
                }
            }
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).gk(view3, hashMap);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).gk(weButton, hashMap);
        }
    }

    public void j() {
        this.f287268z.setVisibility(8);
        android.view.View view = this.f287266x;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/emoji/adapter/EmojiStoreV3HomeMainForFinderHolder", "dealWaitForDownloadView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/emoji/adapter/EmojiStoreV3HomeMainForFinderHolder", "dealWaitForDownloadView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        l(true);
        com.tencent.mm.ui.widget.button.WeButton weButton = this.f287262t;
        weButton.setText(com.tencent.mm.R.string.byn);
        weButton.setEnabled(true);
        this.f287265w.setVisibility(8);
    }

    public final void k(j12.i iVar, java.lang.String str, int i17) {
        if (iVar == null || str == null || kotlin.jvm.internal.o.b(str, "")) {
            return;
        }
        iVar.c(i17);
    }

    public final void l(boolean z17) {
        com.tencent.mm.ui.widget.button.WeButton weButton = this.f287263u;
        if (weButton.isEnabled()) {
            weButton.setText(com.tencent.mm.R.string.byp);
            weButton.setIcon(com.tencent.mm.R.raw.icons_filled_done);
            weButton.setEnabled(false);
            weButton.setBackgroundColor(0);
        }
        com.tencent.mm.ui.widget.button.WeButton weButton2 = this.f287262t;
        if (z17) {
            weButton.setVisibility(8);
            weButton2.setVisibility(0);
        } else {
            weButton2.setVisibility(8);
            weButton.setVisibility(0);
        }
        this.f287264v.setVisibility(8);
    }

    public final void n(int i17) {
        this.f287262t.setVisibility(i17);
        this.f287263u.setVisibility(i17);
        this.f287264v.setVisibility(i17);
    }
}
