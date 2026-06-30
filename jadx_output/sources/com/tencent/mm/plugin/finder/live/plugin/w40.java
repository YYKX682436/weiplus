package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class w40 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.z40 f114871d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cm2.d0 f114872e;

    public w40(com.tencent.mm.plugin.finder.live.plugin.z40 z40Var, cm2.d0 d0Var) {
        this.f114871d = z40Var;
        this.f114872e = d0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.plugin.finder.live.plugin.r60 r60Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLivePlayListBubble$refreshView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.plugin.z40 z40Var = this.f114871d;
        int i17 = z40Var.f115281d.getResources().getConfiguration().orientation;
        cm2.d0 d0Var = this.f114872e;
        if (i17 == 2) {
            qo0.c cVar = z40Var.f115283f;
            com.tencent.mm.plugin.finder.live.view.k0 k0Var = cVar instanceof com.tencent.mm.plugin.finder.live.view.k0 ? (com.tencent.mm.plugin.finder.live.view.k0) cVar : null;
            if (k0Var != null && (r60Var = (com.tencent.mm.plugin.finder.live.plugin.r60) k0Var.getPlugin(com.tencent.mm.plugin.finder.live.plugin.r60.class)) != null) {
                java.lang.String str = z40Var.f115295u;
                android.os.Bundle bundle = new android.os.Bundle();
                java.lang.String str2 = z40Var.f115296v;
                com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) d0Var.f43335v.getCustom(5);
                bundle.putByteArray(str2, finderJumpInfo != null ? finderJumpInfo.toByteArray() : null);
                r60Var.p1(str, bundle);
            }
        } else {
            com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo2 = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) d0Var.f43335v.getCustom(5);
            if (finderJumpInfo2 != null) {
                ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                android.content.Context context = z40Var.f115281d;
                kotlin.jvm.internal.o.g(context, "context");
                xc2.y2 y2Var = xc2.y2.f453343a;
                xc2.p0 p0Var = new xc2.p0(finderJumpInfo2);
                p0Var.f453252n = 0;
                xc2.y2.i(y2Var, context, p0Var, 0, null, 8, null);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLivePlayListBubble$refreshView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
