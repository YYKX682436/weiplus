package com.tencent.mm.ui.chatting.component;

/* loaded from: classes9.dex */
public class bk implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.ck f198833d;

    public bk(com.tencent.mm.ui.chatting.component.ck ckVar) {
        this.f198833d = ckVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.ui.widget.dialog.j0 j0Var = this.f198833d.f198895g;
        if (j0Var != null) {
            j0Var.dismiss();
        }
    }
}
