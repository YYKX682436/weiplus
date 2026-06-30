package zd5;

/* loaded from: classes9.dex */
public final class l implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zd5.n f471697d;

    public l(zd5.n nVar) {
        this.f471697d = nVar;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/search/multi/adapter/FTSMultiNormalResultAdapter$onCreateViewHolder$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        java.lang.Object tag = view.getTag();
        kotlin.jvm.internal.o.e(tag, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((java.lang.Integer) tag).intValue();
        zd5.n nVar = this.f471697d;
        nVar.f471701f.a6(view, intValue, nVar.f471700e.getItem(intValue));
        yj0.a.i(true, this, "com/tencent/mm/ui/chatting/search/multi/adapter/FTSMultiNormalResultAdapter$onCreateViewHolder$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
