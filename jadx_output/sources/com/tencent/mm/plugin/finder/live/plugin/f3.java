package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class f3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.v3 f112494d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderJumpInfo f112495e;

    public f3(com.tencent.mm.plugin.finder.live.plugin.v3 v3Var, com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo) {
        this.f112494d = v3Var;
        this.f112495e = finderJumpInfo;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorAfterPlugin$showBottomLink$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        android.content.Context context = this.f112494d.f365323d.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        r45.l34 l34Var = new r45.l34();
        l34Var.set(1, java.lang.Boolean.TRUE);
        com.tencent.mm.protocal.protobuf.FinderJumpInfo info = this.f112495e;
        kotlin.jvm.internal.o.g(info, "info");
        xc2.y2 y2Var = xc2.y2.f453343a;
        xc2.p0 p0Var = new xc2.p0(info);
        p0Var.f453238c = l34Var;
        xc2.y2.i(y2Var, context, p0Var, 0, null, 8, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorAfterPlugin$showBottomLink$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
