package com.tencent.mm.ui.tools;

/* loaded from: classes14.dex */
public class w7 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelsimple.v0 f210882d;

    public w7(com.tencent.mm.ui.tools.NewTaskUI newTaskUI, com.tencent.mm.modelsimple.v0 v0Var) {
        this.f210882d = v0Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        c01.d9.e().d(this.f210882d);
    }
}
