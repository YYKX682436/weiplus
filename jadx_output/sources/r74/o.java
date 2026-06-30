package r74;

/* loaded from: classes4.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r74.a0 f393227d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(r74.a0 a0Var) {
        super(0);
        this.f393227d = a0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic$mListOfSubImages$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic$mListOfSubImages$2");
        android.view.ViewGroup[] viewGroupArr = new android.view.ViewGroup[3];
        r74.a0 a0Var = this.f393227d;
        android.view.ViewGroup j17 = a0Var.j();
        viewGroupArr[0] = j17 != null ? (android.view.ViewGroup) j17.findViewById(com.tencent.mm.R.id.n3q) : null;
        android.view.ViewGroup j18 = a0Var.j();
        viewGroupArr[1] = j18 != null ? (android.view.ViewGroup) j18.findViewById(com.tencent.mm.R.id.n3r) : null;
        android.view.ViewGroup j19 = a0Var.j();
        viewGroupArr[2] = j19 != null ? (android.view.ViewGroup) j19.findViewById(com.tencent.mm.R.id.n3s) : null;
        java.util.List i17 = kz5.c0.i(viewGroupArr);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic$mListOfSubImages$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic$mListOfSubImages$2");
        return i17;
    }
}
