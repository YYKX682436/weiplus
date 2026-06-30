package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.n2 f207766d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f207767e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f207768f;

    public j(com.tencent.mm.ui.conversation.k kVar, com.tencent.mm.ui.conversation.n2 n2Var, int i17, int i18) {
        this.f207766d = n2Var;
        this.f207767e = i17;
        this.f207768f = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.conversation.n2 n2Var = this.f207766d;
        java.lang.Object parent = n2Var.f207886c.getParent();
        com.tencent.mars.xlog.Log.i("MicroMsg.ConversationAdapter", "expected nicknameParent width: %d, nicknameParent width:%d, expected nickname width: %d, nickname width:%d", java.lang.Integer.valueOf(this.f207767e), java.lang.Integer.valueOf(parent instanceof android.view.View ? ((android.view.View) parent).getWidth() : 0), java.lang.Integer.valueOf(this.f207768f), java.lang.Integer.valueOf(n2Var.f207886c.getWidth()));
    }
}
