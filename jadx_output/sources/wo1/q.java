package wo1;

/* loaded from: classes5.dex */
public final class q implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wo1.b1 f448011d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wo1.v f448012e;

    public q(wo1.b1 b1Var, wo1.v vVar) {
        this.f448011d = b1Var;
        this.f448012e = vVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        wo1.v vVar;
        yz5.l onMoreIconClicked;
        java.util.List list;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/roambackup/ui/component/BaseContactAdapter$onCreateViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int adapterPosition = this.f448011d.getAdapterPosition();
        if (adapterPosition != -1 && (onMoreIconClicked = (vVar = this.f448012e).getOnMoreIconClicked()) != null) {
            list = vVar.convList;
            onMoreIconClicked.invoke(((wo1.n) list.get(adapterPosition)).f447992a);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/ui/component/BaseContactAdapter$onCreateViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
