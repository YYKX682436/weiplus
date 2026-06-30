package hy4;

/* loaded from: classes8.dex */
public class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f286096a = new java.util.HashMap();

    public static void a(android.content.Context context, java.lang.String str, android.content.DialogInterface.OnClickListener onClickListener) {
        com.tencent.mm.ui.widget.dialog.a aVar = new com.tencent.mm.ui.widget.dialog.a();
        aVar.A = false;
        aVar.S = 3;
        aVar.f211709a = context.getString(com.tencent.mm.R.string.l6s);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            aVar.C = true;
            aVar.f211730t = str;
        }
        aVar.f211716f = true;
        aVar.f211714d = context.getString(com.tencent.mm.R.string.l6r);
        aVar.f211732v = context.getString(com.tencent.mm.R.string.f490507x1);
        aVar.W = context.getResources().getColor(com.tencent.mm.R.color.f479308vo);
        aVar.E = onClickListener;
        aVar.f211733w = context.getString(com.tencent.mm.R.string.f490347sg);
        com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("key_webview_menu_haokan");
        if (M.i("show_first_tips", true)) {
            M.G("show_first_tips", false);
            aVar.f211711b = context.getString(com.tencent.mm.R.string.l6q);
        }
        com.tencent.mm.ui.widget.dialog.j0 j0Var = new com.tencent.mm.ui.widget.dialog.j0(context, com.tencent.mm.R.style.f494791wd);
        j0Var.e(aVar);
        com.tencent.mm.ui.widget.dialog.d0 d0Var = aVar.f211723m;
        if (d0Var != null) {
            d0Var.a(j0Var.f211837r);
        }
        j0Var.show();
    }
}
