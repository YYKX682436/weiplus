package wo1;

/* loaded from: classes5.dex */
public final class p implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wo1.b1 f448004d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wo1.v f448005e;

    public p(wo1.b1 b1Var, wo1.v vVar) {
        this.f448004d = b1Var;
        this.f448005e = vVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/roambackup/ui/component/BaseContactAdapter$onCreateViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int adapterPosition = this.f448004d.getAdapterPosition();
        if (adapterPosition != -1) {
            wo1.v vVar = this.f448005e;
            vVar.y(adapterPosition);
            vVar.notifyItemChanged(adapterPosition);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/ui/component/BaseContactAdapter$onCreateViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
