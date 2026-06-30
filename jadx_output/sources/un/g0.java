package un;

/* loaded from: classes.dex */
public final class g0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ un.k0 f429255d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(un.k0 k0Var) {
        super(1);
        this.f429255d = k0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        wi5.n0 state = (wi5.n0) obj;
        kotlin.jvm.internal.o.g(state, "state");
        wi5.p pVar = (wi5.p) state.a(wi5.p.class);
        un.k0 k0Var = this.f429255d;
        if (pVar != null) {
            com.tencent.mm.view.recyclerview.WxRecyclerView k17 = un.k0.V6(k0Var).k();
            kotlin.jvm.internal.o.f(k17, "getSelectContactRv(...)");
            com.tencent.mm.plugin.mvvmlist.MvvmList a17 = xm3.u0.a(k17);
            if (a17 instanceof com.tencent.mm.ui.mvvm.list.SelectContactMvvmList) {
                un.k0.V6(k0Var).l().setAlphabet(new java.lang.String[]{"🔍", "#"});
                ((com.tencent.mm.ui.mvvm.list.SelectContactMvvmList) a17).f152071u.observe(k0Var.getActivity(), new un.c0(k0Var, a17));
            }
        }
        j75.d dVar = state.f298066d;
        if (dVar != null && (dVar instanceof wi5.h0)) {
            em.l2 V6 = un.k0.V6(k0Var);
            if (V6.f254559p == null) {
                V6.f254559p = (android.widget.TextView) V6.f254544a.findViewById(com.tencent.mm.R.id.b5i);
            }
            V6.f254559p.setVisibility(0);
            em.l2 V62 = un.k0.V6(k0Var);
            if (V62.f254559p == null) {
                V62.f254559p = (android.widget.TextView) V62.f254544a.findViewById(com.tencent.mm.R.id.b5i);
            }
            V62.f254559p.setOnClickListener(new un.d0(k0Var));
            un.k0.V6(k0Var).b().setDefaultHint(k0Var.getString(com.tencent.mm.R.string.oft));
            com.tencent.mm.pluginsdk.ui.MultiSelectContactView b17 = un.k0.V6(k0Var).b();
            if (b17 != null) {
                b17.post(new un.f0(k0Var));
            }
        }
        j75.d dVar2 = state.f298066d;
        if (dVar2 != null && (dVar2 instanceof wi5.c0)) {
            java.lang.String str = (java.lang.String) kz5.n0.a0(((wi5.c0) dVar2).f446282b, 0);
            com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
            if (str != null && n17 != null) {
                java.lang.String l17 = c01.v1.l(str, un.k0.U6(k0Var));
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("Contact_User", str);
                intent.putExtra("Contact_RemarkName", n17.w0());
                intent.putExtra("Contact_RoomNickname", l17);
                intent.putExtra("Contact_Nick", n17.P0());
                intent.putExtra("Contact_RoomMember", true);
                intent.putExtra("room_name", un.k0.U6(k0Var));
                if (((int) n17.E2) > 0 && n17.r2()) {
                    com.tencent.mm.autogen.events.SetLocalQQMobileEvent setLocalQQMobileEvent = new com.tencent.mm.autogen.events.SetLocalQQMobileEvent();
                    am.au auVar = setLocalQQMobileEvent.f54766g;
                    auVar.f6187a = intent;
                    auVar.f6188b = str;
                    setLocalQQMobileEvent.e();
                }
                com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                g0Var.idkeyStat(219L, 9L, 1L, true);
                if (n17.k2()) {
                    g0Var.kvStat(10298, n17.d1() + ",14");
                }
                intent.putExtra("Contact_Scene", 14);
                com.tencent.mm.storage.a3 a3Var = k0Var.f429300h;
                if (a3Var != null) {
                    intent.putExtra("Is_RoomOwner", a3Var.L0(str));
                } else {
                    kotlin.jvm.internal.o.f(intent.putExtra("Is_RoomOwner", false), "run(...)");
                }
                intent.putExtra("Contact_ChatRoomId", un.k0.U6(k0Var));
                if (com.tencent.mm.storage.z3.q4(un.k0.U6(k0Var))) {
                    com.tencent.mm.autogen.mmdata.rpt.OpenIMChatRoomLogStruct openIMChatRoomLogStruct = new com.tencent.mm.autogen.mmdata.rpt.OpenIMChatRoomLogStruct();
                    openIMChatRoomLogStruct.p(un.k0.U6(k0Var));
                    openIMChatRoomLogStruct.f59786e = 12L;
                    openIMChatRoomLogStruct.k();
                }
                intent.putExtra("CONTACT_INFO_UI_SOURCE", 8);
                j45.l.j(k0Var.getActivity(), com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent, null);
            }
        }
        return jz5.f0.f302826a;
    }
}
