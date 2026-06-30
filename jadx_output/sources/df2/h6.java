package df2;

/* loaded from: classes3.dex */
public final class h6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.t6 f230291d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f230292e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f230293f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f230294g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f230295h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f230296i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f230297m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f230298n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f230299o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f230300p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h6(df2.t6 t6Var, java.lang.String str, java.lang.String str2, float f17, float f18, float f19, float f27, float f28, java.lang.String str3, java.lang.String str4, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f230291d = t6Var;
        this.f230292e = str;
        this.f230293f = str2;
        this.f230294g = f17;
        this.f230295h = f18;
        this.f230296i = f19;
        this.f230297m = f27;
        this.f230298n = f28;
        this.f230299o = str3;
        this.f230300p = str4;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.h6(this.f230291d, this.f230292e, this.f230293f, this.f230294g, this.f230295h, this.f230296i, this.f230297m, this.f230298n, this.f230299o, this.f230300p, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.h6) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        df2.t6 t6Var = this.f230291d;
        android.view.ViewGroup viewGroup = t6Var.f231415m;
        df2.e6 e6Var = null;
        android.content.Context context = viewGroup != null ? viewGroup.getContext() : null;
        boolean z17 = false;
        if (context != null) {
            java.lang.String str = this.f230292e;
            java.lang.String f76 = t6Var.f7(str);
            if (f76.length() == 0) {
                com.tencent.mars.xlog.Log.i("Finder.GestureEffectPagController", "#getStreamWidgetForSdkId sdkId not found in business:".concat(str));
            } else {
                java.util.Map map = t6Var.f231422t;
                df2.e6 e6Var2 = (df2.e6) ((java.util.LinkedHashMap) map).get(str);
                if (e6Var2 == null) {
                    android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(context);
                    android.view.ViewGroup viewGroup2 = t6Var.f231415m;
                    if (viewGroup2 != null) {
                        viewGroup2.addView(frameLayout);
                    }
                    android.view.ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
                    if (layoutParams != null && (layoutParams instanceof android.widget.FrameLayout.LayoutParams)) {
                        layoutParams.width = -1;
                        layoutParams.height = -1;
                        frameLayout.requestLayout();
                    }
                    android.widget.FrameLayout frameLayout2 = new android.widget.FrameLayout(context);
                    frameLayout.addView(frameLayout2);
                    android.view.ViewGroup.LayoutParams layoutParams2 = frameLayout2.getLayoutParams();
                    if (layoutParams2 != null && (layoutParams2 instanceof android.widget.FrameLayout.LayoutParams)) {
                        layoutParams2.width = -1;
                        layoutParams2.height = -1;
                        ((android.widget.FrameLayout.LayoutParams) layoutParams2).gravity = 17;
                        frameLayout2.requestLayout();
                    }
                    com.tencent.mm.view.MMPAGView mMPAGView = new com.tencent.mm.view.MMPAGView(context);
                    ym5.l2 l2Var = ym5.l2.f463424a;
                    ym5.j2[] j2VarArr = ym5.j2.f463392d;
                    mMPAGView.o(ae2.in.f3688a.a(ym5.f6.E1));
                    frameLayout2.addView(mMPAGView, new android.widget.FrameLayout.LayoutParams(-1, -1));
                    com.tencent.mm.plugin.finder.view.StrokeTextView strokeTextView = new com.tencent.mm.plugin.finder.view.StrokeTextView(context);
                    strokeTextView.setMaxWidth(com.tencent.mm.ui.zk.a(context, 280));
                    strokeTextView.setMaxLines(1);
                    strokeTextView.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.f479107q6));
                    strokeTextView.setVisibility(8);
                    strokeTextView.setStrokeColor(android.graphics.Color.parseColor("#FF99B4"));
                    strokeTextView.setStrokeWidth(4.0f);
                    android.widget.FrameLayout.LayoutParams layoutParams3 = new android.widget.FrameLayout.LayoutParams(-2, -2);
                    layoutParams3.gravity = 17;
                    frameLayout2.addView(strokeTextView, layoutParams3);
                    df2.e6 e6Var3 = new df2.e6(frameLayout, frameLayout2, mMPAGView, strokeTextView, null, null);
                    map.put(str, e6Var3);
                    com.tencent.mars.xlog.Log.i("Finder.GestureEffectPagController", "#getStreamWidgetForSdkId now widgetBucket.count=" + map.size());
                    e6Var = e6Var3;
                } else {
                    e6Var = e6Var2;
                }
                e6Var.f230038e = (android.graphics.Rect) ((java.util.LinkedHashMap) t6Var.f231423u).get(f76);
            }
        }
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (e6Var == null) {
            com.tencent.mars.xlog.Log.i("Finder.GestureEffectPagController", "#executeAnimationCommand streamWidget is null");
            return f0Var;
        }
        kotlinx.coroutines.r2 r2Var = e6Var.f230039f;
        if (r2Var != null && r2Var.a()) {
            z17 = true;
        }
        if (!z17 && !e6Var.f230036c.f()) {
            df2.t6 t6Var2 = this.f230291d;
            e6Var.f230039f = com.tencent.mm.plugin.finder.live.util.y.d(t6Var2, null, null, new df2.g6(this.f230293f, t6Var2, this.f230294g, this.f230295h, this.f230296i, this.f230297m, this.f230298n, this.f230299o, e6Var, this.f230300p, null), 3, null);
        }
        return f0Var;
    }
}
