package qr3;

/* loaded from: classes3.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f366072d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qr3.o f366073e;

    public a(kotlin.jvm.internal.c0 c0Var, qr3.o oVar) {
        this.f366072d = c0Var;
        this.f366073e = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f366072d.f310112d) {
            return;
        }
        qr3.o oVar = this.f366073e;
        if (oVar.getActivity().isFinishing()) {
            return;
        }
        com.tencent.mm.ui.widget.dialog.u3 u3Var = oVar.f366108i;
        if (u3Var != null) {
            u3Var.dismiss();
            oVar.f366108i = null;
        }
        oVar.f366108i = db5.e1.Q(oVar.getContext(), null, oVar.getString(com.tencent.mm.R.string.f490604zq), true, true, qr3.n.f366101d);
    }
}
