package r35;

/* loaded from: classes11.dex */
public class w3 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r35.e4 f369319d;

    public w3(r35.e4 e4Var) {
        this.f369319d = e4Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        r35.e4 e4Var = this.f369319d;
        com.tencent.mm.ui.widget.dialog.j0 j0Var = e4Var.f369085e;
        if (j0Var != null) {
            j0Var.dismiss();
            e4Var.f369085e = null;
        }
        new com.tencent.mm.sdk.platformtools.b4(new r35.v3(this), false).c(500L, 500L);
    }
}
