package com.tencent.mm.ui;

/* loaded from: classes5.dex */
public class a8 implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.c8 f197126d;

    public a8(com.tencent.mm.ui.c8 c8Var) {
        this.f197126d = c8Var;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.ui.c8 c8Var = this.f197126d;
        if (c8Var.f198084c.isFinishing()) {
            return;
        }
        c8Var.f198084c.finish();
    }
}
