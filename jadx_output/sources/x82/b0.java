package x82;

/* loaded from: classes9.dex */
public class b0 implements com.tencent.mm.ui.widget.dialog.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o72.r2 f452495a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f452496b;

    public b0(o72.r2 r2Var, android.content.Context context) {
        this.f452495a = r2Var;
        this.f452496b = context;
    }

    @Override // com.tencent.mm.ui.widget.dialog.i
    public void a() {
        r45.op0 op0Var = this.f452495a.field_favProto.P;
        if (op0Var != null) {
            q80.d0 d0Var = new q80.d0();
            d0Var.f360651c = op0Var.f382416p;
            d0Var.f360650b = op0Var.f382415o;
            d0Var.f360649a = op0Var.f382417q;
            q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
            ((com.tencent.mm.feature.lite.i) g0Var).lk(this.f452496b, d0Var, new x82.a0(this, d0Var));
        }
    }
}
