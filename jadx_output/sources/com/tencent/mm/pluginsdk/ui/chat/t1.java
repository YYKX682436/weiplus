package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes5.dex */
public class t1 implements nl5.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.u1 f190660a;

    public t1(com.tencent.mm.pluginsdk.ui.chat.u1 u1Var) {
        this.f190660a = u1Var;
    }

    public void a(int i17, android.view.MotionEvent event) {
        com.tencent.mm.pluginsdk.ui.SpeechInputLayout B0;
        a31.m mVar;
        com.tencent.mm.ui.widget.MMEditText mMEditText;
        com.tencent.mm.pluginsdk.ui.chat.y4 y4Var = this.f190660a.f190673a.f189955a3;
        if (y4Var != null) {
            com.tencent.mm.ui.chatting.component.y8 y8Var = (com.tencent.mm.ui.chatting.component.y8) ((sb5.i0) y4Var.a().f460708c.a(sb5.i0.class));
            y8Var.getClass();
            kotlin.jvm.internal.o.g(event, "event");
            com.tencent.mm.pluginsdk.ui.SpeechInputLayout B02 = y8Var.B0();
            int curV2TStatus = B02 != null ? B02.getCurV2TStatus() : 0;
            int action = event.getAction();
            if (action == 0) {
                if (curV2TStatus == 0 || (B0 = y8Var.B0()) == null) {
                    return;
                }
                B0.c(0);
                return;
            }
            if ((action == 1 || action == 3) && (mVar = y8Var.f200292m) != null && mVar.f990x && (mMEditText = mVar.f968b) != null) {
                java.lang.Runnable runnable = mVar.P;
                mMEditText.removeCallbacks(runnable);
                mMEditText.post(runnable);
            }
        }
    }
}
