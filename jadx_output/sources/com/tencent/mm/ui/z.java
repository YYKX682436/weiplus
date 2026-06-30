package com.tencent.mm.ui;

/* loaded from: classes14.dex */
public class z implements com.tencent.mm.ui.widget.dialog.q3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.AlertActivity f212595a;

    public z(com.tencent.mm.ui.AlertActivity alertActivity) {
        this.f212595a = alertActivity;
    }

    @Override // com.tencent.mm.ui.widget.dialog.q3
    public void dismiss() {
        com.tencent.mm.ui.AlertActivity alertActivity = this.f212595a;
        com.tencent.mm.ui.widget.dialog.q3 q3Var = alertActivity.f196564f;
        if (q3Var != null) {
            q3Var.dismiss();
        }
        alertActivity.finish();
    }
}
