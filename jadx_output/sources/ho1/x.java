package ho1;

/* loaded from: classes5.dex */
public final class x extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f282844d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f282845e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f282846f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ po1.d f282847g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(com.tencent.mm.ui.widget.dialog.u3 u3Var, kotlin.jvm.internal.c0 c0Var, yz5.l lVar, po1.d dVar) {
        super(0);
        this.f282844d = u3Var;
        this.f282845e = c0Var;
        this.f282846f = lVar;
        this.f282847g = dVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        this.f282844d.dismiss();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("save new device returned, isOk=");
        kotlin.jvm.internal.c0 c0Var = this.f282845e;
        sb6.append(c0Var.f310112d);
        sb6.append('.');
        com.tencent.mars.xlog.Log.i("MicroMsg.RoamBackup.FlutterBackupPlugin", sb6.toString());
        boolean z17 = c0Var.f310112d;
        yz5.l lVar = this.f282846f;
        if (z17) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            lVar.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(this.f282847g.f357295a)));
        } else {
            lVar.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl("error_permission_denied")));
        }
        return jz5.f0.f302826a;
    }
}
