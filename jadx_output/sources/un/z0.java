package un;

/* loaded from: classes11.dex */
public final class z0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ un.g1 f429344d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(un.g1 g1Var) {
        super(1);
        this.f429344d = g1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        wi5.n0 state = (wi5.n0) obj;
        kotlin.jvm.internal.o.g(state, "state");
        j75.d dVar = state.f298066d;
        un.g1 g1Var = this.f429344d;
        if (dVar != null && (dVar instanceof wi5.h0)) {
            g1Var.X6();
            g1Var.V6().n().setOnClickListener(new un.v0(g1Var));
            g1Var.V6().s().setOnClickListener(new un.w0(g1Var));
            a14.a.f581n = new a14.a();
            a14.a a17 = a14.a.a();
            java.lang.String T6 = g1Var.T6();
            com.tencent.mm.autogen.mmdata.rpt.ShareRoomHistoryStatStruct shareRoomHistoryStatStruct = a17.f582a;
            shareRoomHistoryStatStruct.f60357d = shareRoomHistoryStatStruct.b("RoomId", T6, true);
            shareRoomHistoryStatStruct.f60379z = c01.e2.E(T6) ? 1 : 0;
            if (!com.tencent.mm.storage.z3.N4(g1Var.T6()) || c01.e2.E(g1Var.T6()) || ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().D2(g1Var.T6()) <= 0) {
                g1Var.V6().n().setVisibility(8);
                a14.a.a().f582a.f60358e = 0;
            } else {
                g1Var.V6().n().setVisibility(0);
                a14.a.a().f582a.f60358e = 1;
            }
            ((com.tencent.mm.chatroom.ui.uic.SelectWxChatRoomAddMemberUIC$recordMsgNetSceneEventIListener$2$1) ((jz5.n) g1Var.f429269t).getValue()).alive();
        }
        j75.d dVar2 = state.f298066d;
        if (dVar2 != null && (dVar2 instanceof wi5.c)) {
            a14.a a18 = a14.a.a();
            java.util.ArrayList arrayList = new java.util.ArrayList(state.f446319o);
            a18.getClass();
            long size = arrayList.size();
            com.tencent.mm.autogen.mmdata.rpt.ShareRoomHistoryStatStruct shareRoomHistoryStatStruct2 = a18.f582a;
            shareRoomHistoryStatStruct2.f60360g = size;
            shareRoomHistoryStatStruct2.f60373t = shareRoomHistoryStatStruct2.b("InvitedUsrs", com.tencent.mm.sdk.platformtools.t8.c1(arrayList, ";"), true);
            j75.e eVar = ((wi5.c) dVar2).f298067a;
            if (eVar != null && (eVar instanceof un.a)) {
                un.a aVar = (un.a) eVar;
                if (aVar.f446284a) {
                    if (aVar.f429231b || aVar.f429232c) {
                        db5.e1.y(g1Var.getActivity(), g1Var.getString(com.tencent.mm.R.string.htx), "", g1Var.getString(com.tencent.mm.R.string.l_e), un.x0.f429338d);
                        a14.a.a().f591j++;
                    } else if (aVar.f429233d) {
                        db5.e1.y(g1Var.getActivity(), g1Var.getString(com.tencent.mm.R.string.htw), "", g1Var.getString(com.tencent.mm.R.string.l_e), un.y0.f429341d);
                        a14.a.a().f592k++;
                        a14.a.a().f590i++;
                    }
                }
            }
        }
        wi5.c0 c0Var = (wi5.c0) state.a(wi5.c0.class);
        if (c0Var != null) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Select_Contact", com.tencent.mm.sdk.platformtools.t8.c1(c0Var.f446282b, ","));
            com.tencent.mm.chatroom.ui.ChatroomInfoUI.LocalHistoryInfo localHistoryInfo = new com.tencent.mm.chatroom.ui.ChatroomInfoUI.LocalHistoryInfo();
            dn.h hVar = g1Var.f429264o;
            if (hVar != null) {
                localHistoryInfo.f63717d = hVar.field_fileId;
                localHistoryInfo.f63718e = hVar.field_aesKey;
                localHistoryInfo.f63719f = hVar.field_filemd5;
                localHistoryInfo.f63720g = (int) hVar.field_fileLength;
                localHistoryInfo.f63721h = g1Var.f429258f;
            }
            dn.h hVar2 = g1Var.f429268s;
            if (hVar2 != null) {
                localHistoryInfo.f63722i = hVar2.field_fileId;
                localHistoryInfo.f63723m = hVar2.field_aesKey;
                localHistoryInfo.f63724n = hVar2.field_filemd5;
                localHistoryInfo.f63725o = (int) hVar2.field_fileLength;
                localHistoryInfo.f63726p = g1Var.f429258f;
            }
            intent.putExtra("select_record_msg_info", localHistoryInfo);
            intent.putExtra("select_record_fake_msg_id", ((com.tencent.mm.plugin.msg.MsgIdTalker) g1Var.f429263n.first).f149480d);
            g1Var.getActivity().setResult(-1, intent);
            g1Var.getActivity().finish();
        }
        return jz5.f0.f302826a;
    }
}
