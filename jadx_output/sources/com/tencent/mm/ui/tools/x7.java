package com.tencent.mm.ui.tools;

/* loaded from: classes9.dex */
public class x7 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelsimple.v0 f210906d;

    public x7(com.tencent.mm.ui.tools.y7 y7Var, com.tencent.mm.modelsimple.v0 v0Var) {
        this.f210906d = v0Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        c01.d9.e().d(this.f210906d);
    }
}
