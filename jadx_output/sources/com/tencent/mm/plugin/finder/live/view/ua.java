package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes3.dex */
public final class ua implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderJumpInfo f116720d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f116721e;

    public ua(com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo, kotlin.jvm.internal.h0 h0Var) {
        this.f116720d = finderJumpInfo;
        this.f116721e = h0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/FinderLivePromoteAddWidget$getItemView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = this.f116720d;
        if (finderJumpInfo != null) {
            com.tencent.mm.plugin.finder.live.plugin.gq gqVar = com.tencent.mm.plugin.finder.live.plugin.jq.f113154p;
            android.content.Context context = ((android.view.View) this.f116721e.f310123d).getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            gqVar.a(context, finderJumpInfo);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/FinderLivePromoteAddWidget$getItemView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
