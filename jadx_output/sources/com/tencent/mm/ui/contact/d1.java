package com.tencent.mm.ui.contact;

/* loaded from: classes11.dex */
public class d1 implements android.widget.AdapterView.OnItemLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.ChatroomContactUI f206657d;

    public d1(com.tencent.mm.ui.contact.ChatroomContactUI chatroomContactUI) {
        this.f206657d = chatroomContactUI;
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public boolean onItemLongClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        com.tencent.mm.ui.contact.ChatroomContactUI chatroomContactUI = this.f206657d;
        if (i17 < chatroomContactUI.f206339d.getHeaderViewsCount()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ChatroomContactUI", "on item long click, but match header view");
            return true;
        }
        yk5.u uVar = chatroomContactUI.f206346n;
        if (uVar != null && uVar.f462914x) {
            return true;
        }
        com.tencent.mm.storage.z3 z3Var = (com.tencent.mm.storage.z3) chatroomContactUI.f206345m.getItem(i17 - chatroomContactUI.f206339d.getHeaderViewsCount());
        if (z3Var == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ChatroomContactUI", "null == ct position=%s", java.lang.Integer.valueOf(i17));
            return false;
        }
        java.lang.String d17 = z3Var.d1();
        if (!com.tencent.mm.storage.z3.k4(d17) && !com.tencent.mm.storage.z3.b4(d17)) {
            com.tencent.mm.ui.contact.ChatroomContactUI chatroomContactUI2 = this.f206657d;
            chatroomContactUI2.f206348p = d17;
            chatroomContactUI2.f206347o.g(view, i17, j17, chatroomContactUI2, chatroomContactUI2.f206351s, chatroomContactUI2.f206349q, chatroomContactUI2.f206350r);
        }
        return true;
    }
}
