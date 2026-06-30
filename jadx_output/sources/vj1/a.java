package vj1;

/* loaded from: classes7.dex */
public final class a {
    public a(kotlin.jvm.internal.i iVar) {
    }

    public final void a(android.content.Context cxt, android.content.DialogInterface.OnClickListener onPositiveClick, android.content.DialogInterface.OnClickListener onNegativeCLick, android.content.DialogInterface.OnCancelListener onCancelCLick, java.lang.String str) {
        kotlin.jvm.internal.o.g(cxt, "cxt");
        kotlin.jvm.internal.o.g(onPositiveClick, "onPositiveClick");
        kotlin.jvm.internal.o.g(onNegativeCLick, "onNegativeCLick");
        kotlin.jvm.internal.o.g(onCancelCLick, "onCancelCLick");
        com.tencent.mm.ui.widget.dialog.a aVar = new com.tencent.mm.ui.widget.dialog.a();
        aVar.f211729s = cxt.getString(k01.j.f303039a.b(null, str) ? com.tencent.mm.R.string.mgi : com.tencent.mm.R.string.f490043jb);
        aVar.f211732v = cxt.getString(com.tencent.mm.R.string.f490042ja);
        aVar.E = onPositiveClick;
        aVar.f211733w = cxt.getString(com.tencent.mm.R.string.f490347sg);
        aVar.F = onNegativeCLick;
        aVar.G = onCancelCLick;
        com.tencent.mm.ui.widget.dialog.j0 j0Var = new com.tencent.mm.ui.widget.dialog.j0(cxt, com.tencent.mm.R.style.f494791wd);
        j0Var.e(aVar);
        com.tencent.mm.ui.widget.dialog.d0 d0Var = aVar.f211723m;
        if (d0Var != null) {
            d0Var.a(j0Var.f211837r);
        }
        j0Var.setCanceledOnTouchOutside(false);
        j0Var.show();
    }
}
