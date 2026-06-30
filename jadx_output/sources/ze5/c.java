package ze5;

/* loaded from: classes9.dex */
public final class c implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f471860d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yb5.d f471861e;

    public c(com.tencent.mm.storage.f9 f9Var, yb5.d dVar) {
        this.f471860d = f9Var;
        this.f471861e = dVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.pluginsdk.model.app.k0.z(this.f471860d);
        this.f471861e.L(true);
    }
}
