package com.tencent.mm.view.manager;

/* loaded from: classes8.dex */
public class e implements ur.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.manager.d f213655a;

    public e(com.tencent.mm.view.manager.d dVar) {
        this.f213655a = dVar;
    }

    public void a(java.lang.String str, final com.tencent.mm.api.IEmojiInfo iEmojiInfo) {
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f213655a.f213645u) && !com.tencent.mm.sdk.platformtools.t8.D0(str, this.f213655a.f213645u)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.emoji.SmileyPanel.SmileyPanelManager", "user not match toUser:%s, talkName:$s", str, this.f213655a.f213645u);
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).B(new java.lang.Runnable() { // from class: com.tencent.mm.view.manager.e$$a
            @Override // java.lang.Runnable
            public final void run() {
                com.tencent.mm.view.manager.d dVar = com.tencent.mm.view.manager.e.this.f213655a;
                com.tencent.mm.pluginsdk.ui.chat.v9 v9Var = dVar.C;
                if (v9Var != null) {
                    v9Var.b(iEmojiInfo);
                }
                java.lang.Runnable runnable = dVar.M;
                if (runnable != null) {
                    runnable.run();
                    dVar.M = null;
                }
            }
        });
    }
}
