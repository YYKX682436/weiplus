package ze5;

/* loaded from: classes9.dex */
public final class r implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f472172d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yb5.d f472173e;

    public r(com.tencent.mm.storage.f9 f9Var, yb5.d dVar) {
        this.f472172d = f9Var;
        this.f472173e = dVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.pluginsdk.model.app.k0.z(this.f472172d);
        this.f472173e.L(true);
    }
}
