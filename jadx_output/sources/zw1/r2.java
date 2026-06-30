package zw1;

/* loaded from: classes9.dex */
public final class r2 implements com.tencent.mm.ui.widget.picker.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.picker.c0 f476772a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ww1.a3 f476773b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ww1.b3 f476774c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zw1.t2 f476775d;

    public r2(com.tencent.mm.ui.widget.picker.c0 c0Var, ww1.a3 a3Var, ww1.b3 b3Var, zw1.t2 t2Var) {
        this.f476772a = c0Var;
        this.f476773b = a3Var;
        this.f476774c = b3Var;
        this.f476775d = t2Var;
    }

    @Override // com.tencent.mm.ui.widget.picker.a0
    public final void onResult(boolean z17, java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.ui.widget.picker.c0 c0Var = this.f476772a;
        c0Var.d();
        if (z17) {
            ww1.a3 a3Var = this.f476773b;
            if (a3Var.U != ((r45.bj4) a3Var.V.get(c0Var.b())).f370804d) {
                android.widget.TextView textView = this.f476774c.f450143o;
                kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.String");
                textView.setText((java.lang.String) obj);
                a3Var.U = ((r45.bj4) a3Var.V.get(c0Var.b())).f370804d;
                zw1.t2 t2Var = this.f476775d;
                androidx.appcompat.app.AppCompatActivity activity = t2Var.getActivity();
                kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI");
                ((com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI) activity).D7(a3Var);
                androidx.appcompat.app.AppCompatActivity activity2 = t2Var.getActivity();
                kotlin.jvm.internal.o.e(activity2, "null cannot be cast to non-null type com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI");
                ((com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI) activity2).i7();
                androidx.appcompat.app.AppCompatActivity activity3 = t2Var.getActivity();
                kotlin.jvm.internal.o.e(activity3, "null cannot be cast to non-null type com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI");
                ((com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI) activity3).h7(2, true);
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(25983, 19, 2, java.lang.Long.valueOf(a3Var.U));
            }
        }
    }
}
