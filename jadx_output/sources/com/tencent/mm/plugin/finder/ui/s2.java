package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes10.dex */
public final class s2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderConversationFragment f129790d;

    public s2(com.tencent.mm.plugin.finder.ui.FinderConversationFragment finderConversationFragment) {
        this.f129790d = finderConversationFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = com.tencent.mm.plugin.finder.ui.FinderConversationFragment.I;
        this.f129790d.w0().notifyItemChanged(0);
    }
}
