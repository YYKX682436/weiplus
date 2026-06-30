package com.tencent.mm.plugin.nearby.ui;

/* loaded from: classes5.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f152149d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sdk.platformtools.n3 f152150e;

    public j(com.tencent.mm.ui.widget.dialog.u3 u3Var, com.tencent.mm.sdk.platformtools.n3 n3Var) {
        this.f152149d = u3Var;
        this.f152150e = n3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f152149d;
        if (u3Var != null) {
            u3Var.dismiss();
            this.f152150e.sendEmptyMessage(0);
        }
    }
}
