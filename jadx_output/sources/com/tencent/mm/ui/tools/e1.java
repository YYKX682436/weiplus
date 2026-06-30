package com.tencent.mm.ui.tools;

/* loaded from: classes8.dex */
public class e1 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.f1 f210369d;

    public e1(com.tencent.mm.ui.tools.f1 f1Var) {
        this.f210369d = f1Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        this.f210369d.f210389d = true;
    }
}
