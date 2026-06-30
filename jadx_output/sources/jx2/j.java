package jx2;

/* loaded from: classes3.dex */
public final class j extends db5.d5 {

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Context f302432b;

    /* renamed from: c, reason: collision with root package name */
    public final jx2.h f302433c;

    /* renamed from: d, reason: collision with root package name */
    public int f302434d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f302435e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(android.content.Context context, jx2.k delegate) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(delegate, "delegate");
        this.f302432b = context;
        jx2.h hVar = new jx2.h();
        this.f302433c = hVar;
        java.lang.String str = null;
        setContentView(android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.f488779ae0, (android.view.ViewGroup) null));
        setClippingEnabled(false);
        setFocusable(true);
        setOutsideTouchable(true);
        if (context instanceof com.tencent.mm.ui.MMActivity) {
            ((com.tencent.mm.ui.MMActivity) context).mo133getLifecycle().a(new androidx.lifecycle.x() { // from class: com.tencent.mm.plugin.finder.view.feedback.FinderAdFeedbackPopupWindow$1
                @androidx.lifecycle.l0(androidx.lifecycle.m.ON_DESTROY)
                public final void onDestroy() {
                    jx2.j jVar = jx2.j.this;
                    jVar.dismiss();
                    ((com.tencent.mm.ui.MMActivity) jVar.f302432b).mo133getLifecycle().c(this);
                }
            });
        }
        android.view.View contentView = getContentView();
        kotlin.jvm.internal.o.f(contentView, "getContentView(...)");
        hVar.f302420a = contentView;
        hVar.f302421b = delegate;
        hVar.f302422c = (android.widget.TextView) contentView.findViewById(com.tencent.mm.R.id.e0w);
        hVar.f302423d = (android.widget.TextView) contentView.findViewById(com.tencent.mm.R.id.e0x);
        hVar.f302424e = (android.widget.TextView) contentView.findViewById(com.tencent.mm.R.id.e0y);
        hVar.f302425f = (com.tencent.mm.ui.base.FlowLayout) contentView.findViewById(com.tencent.mm.R.id.lko);
        hVar.f302426g = contentView.findViewById(com.tencent.mm.R.id.gdv);
        hVar.f302427h = contentView.findViewById(com.tencent.mm.R.id.gdw);
        hVar.f302428i = (android.widget.TextView) contentView.findViewById(com.tencent.mm.R.id.e0j);
        android.view.View view = hVar.f302426g;
        if (view != null) {
            view.setOnClickListener(new jx2.b(delegate, hVar));
        }
        jx2.k kVar = hVar.f302421b;
        if (kVar != null) {
            android.view.View view2 = hVar.f302420a;
            android.content.Context context2 = view2 != null ? view2.getContext() : null;
            if (context2 != null) {
                android.widget.TextView textView = hVar.f302422c;
                if (textView != null) {
                    textView.setVisibility(0);
                }
                android.widget.TextView textView2 = hVar.f302423d;
                if (textView2 != null) {
                    textView2.setVisibility(0);
                }
                android.widget.TextView textView3 = hVar.f302424e;
                if (textView3 != null) {
                    textView3.setVisibility(8);
                }
                android.widget.TextView textView4 = hVar.f302428i;
                if (textView4 != null) {
                    textView4.setVisibility(8);
                }
                android.widget.TextView textView5 = hVar.f302422c;
                if (textView5 != null) {
                    jx2.l lVar = (jx2.l) kVar;
                    java.lang.String string = lVar.f302437b.getString(9);
                    if (string != null && (!r26.n0.N(string))) {
                        str = string;
                    }
                    if (str == null) {
                        str = lVar.f302436a.getString(com.tencent.mm.R.string.ckb);
                        kotlin.jvm.internal.o.f(str, "getString(...)");
                    }
                    textView5.setText(str);
                }
                android.widget.TextView textView6 = hVar.f302423d;
                if (textView6 != null) {
                    java.lang.String string2 = ((jx2.l) kVar).f302436a.getString(com.tencent.mm.R.string.ckd);
                    kotlin.jvm.internal.o.f(string2, "getString(...)");
                    textView6.setText(string2);
                }
                if (hVar.f302422c != null) {
                    com.tencent.mm.ui.base.FlowLayout flowLayout = hVar.f302425f;
                    if (flowLayout != null) {
                        flowLayout.removeAllViews();
                    }
                    java.lang.String string3 = context2.getString(com.tencent.mm.R.string.f491300cp2);
                    kotlin.jvm.internal.o.f(string3, "getString(...)");
                    android.view.View b17 = hVar.b(context2, string3, 1);
                    com.tencent.mm.ui.base.FlowLayout flowLayout2 = hVar.f302425f;
                    if (flowLayout2 != null) {
                        flowLayout2.addView(b17);
                    }
                    b17.setOnClickListener(new jx2.d(hVar, b17, context2, kVar));
                    java.lang.String string4 = context2.getString(com.tencent.mm.R.string.f491298cp0);
                    kotlin.jvm.internal.o.f(string4, "getString(...)");
                    android.view.View b18 = hVar.b(context2, string4, 0);
                    com.tencent.mm.ui.base.FlowLayout flowLayout3 = hVar.f302425f;
                    if (flowLayout3 != null) {
                        flowLayout3.addView(b18);
                    }
                    b18.setOnClickListener(new jx2.e(hVar, b18, context2));
                    android.view.View view3 = hVar.f302426g;
                    if (view3 != null) {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                        arrayList.add(0);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(view3, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/feedback/FinderAdFeedbackController", "showFirstPage", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view3.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                        yj0.a.f(view3, "com/tencent/mm/plugin/finder/view/feedback/FinderAdFeedbackController", "showFirstPage", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    android.view.View view4 = hVar.f302427h;
                    if (view4 != null) {
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                        arrayList2.add(0);
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(view4, arrayList2.toArray(), "com/tencent/mm/plugin/finder/view/feedback/FinderAdFeedbackController", "showFirstPage", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view4.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                        yj0.a.f(view4, "com/tencent/mm/plugin/finder/view/feedback/FinderAdFeedbackController", "showFirstPage", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                }
            }
        }
        hVar.f302430k = new jx2.i(this);
    }

    public final void a(android.view.View view, java.lang.Integer num) {
        android.view.View findViewById = getContentView().findViewById(com.tencent.mm.R.id.a4x);
        android.view.View findViewById2 = getContentView().findViewById(com.tencent.mm.R.id.a4q);
        int measuredWidth = (view.getMeasuredWidth() - (findViewById != null ? findViewById.getMeasuredWidth() : 0)) / 2;
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = null;
        if (findViewById != null) {
            android.view.ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams2 != null) {
                marginLayoutParams2.rightMargin = measuredWidth - this.f302434d;
            } else {
                marginLayoutParams2 = null;
            }
            findViewById.setLayoutParams(marginLayoutParams2);
        }
        if (findViewById2 != null) {
            android.view.ViewGroup.LayoutParams layoutParams2 = findViewById2.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams2 : null;
            if (marginLayoutParams3 != null) {
                marginLayoutParams3.rightMargin = measuredWidth - this.f302434d;
                marginLayoutParams = marginLayoutParams3;
            }
            findViewById2.setLayoutParams(marginLayoutParams);
        }
        if (num != null) {
            if (num.intValue() < 0) {
                if (findViewById != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(8);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/feedback/FinderAdFeedbackPopupWindow", "updateArrowMargin", "(Landroid/view/View;Ljava/lang/Integer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/view/feedback/FinderAdFeedbackPopupWindow", "updateArrowMargin", "(Landroid/view/View;Ljava/lang/Integer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                if (findViewById2 == null) {
                    return;
                }
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/view/feedback/FinderAdFeedbackPopupWindow", "updateArrowMargin", "(Landroid/view/View;Ljava/lang/Integer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/view/feedback/FinderAdFeedbackPopupWindow", "updateArrowMargin", "(Landroid/view/View;Ljava/lang/Integer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            if (findViewById != null) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                arrayList3.add(0);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(findViewById, arrayList3.toArray(), "com/tencent/mm/plugin/finder/view/feedback/FinderAdFeedbackPopupWindow", "updateArrowMargin", "(Landroid/view/View;Ljava/lang/Integer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/view/feedback/FinderAdFeedbackPopupWindow", "updateArrowMargin", "(Landroid/view/View;Ljava/lang/Integer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (findViewById2 == null) {
                return;
            }
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(findViewById2, arrayList4.toArray(), "com/tencent/mm/plugin/finder/view/feedback/FinderAdFeedbackPopupWindow", "updateArrowMargin", "(Landroid/view/View;Ljava/lang/Integer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/view/feedback/FinderAdFeedbackPopupWindow", "updateArrowMargin", "(Landroid/view/View;Ljava/lang/Integer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    @Override // db5.d5, android.widget.PopupWindow
    public void dismiss() {
        android.view.Window window;
        android.content.Context context = this.f302432b;
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        if (activity != null && (window = activity.getWindow()) != null) {
            window.clearFlags(2);
        }
        super.dismiss();
        jx2.h hVar = this.f302433c;
        hVar.getClass();
        hVar.f302420a = null;
        hVar.f302421b = null;
        hVar.f302430k = null;
        ((java.util.ArrayList) hVar.f302429j).clear();
    }
}
