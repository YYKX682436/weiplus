package dg5;

/* loaded from: classes9.dex */
public class t implements android.view.View.OnCreateContextMenuListener {

    /* renamed from: d, reason: collision with root package name */
    public rl5.r f232397d;

    /* renamed from: e, reason: collision with root package name */
    public db5.t4 f232398e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f232399f = "";

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ dg5.u f232400g;

    public t(dg5.u uVar) {
        this.f232400g = uVar;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.storage.k4) c01.d9.b().q()).n(this.f232399f, true);
        if (n17 == null) {
            com.tencent.mars.xlog.Log.e("EnterpriseConversationPresenter", "onCreateContextMenu, contact is null, talker = " + this.f232399f);
            return;
        }
        java.lang.String g27 = n17.g2();
        boolean endsWith = g27.toLowerCase().endsWith("@chatroom");
        dg5.u uVar = this.f232400g;
        if (endsWith && com.tencent.mm.sdk.platformtools.t8.K0(n17.P0())) {
            g27 = uVar.f232401d.getString(com.tencent.mm.R.string.b5v);
        }
        android.widget.AdapterView.AdapterContextMenuInfo adapterContextMenuInfo = (android.widget.AdapterView.AdapterContextMenuInfo) contextMenuInfo;
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        com.tencent.mm.ui.conversation.BaseConversationUI baseConversationUI = uVar.f232401d;
        ((ke0.e) xVar).getClass();
        contextMenu.setHeaderTitle(com.tencent.mm.pluginsdk.ui.span.c0.i(baseConversationUI, g27));
        if (n17.w2()) {
            contextMenu.add(adapterContextMenuInfo.position, 3, 0, com.tencent.mm.R.string.gqf);
        } else {
            contextMenu.add(adapterContextMenuInfo.position, 3, 0, com.tencent.mm.R.string.c1m);
        }
        contextMenu.add(adapterContextMenuInfo.position, 2, 1, com.tencent.mm.R.string.c1f);
        contextMenu.add(adapterContextMenuInfo.position, 1, 2, com.tencent.mm.R.string.gqi);
    }
}
