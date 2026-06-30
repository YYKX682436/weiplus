package com.tencent.mm.plugin.finder.presenter.contract;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljz5/f0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class FinderMsgContract$convertCommentImage$showImageStatus$1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f122939d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f122940e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f122941f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f122942g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderMsgContract$convertCommentImage$showImageStatus$1(boolean z17, android.view.ViewGroup viewGroup, android.view.View view, android.view.View view2) {
        super(0);
        this.f122939d = z17;
        this.f122940e = viewGroup;
        this.f122941f = view;
        this.f122942g = view2;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        boolean z17 = this.f122939d;
        android.view.ViewGroup viewGroup = this.f122940e;
        if (z17) {
            viewGroup.setVisibility(8);
        } else {
            viewGroup.setVisibility(0);
            android.view.View view = this.f122941f;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/presenter/contract/FinderMsgContract$convertCommentImage$showImageStatus$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/presenter/contract/FinderMsgContract$convertCommentImage$showImageStatus$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = this.f122942g;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/presenter/contract/FinderMsgContract$convertCommentImage$showImageStatus$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/presenter/contract/FinderMsgContract$convertCommentImage$showImageStatus$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        return jz5.f0.f302826a;
    }
}
