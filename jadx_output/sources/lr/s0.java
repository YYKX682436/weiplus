package lr;

/* loaded from: classes13.dex */
public class s0 extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final lr.k0 f320580d;

    /* renamed from: e, reason: collision with root package name */
    public ir.u0 f320581e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(android.view.View itemView, lr.k0 k0Var) {
        super(itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        this.f320580d = k0Var;
        itemView.setOnClickListener(new lr.q0(this));
        itemView.setOnLongClickListener(new lr.r0(this));
    }

    public void i(ir.u0 item) {
        kotlin.jvm.internal.o.g(item, "item");
        this.f320581e = item;
        if (bm5.o1.f22719a.h(new com.tencent.mm.repairer.config.emoji.RepairerConfigPanelViewHasRedDot()) == 1) {
            ir.u0 u0Var = this.f320581e;
            if (u0Var instanceof ir.i0) {
                kotlin.jvm.internal.o.e(u0Var, "null cannot be cast to non-null type com.tencent.mm.emoji.model.panel.GroupTitleItem");
                ((ir.i0) u0Var).f293868d = true;
            }
        }
    }
}
