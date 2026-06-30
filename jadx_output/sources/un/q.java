package un;

/* loaded from: classes5.dex */
public final class q {
    public q(kotlin.jvm.internal.i iVar) {
    }

    public final void a(android.content.Context context, java.lang.String roomName, java.lang.String userName, java.lang.String str, java.lang.String str2, boolean z17, java.lang.String ticket) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(roomName, "roomName");
        kotlin.jvm.internal.o.g(userName, "userName");
        kotlin.jvm.internal.o.g(ticket, "ticket");
        com.tencent.mars.xlog.Log.i("MicroMsg.ChatroomApplicantsContactListUIC", "goToContactInfo roomName = " + roomName + ", userName = " + userName + ", nickName = " + str + ", remarkName = " + str2 + ", hideFooter = " + z17);
        com.tencent.mm.storage.a3 W0 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().W0(roomName);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Contact_User", userName);
        if (str2 == null || str2.length() == 0) {
            intent.putExtra("Contact_RoomNickname", W0.z0(userName));
            str2 = W0.z0(userName);
        }
        if (str2 == null || str2.length() == 0) {
            com.tencent.mm.storage.ya z07 = ((com.tencent.mm.storage.ab) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).mj()).z0(userName);
            str2 = z07 != null ? z07.field_encryptUsername : null;
        }
        if (str2 != null) {
            intent.putExtra("Contact_RemarkName", str2);
        }
        intent.putExtra("key_add_contact_verify_ticket", ticket);
        intent.putExtra("Contact_Nick", str);
        intent.putExtra("Contact_RoomMember", true);
        intent.putExtra("room_name", roomName);
        intent.putExtra("CONTACT_INFO_UI_SOURCE", 16);
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(userName, true);
        if (n17 != null && ((int) n17.E2) > 0 && n17.r2()) {
            com.tencent.mm.autogen.events.SetLocalQQMobileEvent setLocalQQMobileEvent = new com.tencent.mm.autogen.events.SetLocalQQMobileEvent();
            am.au auVar = setLocalQQMobileEvent.f54766g;
            auVar.f6187a = intent;
            auVar.f6188b = userName;
            setLocalQQMobileEvent.e();
        }
        if (n17 != null && n17.k2()) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(10298, n17.d1() + ",14");
        }
        if (z17) {
            intent.putExtra("Contact_Scene", 96);
        } else {
            intent.putExtra("Contact_Scene", 14);
        }
        intent.putExtra("Is_RoomOwner", true);
        intent.putExtra("Contact_ChatRoomId", roomName);
        j45.l.j(context, com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent, null);
    }
}
