package df2;

/* loaded from: classes10.dex */
public final class ks extends com.tencent.mm.view.recyclerview.WxRecyclerAdapter {
    public final /* synthetic */ df2.lt I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ks(df2.lt ltVar, com.tencent.mm.plugin.finder.live.controller.LivePromoteBannerController$initView$5 livePromoteBannerController$initView$5, java.util.ArrayList arrayList) {
        super(livePromoteBannerController$initView$5, arrayList, false);
        this.I = ltVar;
    }

    @Override // com.tencent.mm.view.recyclerview.WxRecyclerAdapter, in5.n0
    /* renamed from: p0 */
    public void I(in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(holder, "holder");
        df2.lt ltVar = this.I;
        if (ltVar.f230717y.size() > 0) {
            i17 %= ltVar.f230717y.size();
        }
        super.I(holder, i17);
    }

    @Override // com.tencent.mm.view.recyclerview.WxRecyclerAdapter, in5.n0
    /* renamed from: q0 */
    public void J(in5.s0 holder, int i17, java.util.List payloads) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(payloads, "payloads");
        df2.lt ltVar = this.I;
        if (ltVar.f230717y.size() > 0) {
            i17 %= ltVar.f230717y.size();
        }
        super.J(holder, i17, payloads);
    }

    @Override // com.tencent.mm.view.recyclerview.WxRecyclerAdapter, in5.n0
    public int x() {
        if (this.I.f230717y.size() > 0) {
            return Integer.MAX_VALUE;
        }
        return super.x();
    }

    @Override // com.tencent.mm.view.recyclerview.WxRecyclerAdapter, in5.n0
    public long y(int i17) {
        return 0L;
    }

    @Override // com.tencent.mm.view.recyclerview.WxRecyclerAdapter, in5.n0
    public int z(int i17) {
        return 1;
    }
}
