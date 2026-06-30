package com.tencent.mm.ui.chatting.component;

@yn.c(exportInterface = sb5.h.class)
/* loaded from: classes9.dex */
public class j0 extends com.tencent.mm.ui.chatting.component.a implements sb5.h {
    @Override // yn.d
    public void N(int i17, int i18, android.content.Intent intent) {
        java.lang.String stringExtra;
        com.tencent.mm.storage.z3 n17;
        java.lang.String N7;
        if (i17 != 223) {
            if (i17 == 224 && i18 == -1 && intent != null) {
                java.lang.String stringExtra2 = intent.getStringExtra("be_send_card_name");
                java.lang.String stringExtra3 = intent.getStringExtra("received_card_name");
                java.lang.String stringExtra4 = intent.getStringExtra("custom_send_text");
                boolean booleanExtra = intent.getBooleanExtra("Is_Chatroom", false);
                android.content.Intent intent2 = new android.content.Intent(this.f198580d.g(), (java.lang.Class<?>) com.tencent.mm.ui.chatting.ChattingUI.class);
                intent2.putExtra("Chat_User", stringExtra3);
                intent2.putExtra("send_card_username", stringExtra2);
                intent2.putExtra("send_card_edittext", stringExtra4);
                intent2.putExtra("Is_Chatroom", booleanExtra);
                com.tencent.mm.ui.chatting.BaseChattingUIFragment baseChattingUIFragment = this.f198580d.f460717l;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent2);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(baseChattingUIFragment, arrayList.toArray(), "com/tencent/mm/ui/chatting/component/CardComponent", "dealWithRequestCode", "(IILandroid/content/Intent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                baseChattingUIFragment.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(baseChattingUIFragment, "com/tencent/mm/ui/chatting/component/CardComponent", "dealWithRequestCode", "(IILandroid/content/Intent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                return;
            }
            return;
        }
        if (i18 != -1 || intent == null || (n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n((stringExtra = intent.getStringExtra("be_send_card_name")), true)) == null || n17.s2()) {
            return;
        }
        ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
        java.lang.String e17 = c01.a2.e(stringExtra);
        java.lang.String stringExtra5 = intent.getStringExtra("received_card_name");
        boolean booleanExtra2 = intent.getBooleanExtra("Is_Chatroom", false);
        r35.i1 i1Var = new r35.i1(this.f198580d.g());
        ((com.tencent.mm.feature.avatar.w) ((kv.c0) i95.n0.c(kv.c0.class))).getClass();
        com.tencent.mm.modelavatar.g.b(stringExtra, true, -1, null);
        int f17 = n17.f1();
        java.util.Set set = c01.e2.f37117a;
        if (com.tencent.mm.storage.z3.D3(f17)) {
            boolean n27 = n17.n2();
            int i19 = com.tencent.mm.R.string.v_;
            if (n27) {
                N7 = this.f198580d.f460717l.getResources().getString(com.tencent.mm.R.string.v_);
            } else if (n17.l2()) {
                if (((ox.g) ((tk.o) i95.n0.c(tk.o.class))).wi()) {
                    i19 = com.tencent.mm.R.string.n8y;
                }
                N7 = this.f198580d.f460717l.getResources().getString(i19);
            } else {
                N7 = this.f198580d.f460717l.getResources().getString(com.tencent.mm.R.string.mxk);
            }
        } else {
            N7 = com.tencent.mm.storage.z3.m4(stringExtra) ? com.tencent.mm.ui.transmit.SelectConversationUI.N7(com.tencent.mm.sdk.platformtools.x2.f193071a, n17) : this.f198580d.f460717l.getResources().getString(com.tencent.mm.R.string.f490447vb);
        }
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer(N7);
        stringBuffer.append(e17);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        i1Var.l(stringExtra5);
        i1Var.i(stringBuffer2);
        i1Var.g(java.lang.Boolean.TRUE);
        i1Var.j(com.tencent.mm.R.string.f490551ya);
        i1Var.a(new com.tencent.mm.ui.chatting.component.i0(this, stringExtra, stringExtra5, booleanExtra2));
        i1Var.k();
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void a() {
        yb5.d dVar = this.f198580d;
        if (dVar == null) {
            return;
        }
        android.content.Intent intent = dVar.g().getIntent();
        java.lang.String stringExtra = intent.getStringExtra("Chat_User");
        java.lang.String stringExtra2 = intent.getStringExtra("send_card_username");
        if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra2)) {
            return;
        }
        boolean booleanExtra = intent.getBooleanExtra("Is_Chatroom", false);
        java.lang.String stringExtra3 = intent.getStringExtra("send_card_edittext");
        ((dk5.s5) tg3.t1.a()).Di(stringExtra2, stringExtra, booleanExtra, null);
        if (stringExtra3 != null) {
            ((dk5.s5) tg3.t1.a()).Ui(stringExtra3, stringExtra);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0099 A[Catch: Exception -> 0x0106, TryCatch #0 {Exception -> 0x0106, blocks: (B:14:0x005f, B:17:0x0093, B:19:0x0099, B:23:0x00fd, B:34:0x0085, B:25:0x006a, B:28:0x0074, B:31:0x007f), top: B:13:0x005f, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00fd A[Catch: Exception -> 0x0106, TRY_LEAVE, TryCatch #0 {Exception -> 0x0106, blocks: (B:14:0x005f, B:17:0x0093, B:19:0x0099, B:23:0x00fd, B:34:0x0085, B:25:0x006a, B:28:0x0074, B:31:0x007f), top: B:13:0x005f, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m0(com.tencent.mm.storage.f9 r10) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.component.j0.m0(com.tencent.mm.storage.f9):boolean");
    }
}
