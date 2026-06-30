package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes8.dex */
public final class ed extends androidx.recyclerview.widget.h2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.TextStatusLikeListFragment f173848a;

    public ed(com.tencent.mm.plugin.textstatus.ui.TextStatusLikeListFragment textStatusLikeListFragment) {
        this.f173848a = textStatusLikeListFragment;
    }

    @Override // androidx.recyclerview.widget.h2
    public void b() {
        com.tencent.mm.ui.MMActivity mMActivity;
        com.tencent.mm.plugin.textstatus.ui.TextStatusLikeListFragment textStatusLikeListFragment = this.f173848a;
        boolean isEmpty = textStatusLikeListFragment.f173646q.isEmpty();
        jz5.g gVar = textStatusLikeListFragment.f173650u;
        if (isEmpty) {
            java.lang.Object value = ((jz5.n) gVar).getValue();
            kotlin.jvm.internal.o.f(value, "getValue(...)");
            android.view.View view = (android.view.View) value;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/textstatus/ui/TextStatusLikeListFragment", "checkEmpty", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/textstatus/ui/TextStatusLikeListFragment", "checkEmpty", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.content.Context context = textStatusLikeListFragment.getContext();
            mMActivity = context instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) context : null;
            if (mMActivity != null) {
                mMActivity.enableOptionMenu(false);
                return;
            }
            return;
        }
        java.lang.Object value2 = ((jz5.n) gVar).getValue();
        kotlin.jvm.internal.o.f(value2, "getValue(...)");
        android.view.View view2 = (android.view.View) value2;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/textstatus/ui/TextStatusLikeListFragment", "checkEmpty", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/textstatus/ui/TextStatusLikeListFragment", "checkEmpty", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.content.Context context2 = textStatusLikeListFragment.getContext();
        mMActivity = context2 instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) context2 : null;
        if (mMActivity != null) {
            mMActivity.enableOptionMenu(true);
        }
    }
}
