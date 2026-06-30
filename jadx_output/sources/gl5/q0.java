package gl5;

/* loaded from: classes5.dex */
public final class q0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gl5.d1 f273078d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(gl5.d1 d1Var) {
        super(0);
        this.f273078d = d1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        gl5.d1 d1Var = this.f273078d;
        com.tencent.mm.ui.widget.imageview.WeImageButton weImageButton = (com.tencent.mm.ui.widget.imageview.WeImageButton) d1Var.e().findViewById(com.tencent.mm.R.id.b1f);
        weImageButton.setOnClickListener(new gl5.p0(d1Var));
        return weImageButton;
    }
}
