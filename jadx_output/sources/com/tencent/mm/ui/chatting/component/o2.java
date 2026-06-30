package com.tencent.mm.ui.chatting.component;

/* loaded from: classes11.dex */
public class o2 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f199613d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f199614e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f199615f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f199616g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f199617h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.q2 f199618i;

    public o2(com.tencent.mm.ui.chatting.component.q2 q2Var, com.tencent.mm.storage.f9 f9Var, java.util.LinkedList linkedList, java.util.LinkedList linkedList2, int i17, int i18) {
        this.f199618i = q2Var;
        this.f199613d = f9Var;
        this.f199614e = linkedList;
        this.f199615f = linkedList2;
        this.f199616g = i17;
        this.f199617h = i18;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.tencent.mm.ui.chatting.component.q2 q2Var = this.f199618i;
        if (itemId == 0) {
            q2Var.f199744p = 3;
            this.f199618i.o0(this.f199613d, this.f199614e, this.f199615f, this.f199616g, this.f199617h, true);
        } else {
            if (itemId != 1) {
                return;
            }
            gd0.f V6 = com.tencent.mm.chatroom.ui.DelChatroomMemberUI.V6(q2Var.f198580d.x(), this.f199613d, 1, null, new com.tencent.mm.ui.chatting.component.n2(this));
            android.app.ProgressDialog progressDialog = q2Var.f199738g;
            if (progressDialog == null) {
                q2Var.f199738g = db5.e1.Q(q2Var.f198580d.g(), q2Var.f198580d.g().getString(com.tencent.mm.R.string.f490573yv), q2Var.f198580d.g().getString(com.tencent.mm.R.string.igr), true, true, new com.tencent.mm.ui.chatting.component.l1(q2Var, V6));
            } else {
                progressDialog.show();
            }
        }
    }
}
