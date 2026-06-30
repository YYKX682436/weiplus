package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class tn implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderJumpInfo f119895d;

    public tn(com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo) {
        this.f119895d = finderJumpInfo;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        df2.nm nmVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveLoadingTipWidget$setupFeedbackButton$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        i95.m c17 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb.y6((zy2.zb) c17, ml2.z4.E, "3", null, 4, null);
        dk2.ef efVar = dk2.ef.f233372a;
        com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore = dk2.ef.f233371J;
        if (liveRoomControllerStore != null && (nmVar = (df2.nm) liveRoomControllerStore.controller(df2.nm.class)) != null) {
            nmVar.Z6(this.f119895d);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveLoadingTipWidget$setupFeedbackButton$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
