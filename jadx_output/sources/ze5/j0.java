package ze5;

/* loaded from: classes9.dex */
public final class j0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f472022d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yb5.d f472023e;

    public j0(com.tencent.mm.storage.f9 f9Var, yb5.d dVar) {
        this.f472022d = f9Var;
        this.f472023e = dVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.pluginsdk.model.app.k0.z(this.f472022d);
        this.f472023e.L(true);
    }
}
