package m71;

/* loaded from: classes5.dex */
public final class b implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelsimple.v0 f324484d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m71.g f324485e;

    public b(com.tencent.mm.modelsimple.v0 v0Var, m71.g gVar) {
        this.f324484d = v0Var;
        this.f324485e = gVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        gm0.j1.d().d(this.f324484d);
        m71.g gVar = this.f324485e;
        gVar.getClass();
        gm0.j1.d().q(701, gVar);
        gm0.j1.d().q(252, gVar);
    }
}
