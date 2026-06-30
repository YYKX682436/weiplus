package dg5;

/* loaded from: classes11.dex */
public class g implements android.view.View.OnCreateContextMenuListener {

    /* renamed from: d, reason: collision with root package name */
    public db5.t4 f232362d;

    /* renamed from: e, reason: collision with root package name */
    public rl5.r f232363e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f232364f = false;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f232365g;

    /* renamed from: h, reason: collision with root package name */
    public s01.b f232366h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f232367i;

    /* renamed from: m, reason: collision with root package name */
    public long f232368m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ dg5.i f232369n;

    public g(dg5.i iVar, dg5.a aVar) {
        this.f232369n = iVar;
    }

    public static void a(dg5.g gVar, boolean z17, int i17) {
        gVar.getClass();
        s01.h z07 = r01.q3.Ui().z0(gVar.f232368m);
        if (s01.r.o(z07.field_bizChatServId)) {
            if (z17) {
                z07.field_bitFlag |= i17;
            } else {
                z07.field_bitFlag &= ~i17;
            }
            com.tencent.mars.xlog.Log.i("BizChatConversationPresenter", "dealSetMute:bitFlag %s", java.lang.Integer.valueOf(z07.field_bitFlag));
            r01.q3.Ui().P0(z07);
        } else {
            s01.a0 y07 = r01.q3.Vi().y0(z07.field_bizChatServId);
            if (y07 == null) {
                return;
            }
            if (z17) {
                y07.field_bitFlag |= i17;
            } else {
                y07.field_bitFlag &= ~i17;
            }
            r01.q3.Vi().J0(y07);
            z07.field_bitFlag = y07.field_bitFlag;
            r01.q3.Ui().P0(z07);
        }
        r45.pj pjVar = new r45.pj();
        pjVar.f383085d = z07.field_bizChatServId;
        pjVar.f383090i = z07.field_bitFlag;
        r01.q3.Ni().n(z07.field_brandUserName, pjVar, new dg5.b(gVar));
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        android.widget.AdapterView.AdapterContextMenuInfo adapterContextMenuInfo = (android.widget.AdapterView.AdapterContextMenuInfo) contextMenuInfo;
        if (this.f232366h.field_unReadCount <= 0) {
            contextMenu.add(adapterContextMenuInfo.position, 1, 1, com.tencent.mm.R.string.gqe);
        } else {
            contextMenu.add(adapterContextMenuInfo.position, 2, 1, com.tencent.mm.R.string.gqc);
        }
        if (r01.q3.aj().f1(this.f232366h)) {
            contextMenu.add(adapterContextMenuInfo.position, 3, 2, com.tencent.mm.R.string.gqf);
        } else {
            contextMenu.add(adapterContextMenuInfo.position, 3, 2, com.tencent.mm.R.string.gqd);
        }
        contextMenu.add(adapterContextMenuInfo.position, 0, 3, com.tencent.mm.R.string.gqi);
    }
}
