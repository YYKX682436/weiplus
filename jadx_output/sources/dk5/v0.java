package dk5;

/* loaded from: classes11.dex */
public class v0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.transmit.MMCreateChatroomUI f234955d;

    public v0(com.tencent.mm.ui.transmit.MMCreateChatroomUI mMCreateChatroomUI) {
        this.f234955d = mMCreateChatroomUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        boolean z17;
        com.tencent.mm.ui.transmit.MMCreateChatroomUI mMCreateChatroomUI = this.f234955d;
        if (!mMCreateChatroomUI.I) {
            mMCreateChatroomUI.I = true;
            java.util.List t17 = mMCreateChatroomUI.F.t();
            java.util.Iterator it = ((java.util.ArrayList) t17).iterator();
            while (true) {
                if (!it.hasNext()) {
                    z17 = true;
                    break;
                }
                if (com.tencent.mm.storage.z3.m4((java.lang.String) it.next())) {
                    z17 = false;
                    break;
                }
            }
            if (z17) {
                mMCreateChatroomUI.w7(((fd0.e) ((gd0.e) i95.n0.c(gd0.e.class))).wi("@chatroom").l("", t17));
            } else {
                mMCreateChatroomUI.w7(((fd0.e) ((gd0.e) i95.n0.c(gd0.e.class))).wi("@im.chatroom").l("", t17));
            }
            if (mMCreateChatroomUI.E == 3) {
                mMCreateChatroomUI.H = true;
                java.util.Set set = com.tencent.mm.plugin.fts.ui.x2.f138375a;
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13970, 1);
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MMCreateChatroomUI", "Create the chatroom");
        return true;
    }
}
