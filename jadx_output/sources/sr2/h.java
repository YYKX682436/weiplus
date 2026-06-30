package sr2;

/* loaded from: classes.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sr2.o f411573d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(sr2.o oVar) {
        super(1);
        this.f411573d = oVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        sr2.o oVar = this.f411573d;
        y9.i iVar = oVar.f411651h;
        if (iVar != null) {
            iVar.hide();
        }
        android.app.ProgressDialog progressDialog = oVar.f411650g;
        if (progressDialog != null) {
            progressDialog.hide();
        }
        oVar.f411650g = null;
        if ((fVar != null && fVar.f70615a == 0) && fVar.f70616b == 0) {
            db5.e1.s(oVar.getContext(), oVar.getContext().getResources().getString(com.tencent.mm.R.string.cjz), "");
        }
        return jz5.f0.f302826a;
    }
}
