package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes11.dex */
public class ag implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f203351d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ot0.q0 f203352e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ot0.r0 f203353f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.zf f203354g;

    public ag(com.tencent.mm.ui.chatting.viewitems.zf zfVar, int i17, ot0.q0 q0Var, ot0.r0 r0Var) {
        this.f203354g = zfVar;
        this.f203351d = i17;
        this.f203352e = q0Var;
        this.f203353f = r0Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = this.f203351d == 1 ? 11 : 12;
        eq1.h hVar = eq1.h.f255812a;
        ot0.q0 q0Var = this.f203352e;
        com.tencent.mm.protocal.protobuf.FinderObject d17 = hVar.d(q0Var.f348741g, q0Var.f348740f);
        java.lang.String str = q0Var.f348741g;
        java.lang.String str2 = q0Var.f348739e;
        ot0.r0 r0Var = this.f203353f;
        hVar.g(i17, str, d17, str2, r0Var.f348578f);
        int j17 = ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).j(r0Var.f348578f);
        zq1.a0 a0Var = (zq1.a0) gm0.j1.s(zq1.a0.class);
        ((yq1.z) a0Var).s(this.f203354g.f206134s.g(), r0Var.f348578f, q0Var.f348741g, i17, j17, d17 == null ? null : d17.getLiveInfo());
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
