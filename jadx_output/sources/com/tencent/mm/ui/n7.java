package com.tencent.mm.ui;

/* loaded from: classes11.dex */
public class n7 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.o7 f209407d;

    public n7(com.tencent.mm.ui.o7 o7Var) {
        this.f209407d = o7Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.ui.o7 o7Var = this.f209407d;
        o7Var.f209454e.setText("");
        o7Var.f209455f.dismiss();
    }
}
