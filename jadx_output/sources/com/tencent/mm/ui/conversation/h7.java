package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public class h7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public int f207719d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f207720e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.MainUI f207721f;

    public h7(com.tencent.mm.ui.conversation.MainUI mainUI, boolean z17) {
        this.f207721f = mainUI;
        this.f207720e = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.conversation.MainUI mainUI = this.f207721f;
        if (mainUI.f207372o == null) {
            return;
        }
        int i17 = com.tencent.mm.ui.bl.i(mainUI.getContext(), -1);
        int a17 = o25.n1.a(mainUI.f207372o.getContext());
        if (i17 <= 0 || a17 <= 0) {
            if (this.f207719d < 2) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MainUI", "[trySetListViewMargin] try getStatusHeight again!");
                mainUI.f207372o.post(this);
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.MainUI", "[trySetListViewMargin] try getStatusHeight finally!");
            }
            this.f207719d++;
        } else if (i17 != mainUI.f207372o.getPaddingTop()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MainUI", "[initListViewPadding] now:%s old:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(mainUI.f207372o.getPaddingTop()));
            if (this.f207720e) {
                a17 = 0;
            }
            mainUI.t0(a17, i17);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.MainUI", "[trySetListViewMargin] has try more once! it's right! statusHeight:%s", java.lang.Integer.valueOf(i17));
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MainUI", "[trySetListViewMargin] tryCount:%s statusHeight:%s", java.lang.Integer.valueOf(this.f207719d), java.lang.Integer.valueOf(i17));
    }
}
