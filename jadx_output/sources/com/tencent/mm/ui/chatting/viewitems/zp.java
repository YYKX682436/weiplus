package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class zp extends com.tencent.mm.ui.chatting.b6 {
    public zp(com.tencent.mm.ui.chatting.viewitems.aq aqVar, yb5.d dVar) {
        super(dVar);
    }

    @Override // com.tencent.mm.ui.chatting.b6
    public void a(android.view.View view, yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        com.tencent.mm.ui.chatting.viewitems.er erVar = (com.tencent.mm.ui.chatting.viewitems.er) view.getTag();
        boolean E = c01.d9.b().E();
        yb5.d dVar2 = this.f198492d;
        if (E) {
            ((com.tencent.mm.ui.chatting.component.ro) ((sb5.q2) dVar2.f460708c.a(sb5.q2.class))).p0().k(erVar.d(), erVar.c());
        } else {
            db5.t7.k(dVar2.g(), dVar2.f460717l.getContentView());
        }
    }
}
