package sc2;

/* loaded from: classes2.dex */
public final class i8 extends com.tencent.mm.view.recyclerview.WxRecyclerAdapter {
    public final /* synthetic */ java.util.ArrayList I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i8(java.util.ArrayList arrayList, com.tencent.mm.plugin.finder.feed.component.FinderJumperCarouselCardObserver$onBindView$1$2 finderJumperCarouselCardObserver$onBindView$1$2) {
        super(finderJumperCarouselCardObserver$onBindView$1$2, arrayList, false);
        this.I = arrayList;
    }

    @Override // com.tencent.mm.view.recyclerview.WxRecyclerAdapter, in5.n0
    /* renamed from: p0 */
    public void I(in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(holder, "holder");
        super.I(holder, i17 % this.I.size());
    }

    @Override // com.tencent.mm.view.recyclerview.WxRecyclerAdapter, in5.n0
    /* renamed from: q0 */
    public void J(in5.s0 holder, int i17, java.util.List payloads) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(payloads, "payloads");
        super.J(holder, i17 % this.I.size(), payloads);
    }

    @Override // com.tencent.mm.view.recyclerview.WxRecyclerAdapter, in5.n0
    public int x() {
        return 214748;
    }

    @Override // com.tencent.mm.view.recyclerview.WxRecyclerAdapter, in5.n0
    public long y(int i17) {
        java.util.ArrayList arrayList = this.I;
        return ((sc2.v8) arrayList.get(i17 % arrayList.size())).hashCode();
    }

    @Override // com.tencent.mm.view.recyclerview.WxRecyclerAdapter, in5.n0
    public int z(int i17) {
        java.util.ArrayList arrayList = this.I;
        return ((sc2.v8) arrayList.get(i17 % arrayList.size())).h();
    }
}
