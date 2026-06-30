package rh4;

/* loaded from: classes8.dex */
public class m extends rh4.o {

    /* renamed from: w, reason: collision with root package name */
    public final android.widget.ImageView f395764w;

    /* renamed from: x, reason: collision with root package name */
    public android.animation.ObjectAnimator f395765x;

    /* renamed from: y, reason: collision with root package name */
    public int f395766y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(android.content.Context context, lh4.b callback, int i17) {
        super(context, callback, i17, null, 0);
        android.view.ViewGroup.LayoutParams layoutParams;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(callback, "callback");
        getRecyclerView().setId(com.tencent.mm.R.id.r8w);
        getMoreView().setAccessibilityTraversalBefore(getRecyclerView().getId());
        ((android.widget.TextView) getRoot().findViewById(com.tencent.mm.R.id.jrt)).setText(com.tencent.mm.R.string.f490310rf);
        android.widget.RelativeLayout moreView = getMoreView();
        if (moreView != null && (layoutParams = moreView.getLayoutParams()) != null) {
            layoutParams.width = i65.a.f(context, com.tencent.mm.R.dimen.f479675cc);
            getMoreView().setLayoutParams(layoutParams);
        }
        this.f395764w = (android.widget.ImageView) getRoot().findViewById(com.tencent.mm.R.id.f485683im4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0085, code lost:
    
        if ((r2.length() == 0) != false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.String getGetCommonUsedWording() {
        /*
            r7 = this;
            java.lang.String r0 = com.tencent.mm.sdk.platformtools.m2.d()
            java.lang.Class<ft.a> r1 = ft.a.class
            i95.m r1 = i95.n0.c(r1)
            ft.a r1 = (ft.a) r1
            com.tencent.mm.feature.appbrand.support.a r1 = (com.tencent.mm.feature.appbrand.support.a) r1
            r1.getClass()
            com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig r1 = com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig.b()
            java.lang.String r1 = r1.f77231y1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "wxaCommUseSetting: "
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r3 = "  curLang:"
            r2.append(r3)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "MicroMsg.TaskBarSectionCommonUsedWeAppView"
            com.tencent.mars.xlog.Log.i(r3, r2)
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L3c
            java.lang.String r0 = ""
            return r0
        L3c:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Exception -> L42
            r2.<init>(r1)     // Catch: java.lang.Exception -> L42
            goto L5a
        L42:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "wxaCommUseSettingJson#get, fail since "
            r2.<init>(r4)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.tencent.mars.xlog.Log.e(r3, r1)
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
        L5a:
            java.lang.String r1 = "CommUseWording"
            org.json.JSONObject r1 = r2.optJSONObject(r1)
            if (r1 == 0) goto L87
            java.lang.String r2 = r1.optString(r0)
            if (r2 == 0) goto L87
            int r4 = r2.length()
            r5 = 1
            r6 = 0
            if (r4 != 0) goto L72
            r4 = r5
            goto L73
        L72:
            r4 = r6
        L73:
            if (r4 == 0) goto L7b
            java.lang.String r2 = "en"
            java.lang.String r2 = r1.optString(r2)
        L7b:
            if (r2 == 0) goto L87
            int r1 = r2.length()
            if (r1 != 0) goto L84
            goto L85
        L84:
            r5 = r6
        L85:
            if (r5 == 0) goto L88
        L87:
            r2 = 0
        L88:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "commUseWording#get, curLang: "
            r1.<init>(r4)
            r1.append(r0)
            java.lang.String r0 = ", "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            com.tencent.mars.xlog.Log.i(r3, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: rh4.m.getGetCommonUsedWording():java.lang.String");
    }

    @Override // rh4.n0, lh4.h
    public void c() {
        super.c();
        getRecyclerView().m1();
    }

    @Override // rh4.o, rh4.n0, lh4.h
    public java.lang.String f() {
        java.lang.String getCommonUsedWording = getGetCommonUsedWording();
        if (!android.text.TextUtils.isEmpty(getCommonUsedWording)) {
            kotlin.jvm.internal.o.d(getCommonUsedWording);
            return getCommonUsedWording;
        }
        java.lang.String string = getContext().getString(com.tencent.mm.R.string.m7c);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return string;
    }

    public final android.animation.ObjectAnimator getLoadObjAnimator() {
        return this.f395765x;
    }

    @Override // rh4.o, rh4.n0
    public com.tencent.mm.plugin.taskbar.ui.section.weapp.TaskBarSectionWeAppRecyclerView i() {
        return new com.tencent.mm.plugin.taskbar.ui.section.weapp.TaskBarSectionCommonUsedWeAppRecyclerView(getContext());
    }

    @Override // rh4.o, rh4.n0
    public void l() {
        com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarSectionCommonUsedWeAppView", "onClickMore");
        rh4.j0 weAppCallback = getWeAppCallback();
        if (weAppCallback != null) {
            weAppCallback.r(7);
        }
    }

    @Override // rh4.n0
    public void n() {
        android.widget.ImageView imageView;
        rh4.j0 weAppCallback = getWeAppCallback();
        java.lang.Integer valueOf = weAppCallback != null ? java.lang.Integer.valueOf(weAppCallback.k()) : null;
        kotlin.jvm.internal.o.e(valueOf, "null cannot be cast to non-null type kotlin.Int");
        getMoreView().setVisibility(valueOf.intValue() > 0 ? 0 : 4);
        if (getMoreView().getVisibility() != 4 || (imageView = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.jr6)) == null) {
            return;
        }
        imageView.setImageDrawable(null);
    }

    public boolean r() {
        if (getMoreView() == null || getTitle() == null) {
            return false;
        }
        android.widget.TextView title = getTitle();
        kotlin.jvm.internal.o.d(title);
        android.widget.RelativeLayout moreView = getMoreView();
        kotlin.jvm.internal.o.f(moreView, "<get-moreView>(...)");
        android.graphics.Rect rect = new android.graphics.Rect();
        title.getGlobalVisibleRect(rect);
        android.graphics.Rect rect2 = new android.graphics.Rect();
        moreView.getGlobalVisibleRect(rect2);
        return rect.intersect(rect2);
    }

    public final void s(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarSectionCommonUsedWeAppView", "notifyItemRangeChanged, itemCount:" + i17);
        this.f395766y = 0;
        if (getRecyclerView().E0()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarSectionCommonUsedWeAppView", "isComputingLayout notifyItemRangeChanged");
            com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarSectionCommonUsedWeAppView", "notifyItemRangeChangedDelay");
            postDelayed(new rh4.l(this, i17), 300L);
        } else {
            androidx.recyclerview.widget.f2 adapter = getRecyclerView().getAdapter();
            if (adapter != null) {
                adapter.notifyItemRangeChanged(0, i17);
            }
        }
    }

    public final void setLoadObjAnimator(android.animation.ObjectAnimator objectAnimator) {
        this.f395765x = objectAnimator;
    }

    public void t(boolean z17) {
        int f17;
        int f18;
        android.view.ViewGroup.LayoutParams layoutParams;
        android.widget.TextView textView = (android.widget.TextView) getRoot().findViewById(com.tencent.mm.R.id.jrt);
        if (textView == null) {
            return;
        }
        if (z17) {
            textView.setMaxLines(1);
            f17 = i65.a.f(getContext(), com.tencent.mm.R.dimen.f479664c2);
            f18 = i65.a.f(getContext(), com.tencent.mm.R.dimen.f479727dj);
        } else {
            textView.setMaxLines(2);
            f17 = i65.a.f(getContext(), com.tencent.mm.R.dimen.f479675cc);
            f18 = i65.a.f(getContext(), com.tencent.mm.R.dimen.f479727dj);
        }
        textView.setMaxWidth(f17 - f18);
        textView.setEllipsize(android.text.TextUtils.TruncateAt.END);
        android.widget.RelativeLayout moreView = getMoreView();
        if (moreView == null || (layoutParams = moreView.getLayoutParams()) == null) {
            return;
        }
        layoutParams.width = f17;
        getMoreView().setLayoutParams(layoutParams);
    }

    public void u() {
        android.animation.ObjectAnimator objectAnimator = this.f395765x;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        android.widget.ImageView imageView = this.f395764w;
        if (imageView == null) {
            return;
        }
        imageView.setVisibility(8);
    }
}
