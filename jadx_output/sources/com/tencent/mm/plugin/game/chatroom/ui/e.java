package com.tencent.mm.plugin.game.chatroom.ui;

/* loaded from: classes12.dex */
public class e implements u33.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.chatroom.ui.GameImagePreviewUI f138839a;

    public e(com.tencent.mm.plugin.game.chatroom.ui.GameImagePreviewUI gameImagePreviewUI) {
        this.f138839a = gameImagePreviewUI;
    }

    @Override // u33.i
    public void a(int i17, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.GameImagePreviewUI", "percent:%d", java.lang.Integer.valueOf(i17));
    }

    @Override // u33.i
    public void b(boolean z17, int i17, java.lang.String str, final java.lang.String str2) {
        com.tencent.mars.xlog.Log.i("MicroMsg.GameImagePreviewUI", "success:%b, errCode:%d, filePath:%s", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i17), str2);
        this.f138839a.f138825m = false;
        if (z17 && com.tencent.mm.vfs.w6.j(str2)) {
            ((ku5.t0) ku5.t0.f312615d).B(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.game.chatroom.ui.e$$a
                @Override // java.lang.Runnable
                public final void run() {
                    com.tencent.mm.plugin.game.chatroom.ui.e eVar = com.tencent.mm.plugin.game.chatroom.ui.e.this;
                    eVar.getClass();
                    int i18 = com.tencent.mm.plugin.game.chatroom.ui.GameImagePreviewUI.f138818q;
                    eVar.f138839a.U6(str2, false);
                }
            });
        } else {
            ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.game.chatroom.ui.f(this));
        }
    }
}
