package com.tencent.mm.ui;

/* loaded from: classes3.dex */
public class j5 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f208997d;

    public j5(com.tencent.mm.ui.FindMoreFriendsUI findMoreFriendsUI, java.lang.Runnable runnable) {
        this.f208997d = runnable;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f208997d.run();
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_JD_ENTRANCE_DECLARE_CLICK_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
    }
}
