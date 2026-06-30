package id2;

/* loaded from: classes.dex */
public final class y4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f290892d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ id2.f5 f290893e;

    public y4(android.view.View view, id2.f5 f5Var) {
        this.f290892d = view;
        this.f290893e = f5Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/ui/uic/FinderLiveRemindRestrictConsumeUIC$onViewCreated$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        c61.yb ybVar = (c61.yb) i95.n0.c(c61.yb.class);
        android.content.Context context = this.f290892d.getContext();
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
        android.app.Activity activity = (android.app.Activity) context;
        android.content.Intent intent = this.f290893e.getIntent();
        ((c61.p2) ybVar).getClass();
        ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).getClass();
        if (intent == null) {
            intent = new android.content.Intent();
        }
        intent.setClass(activity, (java.lang.Class) ((jz5.n) jz2.x0.f302777x).getValue());
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList2.add(0);
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.k(activity, arrayList2.toArray(), "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderLiveRemindConsumeWecoinUI", "(Landroid/app/Activity;Landroid/content/Intent;I)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/uic/FinderLiveRemindRestrictConsumeUIC$onViewCreated$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
