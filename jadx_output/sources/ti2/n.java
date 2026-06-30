package ti2;

/* loaded from: classes.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f419570d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f419571e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f419572f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f419573g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(android.view.View view, android.widget.TextView textView, android.view.View view2, android.view.View view3) {
        super(0);
        this.f419570d = view;
        this.f419571e = textView;
        this.f419572f = view2;
        this.f419573g = view3;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View view = this.f419570d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/pk/convert/MicVisitorLinkUserConvert$onBindViewHolder$1$loadingBlock$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/mic/pk/convert/MicVisitorLinkUserConvert$onBindViewHolder$1$loadingBlock$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f419571e.setVisibility(4);
        android.view.View view2 = this.f419572f;
        if (view2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(4);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/mic/pk/convert/MicVisitorLinkUserConvert$onBindViewHolder$1$loadingBlock$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/mic/pk/convert/MicVisitorLinkUserConvert$onBindViewHolder$1$loadingBlock$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view3 = this.f419573g;
        if (view3 != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(4);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/mic/pk/convert/MicVisitorLinkUserConvert$onBindViewHolder$1$loadingBlock$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/mic/pk/convert/MicVisitorLinkUserConvert$onBindViewHolder$1$loadingBlock$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        return jz5.f0.f302826a;
    }
}
