package zo1;

/* loaded from: classes.dex */
public final class r extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f474750d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f474751e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(com.tencent.mm.ui.widget.dialog.u3 u3Var, yz5.l lVar) {
        super(2);
        this.f474750d = u3Var;
        this.f474751e = lVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupRangeManagerUI", "error code of update range info is " + intValue);
        pm0.v.X(new zo1.q(this.f474750d, this.f474751e, intValue));
        return jz5.f0.f302826a;
    }
}
