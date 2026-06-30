package ze5;

/* loaded from: classes9.dex */
public final class o3 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f472125d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yb5.d f472126e;

    public o3(com.tencent.mm.storage.f9 f9Var, yb5.d dVar) {
        this.f472125d = f9Var;
        this.f472126e = dVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.storage.f9 f9Var = this.f472125d;
        if (f9Var.k2()) {
            com.tencent.mm.pluginsdk.model.app.k0.z(f9Var);
            this.f472126e.L(true);
        }
    }
}
