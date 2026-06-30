package zk3;

/* loaded from: classes8.dex */
public final class m extends com.tencent.mm.view.recyclerview.WxRecyclerAdapter {
    public final /* synthetic */ zk3.g0 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(zk3.g0 g0Var, in5.s sVar, java.util.ArrayList arrayList) {
        super(sVar, arrayList, true);
        this.I = g0Var;
    }

    @Override // com.tencent.mm.view.recyclerview.WxRecyclerAdapter, androidx.recyclerview.widget.f2
    /* renamed from: B0 */
    public void onViewAttachedToWindow(in5.s0 holder) {
        android.view.View findViewById;
        androidx.recyclerview.widget.f2 adapter;
        kotlin.jvm.internal.o.g(holder, "holder");
        super.onViewAttachedToWindow(holder);
        this.I.getClass();
        androidx.recyclerview.widget.RecyclerView o17 = holder.o();
        if (((o17 == null || (adapter = o17.getAdapter()) == null) ? 0 : adapter.getItemCount()) >= 2 && (findViewById = holder.itemView.findViewById(com.tencent.mm.R.id.hhd)) != null && findViewById.getLayoutParams().width != com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC.K) {
            findViewById.getLayoutParams().height = com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC.L;
            findViewById.getLayoutParams().width = com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC.K;
            com.tencent.mm.ui.widget.RoundedCornerFrameLayout roundedCornerFrameLayout = (com.tencent.mm.ui.widget.RoundedCornerFrameLayout) holder.itemView.findViewById(com.tencent.mm.R.id.jvd);
            if (roundedCornerFrameLayout != null) {
                roundedCornerFrameLayout.getLayoutParams().height = com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC.Q;
            }
            findViewById.requestLayout();
        }
        holder.getLayoutPosition();
    }
}
