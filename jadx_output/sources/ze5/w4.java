package ze5;

/* loaded from: classes9.dex */
public final class w4 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f472280d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yb5.d f472281e;

    public w4(com.tencent.mm.storage.f9 f9Var, yb5.d dVar) {
        this.f472280d = f9Var;
        this.f472281e = dVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        l15.c cVar = new l15.c();
        com.tencent.mm.storage.f9 f9Var = this.f472280d;
        java.lang.String U1 = f9Var != null ? f9Var.U1() : null;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (U1 == null) {
            U1 = "";
        }
        cVar.fromXml(U1, true);
        dk5.m2.f234731a.a(f9Var != null ? f9Var.Q0() : null, f9Var, true);
        this.f472281e.L(true);
    }
}
