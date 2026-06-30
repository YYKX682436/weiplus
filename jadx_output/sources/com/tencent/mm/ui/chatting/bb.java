package com.tencent.mm.ui.chatting;

/* loaded from: classes9.dex */
public final class bb extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.db f198501d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bb(com.tencent.mm.ui.chatting.db dbVar) {
        super(1);
        this.f198501d = dbVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.MotionEvent it = (android.view.MotionEvent) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.ui.chatting.db dbVar = this.f198501d;
        boolean z17 = false;
        if (dbVar.T6()) {
            if (it.getAction() == 0) {
                dbVar.f200440w = dbVar.l7(dbVar.W6().B, (int) it.getRawX(), (int) it.getRawY());
            }
            if (dbVar.f200440w) {
                dbVar.W6();
                com.tencent.mm.ui.chatting.ChattingUIFragment W6 = dbVar.W6();
                com.tencent.mm.ui.chatting.view.MMChattingListView mMChattingListView = W6.B;
                if (mMChattingListView != null && mMChattingListView.E0() && W6.B.getIsTopShowAll()) {
                    z17 = true;
                }
            } else {
                z17 = dbVar.U6(it);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.HalfScreenChattingUIC", "dialogCanPullDown:   isDownInListViewArea:" + dbVar.f200440w + "  result:" + z17);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.HalfScreenChattingUIC", "[+] dialogCanPullDown: pull down to dismiss was disabled by " + dbVar.getClass().getName() + '.');
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
