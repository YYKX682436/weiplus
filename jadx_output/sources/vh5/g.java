package vh5;

/* loaded from: classes3.dex */
public final class g implements mg3.e, mf3.o {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f437209d;

    /* renamed from: e, reason: collision with root package name */
    public final mf3.n f437210e;

    /* renamed from: f, reason: collision with root package name */
    public final lf3.j f437211f;

    /* renamed from: g, reason: collision with root package name */
    public mf3.s f437212g;

    /* renamed from: h, reason: collision with root package name */
    public float f437213h;

    /* renamed from: i, reason: collision with root package name */
    public int f437214i;

    /* renamed from: m, reason: collision with root package name */
    public int f437215m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f437216n;

    public g(android.view.View content, mf3.n layer, lf3.j jVar) {
        kotlin.jvm.internal.o.g(content, "content");
        kotlin.jvm.internal.o.g(layer, "layer");
        this.f437209d = content;
        this.f437210e = layer;
        this.f437211f = jVar;
        this.f437216n = jz5.h.b(new vh5.f(this));
    }

    @Override // mg3.e
    public void a(float f17, float f18) {
        int i17;
        int i18 = this.f437215m;
        android.view.View view = this.f437209d;
        if (i18 == 0 || this.f437214i == 0) {
            this.f437215m = view.getHeight();
            this.f437214i = view.getWidth();
        }
        if (this.f437214i == 0 || (i17 = this.f437215m) == 0) {
            return;
        }
        float f19 = 1;
        float f27 = f19 - (f18 / i17);
        if (f27 > 1.0f) {
            f27 = 1.0f;
        }
        lf3.j jVar = this.f437211f;
        vh5.e eVar = jVar instanceof vh5.e ? (vh5.e) jVar : null;
        if (eVar != null) {
            eVar.f437205f = f27;
            eVar.f437206g = f17;
            eVar.f437207h = f18;
        }
        view.setPivotX(r3 / 2);
        view.setPivotY(this.f437215m / 2);
        view.setScaleX(f27);
        view.setScaleY(f27);
        view.setTranslationX(f17);
        view.setTranslationY(f18);
        if (jVar != null) {
            jVar.d3(f27);
        }
        this.f437213h = f27;
        this.f437210e.d(f19 - f27);
        android.view.View view2 = (android.view.View) ((jz5.n) this.f437216n).getValue();
        if (view2 != null) {
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(f27 < 1.0f);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/kt/CommonKt", "invisibleIf", "(Landroid/view/View;Ljava/lang/Boolean;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            int intValue = ((java.lang.Integer) arrayList.get(0)).intValue();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(java.lang.Integer.valueOf(intValue));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/ui/media/chat/legacy/ChatVirtualPageHandler", "onGalleryScale", "(FF)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/ui/media/chat/legacy/ChatVirtualPageHandler", "onGalleryScale", "(FF)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            yj0.a.f(view2, "com/tencent/mm/kt/CommonKt", "invisibleIf", "(Landroid/view/View;Ljava/lang/Boolean;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (((android.view.View) pm0.v.E(valueOf, view2)) == null) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList3.add(0);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view2, arrayList3.toArray(), "com/tencent/mm/kt/CommonKt", "invisibleIf", "(Landroid/view/View;Ljava/lang/Boolean;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                int intValue2 = ((java.lang.Integer) arrayList3.get(0)).intValue();
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                arrayList4.add(java.lang.Integer.valueOf(intValue2));
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(view2, arrayList4.toArray(), "com/tencent/mm/ui/media/chat/legacy/ChatVirtualPageHandler", "onGalleryScale", "(FF)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/ui/media/chat/legacy/ChatVirtualPageHandler", "onGalleryScale", "(FF)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                yj0.a.f(view2, "com/tencent/mm/kt/CommonKt", "invisibleIf", "(Landroid/view/View;Ljava/lang/Boolean;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
    }

    @Override // mg3.e
    public void d() {
        float f17 = this.f437213h;
        android.view.View view = this.f437209d;
        if (f17 >= 1.0f) {
            view.setPivotX(this.f437214i / 2);
            view.setPivotY(this.f437215m / 2);
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            view.setTranslationX(0.0f);
            view.setTranslationY(0.0f);
            this.f437213h = 0.0f;
            return;
        }
        android.view.View view2 = (android.view.View) ((jz5.n) this.f437216n).getValue();
        if (view2 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            int intValue = ((java.lang.Integer) arrayList.get(0)).intValue();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(java.lang.Integer.valueOf(intValue));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/ui/media/chat/legacy/ChatVirtualPageHandler", "exit", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/ui/media/chat/legacy/ChatVirtualPageHandler", "exit", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            yj0.a.f(view2, "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        lf3.j jVar = this.f437211f;
        if (jVar != null) {
            jVar.E2(view);
        }
    }

    @Override // mg3.e
    public boolean f(android.view.MotionEvent event) {
        kotlin.jvm.internal.o.g(event, "event");
        return this.f437210e.n(event);
    }

    @Override // mg3.e
    public boolean g(android.view.MotionEvent event) {
        kotlin.jvm.internal.o.g(event, "event");
        return false;
    }

    @Override // mf3.o
    public void j() {
        d();
    }
}
