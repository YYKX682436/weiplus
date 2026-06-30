package iy;

/* loaded from: classes3.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f295695d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(android.content.Context context) {
        super(1);
        this.f295695d = context;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        if (!((java.lang.Boolean) obj).booleanValue()) {
            android.content.Context context = this.f295695d;
            kotlin.jvm.internal.o.g(context, "context");
            com.tencent.mm.ui.MMActivity b17 = ly.g.b(context);
            if ((b17 == null || z2.h.b(b17, "android.permission.RECORD_AUDIO")) ? false : true) {
                int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
                com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
                e4Var.d(com.tencent.mm.R.string.f493849pc3);
                e4Var.c();
            } else {
                int i18 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
                com.tencent.mm.ui.widget.dialog.e4 e4Var2 = new com.tencent.mm.ui.widget.dialog.e4(context);
                e4Var2.d(com.tencent.mm.R.string.nxn);
                e4Var2.c();
            }
        }
        return jz5.f0.f302826a;
    }
}
