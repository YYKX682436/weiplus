package nx0;

/* loaded from: classes5.dex */
public final class u2 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.shoot_composing.beautify.FilterView f341238d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nx0.g2 f341239e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(com.tencent.mm.mj_publisher.finder.shoot_composing.beautify.FilterView filterView, nx0.g2 g2Var) {
        super(2);
        this.f341238d = filterView;
        this.f341239e = g2Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.mj_publisher.finder.shoot_composing.beautify.SeekBarWithValueView seekBar;
        com.tencent.mm.mj_publisher.finder.shoot_composing.beautify.SeekBarWithValueView seekBar2;
        com.tencent.mm.mj_publisher.finder.shoot_composing.beautify.SeekBarWithValueView seekBar3;
        int intValue = ((java.lang.Number) obj).intValue();
        nx0.i2 itemData = (nx0.i2) obj2;
        kotlin.jvm.internal.o.g(itemData, "itemData");
        com.tencent.mm.mj_publisher.finder.shoot_composing.beautify.FilterView filterView = this.f341238d;
        if (!kotlin.jvm.internal.o.b(itemData, filterView.f69602g)) {
            nx0.g2 g2Var = this.f341239e;
            int i17 = 0;
            for (java.lang.Object obj3 : g2Var.f341118d) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                nx0.i2 i2Var = (nx0.i2) obj3;
                if (i2Var.f341135d) {
                    i2Var.f341135d = false;
                    g2Var.notifyItemChanged(i17);
                }
                i17 = i18;
            }
            filterView.f69602g = itemData;
            if (itemData.a()) {
                seekBar3 = filterView.getSeekBar();
                seekBar3.setVisibility(4);
            } else {
                seekBar = filterView.getSeekBar();
                seekBar.setVisibility(0);
                itemData.f341136e = 0.6f;
                seekBar2 = filterView.getSeekBar();
                seekBar2.setProgress(a06.d.b(itemData.f341136e * 100));
            }
            kotlinx.coroutines.i2 i2Var2 = kotlinx.coroutines.i2.f310477d;
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.l.d(i2Var2, kotlinx.coroutines.internal.b0.f310484a, null, new nx0.v2(filterView, null), 2, null);
            ((nx0.i2) g2Var.f341118d.get(intValue)).f341135d = true;
            g2Var.notifyItemChanged(intValue);
        }
        return jz5.f0.f302826a;
    }
}
