package sk4;

/* loaded from: classes.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f408979d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(android.content.Context context) {
        super(0);
        this.f408979d = context;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Context context = this.f408979d;
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(context);
        u1Var.g(context.getString(com.tencent.mm.R.string.hhn));
        u1Var.i(sk4.h.f408977a);
        u1Var.n(context.getString(com.tencent.mm.R.string.g6z));
        u1Var.l(new sk4.i(context));
        u1Var.q(false);
        return jz5.f0.f302826a;
    }
}
