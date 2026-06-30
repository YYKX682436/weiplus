package r35;

/* loaded from: classes11.dex */
public class x3 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r35.e4 f369325d;

    public x3(r35.e4 e4Var) {
        this.f369325d = e4Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        r35.e4 e4Var = this.f369325d;
        com.tencent.mm.ui.widget.dialog.j0 j0Var = e4Var.f369085e;
        if (j0Var != null) {
            j0Var.dismiss();
            e4Var.f369085e = null;
        }
        e4Var.e();
        ns.h hVar = e4Var.f369086f;
        if (hVar != null) {
            hVar.a(false);
        }
    }
}
