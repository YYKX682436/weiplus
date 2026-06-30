package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes8.dex */
public final class g6 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderFinderSysMsgUI f129288d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g6(com.tencent.mm.plugin.finder.ui.FinderFinderSysMsgUI finderFinderSysMsgUI) {
        super(0);
        this.f129288d = finderFinderSysMsgUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return new com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.MsgPresenter(this.f129288d.getIntent().getIntExtra("key_sys_msg_scene", 1), 2, new int[]{4});
    }
}
