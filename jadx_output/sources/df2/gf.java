package df2;

/* loaded from: classes3.dex */
public final class gf implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.qf f230215d;

    public gf(df2.qf qfVar) {
        this.f230215d = qfVar;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        android.content.Context O6 = this.f230215d.O6();
        int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
        com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(O6);
        e4Var.d(booleanValue ? com.tencent.mm.R.string.opv : com.tencent.mm.R.string.opu);
        e4Var.c();
        return jz5.f0.f302826a;
    }
}
