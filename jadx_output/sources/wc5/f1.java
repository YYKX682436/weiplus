package wc5;

/* loaded from: classes10.dex */
public final class f1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wc5.k1 f444567d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(wc5.k1 k1Var) {
        super(0);
        this.f444567d = k1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        xm3.t0 b17;
        wc5.k1 k1Var = this.f444567d;
        com.tencent.mm.plugin.mvvmlist.MvvmList l76 = ((com.tencent.mm.ui.chatting.history.MsgHistoryGalleryUI) k1Var.V6()).l7();
        if (l76 != null && (b17 = xm3.u0.b(((com.tencent.mm.ui.chatting.history.MsgHistoryGalleryUI) k1Var.V6()).m7())) != null) {
            int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            androidx.appcompat.app.AppCompatActivity appCompatActivity = k1Var.f444591d;
            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(appCompatActivity);
            e4Var.f211776c = appCompatActivity.getResources().getString(com.tencent.mm.R.string.f490604zq);
            e4Var.f211780g = 2;
            e4Var.f211778e = false;
            v65.i.b(((com.tencent.mm.ui.chatting.history.MsgHistoryGalleryUI) k1Var.V6()).k7(), null, new wc5.e1(l76, this.f444567d, b17, e4Var.c(), null), 1, null);
        }
        return jz5.f0.f302826a;
    }
}
