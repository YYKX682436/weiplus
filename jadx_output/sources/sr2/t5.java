package sr2;

/* loaded from: classes10.dex */
public final class t5 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sr2.v5 f411725d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t5(sr2.v5 v5Var) {
        super(2);
        this.f411725d = v5Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String str = (java.lang.String) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        sr2.v5 v5Var = this.f411725d;
        if (str != null) {
            java.lang.String str2 = r26.n0.B(str, v5Var.f411750n, false) ? v5Var.f411750n : "";
            yz5.p pVar = v5Var.f411746g;
            if (pVar != null) {
                pVar.invoke(str, str2);
            }
        }
        android.widget.LinearLayout linearLayout = v5Var.f411743d;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        v5Var.f411749m = -1;
        v5Var.f411750n = "";
        if (str == null) {
            str = "";
        }
        v5Var.O6(1, str, intValue);
        return jz5.f0.f302826a;
    }
}
