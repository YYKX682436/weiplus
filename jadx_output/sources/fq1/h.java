package fq1;

/* loaded from: classes8.dex */
public abstract class h {
    public static com.tencent.mm.ui.widget.dialog.j0 a(com.tencent.mm.ui.ga gaVar, java.lang.String str, java.lang.String str2, java.lang.String str3, com.tencent.mm.ui.widget.dialog.j jVar, com.tencent.mm.ui.widget.dialog.j jVar2) {
        androidx.appcompat.app.AppCompatActivity x17 = gaVar.x();
        com.tencent.mm.ui.widget.dialog.a aVar = new com.tencent.mm.ui.widget.dialog.a();
        aVar.f211727q = bp.b.decodeResource(gaVar.x().getResources(), com.tencent.mm.R.raw.dialog_successful_icon, null);
        aVar.D = false;
        aVar.T = 3;
        aVar.A = false;
        aVar.B = false;
        aVar.f211713c = str;
        aVar.R = 17;
        com.tencent.mm.ui.widget.dialog.j0 j0Var = new com.tencent.mm.ui.widget.dialog.j0(x17, com.tencent.mm.R.style.f494791wd);
        j0Var.e(aVar);
        com.tencent.mm.ui.widget.dialog.d0 d0Var = aVar.f211723m;
        if (d0Var != null) {
            d0Var.a(j0Var.f211837r);
        }
        androidx.appcompat.app.AppCompatActivity x18 = gaVar.x();
        if (com.tencent.mm.sdk.platformtools.t8.K0(str3) || str3.length() == 0) {
            str3 = x18.getResources().getString(com.tencent.mm.R.string.f490941bb3);
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2) || str2.length() == 0) {
            str2 = x18.getResources().getString(com.tencent.mm.R.string.f490347sg);
        }
        j0Var.A(str3, true, new fq1.f(j0Var, jVar2));
        j0Var.w(str2, true, new fq1.g(j0Var, jVar));
        j0Var.x(gaVar.x().getResources().getColor(com.tencent.mm.R.color.f478734fp));
        j0Var.show();
        return j0Var;
    }
}
