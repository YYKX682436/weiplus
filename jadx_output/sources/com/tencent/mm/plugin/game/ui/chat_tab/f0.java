package com.tencent.mm.plugin.game.ui.chat_tab;

/* loaded from: classes8.dex */
public final class f0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.chat_tab.GameRoomListFragment f141267d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(com.tencent.mm.plugin.game.ui.chat_tab.GameRoomListFragment gameRoomListFragment) {
        super(0);
        this.f141267d = gameRoomListFragment;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return new com.tencent.mm.plugin.game.ui.chat_tab.ChatTabTopArea(this.f141267d.requireContext());
    }
}
