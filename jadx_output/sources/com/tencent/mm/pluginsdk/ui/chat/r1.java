package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes5.dex */
public class r1 implements fl5.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.ChatFooter f190594a;

    public r1(com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter) {
        this.f190594a = chatFooter;
    }

    @Override // fl5.f
    public void a(java.lang.CharSequence charSequence) {
        java.lang.CharSequence charSequence2;
        fl5.i iVar;
        if (charSequence == null || charSequence.length() <= 0) {
            return;
        }
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = this.f190594a;
        if (chatFooter.f190022m2 || !chatFooter.f190028n2) {
            long clearCallingIdentity = android.os.Binder.clearCallingIdentity();
            try {
                try {
                    charSequence2 = com.tencent.mm.sdk.platformtools.b0.a();
                } catch (java.lang.SecurityException e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.ChatFooter", "commitText getText SecurityException: " + e17.getMessage());
                    android.os.Binder.restoreCallingIdentity(clearCallingIdentity);
                    charSequence2 = null;
                }
                if (!com.tencent.mm.sdk.platformtools.t8.J0(charSequence2) && charSequence2.toString().equals(charSequence.toString())) {
                    boolean z17 = chatFooter.f190022m2;
                    u35.a aVar = u35.a.f424427a;
                    if (z17) {
                        chatFooter.f190022m2 = false;
                        com.tencent.mm.pluginsdk.ui.chat.y4 y4Var = chatFooter.f189955a3;
                        int length = charSequence.length();
                        if (y4Var != null) {
                            com.tencent.mm.autogen.mmdata.rpt.InputChangeLineStruct inputChangeLineStruct = new com.tencent.mm.autogen.mmdata.rpt.InputChangeLineStruct();
                            inputChangeLineStruct.f58502h = 5;
                            inputChangeLineStruct.f58498d = 1L;
                            inputChangeLineStruct.q(y4Var.c());
                            if (length > 0) {
                                inputChangeLineStruct.f58504j = 1L;
                                inputChangeLineStruct.f58506l = length;
                            }
                            inputChangeLineStruct.p(u35.a.f424428b);
                            inputChangeLineStruct.f58508n = java.lang.System.currentTimeMillis();
                            aVar.a(inputChangeLineStruct);
                            inputChangeLineStruct.k();
                        }
                    } else if (!chatFooter.f190028n2 && (iVar = chatFooter.f190021m) != null && (iVar.getText() == null || chatFooter.f190021m.getText().length() == 0)) {
                        com.tencent.mm.pluginsdk.ui.chat.y4 y4Var2 = chatFooter.f189955a3;
                        int length2 = charSequence.length();
                        if (y4Var2 != null) {
                            com.tencent.mm.autogen.mmdata.rpt.InputChangeLineStruct inputChangeLineStruct2 = new com.tencent.mm.autogen.mmdata.rpt.InputChangeLineStruct();
                            inputChangeLineStruct2.f58502h = 6;
                            inputChangeLineStruct2.f58498d = 1L;
                            inputChangeLineStruct2.q(y4Var2.c());
                            if (length2 > 0) {
                                inputChangeLineStruct2.f58504j = 1L;
                                inputChangeLineStruct2.f58506l = length2;
                            }
                            inputChangeLineStruct2.p(u35.a.f424428b);
                            inputChangeLineStruct2.f58508n = java.lang.System.currentTimeMillis();
                            aVar.a(inputChangeLineStruct2);
                            inputChangeLineStruct2.k();
                        }
                    }
                }
            } finally {
                android.os.Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
        chatFooter.f190022m2 = false;
    }

    @Override // fl5.f
    public void sendKeyEvent(android.view.KeyEvent keyEvent) {
    }
}
