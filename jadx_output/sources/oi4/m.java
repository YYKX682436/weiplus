package oi4;

/* loaded from: classes8.dex */
public final class m implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.m1 f345643d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ oi4.n f345644e;

    public m(com.tencent.mm.modelbase.m1 m1Var, oi4.n nVar) {
        this.f345643d = m1Var;
        this.f345644e = nVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        gm0.j1.d().d(this.f345643d);
        gm0.j1.d().q(4245, this.f345644e);
    }
}
