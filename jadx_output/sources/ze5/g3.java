package ze5;

/* loaded from: classes9.dex */
public final class g3 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yb5.d f471939d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f471940e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ze5.h3 f471941f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f471942g;

    public g3(yb5.d dVar, com.tencent.mm.storage.f9 f9Var, ze5.h3 h3Var, java.lang.String str) {
        this.f471939d = dVar;
        this.f471940e = f9Var;
        this.f471941f = h3Var;
        this.f471942g = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        ze5.h3 h3Var = this.f471941f;
        yb5.d dVar = this.f471939d;
        com.tencent.mm.storage.f9 f9Var = this.f471940e;
        com.tencent.mm.ui.chatting.viewitems.s1.b(dVar, f9Var, h3Var.A(dVar, f9Var));
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(17509, 2, this.f471942g);
    }
}
