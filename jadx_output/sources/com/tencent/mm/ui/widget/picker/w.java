package com.tencent.mm.ui.widget.picker;

/* loaded from: classes3.dex */
public class w implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.picker.c0 f212338d;

    public w(com.tencent.mm.ui.widget.picker.c0 c0Var) {
        this.f212338d = c0Var;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.ui.widget.picker.c0 c0Var = this.f212338d;
        c0Var.f212246d = null;
        com.tencent.mm.ui.widget.picker.a0 a0Var = c0Var.f212259t;
        if (a0Var != null) {
            a0Var.onResult(false, null, null);
        }
        com.tencent.mm.ui.widget.picker.z zVar = c0Var.f212260u;
        if (zVar != null) {
            zVar.a(false, null, null, null);
        }
    }
}
