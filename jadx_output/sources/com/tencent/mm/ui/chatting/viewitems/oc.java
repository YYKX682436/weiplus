package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes5.dex */
public class oc implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yb5.d f205175d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.kg f205176e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.vc f205177f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.nc f205178g;

    public oc(com.tencent.mm.ui.chatting.viewitems.nc ncVar, yb5.d dVar, com.tencent.mm.ui.chatting.component.kg kgVar, com.tencent.mm.ui.chatting.viewitems.vc vcVar) {
        this.f205178g = ncVar;
        this.f205175d = dVar;
        this.f205176e = kgVar;
        this.f205177f = vcVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgPat$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view.getTag() != null && (view.getTag() instanceof com.tencent.mm.ui.chatting.viewitems.er) && ((com.tencent.mm.ui.chatting.viewitems.er) view.getTag()).c() != null) {
            yb5.d dVar = this.f205175d;
            com.tencent.mm.storage.f9 Li = pt0.f0.Li(dVar.x(), ((com.tencent.mm.ui.chatting.viewitems.er) view.getTag()).c().getMsgId());
            com.tencent.mm.ui.chatting.component.kg kgVar = this.f205176e;
            if (kgVar != null) {
                long msgId = Li.getMsgId();
                ((java.util.HashSet) ((com.tencent.mm.ui.chatting.component.h6) kgVar).f199146e).add(java.lang.Long.valueOf(msgId));
            }
            rd5.d dVar2 = ((com.tencent.mm.ui.chatting.viewitems.er) view.getTag()).f203905a;
            we5.a aVar = new we5.a(((com.tencent.mm.ui.chatting.viewitems.er) view.getTag()).f203905a.f394254d.f445299a, Li);
            dVar2.getClass();
            dVar2.f394254d = aVar;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgPat$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgPat$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            mp3.j jVar = (mp3.j) i95.n0.c(mp3.j.class);
            java.lang.String j17 = Li.j();
            ((lp3.l) jVar).getClass();
            r45.k55 e17 = bm5.d1.e(j17);
            com.tencent.mm.ui.chatting.viewitems.nc ncVar = this.f205178g;
            yb5.d dVar3 = this.f205175d;
            rd5.d dVar4 = ((com.tencent.mm.ui.chatting.viewitems.er) view.getTag()).f203905a;
            java.util.LinkedList linkedList = e17.f378386e;
            ncVar.d0(dVar3, dVar4, e17, linkedList.size(), this.f205177f);
            com.tencent.mm.autogen.mmdata.rpt.PatMessageExpandReportStruct patMessageExpandReportStruct = new com.tencent.mm.autogen.mmdata.rpt.PatMessageExpandReportStruct();
            patMessageExpandReportStruct.f59842f = patMessageExpandReportStruct.b("ChatUsername", dVar.x(), true);
            patMessageExpandReportStruct.f59841e = patMessageExpandReportStruct.b("Username", dVar.f460716k, true);
            patMessageExpandReportStruct.f59843g = linkedList.size();
            if (com.tencent.mm.storage.z3.N4(dVar.x())) {
                patMessageExpandReportStruct.f59840d = 2;
            } else {
                patMessageExpandReportStruct.f59840d = 1;
            }
            patMessageExpandReportStruct.k();
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgPat$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
