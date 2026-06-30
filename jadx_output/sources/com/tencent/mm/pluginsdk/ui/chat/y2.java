package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes5.dex */
public class y2 implements android.widget.PopupWindow.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.ChatFooter f190758d;

    public y2(com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter) {
        this.f190758d = chatFooter;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = this.f190758d;
        if (chatFooter.f189968c6 == com.tencent.mm.pluginsdk.ui.chat.b5.MODE_TRANS && chatFooter.X4) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChatFooter", "dismiss from keyback, need cancelRecording");
            chatFooter.N3.b(6);
            chatFooter.f190090x0.o();
        }
        chatFooter.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.ChatFooter", "newVoice2txt, resetNewVoice2txt.");
        chatFooter.Z3.setBackground(chatFooter.s0(chatFooter.Y5, chatFooter.Z5));
        chatFooter.X4 = true;
        chatFooter.P5 = 0;
        com.tencent.mm.pluginsdk.ui.chat.b5 b5Var = com.tencent.mm.pluginsdk.ui.chat.b5.MODE_VOICE;
        chatFooter.f189968c6 = b5Var;
        chatFooter.f189974d6 = b5Var;
        ((java.util.HashMap) chatFooter.f189980e6).clear();
        ((java.util.ArrayList) chatFooter.f190058r6).clear();
        chatFooter.f190026m6 = false;
        com.tencent.mm.plugin.transvoice.model.c cVar = chatFooter.f190038o6;
        if (cVar != null) {
            cVar.a(false, true);
        }
        chatFooter.f190038o6 = null;
        com.tencent.mm.pluginsdk.ui.chat.k5 k5Var = chatFooter.f190090x0;
        if (k5Var != null && chatFooter.T3) {
            k5Var.r();
        }
        chatFooter.f190095x5 = chatFooter.f190057r5;
        chatFooter.C5 = java.lang.Math.round(com.tencent.mm.ui.gk.a(com.tencent.mm.ui.zk.a(chatFooter.getContext(), 176)));
        chatFooter.D5 = 60;
        chatFooter.q();
        chatFooter.E0();
        chatFooter.F0();
        chatFooter.f190086w4.setVisibility(8);
        chatFooter.f190094x4.setVisibility(8);
        android.view.View view = chatFooter.D4;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "resetNewVoice2txtEdit", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "resetNewVoice2txtEdit", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        chatFooter.E4.setVisibility(8);
        chatFooter.G4.topMargin = java.lang.Math.round(com.tencent.mm.ui.gk.a(chatFooter.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479666c3)));
        chatFooter.F4.setLayoutParams(chatFooter.G4);
        chatFooter.F4.setAlpha(1.0f);
        chatFooter.F4.setVisibility(0);
        android.view.View view2 = chatFooter.I4;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "resetNewVoice2txtEdit", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "resetNewVoice2txtEdit", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view3 = chatFooter.J4;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "resetNewVoice2txtEdit", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "resetNewVoice2txtEdit", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        chatFooter.f190044p4.setVisibility(0);
        chatFooter.K4.setAlpha(1.0f);
        chatFooter.K4.setProgress(97.8f);
        chatFooter.K4.setStartAngle(274.0f);
        chatFooter.L4.setAlpha(1.0f);
        chatFooter.L4.setProgress(4.4f);
        chatFooter.L4.setStartAngle(274.4f);
        chatFooter.f190094x4.setVisibility(8);
        chatFooter.f190086w4.setVisibility(8);
        chatFooter.f189961b4.setText("");
        chatFooter.f189961b4.removeTextChangedListener(chatFooter.f190013k5);
        android.view.View view4 = chatFooter.T4;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(8);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "resetNewVoice2txt", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(view4, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "resetNewVoice2txt", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        chatFooter.M5 = 0;
        chatFooter.f190076u6 = false;
        chatFooter.f189961b4.setFocusable(false);
        chatFooter.f189961b4.setFocusableInTouchMode(false);
        android.view.View view5 = chatFooter.Z3;
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        arrayList5.add(0);
        java.util.Collections.reverse(arrayList5);
        yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "resetNewVoice2txt", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
        yj0.a.f(view5, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "resetNewVoice2txt", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view6 = chatFooter.Y3;
        java.util.ArrayList arrayList6 = new java.util.ArrayList();
        arrayList6.add(8);
        java.util.Collections.reverse(arrayList6);
        yj0.a.d(view6, arrayList6.toArray(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "resetNewVoice2txt", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
        yj0.a.f(view6, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "resetNewVoice2txt", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        chatFooter.f189972d4.setVisibility(8);
        chatFooter.f189966c4.setVisibility(0);
        chatFooter.f190064s6.d();
        chatFooter.f190070t6.removeMessages(5000);
        ((java.util.HashMap) chatFooter.f189986f6).clear();
        chatFooter.O5 = false;
        chatFooter.C1();
        chatFooter.f190009j6 = "";
        chatFooter.f190014k6 = "";
        chatFooter.f190032n6 = "";
        chatFooter.f189992g6 = "";
        chatFooter.f190004i6 = "";
        chatFooter.f189957a5 = false;
        chatFooter.f189998h6 = false;
        chatFooter.T1(false, false);
        chatFooter.E1(0, true, -1);
        chatFooter.o0();
    }
}
