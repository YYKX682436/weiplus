package dk5;

/* loaded from: classes9.dex */
public class p4 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dk5.r4 f234799d;

    public p4(dk5.r4 r4Var) {
        this.f234799d = r4Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        dk5.r4 r4Var = this.f234799d;
        com.tencent.mm.ui.widget.dialog.j0 j0Var = r4Var.f234850a;
        if (j0Var != null) {
            j0Var.dismiss();
            r4Var.f234850a = null;
        }
        ((dk5.u1) r4Var.f234851b).f234927a.finish();
    }
}
