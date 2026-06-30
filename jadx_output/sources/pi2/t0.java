package pi2;

/* loaded from: classes3.dex */
public final class t0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pi2.w0 f354812d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(pi2.w0 w0Var) {
        super(1);
        this.f354812d = w0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        if (((java.lang.Boolean) obj).booleanValue()) {
            pi2.w0 w0Var = this.f354812d;
            android.content.Context context = w0Var.f118183e;
            db5.t7.m(context, context.getResources().getString(com.tencent.mm.R.string.f491742mn0));
            com.tencent.mm.plugin.finder.live.widget.e0.t(w0Var, false, 1, null);
        }
        return jz5.f0.f302826a;
    }
}
