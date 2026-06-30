package dg5;

/* loaded from: classes11.dex */
public class j implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dg5.n f232374d;

    public j(dg5.n nVar) {
        this.f232374d = nVar;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        java.lang.String str;
        dg5.n nVar = this.f232374d;
        r01.m mVar = nVar.f232384h;
        java.lang.String str2 = nVar.f232383g;
        boolean z17 = false;
        boolean z18 = true;
        if (!(mVar != null && mVar.field_hide_create_chat) && nVar.a()) {
            z17 = true;
        }
        if (z17) {
            g4Var.b(1, com.tencent.mm.R.string.f490756ao0, com.tencent.mm.R.raw.actionbar_create_biz_chat_icon);
        }
        try {
            z18 = r01.q3.bj().y0(str2).field_hide_colleage_invite;
        } catch (java.lang.Throwable unused) {
        }
        if (!z18) {
            try {
                r01.m y07 = r01.q3.bj().y0(str2);
                r45.ik ikVar = new r45.ik();
                ikVar.parseFrom(y07.field_raw_attrs);
                str = ikVar.f377104f;
            } catch (java.lang.Throwable unused2) {
                str = "";
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                g4Var.b(2, com.tencent.mm.R.string.anz, com.tencent.mm.R.raw.ofm_add_icon);
            } else {
                g4Var.g(2, str, com.tencent.mm.R.raw.ofm_add_icon);
            }
        }
        com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity = nVar.f232380d;
        if (z17) {
            g4Var.m(4, mMFragmentActivity.getResources().getString(com.tencent.mm.R.string.any), com.tencent.mm.ui.uk.e(mMFragmentActivity, com.tencent.mm.R.raw.actionbar_facefriend_icon, -1));
        }
        g4Var.m(3, mMFragmentActivity.getResources().getString(com.tencent.mm.R.string.f489818cm), com.tencent.mm.ui.uk.e(mMFragmentActivity, com.tencent.mm.R.raw.actionbar_setting_white_icon, -1));
    }
}
