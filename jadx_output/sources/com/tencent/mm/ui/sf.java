package com.tencent.mm.ui;

/* loaded from: classes11.dex */
public class sf implements yb5.m {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.NewChattingTabUI f209857d;

    public sf(com.tencent.mm.ui.NewChattingTabUI newChattingTabUI) {
        this.f209857d = newChattingTabUI;
    }

    @Override // android.os.MessageQueue.IdleHandler
    public boolean queueIdle() {
        boolean z17;
        com.tencent.mm.ui.NewChattingTabUI newChattingTabUI = this.f209857d;
        try {
            z17 = true;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.LauncherUI.NewChattingTabUI", e17, "", new java.lang.Object[0]);
            new android.os.Handler().post(new com.tencent.mm.ui.rf(this, e17));
        }
        if (!newChattingTabUI.f197014a.isFinishing() && !newChattingTabUI.f197014a.isDestroyed()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI.NewChattingTabUI", "prepare chattingUI logic start");
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            if (newChattingTabUI.f197016c == null) {
                com.tencent.mm.ui.NewChattingTabUI.e(newChattingTabUI, new android.content.Intent().putExtra("Chat_User", ""), true);
                newChattingTabUI.f197016c.setVisibility(8);
                com.tencent.mm.ui.conversation.MainUI mainUI = (com.tencent.mm.ui.conversation.MainUI) ((com.tencent.mm.ui.HomeUI) newChattingTabUI.f197015b).f196761t.f196935o.get(0);
                if (mainUI != null) {
                    mainUI.s0();
                }
                db5.m9.a(true, new android.content.Intent().putExtra("classname", com.tencent.mm.ui.LauncherUI.class.getName().concat("")));
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI.NewChattingTabUI", "prepare chattingUI logic use %dms", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
            return false;
        }
        java.lang.Object[] objArr = new java.lang.Object[1];
        if (!newChattingTabUI.f197014a.isDestroyed() && !newChattingTabUI.f197014a.isFinishing()) {
            z17 = false;
        }
        objArr[0] = java.lang.Boolean.valueOf(z17);
        com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI.NewChattingTabUI", "prepare chattingUI but activity finished isDestroyed[%b]", objArr);
        return false;
    }
}
