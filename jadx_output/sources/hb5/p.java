package hb5;

/* loaded from: classes11.dex */
public class p implements android.widget.AdapterView.OnItemLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.s6 f280248d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.bizchat.BizChatFavUI f280249e;

    public p(com.tencent.mm.ui.bizchat.BizChatFavUI bizChatFavUI, com.tencent.mm.ui.tools.s6 s6Var) {
        this.f280249e = bizChatFavUI;
        this.f280248d = s6Var;
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public boolean onItemLongClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        if (i17 < this.f280249e.f197916e.getHeaderViewsCount()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.BizChatFavUI", "on header view long click, ignore");
            return true;
        }
        com.tencent.mm.ui.tools.s6 s6Var = this.f280248d;
        com.tencent.mm.ui.bizchat.BizChatFavUI bizChatFavUI = this.f280249e;
        s6Var.b(view, i17, j17, bizChatFavUI, bizChatFavUI.f197918g);
        return true;
    }
}
