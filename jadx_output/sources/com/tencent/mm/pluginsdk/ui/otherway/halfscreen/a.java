package com.tencent.mm.pluginsdk.ui.otherway.halfscreen;

/* loaded from: classes3.dex */
public final class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f190946d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.otherway.halfscreen.c f190947e;

    public a(java.util.List list, com.tencent.mm.pluginsdk.ui.otherway.halfscreen.c cVar) {
        this.f190946d = list;
        this.f190947e = cVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/otherway/halfscreen/MultiShareHeaderUIC$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.util.List list = this.f190946d;
        if (list != null) {
            i95.m c17 = i95.n0.c(jt.x.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            jt.x.X5((jt.x) c17, this.f190947e.getContext(), list, 7, null, false, 24, null);
        }
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/otherway/halfscreen/MultiShareHeaderUIC$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
