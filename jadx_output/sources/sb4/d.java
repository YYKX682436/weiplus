package sb4;

/* loaded from: classes11.dex */
public class d extends com.tencent.mm.ui.contact.f5 {

    /* renamed from: n, reason: collision with root package name */
    public android.view.View.OnClickListener f405453n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f405454o;

    public d(com.tencent.mm.ui.contact.MMBaseSelectContactUI mMBaseSelectContactUI, java.util.List list, boolean z17) {
        super(mMBaseSelectContactUI, list, z17, 0);
        this.f405453n = null;
        this.f405454o = true;
    }

    @Override // com.tencent.mm.ui.contact.f5, rd0.z0
    public com.tencent.mm.ui.contact.item.d d(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createChatroomDataItem", "com.tencent.mm.plugin.sns.ui.adapter.SnsChatRoomSearchAdapter");
        rd0.a1 a1Var = this.f206704m;
        qd0.n0 n0Var = (qd0.n0) a1Var;
        int i18 = (i17 - n0Var.f361555f) - 1;
        tb4.d dVar = new tb4.d(i17);
        dVar.f206848q = n0Var.f361563n;
        dVar.E = this.f405453n;
        p13.y yVar = (p13.y) ((qd0.n0) ((rd0.c1) a1Var)).f361560k.get(i18);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setMatchInfo", "com.tencent.mm.plugin.sns.ui.adapter.data.SnsSelectChatRoomDataItem");
        dVar.F = yVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setMatchInfo", "com.tencent.mm.plugin.sns.ui.adapter.data.SnsSelectChatRoomDataItem");
        dVar.f206836e = this.f207078f;
        boolean z17 = this.f405454o;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setShowMoreBtn", "com.tencent.mm.plugin.sns.ui.adapter.data.SnsSelectChatRoomDataItem");
        dVar.G = z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setShowMoreBtn", "com.tencent.mm.plugin.sns.ui.adapter.data.SnsSelectChatRoomDataItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createChatroomDataItem", "com.tencent.mm.plugin.sns.ui.adapter.SnsChatRoomSearchAdapter");
        return dVar;
    }
}
