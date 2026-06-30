package qd0;

@j95.b
/* loaded from: classes.dex */
public final class q0 extends i95.w implements rd0.e1 {
    public android.content.Intent Ai(androidx.appcompat.app.AppCompatActivity activity, java.lang.String title, java.lang.String chatroomName, java.util.List selectedMemberList, java.util.List allUserNameList, boolean z17) {
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(title, "title");
        kotlin.jvm.internal.o.g(chatroomName, "chatroomName");
        kotlin.jvm.internal.o.g(selectedMemberList, "selectedMemberList");
        kotlin.jvm.internal.o.g(allUserNameList, "allUserNameList");
        com.tencent.mars.xlog.Log.i("MicroMsg.MvvmSelectContactFeatureService", "createChooseLocalChatRoomMemberIntent title:" + title + " chatroomName:" + chatroomName + " selectedMemberList:" + selectedMemberList + " allUserNameList:" + allUserNameList);
        android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.tencent.mm.ui.mvvm.MvvmContactListUI.class);
        intent.putExtra("titile", title);
        intent.putExtra("list_attr", 64);
        intent.putExtra("chatroomName", chatroomName);
        intent.putExtra("chatroommemberlist", kz5.n0.g0(allUserNameList, ",", null, null, 0, null, null, 62, null));
        intent.putExtra("always_select_contact", kz5.n0.g0(selectedMemberList, ",", null, null, 0, null, null, 62, null));
        intent.putExtra("addGroupManager", z17);
        pf5.j0.a(intent, cj5.q4.class);
        pf5.j0.a(intent, dj5.b0.class);
        pf5.j0.a(intent, dj5.m.class);
        pf5.j0.a(intent, cj5.k4.class);
        pf5.j0.a(intent, cj5.s.class);
        pf5.j0.a(intent, cj5.h3.class);
        pf5.j0.a(intent, cj5.n3.class);
        pf5.j0.a(intent, cj5.w2.class);
        pf5.j0.a(intent, cj5.l2.class);
        return intent;
    }

    public android.content.Intent Bi(androidx.appcompat.app.AppCompatActivity activity, java.lang.String title, boolean z17, java.util.List list) {
        int i17;
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(title, "title");
        android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.tencent.mm.ui.mvvm.MvvmContactListUI.class);
        intent.putExtra("titile", title);
        pf5.j0.a(intent, fj5.g.class);
        pf5.j0.a(intent, fj5.i.class);
        pf5.j0.a(intent, cj5.w2.class);
        pf5.j0.a(intent, cj5.l2.class);
        if (list != null) {
            intent.putExtra("already_select_contact", com.tencent.mm.sdk.platformtools.t8.c1(list, ","));
        }
        if (z17) {
            i17 = 64;
        } else {
            com.tencent.mm.ui.contact.i5.e();
            i17 = com.tencent.mm.ui.contact.i5.f206780a;
        }
        intent.putExtra("list_attr", i17);
        intent.putExtra("KEY_NEED_SEAR_HEADER", false);
        return intent;
    }

    public android.content.Intent Di(androidx.appcompat.app.AppCompatActivity activity, java.lang.String title, boolean z17, java.util.List list) {
        int i17;
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(title, "title");
        android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.tencent.mm.ui.mvvm.MvvmContactListUI.class);
        intent.putExtra("titile", title);
        pf5.j0.a(intent, gj5.b.class);
        pf5.j0.a(intent, gj5.c.class);
        pf5.j0.a(intent, cj5.w2.class);
        pf5.j0.a(intent, cj5.l2.class);
        if (list != null) {
            intent.putExtra("already_select_contact", com.tencent.mm.sdk.platformtools.t8.c1(list, ","));
        }
        if (z17) {
            i17 = 64;
        } else {
            com.tencent.mm.ui.contact.i5.e();
            i17 = com.tencent.mm.ui.contact.i5.f206780a;
        }
        intent.putExtra("list_attr", i17);
        intent.putExtra("KEY_NEED_SEAR_HEADER", false);
        return intent;
    }

    public android.content.Intent Ni(androidx.appcompat.app.AppCompatActivity activity, java.lang.String title) {
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(title, "title");
        com.tencent.mars.xlog.Log.i("MicroMsg.MvvmSelectContactFeatureService", "createQuickSendRedPacketRecentConversationIntent title:".concat(title));
        android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.tencent.mm.ui.mvvm.MvvmContactListUI.class);
        intent.putExtra("titile", title);
        pf5.j0.a(intent, cj5.k4.class);
        pf5.j0.a(intent, com.tencent.mm.ui.mvvm.uic.conversation.recent.v0.class);
        pf5.j0.a(intent, com.tencent.mm.ui.mvvm.uic.conversation.recent.e0.class);
        pf5.j0.a(intent, com.tencent.mm.ui.mvvm.uic.conversation.recent.h1.class);
        pf5.j0.a(intent, cj5.n3.class);
        pf5.j0.a(intent, cj5.w2.class);
        pf5.j0.a(intent, cj5.l2.class);
        return intent;
    }

    public android.content.Intent Ri(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.ui.mvvm.MvvmContactListUI.class);
        java.lang.String string = context.getString(com.tencent.mm.R.string.ig7);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        intent.putExtra("titile", string);
        pf5.j0.a(intent, com.tencent.mm.ui.mvvm.uic.conversation.recent.g.class);
        pf5.j0.a(intent, cj5.k4.class);
        pf5.j0.a(intent, com.tencent.mm.ui.mvvm.uic.conversation.recent.v0.class);
        pf5.j0.a(intent, com.tencent.mm.ui.mvvm.uic.conversation.recent.h1.class);
        pf5.j0.a(intent, cj5.n3.class);
        pf5.j0.a(intent, cj5.w2.class);
        pf5.j0.a(intent, cj5.l2.class);
        pf5.j0.a(intent, com.tencent.mm.ui.mvvm.uic.conversation.recent.e0.class);
        qg5.z2 z2Var = (qg5.z2) ((ct.j3) i95.n0.c(ct.j3.class));
        boolean mj6 = z2Var.mj(context, true);
        if (mj6) {
            com.tencent.mm.ui.chatting.component.zp zpVar = new com.tencent.mm.ui.chatting.component.zp();
            z2Var.f363278t = zpVar;
            ((wj.j0) ((xj.i) ((jz5.n) zpVar.f200404e).getValue())).Vi(wj.t0.f446507J, 3000L, new com.tencent.mm.ui.chatting.component.yp(zpVar));
        }
        intent.putExtra("KEY_IS_SUPPORT_FORWARD_TO_YUANBAO", mj6);
        intent.putExtra("KEY_IS_SUPPORT_FORWARD_TO_CLAWBOT", true);
        intent.putExtra("KEY_IS_FORWARD_TO_OTHER_APPS_RENAME", j62.e.g().c(new com.tencent.mm.repairer.config.forward.RepairerConfigForwardToOtherAppsRename()) == 1);
        pf5.j0.a(intent, com.tencent.mm.ui.mvvm.uic.conversation.recent.t.class);
        pf5.j0.a(intent, com.tencent.mm.ui.mvvm.uic.conversation.recent.i.class);
        intent.putExtra("INTENT_KEY_PUSH_DOWN_OUT_ANIMATION", true);
        intent.putExtra("KOrientation", 1);
        return intent;
    }

    public android.content.Intent Ui(android.content.Context context, boolean z17, boolean z18, boolean z19) {
        kotlin.jvm.internal.o.g(context, "context");
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.ui.mvvm.MvvmContactListUI.class);
        java.lang.String string = context.getString(com.tencent.mm.R.string.ig7);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        intent.putExtra("titile", string);
        if (z18) {
            pf5.j0.a(intent, com.tencent.mm.ui.mvvm.uic.conversation.recent.g.class);
        } else {
            pf5.j0.a(intent, com.tencent.mm.ui.mvvm.uic.conversation.recent.k.class);
        }
        pf5.j0.a(intent, cj5.k4.class);
        pf5.j0.a(intent, com.tencent.mm.ui.mvvm.uic.conversation.recent.v0.class);
        pf5.j0.a(intent, com.tencent.mm.ui.mvvm.uic.conversation.recent.h1.class);
        pf5.j0.a(intent, cj5.n3.class);
        pf5.j0.a(intent, cj5.w2.class);
        pf5.j0.a(intent, cj5.l2.class);
        pf5.j0.a(intent, com.tencent.mm.ui.mvvm.uic.conversation.recent.e0.class);
        if (z19) {
            ((com.tencent.mm.ui.chatting.fd) ((rd0.k1) i95.n0.c(rd0.k1.class))).getClass();
            intent.putExtra("KEY_IS_SUPPORT_FORWARD_TYPE_WXWORK", com.tencent.mm.ui.chatting.hd.k());
            ((com.tencent.mm.ui.chatting.fd) ((rd0.k1) i95.n0.c(rd0.k1.class))).getClass();
            intent.putExtra("KEY_IS_SUPPORT_FORWARD_TYPE_WXWORK_LOCAL", com.tencent.mm.ui.chatting.hd.j());
        }
        qg5.z2 z2Var = (qg5.z2) ((ct.j3) i95.n0.c(ct.j3.class));
        boolean mj6 = z2Var.mj(context, true);
        if (mj6) {
            com.tencent.mm.ui.chatting.component.zp zpVar = new com.tencent.mm.ui.chatting.component.zp();
            z2Var.f363278t = zpVar;
            ((wj.j0) ((xj.i) ((jz5.n) zpVar.f200404e).getValue())).Vi(wj.t0.f446507J, 3000L, new com.tencent.mm.ui.chatting.component.yp(zpVar));
        }
        intent.putExtra("KEY_IS_SUPPORT_FORWARD_TO_YUANBAO", mj6);
        intent.putExtra("KEY_IS_FORWARD_TO_OTHER_APPS_RENAME", j62.e.g().c(new com.tencent.mm.repairer.config.forward.RepairerConfigForwardToOtherAppsRename()) == 1);
        intent.putExtra("KEY_IS_SUPPORT_FORWARD_TO_CLAWBOT", true);
        intent.putExtra("KOrientation", 1);
        if (z17) {
            pf5.j0.a(intent, bj5.f0.class);
            pf5.j0.a(intent, com.tencent.mm.ui.mvvm.uic.conversation.recent.r0.class);
            intent.putExtra("max_limit_num", 9);
            intent.putExtra("too_many_member_tip_string", context.getString(com.tencent.mm.R.string.ifr, 9));
        }
        pf5.j0.a(intent, com.tencent.mm.ui.mvvm.uic.conversation.recent.t.class);
        pf5.j0.a(intent, com.tencent.mm.ui.mvvm.uic.conversation.recent.i.class);
        intent.putExtra("INTENT_KEY_PUSH_DOWN_OUT_ANIMATION", true);
        return intent;
    }

    public android.content.Intent wi(androidx.appcompat.app.AppCompatActivity activity, java.lang.String title, java.lang.String chatroomName, java.util.List selectedMemberList, java.util.List allUserNameList) {
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(title, "title");
        kotlin.jvm.internal.o.g(chatroomName, "chatroomName");
        kotlin.jvm.internal.o.g(selectedMemberList, "selectedMemberList");
        kotlin.jvm.internal.o.g(allUserNameList, "allUserNameList");
        com.tencent.mars.xlog.Log.i("MicroMsg.MvvmSelectContactFeatureService", "createChooseChatRoomMemberIntent title:" + title + " chatroomName:" + chatroomName + " selectedMemberList:" + selectedMemberList + " allUserNameList:" + allUserNameList);
        android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.tencent.mm.ui.mvvm.MvvmContactListUI.class);
        intent.putExtra("titile", title);
        intent.putExtra("list_attr", 64);
        intent.putExtra("chatroomName", chatroomName);
        intent.putExtra("chatroommemberlist", kz5.n0.g0(allUserNameList, ",", null, null, 0, null, null, 62, null));
        intent.putExtra("already_select_contact", kz5.n0.g0(selectedMemberList, ",", null, null, 0, null, null, 62, null));
        pf5.j0.a(intent, cj5.q4.class);
        pf5.j0.a(intent, dj5.r.class);
        pf5.j0.a(intent, dj5.m.class);
        pf5.j0.a(intent, cj5.k4.class);
        pf5.j0.a(intent, cj5.s.class);
        pf5.j0.a(intent, cj5.h3.class);
        pf5.j0.a(intent, cj5.n3.class);
        pf5.j0.a(intent, cj5.w2.class);
        pf5.j0.a(intent, cj5.l2.class);
        return intent;
    }
}
