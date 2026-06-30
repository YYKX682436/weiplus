package e23;

/* loaded from: classes12.dex */
public class y1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f247002d;

    public y1(e23.a2 a2Var, android.content.Context context) {
        this.f247002d = context;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fts/ui/item/FTSWXPayRelatedFuncDataItem$FTSWXPayServiceNotifyContentViewItem$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSWXPayRelatedFuncDataItem", "on click more result cell");
        android.content.Context context = this.f247002d;
        if (context instanceof com.tencent.mm.plugin.fts.ui.FTSWXPayNotifyUI) {
            com.tencent.mm.plugin.fts.ui.r3 r3Var = ((com.tencent.mm.plugin.fts.ui.FTSWXPayNotifyUI) context).f138005u;
            r3Var.n(r3Var.f138171v + 1);
            r3Var.f138171v = 0;
            r3Var.f138170u = false;
            r3Var.c();
            r3Var.notifyDataSetChanged();
            r3Var.l(r3Var.getCount(), true);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/fts/ui/item/FTSWXPayRelatedFuncDataItem$FTSWXPayServiceNotifyContentViewItem$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
