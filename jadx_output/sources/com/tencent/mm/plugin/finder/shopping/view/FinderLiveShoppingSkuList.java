package com.tencent.mm.plugin.finder.shopping.view;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b!\u0010\"B#\b\u0016\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b!\u0010%R*\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR0\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0019\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001c\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018¨\u0006&"}, d2 = {"Lcom/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingSkuList;", "Landroid/widget/FrameLayout;", "Lkotlin/Function0;", "Ljz5/f0;", "d", "Lyz5/a;", "getOnLoadMoreCallback", "()Lyz5/a;", "setOnLoadMoreCallback", "(Lyz5/a;)V", "onLoadMoreCallback", "Lkotlin/Function1;", "Lr45/ce0;", "m", "Lyz5/l;", "getOnSkuItemClick", "()Lyz5/l;", "setOnSkuItemClick", "(Lyz5/l;)V", "onSkuItemClick", "Landroid/view/View;", "n", "Ljz5/g;", "getLoadMoreWithImg", "()Landroid/view/View;", "loadMoreWithImg", "o", "getLoadMoreWithoutImg", "loadMoreWithoutImg", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class FinderLiveShoppingSkuList extends android.widget.FrameLayout {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f126333p = 0;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public yz5.a onLoadMoreCallback;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f126335e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.ViewGroup f126336f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.shopping.view.FinderLiveOneWayHorizontalBounceView f126337g;

    /* renamed from: h, reason: collision with root package name */
    public final android.os.Vibrator f126338h;

    /* renamed from: i, reason: collision with root package name */
    public cm2.m0 f126339i;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public yz5.l onSkuItemClick;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    public final jz5.g loadMoreWithImg;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    public final jz5.g loadMoreWithoutImg;

    static {
        i65.a.a(com.tencent.mm.sdk.platformtools.x2.f193071a, 1.5f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveShoppingSkuList(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.dc9, (android.view.ViewGroup) null, false);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        this.f126335e = inflate;
        java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("vibrator");
        this.f126338h = systemService instanceof android.os.Vibrator ? (android.os.Vibrator) systemService : null;
        this.loadMoreWithImg = jz5.h.b(new xt2.x5(this));
        this.loadMoreWithoutImg = jz5.h.b(new xt2.z5(this));
        addView(inflate);
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.pu8);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f126337g = (com.tencent.mm.plugin.finder.shopping.view.FinderLiveOneWayHorizontalBounceView) findViewById;
        android.view.View findViewById2 = inflate.findViewById(com.tencent.mm.R.id.q19);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f126336f = (android.view.ViewGroup) findViewById2;
    }

    public static final void a(com.tencent.mm.plugin.finder.shopping.view.FinderLiveShoppingSkuList finderLiveShoppingSkuList) {
        finderLiveShoppingSkuList.getClass();
        i95.m c17 = i95.n0.c(ml2.r0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ml2.r0 r0Var = (ml2.r0) c17;
        ml2.f4 f4Var = ml2.f4.K;
        cm2.m0 m0Var = finderLiveShoppingSkuList.f126339i;
        if (m0Var == null) {
            kotlin.jvm.internal.o.o("item");
            throw null;
        }
        java.lang.String valueOf = java.lang.String.valueOf(m0Var.f43369w);
        st2.g3 g3Var = st2.g3.f412326a;
        cm2.m0 m0Var2 = finderLiveShoppingSkuList.f126339i;
        if (m0Var2 != null) {
            ml2.r0.Dj(r0Var, f4Var, null, valueOf, null, null, null, 0, 0L, g3Var.k(m0Var2.f43368v), null, null, null, false, null, 16120, null);
        } else {
            kotlin.jvm.internal.o.o("item");
            throw null;
        }
    }

    public static final void b(com.tencent.mm.plugin.finder.shopping.view.FinderLiveShoppingSkuList finderLiveShoppingSkuList) {
        finderLiveShoppingSkuList.getClass();
        i95.m c17 = i95.n0.c(ml2.r0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ml2.r0 r0Var = (ml2.r0) c17;
        ml2.f4 f4Var = ml2.f4.f327430J;
        cm2.m0 m0Var = finderLiveShoppingSkuList.f126339i;
        if (m0Var == null) {
            kotlin.jvm.internal.o.o("item");
            throw null;
        }
        java.lang.String valueOf = java.lang.String.valueOf(m0Var.f43369w);
        st2.g3 g3Var = st2.g3.f412326a;
        cm2.m0 m0Var2 = finderLiveShoppingSkuList.f126339i;
        if (m0Var2 != null) {
            ml2.r0.Dj(r0Var, f4Var, null, valueOf, null, null, null, 0, 0L, g3Var.k(m0Var2.f43368v), null, null, null, false, null, 16120, null);
        } else {
            kotlin.jvm.internal.o.o("item");
            throw null;
        }
    }

    private final android.view.View getLoadMoreWithImg() {
        java.lang.Object value = this.loadMoreWithImg.getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.view.View) value;
    }

    private final android.view.View getLoadMoreWithoutImg() {
        java.lang.Object value = this.loadMoreWithoutImg.getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.view.View) value;
    }

    public final void c(cm2.m0 item, gk2.e buContext, com.tencent.mm.plugin.finder.live.plugin.l lVar) {
        android.view.ViewGroup viewGroup;
        int i17;
        int i18;
        int i19;
        int i27;
        kotlin.jvm.internal.o.g(item, "item");
        kotlin.jvm.internal.o.g(buContext, "buContext");
        this.f126339i = item;
        r45.t66 t66Var = (r45.t66) item.f43368v.getCustom(41);
        if (t66Var != null) {
            int i28 = 0;
            java.util.LinkedList list = t66Var.getList(0);
            int i29 = 1;
            if (!(list == null || list.isEmpty())) {
                com.tencent.mm.ui.ah a17 = com.tencent.mm.ui.bh.a(com.tencent.mm.sdk.platformtools.x2.f193071a);
                java.lang.System.nanoTime();
                boolean z17 = com.tencent.mm.ui.bk.y() || com.tencent.mm.ui.bk.Q() || com.tencent.mm.ui.bk.A();
                java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                int i37 = a17.f197135a;
                if (!z17 && i37 > (i27 = a17.f197136b)) {
                    i37 = i27;
                }
                int i38 = i37 * 3;
                java.lang.String string = ((r45.s66) t66Var.getList(0).getFirst()).getString(1);
                boolean z18 = !(string == null || string.length() == 0);
                setVisibility(0);
                android.view.ViewGroup viewGroup2 = this.f126336f;
                viewGroup2.removeAllViews();
                int size = t66Var.getList(0).size();
                int i39 = 0;
                while (true) {
                    if (i39 >= size) {
                        break;
                    }
                    r45.s66 s66Var = (r45.s66) t66Var.getList(i28).get(i39);
                    viewGroup2.measure(i28, i28);
                    if (viewGroup2.getMeasuredWidth() >= i38) {
                        i28 = i29;
                        break;
                    }
                    kotlin.jvm.internal.o.d(s66Var);
                    android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.dc8, (android.view.ViewGroup) null);
                    android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.q1b);
                    d92.f fVar = d92.f.f227470a;
                    android.content.Context context = textView.getContext();
                    kotlin.jvm.internal.o.f(context, "getContext(...)");
                    d92.f.a(fVar, context, textView, 12.0f, 0.0f, 8, null);
                    android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.f486956n00);
                    android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.q1h);
                    java.lang.String string2 = s66Var.getString(i28);
                    if (string2 == null) {
                        string2 = "";
                    }
                    textView.setText(string2);
                    android.view.ViewGroup.MarginLayoutParams marginLayoutParams = new android.view.ViewGroup.MarginLayoutParams(-2, -2);
                    marginLayoutParams.setMarginEnd(i65.a.b(getContext(), 8));
                    inflate.setLayoutParams(marginLayoutParams);
                    java.lang.String string3 = s66Var.getString(i29);
                    if (((string3 == null || string3.length() == 0) ? i29 : 0) == 0) {
                        imageView.setVisibility(0);
                        mn2.d1 d1Var = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f353936a.e(zy2.b6.class).c(mn2.i4.class))).H).getValue());
                        vd2.i5 i5Var = (vd2.i5) i95.n0.c(vd2.i5.class);
                        java.lang.String string4 = s66Var.getString(i29);
                        ((wo0.b) d1Var.a(((c61.i8) i5Var).Ai(string4 == null ? "" : string4, com.tencent.mm.plugin.finder.storage.y90.f128356f))).c(imageView);
                        i17 = 2;
                        textView.setMaxLines(2);
                        textView.setMaxWidth(i65.a.a(getContext(), 64.0f));
                        i18 = 1;
                    } else {
                        i17 = 2;
                        imageView.setVisibility(8);
                        i18 = 1;
                        textView.setMaxLines(1);
                        textView.setMaxWidth(Integer.MAX_VALUE);
                    }
                    if (s66Var.getInteger(i17) == i18) {
                        java.lang.String string5 = s66Var.getString(i18);
                        if (string5 == null || string5.length() == 0) {
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                            arrayList.add(8);
                            java.util.Collections.reverse(arrayList);
                            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingSkuList", "getAndBindItemView", "(Lcom/tencent/mm/protocal/protobuf/SkuAttrInfo;I)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingSkuList", "getAndBindItemView", "(Lcom/tencent/mm/protocal/protobuf/SkuAttrInfo;I)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        } else {
                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                            arrayList2.add(0);
                            java.util.Collections.reverse(arrayList2);
                            yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingSkuList", "getAndBindItemView", "(Lcom/tencent/mm/protocal/protobuf/SkuAttrInfo;I)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingSkuList", "getAndBindItemView", "(Lcom/tencent/mm/protocal/protobuf/SkuAttrInfo;I)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                        textView.setTextColor(getContext().getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_3));
                        i19 = 0;
                    } else {
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                        arrayList3.add(8);
                        java.util.Collections.reverse(arrayList3);
                        yj0.a.d(findViewById, arrayList3.toArray(), "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingSkuList", "getAndBindItemView", "(Lcom/tencent/mm/protocal/protobuf/SkuAttrInfo;I)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        i19 = 0;
                        findViewById.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                        yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingSkuList", "getAndBindItemView", "(Lcom/tencent/mm/protocal/protobuf/SkuAttrInfo;I)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        textView.setTextColor(getContext().getColor(com.tencent.mm.R.color.f478511t));
                        inflate.setOnClickListener(new xt2.u5(s66Var, this, i39));
                    }
                    ym5.a1.h(inflate, new xt2.v5(this, i39));
                    viewGroup2.addView(inflate);
                    i39++;
                    i28 = i19;
                    i29 = 1;
                }
                int integer = t66Var.getInteger(1);
                com.tencent.mm.plugin.finder.shopping.view.FinderLiveOneWayHorizontalBounceView finderLiveOneWayHorizontalBounceView = this.f126337g;
                if (integer != 1 && i28 == 0) {
                    finderLiveOneWayHorizontalBounceView.setBounceBackListener(null);
                    return;
                }
                if (z18) {
                    android.view.ViewParent parent = getLoadMoreWithImg().getParent();
                    viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
                    if (viewGroup != null) {
                        viewGroup.removeView(getLoadMoreWithImg());
                    }
                    viewGroup2.addView(getLoadMoreWithImg(), new android.view.ViewGroup.LayoutParams(i65.a.a(getContext(), 50.0f), -2));
                    getLoadMoreWithImg().setOnClickListener(new xt2.s5(this));
                } else {
                    android.view.ViewParent parent2 = getLoadMoreWithoutImg().getParent();
                    viewGroup = parent2 instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent2 : null;
                    if (viewGroup != null) {
                        viewGroup.removeView(getLoadMoreWithoutImg());
                    }
                    viewGroup2.addView(getLoadMoreWithoutImg());
                    getLoadMoreWithoutImg().setOnClickListener(new xt2.t5(this));
                }
                finderLiveOneWayHorizontalBounceView.setBounceBackListener(new xt2.a6(this));
                return;
            }
        }
        com.tencent.mars.xlog.Log.e("FinderLiveShoppingSkuList", "empty sku list!");
    }

    public final yz5.a getOnLoadMoreCallback() {
        return this.onLoadMoreCallback;
    }

    public final yz5.l getOnSkuItemClick() {
        return this.onSkuItemClick;
    }

    public final void setOnLoadMoreCallback(yz5.a aVar) {
        this.onLoadMoreCallback = aVar;
    }

    public final void setOnSkuItemClick(yz5.l lVar) {
        this.onSkuItemClick = lVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveShoppingSkuList(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.dc9, (android.view.ViewGroup) null, false);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        this.f126335e = inflate;
        java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("vibrator");
        this.f126338h = systemService instanceof android.os.Vibrator ? (android.os.Vibrator) systemService : null;
        this.loadMoreWithImg = jz5.h.b(new xt2.x5(this));
        this.loadMoreWithoutImg = jz5.h.b(new xt2.z5(this));
        addView(inflate);
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.pu8);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f126337g = (com.tencent.mm.plugin.finder.shopping.view.FinderLiveOneWayHorizontalBounceView) findViewById;
        android.view.View findViewById2 = inflate.findViewById(com.tencent.mm.R.id.q19);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f126336f = (android.view.ViewGroup) findViewById2;
    }
}
