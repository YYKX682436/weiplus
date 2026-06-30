package zd5;

/* loaded from: classes9.dex */
public final class m implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zd5.n f471698d;

    public m(zd5.n nVar) {
        this.f471698d = nVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/search/multi/adapter/FTSMultiNormalResultAdapter$onCreateViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Object tag = view.getTag();
        kotlin.jvm.internal.o.e(tag, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((java.lang.Integer) tag).intValue();
        zd5.n nVar = this.f471698d;
        nVar.f471701f.W2(view, intValue, nVar.f471700e.getItem(intValue));
        yj0.a.h(this, "com/tencent/mm/ui/chatting/search/multi/adapter/FTSMultiNormalResultAdapter$onCreateViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
