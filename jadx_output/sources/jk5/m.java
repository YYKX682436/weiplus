package jk5;

/* loaded from: classes13.dex */
public class m implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jk5.n f300178d;

    public m(jk5.n nVar) {
        this.f300178d = nVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface dialogInterface) {
        jk5.o oVar;
        jk5.n nVar = this.f300178d;
        if (!nVar.f300179a || (oVar = nVar.f300180b) == null) {
            return;
        }
        ((jk5.j) oVar.f300183e).c();
        nVar.f300180b.dismiss();
    }
}
