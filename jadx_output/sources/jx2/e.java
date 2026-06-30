package jx2;

/* loaded from: classes3.dex */
public final class e implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jx2.h f302410d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f302411e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f302412f;

    public e(jx2.h hVar, android.view.View view, android.content.Context context) {
        this.f302410d = hVar;
        this.f302411e = view;
        this.f302412f = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/feedback/FinderAdFeedbackController$showFirstPage$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.view.View view2 = this.f302411e;
        android.content.Context context = this.f302412f;
        jx2.h hVar = this.f302410d;
        jx2.h.a(hVar, view2, context);
        jx2.k kVar = hVar.f302421b;
        if (kVar != null) {
            android.view.View view3 = hVar.f302420a;
            android.content.Context context2 = view3 != null ? view3.getContext() : null;
            if (context2 != null) {
                android.widget.TextView textView = hVar.f302422c;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                android.widget.TextView textView2 = hVar.f302423d;
                if (textView2 != null) {
                    textView2.setVisibility(0);
                }
                android.widget.TextView textView3 = hVar.f302424e;
                if (textView3 != null) {
                    textView3.setVisibility(0);
                }
                android.widget.TextView textView4 = hVar.f302423d;
                if (textView4 != null) {
                    java.lang.String string = ((jx2.l) kVar).f302436a.getString(com.tencent.mm.R.string.cke);
                    kotlin.jvm.internal.o.f(string, "getString(...)");
                    textView4.setText(string);
                }
                android.widget.TextView textView5 = hVar.f302424e;
                if (textView5 != null) {
                    java.lang.String string2 = ((jx2.l) kVar).f302436a.getString(com.tencent.mm.R.string.ckc);
                    kotlin.jvm.internal.o.f(string2, "getString(...)");
                    textView5.setText(string2);
                }
                android.widget.TextView textView6 = hVar.f302428i;
                if (textView6 != null) {
                    textView6.setVisibility(8);
                }
                ((java.util.ArrayList) hVar.f302429j).clear();
                hVar.c(context2);
                com.tencent.mm.ui.base.FlowLayout flowLayout = hVar.f302425f;
                if (flowLayout != null) {
                    flowLayout.removeAllViews();
                }
                android.content.Context context3 = ((jx2.l) kVar).f302436a;
                java.lang.String string3 = context3.getString(com.tencent.mm.R.string.ck9);
                kotlin.jvm.internal.o.f(string3, "getString(...)");
                jx2.a aVar = new jx2.a(0, string3);
                java.lang.String string4 = context3.getString(com.tencent.mm.R.string.ck_);
                kotlin.jvm.internal.o.f(string4, "getString(...)");
                jx2.a aVar2 = new jx2.a(1, string4);
                java.lang.String string5 = context3.getString(com.tencent.mm.R.string.cka);
                kotlin.jvm.internal.o.f(string5, "getString(...)");
                int i17 = 0;
                for (java.lang.Object obj : kz5.c0.i(aVar, aVar2, new jx2.a(2, string5))) {
                    int i18 = i17 + 1;
                    if (i17 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    jx2.a aVar3 = (jx2.a) obj;
                    android.view.View b17 = hVar.b(context2, aVar3.f302400b, -1);
                    com.tencent.mm.ui.base.FlowLayout flowLayout2 = hVar.f302425f;
                    if (flowLayout2 != null) {
                        flowLayout2.addView(b17);
                    }
                    b17.setOnClickListener(new jx2.f(hVar, b17, aVar3, true, context2));
                    i17 = i18;
                }
                android.widget.TextView textView7 = hVar.f302428i;
                if (textView7 != null) {
                    textView7.setOnClickListener(new jx2.g(kVar, hVar, context2));
                }
                android.view.View view4 = hVar.f302426g;
                if (view4 != null) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList2.add(8);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view4, arrayList2.toArray(), "com/tencent/mm/plugin/finder/view/feedback/FinderAdFeedbackController", "showSecondPage", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view4.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view4, "com/tencent/mm/plugin/finder/view/feedback/FinderAdFeedbackController", "showSecondPage", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                android.view.View view5 = hVar.f302427h;
                if (view5 != null) {
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList3.add(8);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(view5, arrayList3.toArray(), "com/tencent/mm/plugin/finder/view/feedback/FinderAdFeedbackController", "showSecondPage", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view5.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                    yj0.a.f(view5, "com/tencent/mm/plugin/finder/view/feedback/FinderAdFeedbackController", "showSecondPage", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/feedback/FinderAdFeedbackController$showFirstPage$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
