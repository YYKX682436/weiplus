package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public class q6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.MainUI f208020d;

    public q6(com.tencent.mm.ui.conversation.MainUI mainUI) {
        this.f208020d = mainUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = 0;
        while (true) {
            com.tencent.mm.ui.conversation.MainUI mainUI = this.f208020d;
            if (i17 >= mainUI.f207372o.getChildCount()) {
                return;
            }
            yf5.n nVar = (yf5.n) mainUI.f207372o.getChildAt(i17).getTag();
            if (nVar != null && com.tencent.mm.storage.z3.N3(nVar.f461926m)) {
                mainUI.f207372o.setHighLightChildNew(i17);
                return;
            }
            i17++;
        }
    }
}
