package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes10.dex */
public final class sk implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderWxConversationFragment f129819d;

    public sk(com.tencent.mm.plugin.finder.ui.FinderWxConversationFragment finderWxConversationFragment) {
        this.f129819d = finderWxConversationFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = com.tencent.mm.plugin.finder.ui.FinderWxConversationFragment.E;
        this.f129819d.w0().notifyItemChanged(0);
    }
}
