package com.tencent.mm.plugin.finder.view;

/* loaded from: classes.dex */
public final class io implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f132398d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f132399e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f132400f;

    public io(java.lang.String str, android.content.Context context, java.lang.String str2) {
        this.f132398d = str;
        this.f132399e = context;
        this.f132400f = str2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/FinderWxProfileApi$updateWxProfileFinderEntry$1$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.String str = this.f132398d;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            ((c61.l7) i95.n0.c(c61.l7.class)).getClass();
            vd2.t3.f435921a.a(this.f132399e, str, this.f132400f, 98);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/FinderWxProfileApi$updateWxProfileFinderEntry$1$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
