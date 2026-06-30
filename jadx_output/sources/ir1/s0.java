package ir1;

/* loaded from: classes5.dex */
public final class s0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ir1.i1 f294044d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(ir1.i1 i1Var) {
        super(0);
        this.f294044d = i1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ir1.m0 m0Var = ir1.i1.R;
        ir1.i1 i1Var = this.f294044d;
        i1Var.a();
        android.content.Context context = i1Var.getContext();
        int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
        com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
        e4Var.f211776c = i1Var.getContext().getText(com.tencent.mm.R.string.n4x);
        e4Var.b(com.tencent.mm.R.raw.check_mark_regular);
        e4Var.c();
        return jz5.f0.f302826a;
    }
}
