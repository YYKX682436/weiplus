package com.tencent.mm.ui.chatting.presenter;

/* loaded from: classes9.dex */
public final class a0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.presenter.h0 f202102d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f202103e;

    public a0(com.tencent.mm.ui.chatting.presenter.h0 h0Var, java.util.List list) {
        this.f202102d = h0Var;
        this.f202103e = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.ui.chatting.presenter.h0 h0Var = this.f202102d;
        com.tencent.mm.ui.chatting.gallery.EmojiHistoryListFragment emojiHistoryListFragment = h0Var.f202238g;
        if (emojiHistoryListFragment != null) {
            emojiHistoryListFragment.r0(this.f202103e, h0Var.f202240i);
        }
    }
}
