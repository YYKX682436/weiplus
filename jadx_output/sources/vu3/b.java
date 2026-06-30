package vu3;

/* loaded from: classes5.dex */
public final class b extends vu3.c {

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Context f440221b;

    /* renamed from: c, reason: collision with root package name */
    public final int f440222c;

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f440223d;

    public b(android.content.Context context, int i17) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f440221b = context;
        this.f440222c = i17;
    }

    @Override // vu3.c
    public android.view.View a() {
        if (this.f440223d == null) {
            android.view.View view = new android.view.View(this.f440221b);
            view.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
            view.setBackgroundColor(this.f440222c);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/ui/drawer/component/BackgroundMaskComponent", "getView", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/recordvideo/ui/drawer/component/BackgroundMaskComponent", "getView", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setOnClickListener(new vu3.a(this));
            this.f440223d = view;
        }
        return this.f440223d;
    }

    @Override // vu3.c
    public void f(uu3.u layout, float f17, java.lang.String source) {
        android.view.View view;
        kotlin.jvm.internal.o.g(layout, "layout");
        kotlin.jvm.internal.o.g(source, "source");
        super.f(layout, f17, source);
        android.view.View view2 = this.f440223d;
        if (view2 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/ui/drawer/component/BackgroundMaskComponent", "onTranslationChange", "(Lcom/tencent/mm/plugin/recordvideo/ui/drawer/MMCustomDrawer;FLjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/recordvideo/ui/drawer/component/BackgroundMaskComponent", "onTranslationChange", "(Lcom/tencent/mm/plugin/recordvideo/ui/drawer/MMCustomDrawer;FLjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        float borderPeek = layout.getCanPeek() ? layout.getBorderPeek() : layout.getBorderExpand();
        float borderClose = layout.getBorderClose();
        float f18 = (borderClose - f17) / (borderClose - borderPeek);
        if (f18 > 1.0f) {
            f18 = 1.0f;
        }
        if (0.0f >= f18) {
            f18 = 0.0f;
        }
        android.view.View view3 = this.f440223d;
        if (view3 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(java.lang.Float.valueOf(f18));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/recordvideo/ui/drawer/component/BackgroundMaskComponent", "onTranslationChange", "(Lcom/tencent/mm/plugin/recordvideo/ui/drawer/MMCustomDrawer;FLjava/lang/String;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view3.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/recordvideo/ui/drawer/component/BackgroundMaskComponent", "onTranslationChange", "(Lcom/tencent/mm/plugin/recordvideo/ui/drawer/MMCustomDrawer;FLjava/lang/String;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        if (!(f18 == 0.0f) || (view = this.f440223d) == null) {
            return;
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view, arrayList3.toArray(), "com/tencent/mm/plugin/recordvideo/ui/drawer/component/BackgroundMaskComponent", "onTranslationChange", "(Lcom/tencent/mm/plugin/recordvideo/ui/drawer/MMCustomDrawer;FLjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/recordvideo/ui/drawer/component/BackgroundMaskComponent", "onTranslationChange", "(Lcom/tencent/mm/plugin/recordvideo/ui/drawer/MMCustomDrawer;FLjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public /* synthetic */ b(android.content.Context context, int i17, int i18, kotlin.jvm.internal.i iVar) {
        this(context, (i18 & 2) != 0 ? 0 : i17);
    }
}
