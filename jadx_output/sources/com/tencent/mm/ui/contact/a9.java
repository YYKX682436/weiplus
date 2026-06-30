package com.tencent.mm.ui.contact;

/* loaded from: classes11.dex */
public class a9 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r35.e4 f206593d;

    public a9(com.tencent.mm.ui.contact.SayHiEditUI sayHiEditUI, r35.e4 e4Var) {
        this.f206593d = e4Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        r35.e4 e4Var = this.f206593d;
        if (e4Var.f369102y != null) {
            gm0.j1.d().d(e4Var.f369102y);
        }
    }
}
