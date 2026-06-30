package com.tencent.mm.ui.conversation;

/* loaded from: classes9.dex */
public class c3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final int f207602d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f207603e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.ConversationFolderItemView f207604f;

    public c3(com.tencent.mm.ui.conversation.ConversationFolderItemView conversationFolderItemView, java.lang.Runnable runnable) {
        this.f207604f = conversationFolderItemView;
        this.f207603e = runnable;
        this.f207602d = ((yf5.n) conversationFolderItemView.getTag()).f461928o;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (((yf5.n) this.f207604f.getTag()).f461928o == this.f207602d) {
            this.f207603e.run();
        } else {
            com.tencent.mars.xlog.Log.w("ConversationFolderItemV", "Skip error match");
        }
    }
}
