package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class k40 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.ViewGroup f118809a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f118810b;

    /* renamed from: c, reason: collision with root package name */
    public android.view.View f118811c;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f118812d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f118813e;

    /* renamed from: f, reason: collision with root package name */
    public android.animation.ValueAnimator f118814f;

    public k40(android.view.ViewGroup root) {
        kotlin.jvm.internal.o.g(root, "root");
        this.f118809a = root;
        this.f118810b = "FinderLiveWarnningCountWidget";
    }

    public final void a(int i17) {
        if (!(1 <= i17 && i17 < 4)) {
            b();
            return;
        }
        java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.d8z);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        if (this.f118811c == null) {
            android.view.ViewGroup viewGroup = this.f118809a;
            android.view.View inflate = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.tencent.mm.R.layout.b1w, viewGroup, false);
            this.f118811c = inflate;
            this.f118812d = inflate != null ? (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.cjv) : null;
            android.view.View view = this.f118811c;
            this.f118813e = view != null ? (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f486579lq3) : null;
            android.view.View view2 = this.f118811c;
            if (view2 != null) {
                view2.setBackgroundColor(-16777216);
            }
            if (viewGroup.indexOfChild(this.f118811c) == -1) {
                viewGroup.addView(this.f118811c);
            }
        }
        android.view.View view3 = this.f118811c;
        if (!(view3 != null && view3.getVisibility() == 0)) {
            android.animation.ValueAnimator valueAnimator = this.f118814f;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 0.6f);
            ofFloat.setDuration(i17 * 1000);
            ofFloat.addUpdateListener(new com.tencent.mm.plugin.finder.live.widget.i40(this));
            ofFloat.addListener(new com.tencent.mm.plugin.finder.live.widget.j40(this));
            this.f118814f = ofFloat;
            ofFloat.start();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("start alpha anim:duration$");
            android.animation.ValueAnimator valueAnimator2 = this.f118814f;
            sb6.append(valueAnimator2 != null ? java.lang.Long.valueOf(valueAnimator2.getDuration()) : null);
            com.tencent.mars.xlog.Log.i(this.f118810b, sb6.toString());
        }
        android.view.View view4 = this.f118811c;
        if (view4 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view4, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveWarnningCountWidget", "show", "(ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/finder/live/widget/FinderLiveWarnningCountWidget", "show", "(ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.TextView textView = this.f118812d;
        if (textView != null) {
            textView.setText(java.lang.String.valueOf(i17));
        }
        android.widget.TextView textView2 = this.f118813e;
        if (textView2 == null) {
            return;
        }
        textView2.setText(string);
    }

    public final void b() {
        android.view.View view = this.f118811c;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveWarnningCountWidget", "hide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/FinderLiveWarnningCountWidget", "hide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.animation.ValueAnimator valueAnimator = this.f118814f;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }
}
