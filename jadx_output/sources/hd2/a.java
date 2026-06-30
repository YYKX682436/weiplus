package hd2;

/* loaded from: classes.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f280443d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f280444e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f280445f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f280446g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(boolean z17, android.view.ViewGroup viewGroup, android.view.View view, android.view.View view2) {
        super(0);
        this.f280443d = z17;
        this.f280444e = viewGroup;
        this.f280445f = view;
        this.f280446g = view2;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        boolean z17 = this.f280443d;
        android.view.ViewGroup viewGroup = this.f280444e;
        if (z17) {
            viewGroup.setVisibility(8);
        } else {
            viewGroup.setVisibility(0);
            android.view.View view = this.f280445f;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/fragment/FinderCommentShareDialogFragment$handleImageLoadStatus$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/feed/ui/fragment/FinderCommentShareDialogFragment$handleImageLoadStatus$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = this.f280446g;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/ui/fragment/FinderCommentShareDialogFragment$handleImageLoadStatus$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/feed/ui/fragment/FinderCommentShareDialogFragment$handleImageLoadStatus$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        return jz5.f0.f302826a;
    }
}
