package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes5.dex */
public class g2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.ChatFooter f190326d;

    public g2(com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter) {
        this.f190326d = chatFooter;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/chat/ChatFooter$39", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        u35.b.f424432d = java.lang.System.currentTimeMillis();
        nr.b.f339032c = true;
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = this.f190326d;
        com.tencent.mm.pluginsdk.ui.chat.k5 k5Var = chatFooter.f190090x0;
        if (k5Var != null) {
            k5Var.s(view);
        }
        if (chatFooter.f189970d2 == 2) {
            chatFooter.z1();
        } else {
            if (chatFooter.f190098y1) {
                chatFooter.v0();
            }
            chatFooter.x1();
            com.tencent.mm.ui.widget.imageview.WeImageButton emojiBtn = chatFooter.C;
            kotlin.jvm.internal.o.g(emojiBtn, "emojiBtn");
            u35.b.f424433e = true;
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("chat_session_id", u35.b.f424429a);
            hashMap.put("last_mic_clk_ts", java.lang.Long.valueOf(u35.b.f424431c));
            hashMap.put("last_clk_btn_name", java.lang.Integer.valueOf(u35.b.f424430b));
            cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
            aVar.gk(emojiBtn, hashMap);
            aVar.ik(emojiBtn, 8, 35963);
            u35.b.f424430b = 2;
            com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
            com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_EMOJI_CAPTURE_OUTER_EMOJI_BUTTON_RED_DOT_BOOLEAN;
            if (!c17.o(u3Var, false)) {
                gm0.j1.u().c().x(u3Var, java.lang.Boolean.TRUE);
                android.view.View findViewById = chatFooter.f189975e.findViewById(com.tencent.mm.R.id.bqs);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$39", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$39", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$39", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
