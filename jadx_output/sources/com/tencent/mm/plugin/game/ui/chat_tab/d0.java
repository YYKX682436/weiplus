package com.tencent.mm.plugin.game.ui.chat_tab;

/* loaded from: classes8.dex */
public final class d0 extends androidx.recyclerview.widget.h2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.chat_tab.GameMsgNoticeFragment f141253a;

    public d0(com.tencent.mm.plugin.game.ui.chat_tab.GameMsgNoticeFragment gameMsgNoticeFragment) {
        this.f141253a = gameMsgNoticeFragment;
    }

    @Override // androidx.recyclerview.widget.h2
    public void b() {
        com.tencent.mm.plugin.game.ui.chat_tab.GameMsgNoticeFragment gameMsgNoticeFragment = this.f141253a;
        com.tencent.mm.plugin.game.ui.message.InteractiveMsgMRecycleView interactiveMsgMRecycleView = gameMsgNoticeFragment.f141135h;
        if (interactiveMsgMRecycleView == null) {
            kotlin.jvm.internal.o.o("gameInteractiveMsgView");
            throw null;
        }
        androidx.recyclerview.widget.f2 adapter = interactiveMsgMRecycleView.getAdapter();
        kotlin.jvm.internal.o.d(adapter);
        if (adapter.getItemCount() <= 1) {
            o43.a aVar = gameMsgNoticeFragment.f141132e;
            kotlin.jvm.internal.o.d(aVar);
            aVar.f342839b.setVisibility(0);
        } else {
            o43.a aVar2 = gameMsgNoticeFragment.f141132e;
            kotlin.jvm.internal.o.d(aVar2);
            aVar2.f342839b.setVisibility(8);
        }
    }
}
