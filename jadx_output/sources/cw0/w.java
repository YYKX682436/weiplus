package cw0;

/* loaded from: classes5.dex */
public final class w extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cw0.w0 f222690d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cw0.l0 f222691e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(cw0.w0 w0Var, cw0.l0 l0Var) {
        super(1);
        this.f222690d = w0Var;
        this.f222691e = l0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        kotlin.jvm.internal.o.g(it, "it");
        cw0.w0 w0Var = this.f222690d;
        boolean userActed$plugin_mj_template_release = w0Var.getUserActed$plugin_mj_template_release();
        cw0.l0 l0Var = this.f222691e;
        if (userActed$plugin_mj_template_release) {
            java.lang.String string = w0Var.getContext().getString(com.tencent.mm.R.string.chs);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            l0Var.U7(string);
        }
        w0Var.D = false;
        l0Var.R7();
        return java.lang.Boolean.TRUE;
    }
}
