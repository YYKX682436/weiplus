package com.tencent.mm.ui.chatting;

/* loaded from: classes9.dex */
public final class q1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.BizHalfScreenChattingUI f202596d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(com.tencent.mm.ui.chatting.BizHalfScreenChattingUI bizHalfScreenChattingUI) {
        super(1);
        this.f202596d = bizHalfScreenChattingUI;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.ui.chatting.ChattingUIFragment chattingUIFragment;
        com.tencent.mm.ui.chatting.view.MMChattingListView mMChattingListView;
        boolean z17;
        android.view.MotionEvent it = (android.view.MotionEvent) obj;
        kotlin.jvm.internal.o.g(it, "it");
        int i17 = com.tencent.mm.ui.chatting.BizHalfScreenChattingUI.f198161z;
        com.tencent.mm.ui.chatting.BizHalfScreenChattingUI bizHalfScreenChattingUI = this.f202596d;
        bizHalfScreenChattingUI.getClass();
        boolean z18 = true;
        if (it.getAction() == 0) {
            com.tencent.mm.ui.chatting.view.MMChattingListView mMChattingListView2 = bizHalfScreenChattingUI.f198254h.B;
            int rawX = (int) it.getRawX();
            int rawY = (int) it.getRawY();
            if (mMChattingListView2 != null) {
                int[] iArr = new int[2];
                mMChattingListView2.getLocationOnScreen(iArr);
                int i18 = iArr[0];
                int i19 = iArr[1];
                int measuredWidth = mMChattingListView2.getMeasuredWidth() + i18;
                int measuredHeight = mMChattingListView2.getMeasuredHeight() + i19;
                if (i18 <= rawX && rawX <= measuredWidth) {
                    if (i19 <= rawY && rawY <= measuredHeight) {
                        z17 = true;
                        bizHalfScreenChattingUI.f198164w = z17;
                    }
                }
            }
            z17 = false;
            bizHalfScreenChattingUI.f198164w = z17;
        }
        if (bizHalfScreenChattingUI.f198164w && ((chattingUIFragment = bizHalfScreenChattingUI.f198254h) == null || (mMChattingListView = chattingUIFragment.B) == null || !mMChattingListView.E0() || !chattingUIFragment.B.getIsTopShowAll())) {
            z18 = false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.BizDialogChattingUI", "dialogCanPullDown:   isDownInListViewArea:" + bizHalfScreenChattingUI.f198164w + "  result:" + z18);
        return java.lang.Boolean.valueOf(z18);
    }
}
