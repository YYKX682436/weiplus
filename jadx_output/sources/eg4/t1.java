package eg4;

/* loaded from: classes11.dex */
public class t1 extends com.tencent.mm.ui.z9 {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f252810t = 0;

    /* renamed from: o, reason: collision with root package name */
    public final android.content.Context f252811o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.HashMap f252812p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.HashMap f252813q;

    /* renamed from: r, reason: collision with root package name */
    public final android.view.View.OnClickListener f252814r;

    /* renamed from: s, reason: collision with root package name */
    public final android.view.View.OnClickListener f252815s;

    public t1(android.content.Context context) {
        super(context, new com.tencent.mm.storage.m7());
        this.f252812p = new java.util.HashMap();
        this.f252813q = new java.util.HashMap();
        this.f252814r = new eg4.l1(this);
        this.f252815s = new eg4.p1(this);
        this.f252811o = context;
    }

    public static void t(eg4.t1 t1Var, y35.r rVar) {
        t1Var.getClass();
        com.tencent.mm.storage.z3 f17 = y35.r.f(r21.w.Ai().b1(rVar.f459232a));
        r35.a aVar = new r35.a(t1Var.f252811o, new eg4.o1(t1Var, rVar, f17));
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add(java.lang.Integer.valueOf(rVar.f459234c));
        aVar.m(f17.F1);
        aVar.b(rVar.f459232a, linkedList, true, "");
    }

    public static void u(eg4.t1 t1Var, y35.r rVar) {
        java.lang.String str;
        t1Var.getClass();
        com.tencent.mm.storage.p7 b17 = r21.w.Ai().b1(rVar.f459232a);
        if (b17 == null || (str = b17.field_msgContent) == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FMessageConversationUI", "lastRecvFmsg is null, verify fail, talker = " + rVar.f459232a);
            return;
        }
        com.tencent.mm.storage.e9 f17 = com.tencent.mm.storage.e9.f(str);
        int i17 = f17.C;
        android.content.Context context = t1Var.f252811o;
        if (i17 == 1) {
            db5.e1.C(context, f17.D, null, context.getString(com.tencent.mm.R.string.fbi), context.getString(com.tencent.mm.R.string.f490347sg), true, new eg4.n1(t1Var, b17), null);
            return;
        }
        com.tencent.mm.storage.ya z07 = ((com.tencent.mm.storage.ab) c01.d9.b().B()).z0(rVar.f459232a);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Contact_User", rVar.f459232a);
        intent.putExtra("Contact_Nick", rVar.f459235d);
        if (z07 != null) {
            intent.putExtra("Contact_RemarkName", z07.field_conRemark);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(f17.f193884z)) {
            com.tencent.mm.storage.a3 z08 = ((com.tencent.mm.storage.b3) c01.d9.b().l()).z0(f17.f193884z);
            if (z08 != null) {
                intent.putExtra("Contact_RoomNickname", z08.z0(f17.f193859a));
                intent.putExtra("room_name", f17.f193884z);
            }
        }
        intent.putExtra("Contact_Scene", f17.f193866h);
        intent.putExtra("Verify_ticket", f17.f193878t);
        intent.putExtra("sayhi_with_sns_perm_send_verify", false);
        intent.putExtra("sayhi_with_sns_perm_add_remark", true);
        intent.putExtra("sayhi_with_sns_perm_set_label", true);
        intent.putExtra("sayhi_with_jump_to_profile", true);
        intent.putExtra("CONTACT_INFO_UI_SOURCE", 7);
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_set_default_chatonly, 2);
        java.lang.String str2 = (com.tencent.mm.storage.z3.m4(rVar.f459232a) || Ni != 1) ? (com.tencent.mm.storage.z3.m4(rVar.f459232a) || Ni != 2 || c01.e2.k() < ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_add_friends_without_choose_permission_threshold, 5000)) ? ".ui.SayHiWithSnsPermissionUI" : ".ui.SayHiWithSnsPermissionUI3" : ".ui.SayHiWithSnsPermissionUI2";
        if ((com.tencent.mm.storage.z3.m4(rVar.f459232a) || com.tencent.mm.storage.z3.n4(rVar.f459232a)) && !com.tencent.mm.sdk.platformtools.f9.ContactNewFriendWeWeCom.k(context, null)) {
            return;
        }
        j45.l.j(context, com.google.android.gms.common.Scopes.PROFILE, str2, intent, null);
    }

    @Override // com.tencent.mm.ui.z9
    public java.lang.Object d(java.lang.Object obj, android.database.Cursor cursor) {
        com.tencent.mm.storage.m7 m7Var = (com.tencent.mm.storage.m7) obj;
        if (m7Var == null) {
            m7Var = new com.tencent.mm.storage.m7();
        }
        m7Var.convertFrom(cursor);
        return m7Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x055a  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x04ff  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x04be  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x04a2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x04fd  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0518 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0549  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0558  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0563  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x056d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x056f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0565  */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View getView(int r21, android.view.View r22, android.view.ViewGroup r23) {
        /*
            Method dump skipped, instructions count: 1414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: eg4.t1.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    @Override // com.tencent.mm.ui.z9
    public void o() {
        c();
        q();
    }

    @Override // com.tencent.mm.ui.z9
    public void q() {
        if (android.os.Looper.myLooper() != android.os.Looper.getMainLooper()) {
            com.tencent.mm.sdk.platformtools.u3.h(new eg4.k1(this));
        } else {
            s(r21.w.wi().getAll());
            notifyDataSetChanged();
        }
    }
}
