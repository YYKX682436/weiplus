package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public abstract class ld {
    public static boolean a(com.tencent.mm.storage.f9 f9Var) {
        rt0.c cVar;
        if (c01.ia.D(f9Var)) {
            return true;
        }
        ot0.q v17 = ot0.q.v(f9Var.U1());
        return (v17 == null || (cVar = (rt0.c) v17.y(rt0.c.class)) == null || cVar.f399374b != 2) ? false : true;
    }

    public static boolean b(final yb5.d dVar, android.view.View view) {
        if (com.tencent.mm.ui.tk.f209956c.a()) {
            return true;
        }
        if (view.getTag() instanceof com.tencent.mm.ui.chatting.viewitems.er) {
            final com.tencent.mm.ui.chatting.viewitems.er erVar = (com.tencent.mm.ui.chatting.viewitems.er) view.getTag();
            if (erVar.c() != null) {
                android.content.Intent intent = new android.content.Intent(dVar.g(), (java.lang.Class<?>) com.tencent.mm.ui.chatting.TextPreviewUI.class);
                intent.addFlags(67108864);
                intent.putExtra("Chat_Msg_Id", erVar.c().getMsgId());
                intent.putExtra("Chat_User", erVar.c().Q0());
                ot0.q v17 = ot0.q.v(((com.tencent.mm.ui.chatting.component.ym) ((sb5.l2) dVar.f460708c.a(sb5.l2.class))).q0(erVar.c(), false));
                if (v17 != null) {
                    intent.putExtra("key_chat_text", v17.f348654f);
                }
                intent.putExtra("key_chat_from", view.getContext().getClass().getName());
                intent.putExtra("is_group_chat", dVar.D());
                j45.l.q(dVar.f460709d, intent, 1010, new j45.g() { // from class: com.tencent.mm.ui.chatting.viewitems.ld$$b
                    @Override // j45.g
                    public final void onActivityResult(int i17, int i18, android.content.Intent intent2) {
                        if (i17 == 1010 && i18 == 101) {
                            java.lang.Object a17 = ok5.d.a(intent2, "kPartialQuoteContent");
                            if (a17 instanceof r15.g) {
                                ((com.tencent.mm.ui.chatting.component.jb) ((sb5.s0) yb5.d.this.f460708c.a(sb5.s0.class))).o0(erVar.c(), (r15.g) a17);
                            }
                        }
                    }
                });
                db5.f.j(view.getContext());
                return true;
            }
        }
        return false;
    }
}
