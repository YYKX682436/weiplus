package com.tencent.mm.ui.chatting;

/* loaded from: classes11.dex */
public class s8 extends yb5.n {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.ChattingUIFragment f202666d;

    public s8(com.tencent.mm.ui.chatting.ChattingUIFragment chattingUIFragment) {
        this.f202666d = chattingUIFragment;
    }

    @Override // yb5.n
    public void a() {
        com.tencent.mm.ui.chatting.ChattingUIFragment chattingUIFragment = this.f202666d;
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUIFragment", "[finish] isCurrentActivity:%s", java.lang.Boolean.valueOf(chattingUIFragment.isCurrentActivity));
        if (chattingUIFragment.isCurrentActivity) {
            super/*com.tencent.mm.ui.MMFragment*/.finish();
            return;
        }
        if (chattingUIFragment.thisActivity() instanceof com.tencent.mm.ui.LauncherUI) {
            com.tencent.mm.ui.LauncherUI launcherUI = (com.tencent.mm.ui.LauncherUI) chattingUIFragment.thisActivity();
            if (launcherUI != null) {
                launcherUI.closeChatting(!chattingUIFragment.isSupportNavigationSwipeBack());
                return;
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.ChattingUIFragment", "LauncherUI is null!???");
                return;
            }
        }
        if (chattingUIFragment.thisActivity() instanceof com.tencent.mm.ui.conversation.BaseConversationUI) {
            com.tencent.mm.ui.conversation.BaseConversationUI baseConversationUI = (com.tencent.mm.ui.conversation.BaseConversationUI) chattingUIFragment.thisActivity();
            if (baseConversationUI != null) {
                baseConversationUI.closeChatting(!chattingUIFragment.isSupportNavigationSwipeBack());
                return;
            }
            return;
        }
        if (chattingUIFragment.thisActivity() instanceof wn.s) {
            ((wn.s) chattingUIFragment.thisActivity()).d6();
            return;
        }
        if (chattingUIFragment.thisActivity().getSupportFragmentManager().getFragments().size() > 0) {
            java.util.List<androidx.fragment.app.Fragment> fragments = chattingUIFragment.thisActivity().getSupportFragmentManager().getFragments();
            for (int i17 = 0; i17 < fragments.size(); i17++) {
                androidx.fragment.app.Fragment fragment = fragments.get(i17);
                if (fragment instanceof com.tencent.mm.chatting.BasePrivateMsgConvListFragment) {
                    ((com.tencent.mm.chatting.BasePrivateMsgConvListFragment) fragment).f64738u.d6();
                    return;
                }
            }
        }
    }
}
