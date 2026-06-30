package hx2;

/* loaded from: classes2.dex */
public final class b extends hx2.i {

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Context f285640b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f285641c;

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f285642d;

    public b(android.content.Context context, boolean z17) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f285640b = context;
        this.f285641c = z17;
    }

    @Override // hx2.i
    public android.view.View a() {
        if (this.f285642d == null) {
            android.view.View view = new android.view.View(this.f285640b);
            view.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
            view.setBackgroundColor(view.getContext().getResources().getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_5));
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/drawer/component/BackgroundMaskComponent", "getView", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/view/drawer/component/BackgroundMaskComponent", "getView", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setOnClickListener(new hx2.a(this));
            this.f285642d = view;
        }
        return this.f285642d;
    }

    @Override // hx2.i
    public void g(gx2.q layout, float f17, java.lang.String source) {
        android.view.View view;
        android.view.View view2;
        kotlin.jvm.internal.o.g(layout, "layout");
        kotlin.jvm.internal.o.g(source, "source");
        super.g(layout, f17, source);
        android.view.View view3 = this.f285642d;
        if (view3 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view3, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/drawer/component/BackgroundMaskComponent", "onTranslationChange", "(Lcom/tencent/mm/plugin/finder/view/drawer/FinderCustomDrawer;FLjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/finder/view/drawer/component/BackgroundMaskComponent", "onTranslationChange", "(Lcom/tencent/mm/plugin/finder/view/drawer/FinderCustomDrawer;FLjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
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
        android.view.View view4 = this.f285642d;
        if (view4 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(java.lang.Float.valueOf(f18));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view4, arrayList2.toArray(), "com/tencent/mm/plugin/finder/view/drawer/component/BackgroundMaskComponent", "onTranslationChange", "(Lcom/tencent/mm/plugin/finder/view/drawer/FinderCustomDrawer;FLjava/lang/String;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view4.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/finder/view/drawer/component/BackgroundMaskComponent", "onTranslationChange", "(Lcom/tencent/mm/plugin/finder/view/drawer/FinderCustomDrawer;FLjava/lang/String;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        if ((f18 == 0.0f) && (view2 = this.f285642d) != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view2, arrayList3.toArray(), "com/tencent/mm/plugin/finder/view/drawer/component/BackgroundMaskComponent", "onTranslationChange", "(Lcom/tencent/mm/plugin/finder/view/drawer/FinderCustomDrawer;FLjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/view/drawer/component/BackgroundMaskComponent", "onTranslationChange", "(Lcom/tencent/mm/plugin/finder/view/drawer/FinderCustomDrawer;FLjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        if (!(((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.Y9).getValue()).r()).intValue() == 1) || this.f285641c || (view = this.f285642d) == null) {
            return;
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
        arrayList4.add(java.lang.Float.valueOf(0.0f));
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view, arrayList4.toArray(), "com/tencent/mm/plugin/finder/view/drawer/component/BackgroundMaskComponent", "onTranslationChange", "(Lcom/tencent/mm/plugin/finder/view/drawer/FinderCustomDrawer;FLjava/lang/String;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList4.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/view/drawer/component/BackgroundMaskComponent", "onTranslationChange", "(Lcom/tencent/mm/plugin/finder/view/drawer/FinderCustomDrawer;FLjava/lang/String;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }

    public /* synthetic */ b(android.content.Context context, boolean z17, int i17, kotlin.jvm.internal.i iVar) {
        this(context, (i17 & 2) != 0 ? false : z17);
    }
}
