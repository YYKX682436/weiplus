package kf3;

/* loaded from: classes5.dex */
public class s implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ if3.g0 f307425d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kf3.u f307426e;

    public s(kf3.u uVar, if3.g0 g0Var) {
        this.f307426e = uVar;
        this.f307425d = g0Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        c01.d9.e().d(this.f307425d);
        kf3.u uVar = this.f307426e;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = uVar.f307441f;
        if (u3Var != null) {
            u3Var.dismiss();
            uVar.f307441f = null;
        }
    }
}
