package com.tencent.mm.ui.chatting;

/* loaded from: classes11.dex */
public class ChattingUIProxy implements com.tencent.mm.ui.IChattingUIProxy {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.ui.chatting.BaseChattingUIFragment f198280a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.ui.MMFragmentActivity f198281b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f198282c = false;

    /* renamed from: d, reason: collision with root package name */
    public int f198283d = -1;

    public ChattingUIProxy(com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity, com.tencent.mm.ui.chatting.BaseChattingUIFragment baseChattingUIFragment) {
        this.f198280a = baseChattingUIFragment;
        this.f198281b = mMFragmentActivity;
    }

    @Override // com.tencent.mm.ui.IChattingUIProxy
    public void onEnterBegin() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUIProxy", "[onEnterBegin]");
        com.tencent.mm.ui.chatting.BaseChattingUIFragment baseChattingUIFragment = this.f198280a;
        baseChattingUIFragment.s0();
        if (baseChattingUIFragment.isCurrentActivity || baseChattingUIFragment.f198155i) {
            baseChattingUIFragment.L0();
        }
        baseChattingUIFragment.L0();
        baseChattingUIFragment.n0();
        if (this.f198283d == -1 || !(this.f198281b instanceof com.tencent.mm.ui.MMActivity)) {
            return;
        }
        baseChattingUIFragment.getController().G0(this.f198283d);
    }

    @Override // com.tencent.mm.ui.IChattingUIProxy
    public void onEnterEnd() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUIProxy", "[onEnterEnd]");
        com.tencent.mm.ui.chatting.BaseChattingUIFragment baseChattingUIFragment = this.f198280a;
        if (baseChattingUIFragment.J0(256)) {
            baseChattingUIFragment.m0();
            baseChattingUIFragment.M0();
            baseChattingUIFragment.f198152f.f460710e.l0();
        }
    }

    @Override // com.tencent.mm.ui.IChattingUIProxy
    public void onExitBegin() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUIProxy", "[onExitBegin]");
        com.tencent.mm.ui.chatting.BaseChattingUIFragment baseChattingUIFragment = this.f198280a;
        if (!baseChattingUIFragment.H0()) {
            baseChattingUIFragment.N0();
        }
        if (this.f198281b instanceof com.tencent.mm.ui.MMActivity) {
            this.f198283d = baseChattingUIFragment.getController().f208673u0;
        }
    }

    @Override // com.tencent.mm.ui.IChattingUIProxy
    public void onExitEnd() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUIProxy", "[onExitEnd]");
        com.tencent.mm.ui.chatting.BaseChattingUIFragment baseChattingUIFragment = this.f198280a;
        baseChattingUIFragment.l0();
        baseChattingUIFragment.o0();
        baseChattingUIFragment.p0(512, new com.tencent.mm.ui.chatting.h1(baseChattingUIFragment));
        baseChattingUIFragment.t0();
        baseChattingUIFragment.P0();
        baseChattingUIFragment.P0();
    }

    @Override // com.tencent.mm.ui.IChattingUIProxy
    public void onInit(int i17, boolean z17) {
        boolean z18;
        this.f198282c = true;
        com.tencent.mm.ui.chatting.BaseChattingUIFragment baseChattingUIFragment = this.f198280a;
        baseChattingUIFragment.f198155i = true;
        com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity = this.f198281b;
        java.util.List<androidx.fragment.app.Fragment> fragments = mMFragmentActivity.getSupportFragmentManager().getFragments();
        if (fragments == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUIProxy", "fragments is null");
        } else if (fragments.size() >= 5) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChattingUIProxy", "fragments more than 5! %s", java.lang.Integer.valueOf(fragments.size()));
            java.util.Iterator<androidx.fragment.app.Fragment> it = fragments.iterator();
            while (it.hasNext()) {
                if (it.next() instanceof com.tencent.mm.ui.chatting.ChattingUIFragment) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.ChattingUIProxy", "fragments more than 5 and find a ChattingUIFragment!!");
                    z18 = false;
                    break;
                }
            }
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUIProxy", "fragments size %s", java.lang.Integer.valueOf(fragments.size()));
        }
        z18 = true;
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUIProxy", "[onInit] isPreload：%s ok:%s", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18));
        if (z18) {
            androidx.fragment.app.i2 beginTransaction = mMFragmentActivity.getSupportFragmentManager().beginTransaction();
            beginTransaction.h(i17, baseChattingUIFragment, null, 1);
            beginTransaction.e();
            mMFragmentActivity.getSupportFragmentManager().executePendingTransactions();
        } else {
            androidx.fragment.app.i2 beginTransaction2 = mMFragmentActivity.getSupportFragmentManager().beginTransaction();
            beginTransaction2.k(i17, baseChattingUIFragment, null);
            beginTransaction2.g();
        }
        if (z17) {
            onExitBegin();
            onExitEnd();
        }
        baseChattingUIFragment.f198155i = false;
    }
}
