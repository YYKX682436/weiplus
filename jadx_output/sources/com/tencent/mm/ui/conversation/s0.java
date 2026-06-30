package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public class s0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.n2 f208053d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f208054e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f208055f;

    public s0(com.tencent.mm.ui.conversation.t0 t0Var, com.tencent.mm.ui.conversation.n2 n2Var, int i17, int i18) {
        this.f208053d = n2Var;
        this.f208054e = i17;
        this.f208055f = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.conversation.n2 n2Var = this.f208053d;
        java.lang.Object parent = n2Var.f207886c.getParent();
        com.tencent.mars.xlog.Log.i("MicroMsg.ConversationAdapter", "expected nicknameParent width: %d, nicknameParent width:%d, expected nickname width: %d, nickname width:%d", java.lang.Integer.valueOf(this.f208054e), java.lang.Integer.valueOf(parent instanceof android.view.View ? ((android.view.View) parent).getWidth() : 0), java.lang.Integer.valueOf(this.f208055f), java.lang.Integer.valueOf(n2Var.f207886c.getWidth()));
    }
}
