package com.tencent.mm.ui.chatting;

/* loaded from: classes15.dex */
public class r8 extends yb5.n {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.ChattingUIFragment f202644d;

    public r8(com.tencent.mm.ui.chatting.ChattingUIFragment chattingUIFragment) {
        this.f202644d = chattingUIFragment;
    }

    @Override // yb5.n
    public void a() {
        com.tencent.mm.ui.chatting.ChattingUIFragment chattingUIFragment = this.f202644d;
        chattingUIFragment.N0();
        if (chattingUIFragment.thisActivity() instanceof wn.s) {
            ((wn.s) chattingUIFragment.thisActivity()).l6();
        }
        if (chattingUIFragment.isCurrentActivity || !chattingUIFragment.isSupportNavigationSwipeBack()) {
            chattingUIFragment.d1();
            return;
        }
        com.tencent.mm.ui.widget.SwipeBackLayout swipeBackLayout = chattingUIFragment.getSwipeBackLayout();
        com.tencent.mars.xlog.Log.i("MicroMsg.SwipeBackLayout", "scrollToFinishActivity, Scrolling %B, hasTranslucent %B, hasCallPopOut %B", java.lang.Boolean.valueOf(swipeBackLayout.f211441v), java.lang.Boolean.valueOf(swipeBackLayout.f211439t), java.lang.Boolean.valueOf(swipeBackLayout.f211440u));
        if (swipeBackLayout.a()) {
            return;
        }
        if (!swipeBackLayout.C) {
            swipeBackLayout.e(0.0f);
        } else if (swipeBackLayout.f211428f == 0) {
            swipeBackLayout.e(0.0f);
        }
        swipeBackLayout.f211441v = true;
        swipeBackLayout.f211440u = false;
        int width = swipeBackLayout.f211431i.getWidth() + swipeBackLayout.f211434o.getIntrinsicWidth() + 10;
        ii5.c cVar = swipeBackLayout.f211432m;
        cVar.f291651v = swipeBackLayout.f211431i;
        cVar.f291632c = -1;
        cVar.i(width, 0, 0, 0, 260L);
        swipeBackLayout.invalidate();
        al5.f3 f3Var = swipeBackLayout.I;
        if (f3Var != null) {
            f3Var.onDrag();
        }
        boolean z17 = !swipeBackLayout.C;
        if (!swipeBackLayout.f211432m.f291654y) {
            al5.a3.a(true, 0, z17);
        }
        swipeBackLayout.F = true;
    }
}
