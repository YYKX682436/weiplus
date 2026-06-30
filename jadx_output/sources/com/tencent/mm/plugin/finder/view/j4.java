package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class j4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f132413d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderColumnFrameLayout f132414e;

    public j4(android.widget.TextView textView, com.tencent.mm.plugin.finder.view.FinderColumnFrameLayout finderColumnFrameLayout) {
        this.f132413d = textView;
        this.f132414e = finderColumnFrameLayout;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/FinderColumnFrameLayout$bindColumn$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f132413d.getText().toString();
        qs2.e eVar = new qs2.e(1, 103, 28);
        i95.m c17 = i95.n0.c(w40.e.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        android.content.Context context = this.f132414e.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        w40.e.Df((w40.e) c17, context, eVar, null, 4, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/FinderColumnFrameLayout$bindColumn$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
