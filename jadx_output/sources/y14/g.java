package y14;

/* loaded from: classes.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.f4 f458907d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f458908e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.tencent.mm.ui.widget.dialog.f4 f4Var, android.app.Activity activity) {
        super(0);
        this.f458907d = f4Var;
        this.f458908e = activity;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        this.f458907d.dismiss();
        com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(this.f458908e);
        e4Var.f211779f = false;
        e4Var.d(com.tencent.mm.R.string.p9r);
        e4Var.c();
        return jz5.f0.f302826a;
    }
}
