package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class ia extends com.tencent.mm.ui.chatting.b6 {
    @Override // com.tencent.mm.ui.chatting.b6
    public void a(android.view.View view, yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        com.tencent.mm.ui.chatting.viewitems.er erVar = (com.tencent.mm.ui.chatting.viewitems.er) view.getTag();
        if ((erVar instanceof com.tencent.mm.ui.chatting.viewitems.go) && qn4.y.e(f9Var.getMsgId(), 3)) {
            return;
        }
        if (!f9Var.X2()) {
            if (f9Var.b3() && (view instanceof com.tencent.mm.ui.widget.MMTextView)) {
                ge5.d a17 = ge5.d.a();
                java.lang.CharSequence text = ((com.tencent.mm.ui.widget.MMTextView) view).getText();
                com.tencent.mm.storage.f9 c17 = erVar.c();
                a17.getClass();
                ge5.d.b(text, c17, 1);
                return;
            }
            return;
        }
        yb5.d dVar2 = this.f198492d;
        if (dVar2 != null) {
            android.content.Intent intent = new android.content.Intent();
            intent.addFlags(67108864);
            intent.putExtra("enter_from_scene", 3);
            ((c34.b0) ((yd0.j) i95.n0.c(yd0.j.class))).wi(dVar2.g(), intent, false);
        }
    }
}
