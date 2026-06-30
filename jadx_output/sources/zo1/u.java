package zo1;

/* loaded from: classes5.dex */
public final class u implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wo1.b1 f474778d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zo1.w f474779e;

    public u(wo1.b1 b1Var, zo1.w wVar) {
        this.f474778d = b1Var;
        this.f474779e = wVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/roambackup/ui/pkg/CheckPackageContentUI$ConversationAdapter$onCreateViewHolder$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int adapterPosition = this.f474778d.getAdapterPosition();
        if (adapterPosition != -1) {
            zo1.w wVar = this.f474779e;
            zo1.s sVar = (zo1.s) wVar.f474805e.get(adapterPosition);
            boolean z17 = !sVar.f474762c;
            sVar.f474762c = z17;
            wVar.f474806f += z17 ? 1 : -1;
            wVar.notifyItemChanged(adapterPosition);
            yz5.a aVar = wVar.f474807g;
            if (aVar != null) {
                aVar.invoke();
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/ui/pkg/CheckPackageContentUI$ConversationAdapter$onCreateViewHolder$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
