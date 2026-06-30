package ze5;

/* loaded from: classes9.dex */
public final class h5 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f471965d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yb5.d f471966e;

    public h5(com.tencent.mm.storage.f9 f9Var, yb5.d dVar) {
        this.f471965d = f9Var;
        this.f471966e = dVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.pluginsdk.model.app.k0.z(this.f471965d);
        this.f471966e.L(true);
    }
}
