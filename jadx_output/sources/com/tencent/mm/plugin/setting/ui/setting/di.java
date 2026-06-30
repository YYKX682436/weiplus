package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes4.dex */
public class di implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r61.r1 f160950d;

    public di(com.tencent.mm.plugin.setting.ui.setting.ei eiVar, r61.r1 r1Var) {
        this.f160950d = r1Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        gm0.j1.d().d(this.f160950d);
    }
}
