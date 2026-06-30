package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes10.dex */
public final class g extends yn.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.j f204000d;

    public g(com.tencent.mm.ui.chatting.viewitems.j jVar) {
        this.f204000d = jVar;
    }

    @Override // yn.a, yn.l
    public void J() {
        yn.j jVar;
        com.tencent.mm.ui.chatting.viewitems.j jVar2 = this.f204000d;
        android.view.View view = jVar2.f204217y;
        android.view.View findViewWithTag = view != null ? view.findViewWithTag("fluent_view_tag") : null;
        if (findViewWithTag != null) {
            com.tencent.mars.xlog.Log.i("ChatingItemAppMsgFinderLiveFeed", "onChattingExitAnimEnd detach fluent view " + findViewWithTag + " feedId: " + jVar2.f204218z);
            if (jVar2.f204218z == 0) {
                android.view.View view2 = jVar2.f204217y;
                android.view.ViewGroup viewGroup = view2 instanceof android.view.ViewGroup ? (android.view.ViewGroup) view2 : null;
                if (viewGroup != null) {
                    viewGroup.removeView(findViewWithTag);
                }
            } else {
                zy2.c8 c8Var = (zy2.c8) i95.n0.c(zy2.c8.class);
                long j17 = jVar2.f204218z;
                ((c61.d8) c8Var).getClass();
                ig2.m mVar = ig2.m.f291393a;
                ig2.r h17 = mVar.h(j17, true);
                if (h17 != null) {
                    h17.h();
                }
                ((c61.d8) ((zy2.c8) i95.n0.c(zy2.c8.class))).getClass();
                mVar.d();
            }
        }
        yb5.d dVar = jVar2.f204216x;
        if (dVar == null || (jVar = (yn.j) dVar.f460708c.a(yn.j.class)) == null) {
            return;
        }
        ((com.tencent.mm.ui.chatting.component.y4) jVar).c(this);
    }
}
