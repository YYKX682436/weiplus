package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes3.dex */
public final class ra implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity f174246d;

    public ra(com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity textStatusEditActivity) {
        this.f174246d = textStatusEditActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.textstatus.ui.qa qaVar = com.tencent.mm.plugin.textstatus.ui.qa.f174227d;
        com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity context = this.f174246d;
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.ui.widget.dialog.z2 z2Var = new com.tencent.mm.ui.widget.dialog.z2(context, 2, 0, false);
        z2Var.y(context.getResources().getString(com.tencent.mm.R.string.jvc));
        com.tencent.mm.ui.bk.s0(z2Var.f212072x.getPaint());
        z2Var.x(1);
        android.view.View inflate = com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.cze, (android.view.ViewGroup) null);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.olx);
        if (textView != null) {
            com.tencent.mm.ui.bk.s0(textView.getPaint());
        }
        z2Var.j(inflate);
        z2Var.F = new bk4.g1(z2Var);
        z2Var.l(new bk4.h1(qaVar));
        z2Var.C();
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_TEXT_STATUS_DND_TIPS_EDUCATION_INT, 1);
    }
}
