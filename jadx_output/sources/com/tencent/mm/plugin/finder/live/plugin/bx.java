package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class bx implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.fx f112085d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cm2.a0 f112086e;

    public bx(com.tencent.mm.plugin.finder.live.plugin.fx fxVar, cm2.a0 a0Var) {
        this.f112085d = fxVar;
        this.f112086e = a0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveMemberBubble$refreshView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        bf2.c cVar = bf2.c.f19598a;
        com.tencent.mm.plugin.finder.live.plugin.fx fxVar = this.f112085d;
        gk2.e eVar = fxVar.f112598e;
        cm2.a0 a0Var = this.f112086e;
        bf2.c.c(cVar, eVar, 5, 10, java.lang.String.valueOf(a0Var.f43385d), 0, null, 0, 0, null, 0, 1008, null);
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) a0Var.f43329v.getCustom(2);
        if (finderJumpInfo != null) {
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            android.content.Context context = fxVar.f112602i.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            xc2.y2 y2Var = xc2.y2.f453343a;
            xc2.p0 p0Var = new xc2.p0(finderJumpInfo);
            p0Var.f453252n = 0;
            xc2.y2.i(y2Var, context, p0Var, 0, null, 8, null);
        }
        yz5.l lVar = fxVar.f112599f;
        if (lVar != null) {
            lVar.invoke(a0Var);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveMemberBubble$refreshView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
