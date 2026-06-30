package ei4;

/* loaded from: classes10.dex */
public final class f implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wn.j f253211d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ei4.h f253212e;

    public f(wn.j jVar, ei4.h hVar) {
        this.f253211d = jVar;
        this.f253212e = hVar;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/conversation/adapter/TextStatusConversationAdapter$onCreateViewHolder$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        wn.j jVar = this.f253211d;
        hi4.a aVar = (hi4.a) jVar.f293125i;
        yz5.q qVar = this.f253212e.f253218h;
        if (qVar != null) {
            kotlin.jvm.internal.o.d(view);
            java.lang.Integer valueOf = java.lang.Integer.valueOf(jVar.getAdapterPosition());
            kotlin.jvm.internal.o.d(aVar);
            qVar.invoke(view, valueOf, aVar);
        }
        yj0.a.i(true, this, "com/tencent/mm/plugin/textstatus/conversation/adapter/TextStatusConversationAdapter$onCreateViewHolder$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
