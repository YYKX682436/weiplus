package ze5;

/* loaded from: classes9.dex */
public final class e4 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f471900d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yb5.d f471901e;

    public e4(com.tencent.mm.storage.f9 f9Var, yb5.d dVar) {
        this.f471900d = f9Var;
        this.f471901e = dVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.pluginsdk.model.app.k0.z(this.f471900d);
        this.f471901e.L(true);
    }
}
