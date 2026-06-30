package ow0;

/* loaded from: classes3.dex */
public final class v extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ow0.a0 f349353d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(ow0.a0 a0Var) {
        super(0);
        this.f349353d = a0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ow0.a0 a0Var = this.f349353d;
        android.app.Activity context = a0Var.getContext();
        int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
        com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
        e4Var.f211776c = a0Var.getContext().getString(com.tencent.mm.R.string.m_8);
        e4Var.c();
        return jz5.f0.f302826a;
    }
}
