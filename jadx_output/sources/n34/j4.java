package n34;

/* loaded from: classes4.dex */
public final class j4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.SnsStarListUIC f334647d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j4(com.tencent.mm.plugin.sns.SnsStarListUIC snsStarListUIC) {
        super(0);
        this.f334647d = snsStarListUIC;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.SnsStarListUIC$snsSlotLv$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.SnsStarListUIC$snsSlotLv$2");
        android.widget.ListView listView = (android.widget.ListView) this.f334647d.findViewById(com.tencent.mm.R.id.f487047nb1);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.SnsStarListUIC$snsSlotLv$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.SnsStarListUIC$snsSlotLv$2");
        return listView;
    }
}
