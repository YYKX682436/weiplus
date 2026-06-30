package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes11.dex */
public class hg implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ot0.q0 f204108d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ot0.r0 f204109e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yb5.d f204110f;

    public hg(com.tencent.mm.ui.chatting.viewitems.zf zfVar, ot0.q0 q0Var, ot0.r0 r0Var, yb5.d dVar) {
        this.f204108d = q0Var;
        this.f204109e = r0Var;
        this.f204110f = dVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        eq1.h hVar = eq1.h.f255812a;
        ot0.q0 q0Var = this.f204108d;
        com.tencent.mm.protocal.protobuf.FinderObject d17 = hVar.d(q0Var.f348741g, q0Var.f348740f);
        java.lang.String str = q0Var.f348741g;
        java.lang.String str2 = q0Var.f348739e;
        ot0.r0 r0Var = this.f204109e;
        hVar.g(13, str, d17, str2, r0Var.f348578f);
        ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).s(this.f204110f.g(), r0Var.f348578f, q0Var.f348741g, 13, ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).j(r0Var.f348578f), d17 == null ? null : d17.getLiveInfo());
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
