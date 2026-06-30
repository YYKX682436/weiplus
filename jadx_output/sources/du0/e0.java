package du0;

/* loaded from: classes.dex */
public final class e0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f243342d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f243343e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(com.tencent.mm.ui.widget.dialog.u3 u3Var, yz5.l lVar) {
        super(1);
        this.f243342d = u3Var;
        this.f243343e = lVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.modelgeo.Addr addr = (com.tencent.mm.modelgeo.Addr) obj;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f243342d;
        if (u3Var.isShowing()) {
            u3Var.dismiss();
        }
        this.f243343e.invoke(addr);
        return jz5.f0.f302826a;
    }
}
