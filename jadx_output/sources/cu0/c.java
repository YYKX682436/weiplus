package cu0;

/* loaded from: classes5.dex */
public final class c extends vu3.c {

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Context f222308b;

    /* renamed from: c, reason: collision with root package name */
    public final yz5.l f222309c;

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f222310d;

    public c(android.content.Context context, yz5.l ignoreBackgroundTouchEvent) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(ignoreBackgroundTouchEvent, "ignoreBackgroundTouchEvent");
        this.f222308b = context;
        this.f222309c = ignoreBackgroundTouchEvent;
    }

    @Override // vu3.c
    public android.view.View a() {
        if (this.f222310d == null) {
            cu0.a aVar = new cu0.a(this, this.f222308b);
            this.f222310d = aVar;
            aVar.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(aVar, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/common/music/ComposingBackgroundComponent", "getView", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            aVar.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(aVar, "com/tencent/mm/mj_publisher/finder/common/music/ComposingBackgroundComponent", "getView", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            aVar.setOnClickListener(new cu0.b(this));
        }
        return this.f222310d;
    }

    @Override // vu3.c
    public void f(uu3.u layout, float f17, java.lang.String source) {
        android.view.View view;
        kotlin.jvm.internal.o.g(layout, "layout");
        kotlin.jvm.internal.o.g(source, "source");
        super.f(layout, f17, source);
        android.view.View view2 = this.f222310d;
        if (view2 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/common/music/ComposingBackgroundComponent", "onTranslationChange", "(Lcom/tencent/mm/plugin/recordvideo/ui/drawer/MMCustomDrawer;FLjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/mj_publisher/finder/common/music/ComposingBackgroundComponent", "onTranslationChange", "(Lcom/tencent/mm/plugin/recordvideo/ui/drawer/MMCustomDrawer;FLjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
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
        android.view.View view3 = this.f222310d;
        if (view3 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(java.lang.Float.valueOf(f18));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/mj_publisher/finder/common/music/ComposingBackgroundComponent", "onTranslationChange", "(Lcom/tencent/mm/plugin/recordvideo/ui/drawer/MMCustomDrawer;FLjava/lang/String;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view3.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
            yj0.a.f(view3, "com/tencent/mm/mj_publisher/finder/common/music/ComposingBackgroundComponent", "onTranslationChange", "(Lcom/tencent/mm/plugin/recordvideo/ui/drawer/MMCustomDrawer;FLjava/lang/String;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        if (!(f18 == 0.0f) || (view = this.f222310d) == null) {
            return;
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view, arrayList3.toArray(), "com/tencent/mm/mj_publisher/finder/common/music/ComposingBackgroundComponent", "onTranslationChange", "(Lcom/tencent/mm/plugin/recordvideo/ui/drawer/MMCustomDrawer;FLjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/mj_publisher/finder/common/music/ComposingBackgroundComponent", "onTranslationChange", "(Lcom/tencent/mm/plugin/recordvideo/ui/drawer/MMCustomDrawer;FLjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
