package nx0;

/* loaded from: classes5.dex */
public final class l2 extends nx0.p3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.shoot_composing.beautify.FilterView f341158d;

    public l2(com.tencent.mm.mj_publisher.finder.shoot_composing.beautify.FilterView filterView) {
        this.f341158d = filterView;
    }

    @Override // nx0.p3, android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(android.widget.SeekBar seekBar, int i17, boolean z17) {
        com.tencent.mm.mj_publisher.finder.shoot_composing.beautify.FilterView filterView;
        nx0.i2 i2Var;
        if (!z17 || (i2Var = (filterView = this.f341158d).f69602g) == null) {
            return;
        }
        i2Var.f341136e = i17 / 100.0f;
        kotlinx.coroutines.i2 i2Var2 = kotlinx.coroutines.i2.f310477d;
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.l.d(i2Var2, kotlinx.coroutines.internal.b0.f310484a, null, new nx0.k2(filterView, i2Var, null), 2, null);
    }
}
