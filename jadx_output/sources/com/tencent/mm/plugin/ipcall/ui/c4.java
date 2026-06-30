package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes8.dex */
public class c4 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w11.o0 f142773d;

    public c4(com.tencent.mm.plugin.ipcall.ui.d4 d4Var, w11.o0 o0Var) {
        this.f142773d = o0Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        c01.d9.e().d(this.f142773d);
    }
}
