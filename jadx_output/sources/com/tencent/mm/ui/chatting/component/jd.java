package com.tencent.mm.ui.chatting.component;

/* loaded from: classes13.dex */
public class jd implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.fd f199285d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.ld f199286e;

    public jd(com.tencent.mm.ui.chatting.component.ld ldVar, com.tencent.mm.ui.chatting.component.fd fdVar) {
        this.f199286e = ldVar;
        this.f199285d = fdVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.lang.String j17;
        ot0.q v17;
        boolean z17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/component/GroupTodoComponent$ToDoAdapter$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.chatting.component.dd ddVar = this.f199286e.f199412f;
        if (ddVar != null) {
            int adapterPosition = this.f199285d.getAdapterPosition();
            com.tencent.mm.ui.chatting.component.bd bdVar = (com.tencent.mm.ui.chatting.component.bd) ddVar;
            bdVar.getClass();
            java.lang.Object tag = view.getTag();
            if (tag instanceof rn.c) {
                rn.c cVar = (rn.c) tag;
                boolean v07 = cVar.v0();
                com.tencent.mm.ui.chatting.component.qc qcVar = bdVar.f198732a;
                if (v07) {
                    kn.j0.d(qcVar.f198580d.g(), cVar.field_roomname, false);
                } else {
                    l81.b1 b1Var = new l81.b1();
                    b1Var.f317012a = cVar.field_username;
                    b1Var.f317022f = cVar.field_path;
                    b1Var.f317032k = com.tencent.mm.plugin.appbrand.jsapi.e5.CTRL_INDEX;
                    java.lang.String str = cVar.field_roomname;
                    b1Var.f317042t = str;
                    b1Var.f317043u = str;
                    ((nn.j) i95.n0.c(nn.j.class)).wi(b1Var, cVar);
                    com.tencent.mm.storage.f9 o27 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().o2(cVar.field_roomname, cVar.u0());
                    b1Var.R = (o27 == null || (j17 = o27.j()) == null || (v17 = ot0.q.v(c01.w9.l(true, j17, o27.A0()))) == null) ? 0 : v17.f348717u2;
                    ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).bj(qcVar.f198580d.g(), b1Var);
                }
                rn.c z07 = ((nn.j) i95.n0.c(nn.j.class)).Bi().z0(cVar.field_roomname, cVar.field_todoid);
                boolean e17 = kn.j0.e(z07);
                if (z07 != null) {
                    z17 = kn.j0.j(z07);
                    if (z17) {
                        com.tencent.mm.sdk.platformtools.u3.i(new com.tencent.mm.ui.chatting.component.wc(bdVar, z07, adapterPosition), 300L);
                    }
                } else {
                    z17 = false;
                }
                kn.k0.a(qcVar.f198580d.x(), cVar.v0() ? 1 : 0, 1, cVar.field_todoid, cVar.field_username);
                java.lang.Object[] objArr = new java.lang.Object[3];
                objArr[0] = z07 != null ? z07.field_todoid : "null";
                objArr[1] = java.lang.Boolean.valueOf(z17);
                objArr[2] = java.lang.Boolean.valueOf(e17);
                com.tencent.mars.xlog.Log.i("MicroMsg.roomTodo.GroupTodoComponent", "click update to finish(%s %s %s)", objArr);
            } else {
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                objArr2[0] = tag != null ? tag.getClass().getSimpleName() : "null";
                com.tencent.mars.xlog.Log.e("MicroMsg.roomTodo.GroupTodoComponent", "onClick %s", objArr2);
            }
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/component/GroupTodoComponent$ToDoAdapter$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
