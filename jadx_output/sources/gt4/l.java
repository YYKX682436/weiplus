package gt4;

/* loaded from: classes8.dex */
public abstract class l {
    public static void a(android.content.Context context, com.tencent.mm.ui.widget.dialog.j0 j0Var) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("launch_from_remittance", true);
        intent.putExtra("enter_scene_address", 4);
        j45.l.o(context, "address", ".ui.WalletSelectAddrUI", intent, 6, false);
        if (j0Var != null) {
            j0Var.dismiss();
        }
    }

    public static com.tencent.mm.ui.widget.dialog.j0 b(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17, int i17, db5.a1 a1Var, android.content.DialogInterface.OnClickListener onClickListener) {
        if ((context instanceof android.app.Activity) && ((android.app.Activity) context).isFinishing()) {
            return null;
        }
        com.tencent.mm.ui.widget.dialog.a aVar = new com.tencent.mm.ui.widget.dialog.a();
        aVar.A = false;
        aVar.B = true;
        aVar.f211733w = of5.b.a(context).getString(com.tencent.mm.R.string.f490347sg);
        aVar.F = onClickListener;
        aVar.f211709a = str;
        android.view.View inflate = android.view.View.inflate(context, com.tencent.mm.R.layout.f489608d53, null);
        android.widget.EditText editText = (android.widget.EditText) inflate.findViewById(com.tencent.mm.R.id.d98);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            float textSize = editText.getTextSize();
            ((ke0.e) xVar).getClass();
            editText.append(com.tencent.mm.pluginsdk.ui.span.c0.j(context, str2, textSize));
        }
        ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f487334ob5)).setVisibility(8);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            editText.setHint(str3);
        }
        aVar.f211732v = of5.b.a(context).getString(com.tencent.mm.R.string.f490507x1);
        aVar.E = new gt4.b(a1Var, editText, context);
        aVar.Z = false;
        if (i17 > 0) {
            ck5.f b17 = ck5.f.b(editText);
            b17.f42561f = 0;
            b17.f42560e = i17;
            b17.d(null);
        }
        aVar.L = inflate;
        com.tencent.mm.ui.widget.dialog.j0 j0Var = new com.tencent.mm.ui.widget.dialog.j0(context, com.tencent.mm.R.style.f494791wd);
        j0Var.e(aVar);
        com.tencent.mm.ui.widget.dialog.d0 d0Var = aVar.f211723m;
        if (d0Var != null) {
            d0Var.a(j0Var.f211837r);
        }
        j0Var.show();
        boolean z18 = context instanceof com.tencent.mm.ui.MMActivity;
        if (z18) {
            ((com.tencent.mm.ui.MMActivity) context).addDialog(j0Var);
        }
        if (z18) {
            inflate.postDelayed(new gt4.c(z17, editText, context), 200L);
        }
        return j0Var;
    }
}
