package te2;

/* loaded from: classes3.dex */
public final class va extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ te2.hc f418501d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public va(te2.hc hcVar) {
        super(3);
        this.f418501d = hcVar;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        r45.h32 h32Var;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        java.lang.String errString = (java.lang.String) obj2;
        r45.q62 q62Var = (r45.q62) obj3;
        kotlin.jvm.internal.o.g(errString, "errString");
        te2.hc hcVar = this.f418501d;
        if (q62Var != null && (h32Var = hcVar.f418068J) != null) {
            zl2.t.c(h32Var, q62Var, booleanValue);
        }
        hcVar.S6();
        hcVar.T6();
        if (booleanValue) {
            android.app.Activity context = hcVar.getContext();
            int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
            e4Var.b(com.tencent.mm.R.raw.toast_ok);
            e4Var.d(com.tencent.mm.R.string.ljl);
            e4Var.c();
        } else {
            android.app.Activity context2 = hcVar.getContext();
            int i18 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var2 = new com.tencent.mm.ui.widget.dialog.e4(context2);
            if (errString.length() > 0) {
                e4Var2.f211776c = errString;
            } else {
                e4Var2.d(com.tencent.mm.R.string.oss);
            }
            e4Var2.c();
        }
        return jz5.f0.f302826a;
    }
}
