package hr3;

/* loaded from: classes9.dex */
public class a6 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hr3.t6 f283377d;

    public a6(hr3.t6 t6Var) {
        this.f283377d = t6Var;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        hr3.t6 t6Var = this.f283377d;
        if (itemId == 1) {
            java.lang.String d17 = t6Var.f284004f.d1();
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Select_Talker_Name", t6Var.f284004f.d1());
            intent.putExtra("Select_block_List", d17);
            intent.putExtra("Select_Send_Card", true);
            intent.putExtra("Select_Conv_Type", 3);
            intent.putExtra("mutil_select_is_ret", true);
            ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.getClass();
            com.tencent.mm.ui.MMActivity mMActivity = t6Var.f284002d;
            intent.setClass(mMActivity, com.tencent.mm.ui.transmit.SelectConversationUI.class);
            mMActivity.startActivityForResult(intent, 1);
            return;
        }
        if (itemId == 2) {
            t6Var.f284002d.getString(com.tencent.mm.R.string.fc7, t6Var.f284004f.g2());
            com.tencent.mm.ui.MMActivity mMActivity2 = t6Var.f284002d;
            db5.e1.A(mMActivity2, mMActivity2.getString(com.tencent.mm.R.string.bbw), "", mMActivity2.getString(com.tencent.mm.R.string.bbv), mMActivity2.getString(com.tencent.mm.R.string.f490347sg), new hr3.z5(this), null);
            return;
        }
        if (itemId == 3) {
            t6Var.g();
            return;
        }
        if (itemId != 4) {
            if (itemId != 5) {
                return;
            }
            t6Var.f284004f.getClass();
            xp1.c.j(t6Var.f284002d, t6Var.f284004f.d1());
            com.tencent.mm.sdk.platformtools.u3.i(new hr3.g6(t6Var), 1000L);
            return;
        }
        t6Var.getClass();
        qk.n6 n6Var = (qk.n6) i95.n0.c(qk.n6.class);
        qk.o oVar = t6Var.f284005g;
        com.tencent.mm.ui.MMActivity mMActivity3 = t6Var.f284002d;
        com.tencent.mm.storage.z3 z3Var = t6Var.f284004f;
        hr3.b6 b6Var = new hr3.b6(t6Var);
        ((com.tencent.mm.app.o7) n6Var).getClass();
        com.tencent.mm.ui.tools.n1.b(oVar, mMActivity3, z3Var, true, b6Var, 0);
    }
}
