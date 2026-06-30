package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class sp implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.tp f205537d;

    public sp(com.tencent.mm.ui.chatting.viewitems.tp tpVar) {
        this.f205537d = tpVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.modelbase.r1 e17 = c01.d9.e();
        com.tencent.mm.ui.chatting.viewitems.tp tpVar = this.f205537d;
        com.tencent.mm.ui.chatting.viewitems.up upVar = tpVar.f205628f;
        com.tencent.mm.ui.chatting.viewitems.qp qpVar = new com.tencent.mm.ui.chatting.viewitems.qp(this);
        upVar.f205724t = qpVar;
        e17.a(331, qpVar);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        r45.u17 u17Var = new r45.u17();
        u17Var.f386951d = tpVar.f205627e.f472683b;
        linkedList.add(u17Var);
        zf4.e eVar = new zf4.e(1, linkedList, linkedList.size());
        c01.d9.e().g(eVar);
        com.tencent.mm.ui.chatting.viewitems.up upVar2 = tpVar.f205628f;
        upVar2.f205725u = db5.e1.Q(upVar2.f205723s.g(), tpVar.f205628f.f205723s.s().getString(com.tencent.mm.R.string.f490573yv), tpVar.f205628f.f205723s.s().getString(com.tencent.mm.R.string.b3g), true, true, new com.tencent.mm.ui.chatting.viewitems.rp(this, eVar));
    }
}
