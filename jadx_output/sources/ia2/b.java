package ia2;

/* loaded from: classes2.dex */
public final class b extends hx2.i {

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Context f289900b;

    /* renamed from: c, reason: collision with root package name */
    public android.view.View f289901c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f289902d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.activity.poi.flutter.FinderFlutterPOIActivity f289903e;

    public b(com.tencent.mm.plugin.finder.activity.poi.flutter.FinderFlutterPOIActivity finderFlutterPOIActivity, android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f289903e = finderFlutterPOIActivity;
        this.f289900b = context;
        this.f289902d = new java.lang.ref.WeakReference(finderFlutterPOIActivity);
    }

    @Override // hx2.i
    public android.view.View a() {
        if (this.f289901c == null) {
            android.view.View view = new android.view.View(this.f289900b);
            view.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/activity/poi/flutter/FinderFlutterPOIActivity$BackgroundComponent", "getView", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/activity/poi/flutter/FinderFlutterPOIActivity$BackgroundComponent", "getView", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (this.f289903e.D) {
                view.setOnClickListener(new ia2.a(this));
            }
            this.f289901c = view;
        }
        return this.f289901c;
    }

    @Override // hx2.i
    public void g(gx2.q layout, float f17, java.lang.String source) {
        yz5.p pVar;
        gx2.q qVar;
        android.view.View container;
        gx2.q qVar2;
        android.view.View view;
        kotlin.jvm.internal.o.g(layout, "layout");
        kotlin.jvm.internal.o.g(source, "source");
        super.g(layout, f17, source);
        java.lang.ref.WeakReference weakReference = this.f289902d;
        com.tencent.mm.plugin.finder.activity.poi.flutter.FinderFlutterPOIActivity finderFlutterPOIActivity = (com.tencent.mm.plugin.finder.activity.poi.flutter.FinderFlutterPOIActivity) weakReference.get();
        int i17 = 0;
        float f18 = 0.0f;
        if (!(finderFlutterPOIActivity != null && finderFlutterPOIActivity.L)) {
            android.view.View view2 = this.f289901c;
            if (view2 != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/activity/poi/flutter/FinderFlutterPOIActivity$BackgroundComponent", "onTranslationChange", "(Lcom/tencent/mm/plugin/finder/view/drawer/FinderCustomDrawer;FLjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/finder/activity/poi/flutter/FinderFlutterPOIActivity$BackgroundComponent", "onTranslationChange", "(Lcom/tencent/mm/plugin/finder/view/drawer/FinderCustomDrawer;FLjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            float borderExpand = layout.getBorderExpand();
            float borderPeek = layout.getCanPeek() ? layout.getBorderPeek() : layout.getBorderClose();
            float f19 = (borderPeek - f17) / (borderPeek - borderExpand);
            if (f19 > 1.0f) {
                f19 = 1.0f;
            }
            if (0.0f >= f19) {
                f19 = 0.0f;
            }
            if ((f19 == 0.0f) && (view = this.f289901c) != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/finder/activity/poi/flutter/FinderFlutterPOIActivity$BackgroundComponent", "onTranslationChange", "(Lcom/tencent/mm/plugin/finder/view/drawer/FinderCustomDrawer;FLjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/activity/poi/flutter/FinderFlutterPOIActivity$BackgroundComponent", "onTranslationChange", "(Lcom/tencent/mm/plugin/finder/view/drawer/FinderCustomDrawer;FLjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        com.tencent.mm.plugin.finder.activity.poi.flutter.FinderFlutterPOIActivity finderFlutterPOIActivity2 = (com.tencent.mm.plugin.finder.activity.poi.flutter.FinderFlutterPOIActivity) weakReference.get();
        if (finderFlutterPOIActivity2 == null || (pVar = finderFlutterPOIActivity2.P) == null) {
            return;
        }
        com.tencent.mm.plugin.finder.activity.poi.flutter.FinderFlutterPOIActivity finderFlutterPOIActivity3 = (com.tencent.mm.plugin.finder.activity.poi.flutter.FinderFlutterPOIActivity) weakReference.get();
        if (finderFlutterPOIActivity3 != null && (qVar2 = finderFlutterPOIActivity3.f101776J) != null) {
            f18 = qVar2.getF131934f();
        }
        java.lang.Float valueOf = java.lang.Float.valueOf(f18);
        com.tencent.mm.plugin.finder.activity.poi.flutter.FinderFlutterPOIActivity finderFlutterPOIActivity4 = (com.tencent.mm.plugin.finder.activity.poi.flutter.FinderFlutterPOIActivity) weakReference.get();
        if (finderFlutterPOIActivity4 != null && (qVar = finderFlutterPOIActivity4.f101776J) != null && (container = qVar.getContainer()) != null) {
            i17 = container.getHeight();
        }
        pVar.invoke(valueOf, java.lang.Float.valueOf(i17 - f17));
    }
}
