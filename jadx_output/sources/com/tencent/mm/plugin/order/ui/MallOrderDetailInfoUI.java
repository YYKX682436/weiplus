package com.tencent.mm.plugin.order.ui;

@db5.a(3)
/* loaded from: classes9.dex */
public class MallOrderDetailInfoUI extends com.tencent.mm.wallet_core.ui.WalletBaseUI implements y60.e {
    public static final /* synthetic */ int B = 0;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f152827d;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ListView f152829f;

    /* renamed from: g, reason: collision with root package name */
    public fp3.i f152830g;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f152832i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f152833m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f152834n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f152835o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f152836p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f152837q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f152838r;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.CheckedTextView f152844x;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.CheckedTextView f152845y;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f152828e = new java.util.ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.order.model.a f152831h = null;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.HashMap f152839s = new java.util.HashMap();

    /* renamed from: t, reason: collision with root package name */
    public boolean f152840t = false;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f152841u = "";

    /* renamed from: v, reason: collision with root package name */
    public boolean f152842v = false;

    /* renamed from: w, reason: collision with root package name */
    public int f152843w = 0;

    /* renamed from: z, reason: collision with root package name */
    public final android.view.View.OnClickListener f152846z = new fp3.a(this);
    public final android.view.View.OnClickListener A = new fp3.g(this);

    public static void U6(com.tencent.mm.plugin.order.ui.MallOrderDetailInfoUI mallOrderDetailInfoUI, java.lang.String str) {
        hp3.d.d(java.lang.Boolean.valueOf(mallOrderDetailInfoUI.f152840t), mallOrderDetailInfoUI.f152831h.f152825g, mallOrderDetailInfoUI.f152841u, str, "");
    }

    @Override // y60.e
    public void K4(java.lang.String str, android.graphics.Bitmap bitmap) {
        android.widget.ImageView imageView = (android.widget.ImageView) this.f152839s.get(str);
        if (imageView != null) {
            imageView.setImageBitmap(bitmap);
        }
    }

    public final void V6() {
        if (this.f152842v || this.f152843w == 0) {
            return;
        }
        gm0.j1.i();
        gm0.j1.n().f273288b.g(new dp3.l(this.f152841u, "", this.f152843w));
        this.f152842v = true;
    }

