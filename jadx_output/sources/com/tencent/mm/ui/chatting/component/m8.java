package com.tencent.mm.ui.chatting.component;

/* loaded from: classes5.dex */
public final class m8 implements com.tencent.mm.pluginsdk.ui.w2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.y8 f199487a;

    public m8(com.tencent.mm.ui.chatting.component.y8 y8Var) {
        this.f199487a = y8Var;
    }

    @Override // com.tencent.mm.pluginsdk.ui.w2
    public void a() {
        com.tencent.mm.ui.chatting.component.y8 y8Var = this.f199487a;
        android.widget.TextView y07 = y8Var.y0();
        boolean z17 = false;
        if (y07 != null && y07.getVisibility() == 0) {
            z17 = true;
        }
        if (z17) {
            y8Var.A0().G("show_btn_guide", true);
        }
        if (y8Var.A0().q("longclick_guide_first_time", 0L) == 0) {
            y8Var.A0().B("longclick_guide_first_time", java.lang.System.currentTimeMillis());
        }
        y8Var.G0();
    }

    @Override // com.tencent.mm.pluginsdk.ui.w2
    public void b(int i17) {
        com.tencent.mm.pluginsdk.ui.SpeechInputLayout B0;
        com.tencent.mm.ui.chatting.component.y8 y8Var = this.f199487a;
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter v07 = y8Var.v0();
        java.lang.String lastText = v07 != null ? v07.getLastText() : null;
        if (!(lastText == null || r26.n0.N(lastText)) || (B0 = y8Var.B0()) == null) {
            return;
        }
        B0.c(i17);
    }

    @Override // com.tencent.mm.pluginsdk.ui.w2
    public void c(float f17, float f18) {
        com.tencent.mm.ui.chatting.component.y8 y8Var = this.f199487a;
        if (com.tencent.mm.ui.chatting.component.y8.r0(y8Var)) {
            com.tencent.mm.ui.chatting.component.y8.q0(y8Var, f17, f18);
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.w2
    public void d() {
        java.lang.String str;
        java.lang.String str2;
        com.tencent.mm.ui.chatting.component.y8 y8Var = this.f199487a;
        if (com.tencent.mm.ui.chatting.component.y8.r0(y8Var)) {
            if (y8Var.f200286J == com.tencent.mm.ui.chatting.component.a8.f198610d) {
                long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - y8Var.G;
                u35.e eVar = u35.e.f424436a;
                com.tencent.mm.pluginsdk.ui.chat.h9 h9Var = y8Var.f200293n;
                java.lang.String str3 = (h9Var == null || (str2 = h9Var.f190355a) == null) ? "" : str2;
                java.lang.String x17 = y8Var.f198580d.x();
                com.tencent.mm.pluginsdk.ui.chat.h9 h9Var2 = y8Var.f200293n;
                eVar.a(elapsedRealtime, str3, x17, (h9Var2 == null || (str = h9Var2.f190356b) == null) ? "" : str);
            }
            if (y8Var.f200286J == com.tencent.mm.ui.chatting.component.a8.f198611e) {
                com.tencent.mm.ui.chatting.component.y8.o0(y8Var);
            }
            com.tencent.mm.pluginsdk.ui.chat.h9 h9Var3 = y8Var.f200293n;
            if (h9Var3 != null) {
                h9Var3.c();
            }
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.w2
    public void e(float f17, float f18) {
        com.tencent.mm.ui.chatting.component.y8 y8Var = this.f199487a;
        if (com.tencent.mm.ui.chatting.component.y8.r0(y8Var)) {
            com.tencent.mm.ui.chatting.component.y8.p0(y8Var, f17, f18);
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.w2
    public void f() {
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter v07 = this.f199487a.v0();
        if (v07 != null) {
            v07.z1();
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.w2
    public void onHide() {
        com.tencent.mm.ui.chatting.component.y8 y8Var = this.f199487a;
        android.view.View F0 = y8Var.F0();
        if (F0 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(F0, arrayList.toArray(), "com/tencent/mm/ui/chatting/component/ChattingVoice2TxtComponent$initSpeechInputLayout$5", "onHide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            F0.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(F0, "com/tencent/mm/ui/chatting/component/ChattingVoice2TxtComponent$initSpeechInputLayout$5", "onHide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.ui.chatting.component.gp gpVar = y8Var.f200305z;
        if (gpVar != null) {
            gpVar.c();
        }
        y8Var.G0();
        if (com.tencent.mm.pluginsdk.ui.SpeechInputLayout.f189820y.a() == 2) {
            com.tencent.mm.ui.chatting.component.y8.n0(y8Var);
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.w2
    public void onShow() {
        com.tencent.mm.ui.chatting.component.y8 y8Var = this.f199487a;
        boolean z17 = false;
        if (y8Var.f200304y) {
            android.view.View F0 = y8Var.F0();
            if (F0 == null) {
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(F0, arrayList.toArray(), "com/tencent/mm/ui/chatting/component/ChattingVoice2TxtComponent$initSpeechInputLayout$5", "onShow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            F0.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(F0, "com/tencent/mm/ui/chatting/component/ChattingVoice2TxtComponent$initSpeechInputLayout$5", "onShow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View F02 = y8Var.F0();
        if (F02 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(F02, arrayList2.toArray(), "com/tencent/mm/ui/chatting/component/ChattingVoice2TxtComponent$initSpeechInputLayout$5", "onShow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            F02.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(F02, "com/tencent/mm/ui/chatting/component/ChattingVoice2TxtComponent$initSpeechInputLayout$5", "onShow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            b31.l.f17613a.h(F02, 1, y8Var.f198580d.x());
            if (!y8Var.f200302w) {
                y8Var.G0();
            }
        }
        if (com.tencent.mm.pluginsdk.ui.SpeechInputLayout.f189820y.a() == 2) {
            com.tencent.mm.pluginsdk.ui.SpeechInputLayout B0 = y8Var.B0();
            if (B0 != null && B0.getCurV2TStatus() == 1) {
                z17 = true;
            }
            if (z17) {
                y8Var.J0();
            } else {
                com.tencent.mm.ui.chatting.component.y8.n0(y8Var);
            }
        }
    }
}
