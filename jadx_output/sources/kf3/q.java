package kf3;

/* loaded from: classes5.dex */
public class q implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ if3.g0 f307414d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kf3.u f307415e;

    public q(kf3.u uVar, if3.g0 g0Var) {
        this.f307415e = uVar;
        this.f307414d = g0Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        c01.d9.e().d(this.f307414d);
        kf3.u uVar = this.f307415e;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = uVar.f307441f;
        if (u3Var != null) {
            u3Var.dismiss();
            uVar.f307441f = null;
        }
    }
}
