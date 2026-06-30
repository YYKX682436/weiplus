package ei4;

/* loaded from: classes10.dex */
public final class e implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wn.j f253209d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ei4.h f253210e;

    public e(wn.j jVar, ei4.h hVar) {
        this.f253209d = jVar;
        this.f253210e = hVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/conversation/adapter/TextStatusConversationAdapter$onCreateViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        wn.j jVar = this.f253209d;
        hi4.a aVar = (hi4.a) jVar.f293125i;
        yz5.q qVar = this.f253210e.f253217g;
        if (qVar != null) {
            kotlin.jvm.internal.o.d(view);
            java.lang.Integer valueOf = java.lang.Integer.valueOf(jVar.getAdapterPosition());
            kotlin.jvm.internal.o.d(aVar);
            qVar.invoke(view, valueOf, aVar);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/textstatus/conversation/adapter/TextStatusConversationAdapter$onCreateViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
