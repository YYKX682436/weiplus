package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public class pa implements p21.a {

    /* renamed from: d, reason: collision with root package name */
    public android.app.Activity f207969d;

    /* renamed from: e, reason: collision with root package name */
    public yf5.j0 f207970e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.conversation.ConversationListView f207971f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.sdk.event.IListener f207972g = null;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.sdk.event.IListener f207973h = null;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.sdk.event.IListener f207974i = null;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.Runnable f207975m = new com.tencent.mm.ui.conversation.na(this);

    @Override // p21.a
    public void Z1(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        yf5.j0 j0Var = this.f207970e;
        if (j0Var != null) {
            ((yf5.w0) j0Var).notifyDataSetChanged();
        }
    }

    public void a() {
        if (p21.l.a() != null) {
            ((dh4.t) p21.l.a()).f(this);
        }
        com.tencent.mm.ui.widget.dialog.j0 j0Var = com.tencent.mm.ui.conversation.ea.f207655a;
        if (j0Var != null) {
            j0Var.dismiss();
            com.tencent.mm.ui.conversation.ea.f207655a = null;
        }
        com.tencent.mm.ui.LauncherUI launcherUI = (com.tencent.mm.ui.LauncherUI) this.f207969d;
        if (launcherUI != null) {
            com.tencent.mm.ui.HomeUI homeUI = launcherUI.getHomeUI();
            homeUI.T.remove(this.f207975m);
        }
    }
}
