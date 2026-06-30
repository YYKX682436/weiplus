package sr2;

/* loaded from: classes2.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sr2.c f411505d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f411506e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f411507f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(sr2.c cVar, java.lang.String str, boolean z17) {
        super(0);
        this.f411505d = cVar;
        this.f411506e = str;
        this.f411507f = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        sr2.c cVar = this.f411505d;
        java.lang.String str = this.f411506e;
        if (str == null) {
            str = "";
        }
        cVar.getClass();
        cVar.f411522d = str;
        if (this.f411507f) {
            sr2.c cVar2 = this.f411505d;
            java.lang.String str2 = cVar2.f411522d;
            cVar2.f411523e = o35.a.b(str2) && o35.a.g(str2) > 0;
        }
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f411505d.f411524f;
        if (u3Var != null && u3Var.isShowing()) {
            com.tencent.mm.ui.widget.dialog.u3 u3Var2 = this.f411505d.f411524f;
            if (u3Var2 != null) {
                u3Var2.dismiss();
            }
            yz5.a aVar = this.f411505d.f411525g;
            if (aVar != null) {
                aVar.invoke();
            }
        }
        return jz5.f0.f302826a;
    }
}
