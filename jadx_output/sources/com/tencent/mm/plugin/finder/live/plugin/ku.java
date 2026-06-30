package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class ku implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.iv f113318d;

    public ku(com.tencent.mm.plugin.finder.live.plugin.iv ivVar) {
        this.f113318d = ivVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveKTVMemberListPlugin$initListener$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.plugin.iv ivVar = this.f113318d;
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = ((mm2.c1) ivVar.P0(mm2.c1.class)).f328846n;
        if (finderObject != null) {
            ((mm2.c1) ivVar.P0(mm2.c1.class)).O1 = false;
            i95.m c17 = i95.n0.c(c61.ub.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            android.content.Context context = ivVar.R0().getContext();
            kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            c61.ub.ah((c61.ub) c17, (com.tencent.mm.ui.MMActivity) context, com.tencent.mm.plugin.finder.storage.FinderItem.Companion.a(finderObject, 16384), null, 0, null, 28, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveKTVMemberListPlugin$initListener$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
