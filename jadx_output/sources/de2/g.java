package de2;

/* loaded from: classes3.dex */
public final class g implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.Button f229377d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f229378e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ de2.h f229379f;

    public g(android.widget.Button button, yz5.a aVar, de2.h hVar) {
        this.f229377d = button;
        this.f229378e = aVar;
        this.f229379f = hVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/box/FinderLiveBoxHintBottomSheet$btnTextView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.widget.Button button = this.f229377d;
        boolean b17 = kotlin.jvm.internal.o.b(button.getText(), button.getContext().getString(com.tencent.mm.R.string.f491540dg5));
        de2.h hVar = this.f229379f;
        if (b17) {
            ml2.t1 t1Var = ml2.t1.C1;
            com.tencent.mars.xlog.Log.i("FinderLiveBoxReportUtils", "boxClickReport elementId: group_chat_button");
            i95.m c17 = i95.n0.c(zy2.zb.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb.T8((zy2.zb) c17, t1Var, null, null, null, null, null, false, 126, null);
            this.f229378e.invoke();
            hVar.f229384e.f444836c.q();
        } else {
            hVar.f229384e.f444836c.q();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/box/FinderLiveBoxHintBottomSheet$btnTextView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
