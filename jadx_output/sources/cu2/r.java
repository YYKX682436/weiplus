package cu2;

/* loaded from: classes.dex */
public final class r extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f222437d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f222438e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f222439f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(com.tencent.mm.ui.widget.dialog.u3 u3Var, yz5.l lVar, android.content.Context context) {
        super(1);
        this.f222437d = u3Var;
        this.f222438e = lVar;
        this.f222439f = context;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f222437d;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        yz5.l lVar = this.f222438e;
        if (lVar != null) {
            lVar.invoke(java.lang.Boolean.FALSE);
        }
        db5.t7.makeText(this.f222439f, com.tencent.mm.R.string.eyh, 0).show();
        return jz5.f0.f302826a;
    }
}
