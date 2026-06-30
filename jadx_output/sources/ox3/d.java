package ox3;

/* loaded from: classes10.dex */
public final class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ox3.e f349733d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ox3.a f349734e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ox3.c f349735f;

    public d(ox3.e eVar, ox3.a aVar, ox3.c cVar) {
        this.f349733d = eVar;
        this.f349734e = aVar;
        this.f349735f = cVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ringtone/data/ExclusiveConverter$initUserLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ox3.b bVar = this.f349733d.f349738e;
        if (bVar != null) {
            ox3.a ringback = this.f349734e;
            kotlin.jvm.internal.o.g(ringback, "ringback");
            ox3.c holder = this.f349735f;
            kotlin.jvm.internal.o.g(holder, "holder");
            androidx.recyclerview.widget.f2 f2Var = holder.f293122f;
            kotlin.jvm.internal.o.e(f2Var, "null cannot be cast to non-null type com.tencent.mm.view.recyclerview.WxRecyclerAdapter<com.tencent.mm.plugin.ringtone.data.ExclusiveConvertData>");
            ox3.a aVar = (ox3.a) ((com.tencent.mm.view.recyclerview.WxRecyclerAdapter) f2Var).getData().get(holder.getLayoutPosition());
            com.tencent.mm.plugin.ringtone.uic.v0 v0Var = ((com.tencent.mm.plugin.ringtone.uic.o0) bVar).f158452a;
            v0Var.getClass();
            java.lang.String str = aVar.f349721d.f415588d;
            if (str != null) {
                com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) v0Var.getContext(), 1, true);
                k0Var.f211872n = new com.tencent.mm.plugin.ringtone.uic.t0(v0Var);
                k0Var.f211881s = new com.tencent.mm.plugin.ringtone.uic.u0(str, v0Var, aVar);
                k0Var.t(false);
                k0Var.e(false);
                k0Var.v();
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/ringtone/data/ExclusiveConverter$initUserLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
