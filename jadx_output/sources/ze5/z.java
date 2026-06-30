package ze5;

/* loaded from: classes9.dex */
public final class z implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f472333d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yb5.d f472334e;

    public z(com.tencent.mm.storage.f9 f9Var, yb5.d dVar) {
        this.f472333d = f9Var;
        this.f472334e = dVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.pluginsdk.model.app.k0.z(this.f472333d);
        this.f472334e.L(true);
    }
}
