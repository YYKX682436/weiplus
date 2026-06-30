package com.tencent.mm.ui.widget.picker;

/* loaded from: classes11.dex */
public class f0 implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.picker.h0 f212270d;

    public f0(com.tencent.mm.ui.widget.picker.h0 h0Var) {
        this.f212270d = h0Var;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.ui.widget.picker.h0 h0Var = this.f212270d;
        h0Var.f212273d = null;
        com.tencent.mm.ui.widget.picker.h0.a(h0Var, false, null);
    }
}
