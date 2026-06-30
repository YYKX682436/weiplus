package zi4;

/* loaded from: classes5.dex */
public final class t0 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.m1 f473263d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zi4.u0 f473264e;

    public t0(com.tencent.mm.modelbase.m1 m1Var, zi4.u0 u0Var) {
        this.f473263d = m1Var;
        this.f473264e = u0Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        gm0.j1.d().d(this.f473263d);
        gm0.j1.d().q(4245, this.f473264e);
    }
}
