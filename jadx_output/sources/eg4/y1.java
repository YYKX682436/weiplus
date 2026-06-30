package eg4;

/* loaded from: classes4.dex */
public class y1 implements android.widget.AdapterView.OnItemLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rl5.r f252832d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.subapp.ui.friend.FMessageConversationUI f252833e;

    public y1(com.tencent.mm.plugin.subapp.ui.friend.FMessageConversationUI fMessageConversationUI, rl5.r rVar) {
        this.f252833e = fMessageConversationUI;
        this.f252832d = rVar;
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public boolean onItemLongClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        com.tencent.mm.plugin.subapp.ui.friend.FMessageConversationUI fMessageConversationUI = this.f252833e;
        if (i17 < fMessageConversationUI.f172173d.getHeaderViewsCount()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FMessageConversationUI", "on header view long click, ignore");
            return true;
        }
        int headerViewsCount = i17 - fMessageConversationUI.f172173d.getHeaderViewsCount();
        rl5.r rVar = this.f252832d;
        com.tencent.mm.plugin.subapp.ui.friend.FMessageConversationUI fMessageConversationUI2 = this.f252833e;
        rVar.g(view, headerViewsCount, j17, fMessageConversationUI2, fMessageConversationUI2.f172181o, fMessageConversationUI2.f172177h, fMessageConversationUI2.f172178i);
        return true;
    }
}
