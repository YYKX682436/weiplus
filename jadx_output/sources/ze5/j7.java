package ze5;

/* loaded from: classes9.dex */
public final class j7 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f472034d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yb5.d f472035e;

    public j7(com.tencent.mm.storage.f9 f9Var, yb5.d dVar) {
        this.f472034d = f9Var;
        this.f472035e = dVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.pluginsdk.model.app.k0.z(this.f472034d);
        this.f472035e.L(true);
    }
}
