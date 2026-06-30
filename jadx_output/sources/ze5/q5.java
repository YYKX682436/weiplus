package ze5;

/* loaded from: classes9.dex */
public final class q5 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f472163d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yb5.d f472164e;

    public q5(com.tencent.mm.storage.f9 f9Var, yb5.d dVar) {
        this.f472163d = f9Var;
        this.f472164e = dVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.pluginsdk.model.app.k0.z(this.f472163d);
        this.f472164e.L(true);
    }
}
