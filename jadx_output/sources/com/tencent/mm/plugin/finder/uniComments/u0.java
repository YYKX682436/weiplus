package com.tencent.mm.plugin.finder.uniComments;

/* loaded from: classes.dex */
public final class u0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f130419d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f130420e;

    public u0(yz5.l lVar, int i17) {
        this.f130419d = lVar;
        this.f130420e = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/uniComments/TextStatusCommentFooter$initSelectItem$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f130419d.invoke(java.lang.Integer.valueOf(this.f130420e));
        yj0.a.h(this, "com/tencent/mm/plugin/finder/uniComments/TextStatusCommentFooter$initSelectItem$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
