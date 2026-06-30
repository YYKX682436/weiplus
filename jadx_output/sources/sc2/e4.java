package sc2;

/* loaded from: classes2.dex */
public final class e4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cp0.n f405858d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e4(cp0.n nVar) {
        super(0);
        this.f405858d = nVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        cp0.n nVar = this.f405858d;
        java.lang.Object a17 = nVar != null ? nVar.a() : null;
        if (a17 instanceof com.tencent.mm.ui.widget.imageview.WeImageView) {
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) a17;
            weImageView.setLayerPaint(null);
            weImageView.setIconColor(weImageView.getContext().getResources().getColor(com.tencent.mm.R.color.f479254u6));
        }
        return jz5.f0.f302826a;
    }
}
