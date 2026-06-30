package com.tencent.mm.ui.chatting.component;

/* loaded from: classes5.dex */
public final class j8 implements com.tencent.mm.pluginsdk.ui.v2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.y8 f199258a;

    public j8(com.tencent.mm.ui.chatting.component.y8 y8Var) {
        this.f199258a = y8Var;
    }

    @Override // com.tencent.mm.pluginsdk.ui.v2
    public void a() {
        com.tencent.mm.pluginsdk.ui.chat.c8 c8Var;
        com.tencent.mm.ui.chatting.component.y8 y8Var = this.f199258a;
        a31.m mVar = y8Var.f200292m;
        if (mVar != null) {
            mVar.j();
        }
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter v07 = y8Var.v0();
        if (v07 != null && (c8Var = v07.D2) != null) {
            c8Var.m();
        }
        fl5.i C0 = y8Var.C0();
        if (C0 != null) {
            C0.setHint("");
        }
        a31.m mVar2 = y8Var.f200292m;
        if (mVar2 == null) {
            return;
        }
        mVar2.f973g = 1;
    }

    @Override // com.tencent.mm.pluginsdk.ui.v2
    public void b() {
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter v07 = this.f199258a.v0();
        if (v07 != null) {
            android.widget.Button button = v07.f190027n;
            if (button != null) {
                button.performClick();
            }
            com.tencent.mm.pluginsdk.ui.chat.c8 c8Var = v07.D2;
            if (c8Var == null || !c8Var.n()) {
                return;
            }
            v07.D2.a();
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.v2
    public void c(int i17) {
        a31.m mVar = this.f199258a.f200292m;
        if (mVar != null) {
            mVar.l(i17);
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.v2
    public void d() {
        com.tencent.mm.ui.chatting.component.y8 y8Var = this.f199258a;
        y8Var.A0().G("show_guide", true);
        fl5.i C0 = y8Var.C0();
        if (C0 == null) {
            return;
        }
        C0.setHint("");
    }

    @Override // com.tencent.mm.pluginsdk.ui.v2
    public void e(int i17) {
        z21.w wVar;
        a31.m mVar = this.f199258a.f200292m;
        if (mVar == null || (wVar = mVar.f985s) == null) {
            return;
        }
        wVar.e(i17);
    }

    @Override // com.tencent.mm.pluginsdk.ui.v2
    public void f() {
        fl5.i C0 = this.f199258a.C0();
        if (C0 == null) {
            return;
        }
        C0.setHint("");
    }

    @Override // com.tencent.mm.pluginsdk.ui.v2
    public void g(int i17) {
        android.content.Context w07;
        int i18;
        com.tencent.mm.pluginsdk.ui.SpeechInputLayout B0;
        com.tencent.mm.ui.chatting.component.y8 y8Var = this.f199258a;
        a31.m mVar = y8Var.f200292m;
        if ((mVar != null && mVar.f973g == 1) && (B0 = y8Var.B0()) != null) {
            u35.b.f424431c = java.lang.System.currentTimeMillis();
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("chat_session_id", u35.b.f424429a);
            hashMap.put("last_emoji_clk_ts", java.lang.Long.valueOf(u35.b.f424432d));
            hashMap.put("last_clk_btn_name", java.lang.Integer.valueOf(u35.b.f424430b));
            cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
            aVar.pk(B0, "speech_to_text_button");
            aVar.gk(B0, hashMap);
            aVar.ik(B0, 8, 35963);
            u35.b.f424430b = 1;
        }
        a31.m mVar2 = y8Var.f200292m;
        if (mVar2 != null) {
            mVar2.i(i17);
        }
        y8Var.A0().putBoolean("hide_btn_bubble_guide", true);
        if (!y8Var.A0().i("show_guide", false) && j62.e.g().c(new com.tencent.mm.repairer.config.chatting.RepairerConfigVoiceInputGuide()) == 1) {
            fl5.i C0 = y8Var.C0();
            if (C0 != null) {
                if (com.tencent.mm.sdk.platformtools.m2.j()) {
                    w07 = y8Var.w0();
                    i18 = com.tencent.mm.R.string.ona;
                } else {
                    w07 = y8Var.w0();
                    i18 = com.tencent.mm.R.string.onb;
                }
                C0.setHint(w07.getString(i18));
            }
            y8Var.f200296q = y8Var.A0().o("show_count", 0);
            y8Var.f200296q++;
            y8Var.A0().A("show_count", y8Var.f200296q);
            if (y8Var.f200296q >= 3) {
                y8Var.A0().G("show_guide", true);
            }
        }
    }
}
