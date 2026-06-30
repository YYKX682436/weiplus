package xc5;

/* loaded from: classes3.dex */
public final class d2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f453417d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xc5.f2 f453418e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(boolean z17, xc5.f2 f2Var) {
        super(0);
        this.f453417d = z17;
        this.f453418e = f2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        boolean z17 = this.f453417d;
        xc5.f2 f2Var = this.f453418e;
        if (z17) {
            android.app.Activity context = f2Var.getContext();
            int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
            e4Var.f211776c = f2Var.getContext().getString(com.tencent.mm.R.string.f492190o50);
            e4Var.b(com.tencent.mm.R.raw.icons_filled_done);
            e4Var.c();
        } else {
            android.app.Activity context2 = f2Var.getContext();
            int i18 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var2 = new com.tencent.mm.ui.widget.dialog.e4(context2);
            e4Var2.f211776c = f2Var.getContext().getString(com.tencent.mm.R.string.i88);
            e4Var2.b(com.tencent.mm.R.raw.icons_filled_info);
            e4Var2.c();
        }
        return jz5.f0.f302826a;
    }
}
