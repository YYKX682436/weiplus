package com.tencent.mm.ui.chatting.component;

/* loaded from: classes13.dex */
public class kd implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.fd f199361d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.ld f199362e;

    public kd(com.tencent.mm.ui.chatting.component.ld ldVar, com.tencent.mm.ui.chatting.component.fd fdVar) {
        this.f199362e = ldVar;
        this.f199361d = fdVar;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/component/GroupTodoComponent$ToDoAdapter$4", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        com.tencent.mm.ui.chatting.component.dd ddVar = this.f199362e.f199412f;
        if (ddVar == null) {
            yj0.a.i(false, this, "com/tencent/mm/ui/chatting/component/GroupTodoComponent$ToDoAdapter$4", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return false;
        }
        int adapterPosition = this.f199361d.getAdapterPosition();
        com.tencent.mm.ui.chatting.component.bd bdVar = (com.tencent.mm.ui.chatting.component.bd) ddVar;
        bdVar.getClass();
        java.lang.Object tag = view.getTag();
        if (tag instanceof rn.c) {
            rn.c cVar = (rn.c) tag;
            com.tencent.mm.ui.chatting.component.qc qcVar = bdVar.f198732a;
            rl5.r rVar = new rl5.r(qcVar.f198580d.g(), view);
            rVar.B = true;
            rVar.N = true;
            rVar.P = true;
            rVar.f397351u = new com.tencent.mm.ui.chatting.component.xc(bdVar);
            rVar.f397354x = new com.tencent.mm.ui.chatting.component.zc(bdVar, cVar, adapterPosition);
            int[] iArr = new int[2];
            view.getLocationInWindow(iArr);
            int i17 = iArr[0];
            int i18 = iArr[1] - 32;
            if (i17 <= 0) {
                i17 = 16;
            }
            if (i18 < 0) {
                i18 = 16;
            }
            if (i17 > wl5.y.n(qcVar.f198580d.g())) {
                i17 = wl5.y.n(qcVar.f198580d.g()) - 16;
            }
            rVar.L = new com.tencent.mm.ui.chatting.component.ad(bdVar, view);
            rVar.f397350t = view;
            rVar.n(i17, i18);
            view.setBackgroundResource(com.tencent.mm.R.drawable.f481198mw);
            kn.k0.b(qcVar.f198580d.x(), cVar.v0() ? 1 : 0, 4, 2, cVar.field_todoid, cVar.field_username);
        }
        yj0.a.i(true, this, "com/tencent/mm/ui/chatting/component/GroupTodoComponent$ToDoAdapter$4", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
