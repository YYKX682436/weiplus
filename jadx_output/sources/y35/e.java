package y35;

/* loaded from: classes11.dex */
public class e implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.MMLimitedClearEditText f459207d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y35.g f459208e;

    public e(y35.g gVar, com.tencent.mm.ui.base.MMLimitedClearEditText mMLimitedClearEditText) {
        this.f459208e = gVar;
        this.f459207d = mMLimitedClearEditText;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        y35.g gVar = this.f459208e;
        java.lang.String trim = this.f459207d.getText().toString().trim();
        if (trim == null || trim.length() <= 0) {
            return;
        }
        try {
            y35.d.a(gVar.f459211d, trim);
            android.content.Context context = gVar.f459211d.f459196d;
            if (context instanceof android.app.Activity) {
                com.tencent.mm.plugin.profile.p2.Bi(((android.app.Activity) context).getIntent(), 29, 1, y35.d.f459195o.f459219a);
                y35.k kVar = gVar.f459211d.f459201i;
                if (kVar != null) {
                    com.tencent.mm.plugin.profile.e0 e0Var = ((com.tencent.mm.plugin.profile.r0) kVar).f153597b;
                    e0Var.e(2L, e0Var.f153420d);
                }
            }
        } catch (java.lang.ArrayIndexOutOfBoundsException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FMessageItemView", e17, "", new java.lang.Object[0]);
            com.tencent.mm.ui.widget.dialog.u3 u3Var = gVar.f459211d.f459200h;
            if (u3Var == null || !u3Var.isShowing()) {
                return;
            }
            gVar.f459211d.f459200h.dismiss();
        }
    }
}
