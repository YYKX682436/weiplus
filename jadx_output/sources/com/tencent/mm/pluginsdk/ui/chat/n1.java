package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes5.dex */
public class n1 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.ChatFooter f190495d;

    public n1(com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter) {
        this.f190495d = chatFooter;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        a31.m mVar;
        com.tencent.mm.ui.widget.MMEditText mMEditText;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/chat/ChatFooter$20", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = this.f190495d;
        if (chatFooter.f189955a3 != null) {
            int action = motionEvent.getAction();
            if (action == 0) {
                com.tencent.mm.ui.chatting.component.y8 y8Var = (com.tencent.mm.ui.chatting.component.y8) ((sb5.i0) chatFooter.f189955a3.a().f460708c.a(sb5.i0.class));
                com.tencent.mm.ui.chatting.component.gp gpVar = y8Var.f200305z;
                if (gpVar != null) {
                    gpVar.f199125h = true;
                }
                float x17 = motionEvent.getX();
                float y17 = motionEvent.getY();
                a31.m mVar2 = y8Var.f200292m;
                if (mVar2 != null) {
                    mVar2.g(x17, y17);
                }
                y8Var.P0(54);
            } else if ((action == 1 || action == 3) && (mVar = ((com.tencent.mm.ui.chatting.component.y8) ((sb5.i0) chatFooter.f189955a3.a().f460708c.a(sb5.i0.class))).f200292m) != null && mVar.f990x && (mMEditText = mVar.f968b) != null) {
                java.lang.Runnable runnable = mVar.P;
                mMEditText.removeCallbacks(runnable);
                mMEditText.post(runnable);
            }
        }
        if (chatFooter.f190016l2 && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            chatFooter.f190016l2 = false;
            chatFooter.f190022m2 = true;
            chatFooter.z1();
            com.tencent.mm.pluginsdk.ui.chat.y4 y4Var = chatFooter.f189955a3;
            if (y4Var != null) {
                com.tencent.mm.autogen.mmdata.rpt.InputChangeLineStruct inputChangeLineStruct = new com.tencent.mm.autogen.mmdata.rpt.InputChangeLineStruct();
                inputChangeLineStruct.f58502h = 3;
                inputChangeLineStruct.f58498d = 1L;
                inputChangeLineStruct.q(y4Var.c());
                inputChangeLineStruct.p(u35.a.f424428b);
                inputChangeLineStruct.f58508n = java.lang.System.currentTimeMillis();
                java.lang.String n17 = inputChangeLineStruct.n();
                kotlin.jvm.internal.o.f(n17, "toShowString(...)");
                com.tencent.mars.xlog.Log.i("CEMenuReporter", "report%s %s", 16112, r26.i0.t(n17, com.tencent.midas.comm.log.util.APLogFileUtil.SEPARATOR_LINE, " ", false));
                inputChangeLineStruct.k();
            }
        }
        chatFooter.setToSendTextColor(true);
        com.tencent.mm.pluginsdk.ui.chat.k5 k5Var = chatFooter.f190090x0;
        if (k5Var != null) {
            k5Var.i(view, motionEvent);
        }
        chatFooter.postDelayed(new com.tencent.mm.pluginsdk.ui.chat.n4(chatFooter, false), 10);
        yj0.a.i(false, this, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$20", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
