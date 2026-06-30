package sr2;

/* loaded from: classes10.dex */
public final class p4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.post.PostMainUIC f411673d;

    public p4(com.tencent.mm.plugin.finder.post.PostMainUIC postMainUIC) {
        this.f411673d = postMainUIC;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.post.PostMainUIC postMainUIC = this.f411673d;
        java.lang.Object tag = com.tencent.mm.plugin.finder.post.PostMainUIC.S6(postMainUIC).getTag(com.tencent.mm.R.id.f484914tt4);
        if (tag != null) {
            android.view.View S6 = com.tencent.mm.plugin.finder.post.PostMainUIC.S6(postMainUIC);
            int intValue = ((java.lang.Integer) tag).intValue();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(intValue));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(S6, arrayList.toArray(), "com/tencent/mm/plugin/finder/post/PostMainUIC$onKeyboardHeightChanged$1$2", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            S6.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(S6, "com/tencent/mm/plugin/finder/post/PostMainUIC$onKeyboardHeightChanged$1$2", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        java.lang.Object tag2 = com.tencent.mm.plugin.finder.post.PostMainUIC.Q6(postMainUIC).getTag(com.tencent.mm.R.id.qyi);
        if (tag2 != null) {
            android.view.View Q6 = com.tencent.mm.plugin.finder.post.PostMainUIC.Q6(postMainUIC);
            int intValue2 = ((java.lang.Integer) tag2).intValue();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(java.lang.Integer.valueOf(intValue2));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(Q6, arrayList2.toArray(), "com/tencent/mm/plugin/finder/post/PostMainUIC$onKeyboardHeightChanged$1$2", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            Q6.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(Q6, "com/tencent/mm/plugin/finder/post/PostMainUIC$onKeyboardHeightChanged$1$2", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        java.lang.Object tag3 = com.tencent.mm.plugin.finder.post.PostMainUIC.R6(postMainUIC).getTag(com.tencent.mm.R.id.f486368l12);
        if (tag3 != null) {
            android.view.View R6 = com.tencent.mm.plugin.finder.post.PostMainUIC.R6(postMainUIC);
            int intValue3 = ((java.lang.Integer) tag3).intValue();
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList3.add(java.lang.Integer.valueOf(intValue3));
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(R6, arrayList3.toArray(), "com/tencent/mm/plugin/finder/post/PostMainUIC$onKeyboardHeightChanged$1$2", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            R6.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(R6, "com/tencent/mm/plugin/finder/post/PostMainUIC$onKeyboardHeightChanged$1$2", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view = postMainUIC.f122516h;
        if (view == null) {
            kotlin.jvm.internal.o.o("bottomSpace");
            throw null;
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
        arrayList4.add(8);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view, arrayList4.toArray(), "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int intValue4 = ((java.lang.Integer) arrayList4.get(0)).intValue();
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        arrayList5.add(java.lang.Integer.valueOf(intValue4));
        java.util.Collections.reverse(arrayList5);
        yj0.a.d(view, arrayList5.toArray(), "com/tencent/mm/plugin/finder/post/PostMainUIC$onKeyboardHeightChanged$1$2", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/post/PostMainUIC$onKeyboardHeightChanged$1$2", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        yj0.a.f(view, "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
