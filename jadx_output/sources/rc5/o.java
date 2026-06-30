package rc5;

/* loaded from: classes9.dex */
public final /* synthetic */ class o extends kotlin.jvm.internal.m implements yz5.l {
    public o(java.lang.Object obj) {
        super(1, obj, rc5.x.class, "dialogCanPullDown", "dialogCanPullDown(Landroid/view/MotionEvent;)Z", 0);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean z17;
        android.view.MotionEvent p07 = (android.view.MotionEvent) obj;
        kotlin.jvm.internal.o.g(p07, "p0");
        rc5.x xVar = (rc5.x) this.receiver;
        boolean z18 = false;
        if (xVar.y7()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ExpandableHalfScreenChattingUIC", "[+] dialogCanPullDown: pull down to dismiss was disabled.");
        } else {
            if (p07.getAction() == 0) {
                com.tencent.mm.ui.chatting.view.MMChattingListView mMChattingListView = xVar.W6().B;
                int rawX = (int) p07.getRawX();
                int rawY = (int) p07.getRawY();
                if (mMChattingListView != null) {
                    int[] iArr = new int[2];
                    mMChattingListView.getLocationOnScreen(iArr);
                    int i17 = iArr[0];
                    int i18 = iArr[1];
                    int measuredWidth = mMChattingListView.getMeasuredWidth() + i17;
                    int measuredHeight = mMChattingListView.getMeasuredHeight() + i18;
                    if (i17 <= rawX && rawX <= measuredWidth) {
                        if (i18 <= rawY && rawY <= measuredHeight) {
                            z17 = true;
                            xVar.C = z17;
                        }
                    }
                }
                z17 = false;
                xVar.C = z17;
            }
            if (xVar.C) {
                com.tencent.mm.ui.chatting.ChattingUIFragment W6 = xVar.W6();
                com.tencent.mm.ui.chatting.view.MMChattingListView mMChattingListView2 = W6.B;
                if (mMChattingListView2 == null || mMChattingListView2.getVisibility() != 0 || W6.B.getCurCount() == 0 || (W6.B.E0() && W6.B.getIsTopShowAll())) {
                    z18 = true;
                }
            } else {
                z18 = xVar.U6(p07);
            }
        }
        return java.lang.Boolean.valueOf(z18);
    }
}
