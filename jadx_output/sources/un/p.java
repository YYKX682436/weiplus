package un;

/* loaded from: classes11.dex */
public final class p extends un.h {

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f429319n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f429320o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f429321p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f429319n = jz5.h.b(new un.n(this));
        this.f429320o = jz5.h.b(new un.o(this));
        this.f429321p = jz5.h.b(new un.m(this));
    }

    @Override // un.h
    public void O6(boolean z17) {
        super.O6(z17);
        if (this.f429273d != null) {
            if (W6().getBoolean("room_placed_to_the_top", false)) {
                ((u90.a) ((v90.v) i95.n0.c(v90.v.class))).Ai(false, d7(), true);
            } else {
                ((u90.a) ((v90.v) i95.n0.c(v90.v.class))).Ai(false, d7(), false);
            }
        }
    }

    @Override // un.h
    public com.tencent.mm.storage.a3 R6() {
        return ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0(d7());
    }

    @Override // un.h
    public boolean S6() {
        qy.i iVar = (qy.i) i95.n0.c(qy.i.class);
        java.lang.String d76 = d7();
        ((py.a) iVar).getClass();
        return c01.v1.y(d76);
    }

    @Override // un.h
    public boolean T6() {
        com.tencent.mm.storage.m4 Di = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di();
        com.tencent.mm.storage.z3 z3Var = this.f429273d;
        return Di.K(z3Var != null ? z3Var.d1() : null);
    }

    @Override // un.h
    public java.lang.String U6() {
        return d7();
    }

    @Override // un.h
    public java.lang.String X6() {
        return "MicroMsg.ChatRoomOperationUIC";
    }

    @Override // un.h
    public boolean a7(java.lang.String str, com.tencent.mm.storage.a3 a3Var) {
        return a3Var != null && super.a7(str, a3Var);
    }

    public final void c7(boolean z17) {
        android.content.Intent intent = new android.content.Intent();
        lk5.s.e(intent, true);
        intent.putExtra("RoomInfo_Id", d7());
        intent.putExtra("room_operation_session_id", d7());
        intent.setClass(getActivity(), com.tencent.mm.chatroom.ui.RoomStillNotifyMessageManagerUI.class);
        if (z17) {
            intent.putExtra("only_show_special_follow", true);
        }
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activity, arrayList.toArray(), "com/tencent/mm/chatroom/ui/uic/ChatRoomOperationUIC", "dealJumpToStillNotifyMessageManagerUI", "(Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activity.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activity, "com/tencent/mm/chatroom/ui/uic/ChatRoomOperationUIC", "dealJumpToStillNotifyMessageManagerUI", "(Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        androidx.appcompat.app.AppCompatActivity activity2 = getActivity();
        kotlin.jvm.internal.o.g(activity2, "activity");
        un.l lVar = (un.l) pf5.z.f353948a.a(activity2).a(un.l.class);
        lVar.getClass();
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("view_clk", lVar.getActivity(), kz5.c1.k(new jz5.l("view_id", "still_notify_setting_cell"), new jz5.l("chat_name", lVar.O6()), new jz5.l("chatroom_info_sid", lVar.P6())), 34574);
    }

    public final java.lang.String d7() {
        return (java.lang.String) ((jz5.n) this.f429319n).getValue();
    }

    public final void e7(boolean z17) {
        ((com.tencent.mm.ui.base.preference.h0) V6()).m("room_special_follow_member", z17);
        if (z17) {
            return;
        }
        ((java.lang.Boolean) ((jz5.n) this.f429321p).getValue()).booleanValue();
    }

    public final void f7(boolean z17) {
        com.tencent.mm.chatroom.ui.preference.StillNotifyMessagePreference stillNotifyMessagePreference;
        java.lang.String str;
        r45.ya4 ya4Var;
        java.util.LinkedList linkedList;
        if (!((com.tencent.mm.ui.base.preference.h0) V6()).q("room_still_notify_message") && !z17) {
            androidx.appcompat.app.AppCompatActivity activity = getActivity();
            kotlin.jvm.internal.o.g(activity, "activity");
            ((un.l) pf5.z.f353948a.a(activity).a(un.l.class)).Q6();
        }
        ((com.tencent.mm.ui.base.preference.h0) V6()).m("room_still_notify_message", z17);
        if (z17 || (stillNotifyMessagePreference = (com.tencent.mm.chatroom.ui.preference.StillNotifyMessagePreference) ((jz5.n) this.f429320o).getValue()) == null) {
            return;
        }
        qy.i iVar = (qy.i) i95.n0.c(qy.i.class);
        java.lang.String d76 = d7();
        ((py.a) iVar).getClass();
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(c01.v1.K(d76));
        java.lang.Boolean valueOf2 = java.lang.Boolean.valueOf(c01.v1.J(d7()));
        java.lang.Boolean valueOf3 = java.lang.Boolean.valueOf(c01.v1.I(d7()));
        boolean booleanValue = valueOf.booleanValue();
        boolean booleanValue2 = valueOf2.booleanValue();
        boolean booleanValue3 = valueOf3.booleanValue();
        com.tencent.mm.storage.b3 a17 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a();
        java.lang.String d77 = d7();
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        java.lang.String str2 = "";
        if (d77 == null) {
            d77 = "";
        }
        com.tencent.mm.storage.a3 z07 = a17.z0(d77);
        boolean z19 = ((z07 == null || (ya4Var = z07.field_localChatRoomWatchMembers) == null || (linkedList = ya4Var.f390927e) == null) ? 0 : linkedList.size()) > 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.ChatRoomOperationUIC", "ChatroomMuteRefine: needNotifyAtMe: " + booleanValue + ", needNotifyAtAll: " + booleanValue2 + ", needNotifyAnnouncement: " + booleanValue3 + ", watchMembers: " + z19);
        if (!booleanValue && !booleanValue2 && !booleanValue3 && !z19) {
            str = null;
        } else if (!z19 || booleanValue || booleanValue2 || booleanValue3) {
            java.util.List b17 = kz5.b0.b();
            if (booleanValue) {
                ((lz5.e) b17).add(getActivity().getString(com.tencent.mm.R.string.f492901og1));
            }
            if (booleanValue2) {
                ((lz5.e) b17).add(getActivity().getString(com.tencent.mm.R.string.f492900og0));
            }
            if (booleanValue3) {
                ((lz5.e) b17).add(getActivity().getString(com.tencent.mm.R.string.f492903og3));
            }
            if (z19) {
                ((lz5.e) b17).add(getActivity().getString(com.tencent.mm.R.string.ofw));
            }
            java.util.List a18 = kz5.b0.a(b17);
            int d17 = ((kz5.l) a18).d();
            if (d17 == 1) {
                str2 = (java.lang.String) ((lz5.e) a18).get(0);
            } else if (d17 == 2) {
                lz5.e eVar = (lz5.e) a18;
                str2 = getActivity().getString(com.tencent.mm.R.string.p6m, eVar.get(0), eVar.get(1));
            } else if (d17 == 3) {
                lz5.e eVar2 = (lz5.e) a18;
                str2 = getActivity().getString(com.tencent.mm.R.string.p6n, eVar2.get(0), eVar2.get(1), eVar2.get(2));
            } else if (d17 == 4) {
                lz5.e eVar3 = (lz5.e) a18;
                str2 = getActivity().getString(com.tencent.mm.R.string.p6o, eVar3.get(0), eVar3.get(1), eVar3.get(2), eVar3.get(3));
            }
            str = str2;
        } else {
            str = getActivity().getString(com.tencent.mm.R.string.p6l);
        }
        stillNotifyMessagePreference.M = str;
        stillNotifyMessagePreference.M();
    }

    public void g7(boolean z17) {
        com.tencent.mm.autogen.mmdata.rpt.ChatBoxGroupActionStruct chatBoxGroupActionStruct = new com.tencent.mm.autogen.mmdata.rpt.ChatBoxGroupActionStruct();
        chatBoxGroupActionStruct.f55598d = chatBoxGroupActionStruct.b("roomUsername", U6(), true);
        chatBoxGroupActionStruct.f55599e = z17 ? 11 : 10;
        chatBoxGroupActionStruct.k();
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        ((un.l) pf5.z.f353948a.a(activity).a(un.l.class)).R6(z17, un.i.f429283e);
    }

    public final void h7(boolean z17, boolean z18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ChatRoomOperationUIC", "updateStillNotifyMessagePreference: " + z17 + ", " + z18);
        if (com.tencent.mm.storage.z3.N4(d7())) {
            com.tencent.mm.chatroom.ui.b9 b9Var = com.tencent.mm.chatroom.ui.RoomSpecialFollowMemberManagerUI.f63855u;
            if (!(!(com.tencent.mm.sdk.platformtools.t8.P(((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("WeComWatchMemberEntry"), 0) == 1) && c01.e2.E(d7()))) {
                if (z18) {
                    e7(true);
                    f7(true);
                    return;
                }
                Y6(!z17);
                if (z17) {
                    Y6(false);
                    if (W6().getBoolean("room_set_to_conv_box", false)) {
                        e7(false);
                        f7(true);
                    } else {
                        e7(true);
                        f7(false);
                    }
                } else {
                    Y6(true);
                    e7(true);
                    f7(true);
                }
                if (c01.v1.v()) {
                    return;
                }
                com.tencent.mars.xlog.Log.w("MicroMsg.ChatRoomOperationUIC", "ChatroomMuteRefine: not enable, should not show!");
                f7(true);
                return;
            }
        }
        Y6(true);
        e7(true);
        f7(true);
    }
}
