package hb5;

/* loaded from: classes11.dex */
public class y implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.bizchat.BizChatFavUI f280267d;

    public y(com.tencent.mm.ui.bizchat.BizChatFavUI bizChatFavUI) {
        this.f280267d = bizChatFavUI;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() != 0) {
            return;
        }
        com.tencent.mm.ui.bizchat.BizChatFavUI bizChatFavUI = this.f280267d;
        long j17 = bizChatFavUI.f197920i;
        bizChatFavUI.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.BizChatFavUI", "deleteFromFav");
        s01.h z07 = r01.q3.Ui().z0(j17);
        int i18 = z07.field_bitFlag & (-9);
        z07.field_bitFlag = i18;
        com.tencent.mars.xlog.Log.i("MicroMsg.BizChatFavUI", "deleteFromFav:bitFlag %s", java.lang.Integer.valueOf(i18));
        r45.pj pjVar = new r45.pj();
        pjVar.f383085d = z07.field_bizChatServId;
        pjVar.f383090i = z07.field_bitFlag;
        bizChatFavUI.f197924p = db5.e1.Q(bizChatFavUI, "", "", true, false, new hb5.r(bizChatFavUI, r01.q3.Ni().n(z07.field_brandUserName, pjVar, bizChatFavUI)));
    }
}