    public void W6() {
        java.util.List list;
        if (this.f152831h == null) {
            return;
        }
        ((x60.e) ((y60.f) i95.n0.c(y60.f.class))).wi(this);
        this.f152839s.clear();
        dp3.c cVar = this.f152831h.f152820b;
        if (cVar != null) {
            java.lang.String str = cVar.f242202a;
            if (!android.text.TextUtils.isEmpty(cVar.f242206e)) {
                str = str + "：" + cVar.f242206e;
            }
            if (this.f152840t) {
                android.view.View view = this.f152832i;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshStatusUI", "(Lcom/tencent/mm/plugin/order/model/MallOrderDetailObject$StatusSection;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshStatusUI", "(Lcom/tencent/mm/plugin/order/model/MallOrderDetailObject$StatusSection;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view2 = this.f152833m;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshStatusUI", "(Lcom/tencent/mm/plugin/order/model/MallOrderDetailObject$StatusSection;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshStatusUI", "(Lcom/tencent/mm/plugin/order/model/MallOrderDetailObject$StatusSection;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                ((android.widget.TextView) this.f152833m.findViewById(com.tencent.mm.R.id.kkx)).setText(str);
                ((android.widget.TextView) this.f152833m.findViewById(com.tencent.mm.R.id.kkw)).setText(com.tencent.mm.wallet_core.ui.r1.p(this.f152831h.f152826h));
                if (android.text.TextUtils.isEmpty(cVar.f242204c) || !com.tencent.mm.wallet_core.ui.r1.Q(cVar.f242204c)) {
                    android.widget.ImageView imageView = (android.widget.ImageView) this.f152833m.findViewById(com.tencent.mm.R.id.kl6);
                    android.graphics.Bitmap decodeResource = bp.b.decodeResource(getResources(), com.tencent.mm.R.raw.mall_order_trade_state_icon, null);
                    if (decodeResource != null) {
                        imageView.setImageBitmap(com.tencent.mm.sdk.platformtools.x.s0(decodeResource, false, 96.0f));
                    }
                } else {
                    X6((android.widget.ImageView) this.f152833m.findViewById(com.tencent.mm.R.id.kl6), cVar.f242204c);
                }
            } else {
                android.view.View view3 = this.f152833m;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshStatusUI", "(Lcom/tencent/mm/plugin/order/model/MallOrderDetailObject$StatusSection;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshStatusUI", "(Lcom/tencent/mm/plugin/order/model/MallOrderDetailObject$StatusSection;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view4 = this.f152832i;
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                arrayList4.add(0);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshStatusUI", "(Lcom/tencent/mm/plugin/order/model/MallOrderDetailObject$StatusSection;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(view4, "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshStatusUI", "(Lcom/tencent/mm/plugin/order/model/MallOrderDetailObject$StatusSection;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                ((android.widget.TextView) this.f152832i.findViewById(com.tencent.mm.R.id.kkx)).setText(str);
                ((android.widget.TextView) this.f152832i.findViewById(com.tencent.mm.R.id.kkw)).setText(com.tencent.mm.wallet_core.ui.r1.p(this.f152831h.f152826h));
                if (android.text.TextUtils.isEmpty(cVar.f242204c) || !com.tencent.mm.wallet_core.ui.r1.Q(cVar.f242204c)) {
                    android.widget.ImageView imageView2 = (android.widget.ImageView) this.f152832i.findViewById(com.tencent.mm.R.id.kl6);
                    android.graphics.Bitmap decodeResource2 = bp.b.decodeResource(getResources(), com.tencent.mm.R.raw.mall_order_trade_state_icon, null);
                    if (decodeResource2 != null) {
                        imageView2.setImageBitmap(com.tencent.mm.sdk.platformtools.x.s0(decodeResource2, false, 96.0f));
                    }
                } else {
                    X6((android.widget.ImageView) this.f152832i.findViewById(com.tencent.mm.R.id.kl6), cVar.f242204c);
                }
            }
        } else {
            android.view.View view5 = this.f152832i;
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList5.add(8);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshStatusUI", "(Lcom/tencent/mm/plugin/order/model/MallOrderDetailObject$StatusSection;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshStatusUI", "(Lcom/tencent/mm/plugin/order/model/MallOrderDetailObject$StatusSection;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view6 = this.f152833m;
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            arrayList6.add(8);
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(view6, arrayList6.toArray(), "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshStatusUI", "(Lcom/tencent/mm/plugin/order/model/MallOrderDetailObject$StatusSection;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(view6, "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshStatusUI", "(Lcom/tencent/mm/plugin/order/model/MallOrderDetailObject$StatusSection;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        java.util.ArrayList arrayList7 = this.f152831h.f152821c;
        if (arrayList7 == null || arrayList7.size() == 0) {
            android.view.View view7 = this.f152836p;
            java.util.ArrayList arrayList8 = new java.util.ArrayList();
            arrayList8.add(8);
            java.util.Collections.reverse(arrayList8);
            yj0.a.d(view7, arrayList8.toArray(), "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshProductUI", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view7.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
            yj0.a.f(view7, "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshProductUI", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view8 = this.f152837q;
            java.util.ArrayList arrayList9 = new java.util.ArrayList();
            arrayList9.add(8);
            java.util.Collections.reverse(arrayList9);
            yj0.a.d(view8, arrayList9.toArray(), "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshProductUI", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view8.setVisibility(((java.lang.Integer) arrayList9.get(0)).intValue());
            yj0.a.f(view8, "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshProductUI", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view9 = this.f152838r;
            java.util.ArrayList arrayList10 = new java.util.ArrayList();
            arrayList10.add(8);
            java.util.Collections.reverse(arrayList10);
            yj0.a.d(view9, arrayList10.toArray(), "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshProductUI", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view9.setVisibility(((java.lang.Integer) arrayList10.get(0)).intValue());
            yj0.a.f(view9, "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshProductUI", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else if (arrayList7.size() == 1) {
            android.view.View view10 = this.f152838r;
            java.util.ArrayList arrayList11 = new java.util.ArrayList();
            arrayList11.add(8);
            java.util.Collections.reverse(arrayList11);
            yj0.a.d(view10, arrayList11.toArray(), "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshProductUI", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view10.setVisibility(((java.lang.Integer) arrayList11.get(0)).intValue());
            yj0.a.f(view10, "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshProductUI", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.tencent.mm.plugin.order.model.ProductSectionItem productSectionItem = (com.tencent.mm.plugin.order.model.ProductSectionItem) arrayList7.get(0);
            if (android.text.TextUtils.isEmpty(productSectionItem.f152809d)) {
                android.view.View view11 = this.f152837q;
                java.util.ArrayList arrayList12 = new java.util.ArrayList();
                arrayList12.add(8);
                java.util.Collections.reverse(arrayList12);
                yj0.a.d(view11, arrayList12.toArray(), "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshProductUI", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view11.setVisibility(((java.lang.Integer) arrayList12.get(0)).intValue());
                yj0.a.f(view11, "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshProductUI", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view12 = this.f152836p;
                java.util.ArrayList arrayList13 = new java.util.ArrayList();
                arrayList13.add(0);
                java.util.Collections.reverse(arrayList13);
                yj0.a.d(view12, arrayList13.toArray(), "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshProductUI", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view12.setVisibility(((java.lang.Integer) arrayList13.get(0)).intValue());
                yj0.a.f(view12, "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshProductUI", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                ((android.widget.TextView) this.f152836p.findViewById(com.tencent.mm.R.id.hj6)).setText(productSectionItem.f152810e);
                if (android.text.TextUtils.isEmpty(productSectionItem.f152814i)) {
                    android.graphics.Rect rect = new android.graphics.Rect();
                    rect.set(this.f152836p.findViewById(com.tencent.mm.R.id.f485392hj5).getPaddingLeft(), this.f152836p.findViewById(com.tencent.mm.R.id.f485392hj5).getPaddingTop(), this.f152836p.findViewById(com.tencent.mm.R.id.f485392hj5).getPaddingRight(), this.f152836p.findViewById(com.tencent.mm.R.id.f485392hj5).getPaddingBottom());
                    this.f152836p.findViewById(com.tencent.mm.R.id.f485392hj5).setBackgroundResource(com.tencent.mm.R.drawable.bfj);
                    this.f152836p.findViewById(com.tencent.mm.R.id.f485392hj5).setPadding(rect.left, rect.top, rect.right, rect.bottom);
                } else {
                    ((android.widget.TextView) this.f152836p.findViewById(com.tencent.mm.R.id.hj6)).setTextColor(getResources().getColor(com.tencent.mm.R.color.f479380xw));
                }
            } else {
                android.view.View view13 = this.f152836p;
                java.util.ArrayList arrayList14 = new java.util.ArrayList();
                arrayList14.add(8);
                java.util.Collections.reverse(arrayList14);
                yj0.a.d(view13, arrayList14.toArray(), "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshProductUI", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view13.setVisibility(((java.lang.Integer) arrayList14.get(0)).intValue());
                yj0.a.f(view13, "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshProductUI", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view14 = this.f152837q;
                java.util.ArrayList arrayList15 = new java.util.ArrayList();
                arrayList15.add(0);
                java.util.Collections.reverse(arrayList15);
                yj0.a.d(view14, arrayList15.toArray(), "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshProductUI", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view14.setVisibility(((java.lang.Integer) arrayList15.get(0)).intValue());
                yj0.a.f(view14, "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshProductUI", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                ((android.widget.TextView) this.f152837q.findViewById(com.tencent.mm.R.id.hj6)).setText(productSectionItem.f152810e);
                ((android.widget.TextView) this.f152837q.findViewById(com.tencent.mm.R.id.hj8)).setText(productSectionItem.f152813h);
                ((android.widget.TextView) this.f152837q.findViewById(com.tencent.mm.R.id.f485391hj4)).setText("+" + productSectionItem.f152812g);
                ((android.widget.TextView) this.f152837q.findViewById(com.tencent.mm.R.id.f485390hj3)).setText(com.tencent.mm.plugin.order.model.ProductSectionItem.Skus.a(productSectionItem.f152811f));
                if (!android.text.TextUtils.isEmpty(productSectionItem.f152809d)) {
                    X6((android.widget.ImageView) this.f152837q.findViewById(com.tencent.mm.R.id.hj7), productSectionItem.f152809d);
                }
            }
        } else {
            android.view.View view15 = this.f152836p;
            java.util.ArrayList arrayList16 = new java.util.ArrayList();
            arrayList16.add(8);
            java.util.Collections.reverse(arrayList16);
            yj0.a.d(view15, arrayList16.toArray(), "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshProductUI", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view15.setVisibility(((java.lang.Integer) arrayList16.get(0)).intValue());
            yj0.a.f(view15, "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshProductUI", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view16 = this.f152837q;
            java.util.ArrayList arrayList17 = new java.util.ArrayList();
            arrayList17.add(8);
            java.util.Collections.reverse(arrayList17);
            yj0.a.d(view16, arrayList17.toArray(), "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshProductUI", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view16.setVisibility(((java.lang.Integer) arrayList17.get(0)).intValue());
            yj0.a.f(view16, "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshProductUI", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view17 = this.f152838r;
            java.util.ArrayList arrayList18 = new java.util.ArrayList();
            arrayList18.add(0);
            java.util.Collections.reverse(arrayList18);
            yj0.a.d(view17, arrayList18.toArray(), "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshProductUI", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view17.setVisibility(((java.lang.Integer) arrayList18.get(0)).intValue());
            yj0.a.f(view17, "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshProductUI", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (arrayList7.size() == 2) {
                Z6(this.f152838r.findViewById(com.tencent.mm.R.id.kla), (com.tencent.mm.plugin.order.model.ProductSectionItem) arrayList7.get(0));
                Z6(this.f152838r.findViewById(com.tencent.mm.R.id.klb), (com.tencent.mm.plugin.order.model.ProductSectionItem) arrayList7.get(1));
                android.view.View findViewById = this.f152838r.findViewById(com.tencent.mm.R.id.klc);
                java.util.ArrayList arrayList19 = new java.util.ArrayList();
                arrayList19.add(8);
                java.util.Collections.reverse(arrayList19);
                yj0.a.d(findViewById, arrayList19.toArray(), "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshProductUI", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList19.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshProductUI", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View findViewById2 = this.f152838r.findViewById(com.tencent.mm.R.id.kld);
                java.util.ArrayList arrayList20 = new java.util.ArrayList();
                arrayList20.add(8);
                java.util.Collections.reverse(arrayList20);
                yj0.a.d(findViewById2, arrayList20.toArray(), "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshProductUI", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((java.lang.Integer) arrayList20.get(0)).intValue());
                yj0.a.f(findViewById2, "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshProductUI", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else if (arrayList7.size() == 3) {
                Z6(this.f152838r.findViewById(com.tencent.mm.R.id.kla), (com.tencent.mm.plugin.order.model.ProductSectionItem) arrayList7.get(0));
                Z6(this.f152838r.findViewById(com.tencent.mm.R.id.klb), (com.tencent.mm.plugin.order.model.ProductSectionItem) arrayList7.get(1));
                Z6(this.f152838r.findViewById(com.tencent.mm.R.id.klc), (com.tencent.mm.plugin.order.model.ProductSectionItem) arrayList7.get(2));
                android.view.View findViewById3 = this.f152838r.findViewById(com.tencent.mm.R.id.kld);
                java.util.ArrayList arrayList21 = new java.util.ArrayList();
                arrayList21.add(8);
                java.util.Collections.reverse(arrayList21);
                yj0.a.d(findViewById3, arrayList21.toArray(), "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshProductUI", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById3.setVisibility(((java.lang.Integer) arrayList21.get(0)).intValue());
                yj0.a.f(findViewById3, "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshProductUI", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else if (arrayList7.size() >= 4) {
                Z6(this.f152838r.findViewById(com.tencent.mm.R.id.kla), (com.tencent.mm.plugin.order.model.ProductSectionItem) arrayList7.get(0));
                Z6(this.f152838r.findViewById(com.tencent.mm.R.id.klb), (com.tencent.mm.plugin.order.model.ProductSectionItem) arrayList7.get(1));
                Z6(this.f152838r.findViewById(com.tencent.mm.R.id.klc), (com.tencent.mm.plugin.order.model.ProductSectionItem) arrayList7.get(2));
                Z6(this.f152838r.findViewById(com.tencent.mm.R.id.kld), (com.tencent.mm.plugin.order.model.ProductSectionItem) arrayList7.get(3));
            }
        }
        com.tencent.mm.plugin.order.model.MallTransactionObject mallTransactionObject = this.f152831h.f152819a;
        if (mallTransactionObject != null) {
            android.view.View view18 = this.f152834n;
            java.util.ArrayList arrayList22 = new java.util.ArrayList();
            arrayList22.add(0);
            java.util.Collections.reverse(arrayList22);
            yj0.a.d(view18, arrayList22.toArray(), "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshTransactionUI", "(Lcom/tencent/mm/plugin/order/model/MallTransactionObject;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view18.setVisibility(((java.lang.Integer) arrayList22.get(0)).intValue());
            yj0.a.f(view18, "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshTransactionUI", "(Lcom/tencent/mm/plugin/order/model/MallTransactionObject;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ((android.widget.TextView) findViewById(com.tencent.mm.R.id.klq)).setText(com.tencent.mm.wallet_core.ui.r1.n(mallTransactionObject.f152794q, mallTransactionObject.B));
            com.tencent.mm.plugin.order.model.a aVar = this.f152831h;
            if (aVar != null && (list = aVar.f152822d) != null && ((java.util.ArrayList) list).size() >= 1) {
                Y6(this.f152835o, (dp3.b) ((java.util.ArrayList) this.f152831h.f152822d).get(0));
            }
        } else {
            android.view.View view19 = this.f152834n;
            java.util.ArrayList arrayList23 = new java.util.ArrayList();
            arrayList23.add(8);
            java.util.Collections.reverse(arrayList23);
            yj0.a.d(view19, arrayList23.toArray(), "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshTransactionUI", "(Lcom/tencent/mm/plugin/order/model/MallTransactionObject;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view19.setVisibility(((java.lang.Integer) arrayList23.get(0)).intValue());
            yj0.a.f(view19, "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshTransactionUI", "(Lcom/tencent/mm/plugin/order/model/MallTransactionObject;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        java.util.List list2 = this.f152831h.f152822d;
        if (list2 != null) {
            ((java.util.ArrayList) this.f152828e).addAll(list2);
            this.f152830g.notifyDataSetChanged();
        }
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.j_9);
        java.util.ArrayList arrayList24 = new java.util.ArrayList();
        arrayList24.add(0);
        java.util.Collections.reverse(arrayList24);
        yj0.a.d(findViewById4, arrayList24.toArray(), "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById4.setVisibility(((java.lang.Integer) arrayList24.get(0)).intValue());
        yj0.a.f(findViewById4, "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.tencent.mm.plugin.order.model.a aVar2 = this.f152831h;
        if (aVar2 != null && android.text.TextUtils.isEmpty(aVar2.f152824f) && android.text.TextUtils.isEmpty(this.f152831h.f152825g)) {
            android.view.View findViewById5 = findViewById(com.tencent.mm.R.id.j_9);
            java.util.ArrayList arrayList25 = new java.util.ArrayList();
            arrayList25.add(8);
            java.util.Collections.reverse(arrayList25);
            yj0.a.d(findViewById5, arrayList25.toArray(), "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById5.setVisibility(((java.lang.Integer) arrayList25.get(0)).intValue());
            yj0.a.f(findViewById5, "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            com.tencent.mm.plugin.order.model.a aVar3 = this.f152831h;
            if (aVar3 == null || android.text.TextUtils.isEmpty(aVar3.f152824f) || !android.text.TextUtils.isEmpty(this.f152831h.f152825g)) {
                com.tencent.mm.plugin.order.model.a aVar4 = this.f152831h;
                if (aVar4 != null && android.text.TextUtils.isEmpty(aVar4.f152824f) && !android.text.TextUtils.isEmpty(this.f152831h.f152825g)) {
                    android.view.View findViewById6 = findViewById(com.tencent.mm.R.id.h1b);
                    java.util.ArrayList arrayList26 = new java.util.ArrayList();
                    arrayList26.add(8);
                    java.util.Collections.reverse(arrayList26);
                    yj0.a.d(findViewById6, arrayList26.toArray(), "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById6.setVisibility(((java.lang.Integer) arrayList26.get(0)).intValue());
                    yj0.a.f(findViewById6, "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    android.view.View findViewById7 = findViewById(com.tencent.mm.R.id.pr6);
                    java.util.ArrayList arrayList27 = new java.util.ArrayList();
                    arrayList27.add(8);
                    java.util.Collections.reverse(arrayList27);
                    yj0.a.d(findViewById7, arrayList27.toArray(), "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById7.setVisibility(((java.lang.Integer) arrayList27.get(0)).intValue());
                    yj0.a.f(findViewById7, "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.pr7);
                    textView.setVisibility(0);
                    textView.setGravity(3);
                }
            } else {
                android.view.View findViewById8 = findViewById(com.tencent.mm.R.id.pr7);
                java.util.ArrayList arrayList28 = new java.util.ArrayList();
                arrayList28.add(8);
                java.util.Collections.reverse(arrayList28);
                yj0.a.d(findViewById8, arrayList28.toArray(), "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById8.setVisibility(((java.lang.Integer) arrayList28.get(0)).intValue());
                yj0.a.f(findViewById8, "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View findViewById9 = findViewById(com.tencent.mm.R.id.pr6);
                java.util.ArrayList arrayList29 = new java.util.ArrayList();
                arrayList29.add(8);
                java.util.Collections.reverse(arrayList29);
                yj0.a.d(findViewById9, arrayList29.toArray(), "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById9.setVisibility(((java.lang.Integer) arrayList29.get(0)).intValue());
                yj0.a.f(findViewById9, "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.h1b);
                textView2.setVisibility(0);
                textView2.setGravity(3);
            }
        }
        com.tencent.mm.plugin.order.model.a aVar5 = this.f152831h;
        if (aVar5 == null || android.text.TextUtils.isEmpty(aVar5.f152823e)) {
            return;
        }
        addIconOptionMenu(0, com.tencent.mm.R.raw.icons_outlined_more, new fp3.d(this));
    }

    public final void X6(android.widget.ImageView imageView, java.lang.String str) {
        if (imageView == null || android.text.TextUtils.isEmpty(str) || !com.tencent.mm.wallet_core.ui.r1.Q(str)) {
            return;
        }
        y60.f fVar = (y60.f) i95.n0.c(y60.f.class);
        hp3.c cVar = new hp3.c(str);
        ((x60.e) fVar).getClass();
        imageView.setImageBitmap(x51.w0.d(cVar));
        this.f152839s.put(str, imageView);
    }

    public final void Y6(android.view.View view, dp3.b bVar) {
        if (bVar == null) {
            return;
        }
        android.graphics.Rect rect = new android.graphics.Rect();
        rect.left = view.getPaddingLeft();
        rect.right = view.getPaddingRight();
        rect.top = view.getPaddingTop();
        rect.bottom = view.getPaddingBottom();
        android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) view.getLayoutParams();
        if (bVar.f242200d) {
            view.setBackgroundResource(com.tencent.mm.R.drawable.f481981ap3);
        } else {
            view.setBackgroundResource(com.tencent.mm.R.drawable.bfj);
        }
        view.setLayoutParams(layoutParams);
        view.setPadding(rect.left, rect.top, rect.right, rect.bottom);
    }

    public final void Z6(android.view.View view, com.tencent.mm.plugin.order.model.ProductSectionItem productSectionItem) {
        if (view == null || productSectionItem == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "setProductIconText", "(Landroid/view/View;Lcom/tencent/mm/plugin/order/model/ProductSectionItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "setProductIconText", "(Landroid/view/View;Lcom/tencent/mm/plugin/order/model/ProductSectionItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.hj6);
        if (textView != null) {
            textView.setText(productSectionItem.f152810e);
        }
        if (android.text.TextUtils.isEmpty(productSectionItem.f152809d)) {
            return;
        }
        X6((android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.hj7), productSectionItem.f152809d);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public void cleanUiData(int i17) {
        finish();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        V6();
        super.finish();
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.bwg;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        if (this.f152840t) {
            dp3.r a17 = bp3.f.wi().Ai().a(this.f152841u);
            int i17 = -1;
            if (a17 != null && !android.text.TextUtils.isEmpty(a17.f242250b) && hp3.d.a(a17.f242250b)) {
                i17 = com.tencent.mm.sdk.platformtools.t8.P(a17.f242250b, 0);
            }
            if (i17 == 2) {
                setMMTitle(com.tencent.mm.R.string.gre);
            } else if (i17 == 1) {
                setMMTitle(com.tencent.mm.R.string.grf);
            }
        } else {
            setMMTitle(com.tencent.mm.R.string.grg);
        }
        this.f152832i = findViewById(com.tencent.mm.R.id.kkv);
        this.f152833m = findViewById(com.tencent.mm.R.id.kku);
        this.f152837q = findViewById(com.tencent.mm.R.id.kl_);
        this.f152838r = findViewById(com.tencent.mm.R.id.kl8);
        this.f152836p = findViewById(com.tencent.mm.R.id.kl9);
        this.f152834n = findViewById(com.tencent.mm.R.id.klp);
        this.f152835o = findViewById(com.tencent.mm.R.id.klo);
        android.view.View view = this.f152832i;
        android.view.View.OnClickListener onClickListener = this.f152846z;
        view.setOnClickListener(onClickListener);
        this.f152838r.setOnClickListener(onClickListener);
        this.f152837q.setOnClickListener(onClickListener);
        this.f152836p.setOnClickListener(onClickListener);
        this.f152834n.setOnClickListener(onClickListener);
        findViewById(com.tencent.mm.R.id.kkq).setOnClickListener(onClickListener);
        findViewById(com.tencent.mm.R.id.h1b).setOnClickListener(onClickListener);
        findViewById(com.tencent.mm.R.id.pr7).setOnClickListener(onClickListener);
        this.f152829f = (android.widget.ListView) findViewById(com.tencent.mm.R.id.kkp);
        fp3.i iVar = new fp3.i(this, null);
        this.f152830g = iVar;
        this.f152829f.setAdapter((android.widget.ListAdapter) iVar);
        this.f152830g.notifyDataSetChanged();
        this.f152829f.setOnItemClickListener(new fp3.f(this));
        W6();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        dp3.r a17;
        super.onCreate(bundle);
        com.tencent.mm.wallet_core.h g17 = com.tencent.mm.wallet_core.a.g(this);
        if (g17 != null && (g17 instanceof bp3.e)) {
            java.lang.String string = getInput().getString("key_trans_id");
            this.f152841u = string;
            com.tencent.mm.plugin.order.model.a aVar = null;
            if (string != null && !bp3.f.wi().Ai().c(string)) {
                this.f152840t = false;
                doSceneProgress(new dp3.n(string, null, -1));
            } else if (bp3.f.wi().Ai().c(string)) {
                this.f152840t = true;
                dp3.h Ai = bp3.f.wi().Ai();
                Ai.getClass();
                if (!android.text.TextUtils.isEmpty(string) && (a17 = Ai.a(string)) != null) {
                    aVar = new com.tencent.mm.plugin.order.model.a();
                    dp3.c cVar = new dp3.c();
                    cVar.f242202a = a17.f242253e;
                    if (android.text.TextUtils.isEmpty(a17.f242251c) || !hp3.d.a(a17.f242251c)) {
                        cVar.f242203b = (int) (java.lang.System.currentTimeMillis() / 1000);
                    } else {
                        cVar.f242203b = com.tencent.mm.sdk.platformtools.t8.P(a17.f242251c, 0);
                    }
                    cVar.f242204c = a17.f242252d;
                    cVar.f242205d = a17.f242255g;
                    cVar.f242206e = a17.f242254f;
                    aVar.f152820b = cVar;
                    java.util.List list = a17.f242258j;
                    if (list != null) {
                        java.util.ArrayList arrayList = (java.util.ArrayList) list;
                        if (arrayList.size() > 0) {
                            aVar.f152822d = new java.util.ArrayList();
                            for (int i17 = 0; i17 < arrayList.size(); i17++) {
                                dp3.p pVar = (dp3.p) arrayList.get(i17);
                                dp3.b bVar = new dp3.b();
                                bVar.f242197a = pVar.f242244a;
                                bVar.f242198b = "";
                                bVar.f242199c = pVar.f242245b;
                                bVar.f242200d = false;
                                ((java.util.ArrayList) aVar.f152822d).add(bVar);
                            }
                        }
                    }
                    java.util.List list2 = a17.f242259k;
                    if (list2 != null) {
                        java.util.ArrayList arrayList2 = (java.util.ArrayList) list2;
                        if (arrayList2.size() > 0) {
                            if (aVar.f152822d == null) {
                                aVar.f152822d = new java.util.ArrayList();
                            }
                            for (int i18 = 0; i18 < arrayList2.size(); i18++) {
                                dp3.q qVar = (dp3.q) arrayList2.get(i18);
                                dp3.b bVar2 = new dp3.b();
                                bVar2.f242197a = qVar.f242246a;
                                bVar2.f242198b = qVar.f242247b;
                                bVar2.f242199c = qVar.f242248c;
                                bVar2.f242200d = false;
                                if (i18 == 0) {
                                    bVar2.f242200d = true;
                                }
                                ((java.util.ArrayList) aVar.f152822d).add(bVar2);
                            }
                        }
                    }
                    aVar.f152824f = a17.f242257i;
                    aVar.f152825g = a17.f242256h;
                    if (android.text.TextUtils.isEmpty(a17.f242251c) || !hp3.d.a(a17.f242251c)) {
                        aVar.f152826h = (int) (java.lang.System.currentTimeMillis() / 1000);
                    } else {
                        aVar.f152826h = com.tencent.mm.sdk.platformtools.t8.P(a17.f242251c, 0);
                    }
                }
                this.f152831h = aVar;
                if (aVar == null) {
                    db5.e1.m(getContext(), com.tencent.mm.R.string.ks_, 0, new fp3.h(this));
                }
            } else {
                com.tencent.mars.xlog.Log.w("MicroMsg.MallOrderDetailInfoUI", "mOrders info is Illegal!");
                db5.e1.m(getContext(), com.tencent.mm.R.string.ks_, 0, new fp3.h(this));
            }
        }
        initView();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        V6();
        super.onDestroy();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4) {
            return super.onKeyUp(i17, keyEvent);
        }
        if (!(com.tencent.mm.wallet_core.a.g(this) instanceof bp3.e)) {
            return true;
        }
        com.tencent.mm.wallet_core.a.a(this);
        return true;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (i17 != 0 || i18 != 0) {
            return false;
        }
        if (!(m1Var instanceof dp3.n)) {
            return true;
        }
        com.tencent.mm.plugin.order.model.a aVar = ((dp3.n) m1Var).f242223d;
        java.util.Objects.toString(aVar);
        if (aVar == null) {
            return true;
        }
        this.f152831h = aVar;
        W6();
        return true;
    }
}
