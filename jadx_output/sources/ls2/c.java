package ls2;

/* loaded from: classes2.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cp0.n f321021d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f321022e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(cp0.n nVar, int i17) {
        super(0);
        this.f321021d = nVar;
        this.f321022e = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        cp0.n nVar = this.f321021d;
        java.lang.Object a17 = nVar != null ? nVar.a() : null;
        if (a17 instanceof com.tencent.mm.ui.widget.imageview.WeImageView) {
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) a17;
            weImageView.setLayerPaint(null);
            weImageView.setIconColor(this.f321022e);
        }
        return jz5.f0.f302826a;
    }
}
