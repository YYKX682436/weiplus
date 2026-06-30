package ei4;

/* loaded from: classes9.dex */
public final class p implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wn.j f253234d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ei4.s f253235e;

    public p(wn.j jVar, ei4.s sVar) {
        this.f253234d = jVar;
        this.f253235e = sVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/conversation/adapter/TextStatusGreetingAdapter$onCreateViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        wn.j jVar = this.f253234d;
        hi4.e eVar = (hi4.e) jVar.f293125i;
        yz5.q qVar = this.f253235e.f253240f;
        if (qVar != null) {
            kotlin.jvm.internal.o.d(view);
            java.lang.Integer valueOf = java.lang.Integer.valueOf(jVar.getAdapterPosition());
            kotlin.jvm.internal.o.d(eVar);
            qVar.invoke(view, valueOf, eVar);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/textstatus/conversation/adapter/TextStatusGreetingAdapter$onCreateViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
