package ze5;

/* loaded from: classes9.dex */
public final class o1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yb5.d f472120d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f472121e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ze5.p1 f472122f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f472123g;

    public o1(yb5.d dVar, com.tencent.mm.storage.f9 f9Var, ze5.p1 p1Var, java.lang.String str) {
        this.f472120d = dVar;
        this.f472121e = f9Var;
        this.f472122f = p1Var;
        this.f472123g = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        ze5.p1 p1Var = this.f472122f;
        yb5.d dVar = this.f472120d;
        com.tencent.mm.storage.f9 f9Var = this.f472121e;
        com.tencent.mm.ui.chatting.viewitems.s1.b(dVar, f9Var, p1Var.A(dVar, f9Var));
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(17509, 2, this.f472123g);
    }
}
