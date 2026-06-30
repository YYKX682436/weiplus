package uy3;

/* loaded from: classes8.dex */
public final class m0 implements uy3.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f431978a;

    /* renamed from: b, reason: collision with root package name */
    public final uy3.v f431979b;

    /* renamed from: c, reason: collision with root package name */
    public long f431980c;

    /* renamed from: d, reason: collision with root package name */
    public long f431981d;

    /* renamed from: e, reason: collision with root package name */
    public long f431982e;

    /* renamed from: f, reason: collision with root package name */
    public uy3.l0 f431983f;

    public m0(java.lang.String session, uy3.v vVar) {
        kotlin.jvm.internal.o.g(session, "session");
        this.f431978a = session;
        this.f431979b = vVar;
    }

    @Override // uy3.v
    public void a(android.content.DialogInterface dialogInterface, int i17) {
        uy3.v vVar = this.f431979b;
        if (vVar != null) {
            vVar.a(dialogInterface, i17);
        }
    }

    @Override // uy3.v
    public void onCancel(android.content.DialogInterface dialogInterface) {
        uy3.v vVar = this.f431979b;
        if (vVar != null) {
            vVar.onCancel(dialogInterface);
        }
    }

    @Override // uy3.v
    public void onShow(android.content.DialogInterface dialogInterface) {
        uy3.v vVar = this.f431979b;
        if (vVar != null) {
            vVar.onShow(dialogInterface);
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        uy3.l0 l0Var = this.f431983f;
        if (l0Var != null) {
            l0Var.f431973f = currentTimeMillis - this.f431980c;
        }
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = this.f431978a;
        objArr[1] = l0Var != null ? java.lang.Long.valueOf(l0Var.f431973f) : null;
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanBoxDialogViewListenerImpl", "onShow session: %s, cost: %s", objArr);
        uy3.l0 l0Var2 = this.f431983f;
        if (l0Var2 != null) {
            l0Var2.a();
        }
    }
}
