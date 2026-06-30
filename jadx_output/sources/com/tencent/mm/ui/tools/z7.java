package com.tencent.mm.ui.tools;

/* loaded from: classes11.dex */
public class z7 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.NewTaskUI f210945d;

    public z7(com.tencent.mm.ui.tools.NewTaskUI newTaskUI) {
        this.f210945d = newTaskUI;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        if (com.tencent.mm.ui.tools.NewTaskUI.f210133i != null) {
            com.tencent.mm.ui.tools.NewTaskUI.f210133i = null;
            this.f210945d.finish();
        }
    }
}
