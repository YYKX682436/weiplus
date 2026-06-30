package com.tencent.mm.ui.chatting.component;

/* loaded from: classes3.dex */
public class ob implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.jb f199634d;

    public ob(com.tencent.mm.ui.chatting.component.jb jbVar) {
        this.f199634d = jbVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        dialogInterface.dismiss();
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        android.app.Activity g17 = this.f199634d.f198580d.g();
        ((sb0.f) jVar).getClass();
        j35.u.g(g17);
    }
}
