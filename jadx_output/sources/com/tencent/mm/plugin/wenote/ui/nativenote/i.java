package com.tencent.mm.plugin.wenote.ui.nativenote;

/* loaded from: classes12.dex */
public class i implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wenote.ui.nativenote.j f188213d;

    public i(com.tencent.mm.plugin.wenote.ui.nativenote.j jVar) {
        this.f188213d = jVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.plugin.wenote.ui.nativenote.j jVar = this.f188213d;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = jVar.f188217d.V1;
        if (u3Var != null) {
            u3Var.dismiss();
            jVar.f188217d.V1 = null;
        }
    }
}
