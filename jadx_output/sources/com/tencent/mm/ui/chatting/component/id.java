package com.tencent.mm.ui.chatting.component;

/* loaded from: classes13.dex */
public class id implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.fd f199225d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.ld f199226e;

    public id(com.tencent.mm.ui.chatting.component.ld ldVar, com.tencent.mm.ui.chatting.component.fd fdVar) {
        this.f199226e = ldVar;
        this.f199225d = fdVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/component/GroupTodoComponent$ToDoAdapter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.chatting.component.dd ddVar = this.f199226e.f199412f;
        if (ddVar != null) {
            int adapterPosition = this.f199225d.getAdapterPosition();
            com.tencent.mm.ui.chatting.component.bd bdVar = (com.tencent.mm.ui.chatting.component.bd) ddVar;
            bdVar.getClass();
            java.lang.Object tag = view.getTag();
            if (tag instanceof rn.c) {
                rn.c cVar = (rn.c) tag;
                boolean i17 = kn.j0.i(cVar);
                com.tencent.mars.xlog.Log.i("MicroMsg.roomTodo.GroupTodoComponent", "onFinish finish(%s %s)", cVar.field_todoid, java.lang.Boolean.valueOf(i17));
                com.tencent.mm.ui.chatting.component.qc qcVar = bdVar.f198732a;
                if (i17) {
                    jn.k Ri = ((nn.j) i95.n0.c(nn.j.class)).Ri();
                    java.lang.String x17 = qcVar.f198580d.x();
                    java.lang.String str = cVar.field_creator;
                    java.lang.String str2 = cVar.field_todoid;
                    r45.vt5 b17 = kn.j0.b(cVar);
                    Ri.getClass();
                    gm0.j1.d().g(new kn.b0(x17, str, str2, b17));
                    qcVar.n0(cVar);
                    qcVar.f199768m.notifyItemRemoved(adapterPosition);
                    qcVar.p0();
                }
                kn.k0.b(qcVar.f198580d.x(), cVar.v0() ? 1 : 0, 1, 2, cVar.field_todoid, cVar.field_username);
            } else {
                java.lang.Object[] objArr = new java.lang.Object[1];
                objArr[0] = tag == null ? "null" : tag.getClass().getSimpleName();
                com.tencent.mars.xlog.Log.e("MicroMsg.roomTodo.GroupTodoComponent", "onFinish %s", objArr);
            }
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/component/GroupTodoComponent$ToDoAdapter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
