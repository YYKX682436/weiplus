package com.tencent.mm.ui;

/* loaded from: classes5.dex */
public class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.f4 f209864d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.AlertActivity f209865e;

    public t(com.tencent.mm.ui.AlertActivity alertActivity, com.tencent.mm.ui.widget.dialog.f4 f4Var) {
        this.f209865e = alertActivity;
        this.f209864d = f4Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.widget.dialog.f4 f4Var;
        com.tencent.mm.ui.AlertActivity alertActivity = this.f209865e;
        if (alertActivity.getWindow() == null || alertActivity.isDestroyed() || (f4Var = this.f209864d) == null || !f4Var.isShowing()) {
            return;
        }
        f4Var.dismiss();
    }
}
