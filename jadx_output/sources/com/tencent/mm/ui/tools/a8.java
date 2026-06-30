package com.tencent.mm.ui.tools;

/* loaded from: classes14.dex */
public class a8 implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.NewTaskUI f210274d;

    public a8(com.tencent.mm.ui.tools.NewTaskUI newTaskUI) {
        this.f210274d = newTaskUI;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface dialogInterface) {
        this.f210274d.f210134e = null;
    }
}
