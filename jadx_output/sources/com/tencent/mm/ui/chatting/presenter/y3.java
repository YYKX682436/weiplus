package com.tencent.mm.ui.chatting.presenter;

/* loaded from: classes9.dex */
public class y3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f202562d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.presenter.z3 f202563e;

    public y3(com.tencent.mm.ui.chatting.presenter.z3 z3Var, java.lang.String str) {
        this.f202563e = z3Var;
        this.f202562d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.chatting.presenter.z3 z3Var = this.f202563e;
        com.tencent.mm.ui.chatting.presenter.c4 c4Var = z3Var.f202584i;
        if (c4Var.f202149n == z3Var.f202582g) {
            com.tencent.mm.ui.chatting.presenter.o3 o3Var = z3Var.f202585m;
            o3Var.getClass();
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            java.lang.String str = this.f202562d;
            if (str == null) {
                str = "";
            }
            android.widget.TextView textView = c4Var.f202148m;
            textView.setText(str);
            c4Var.i(textView, o3Var.f202544g.f198433e);
        }
    }
}
