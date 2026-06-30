package kf3;

/* loaded from: classes5.dex */
public class n implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ if3.g0 f307400d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kf3.o f307401e;

    public n(kf3.o oVar, if3.g0 g0Var) {
        this.f307401e = oVar;
        this.f307400d = g0Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        c01.d9.e().d(this.f307400d);
        kf3.o oVar = this.f307401e;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = oVar.f307406a.f307441f;
        if (u3Var != null) {
            u3Var.dismiss();
            oVar.f307406a.f307441f = null;
        }
    }
}
