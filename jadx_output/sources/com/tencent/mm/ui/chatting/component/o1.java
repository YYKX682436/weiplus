package com.tencent.mm.ui.chatting.component;

/* loaded from: classes11.dex */
public class o1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f199606d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f199607e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f199608f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f199609g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f199610h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f199611i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.q2 f199612m;

    public o1(com.tencent.mm.ui.chatting.component.q2 q2Var, boolean z17, com.tencent.mm.storage.f9 f9Var, java.util.LinkedList linkedList, int i17, java.util.LinkedList linkedList2, int i18) {
        this.f199612m = q2Var;
        this.f199606d = z17;
        this.f199607e = f9Var;
        this.f199608f = linkedList;
        this.f199609g = i17;
        this.f199610h = linkedList2;
        this.f199611i = i18;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        if (!this.f199606d) {
            com.tencent.mm.ui.chatting.component.q2.m0(this.f199612m, this.f199607e, this.f199608f, this.f199610h, this.f199611i, this.f199609g, false);
            return;
        }
        com.tencent.mm.ui.chatting.component.q2 q2Var = this.f199612m;
        q2Var.f199745q = null;
        gd0.f V6 = com.tencent.mm.chatroom.ui.DelChatroomMemberUI.V6(q2Var.f198580d.x(), this.f199607e, 2, (java.lang.String) this.f199608f.get(0), new com.tencent.mm.ui.chatting.component.n1(this));
        android.app.ProgressDialog progressDialog = q2Var.f199739h;
        if (progressDialog == null) {
            q2Var.f199739h = db5.e1.Q(q2Var.f198580d.g(), q2Var.f198580d.g().getString(com.tencent.mm.R.string.f490573yv), q2Var.f198580d.g().getString(com.tencent.mm.R.string.i4_), true, true, new com.tencent.mm.ui.chatting.component.q1(q2Var, V6));
        } else {
            progressDialog.show();
        }
    }
}
