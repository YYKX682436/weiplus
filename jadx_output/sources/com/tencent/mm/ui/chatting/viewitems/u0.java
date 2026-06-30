package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class u0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f205650d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f205651e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f205652f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f205653g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f205654h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.i1 f205655i;

    public u0(com.tencent.mm.ui.chatting.viewitems.i1 i1Var, java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        this.f205655i = i1Var;
        this.f205650d = str;
        this.f205651e = i17;
        this.f205652f = str2;
        this.f205653g = str3;
        this.f205654h = str4;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() != 0) {
            return;
        }
        com.tencent.mm.ui.chatting.viewitems.i1 i1Var = this.f205655i;
        i1Var.getClass();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        r45.le7 le7Var = new r45.le7();
        le7Var.f379398d = this.f205650d;
        le7Var.f379399e = 1;
        linkedList.add(le7Var);
        r45.h36 h36Var = new r45.h36();
        h36Var.f375808d = linkedList;
        h36Var.f375809e = 3;
        com.tencent.mm.modelbase.z2.d(((k01.a) ((k01.n0) i95.n0.c(k01.n0.class))).wi(h36Var), new com.tencent.mm.ui.chatting.viewitems.c1(i1Var, linkedList), true);
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.ui.chatting.viewitems.a1(i1Var));
        this.f205655i.e0(2, this.f205650d, this.f205652f, this.f205653g, this.f205654h, com.tencent.mm.ui.chatting.viewitems.i1.d0(i1Var, this.f205651e));
    }
}
