package wc5;

/* loaded from: classes10.dex */
public final class n0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wc5.y0 f444610d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(wc5.y0 y0Var) {
        super(1);
        this.f444610d = y0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        vc5.j filterType = (vc5.j) obj;
        kotlin.jvm.internal.o.g(filterType, "filterType");
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgHistoryGallerySearchFilterUIC", "filter selected: " + filterType);
        wc5.y0 y0Var = this.f444610d;
        y0Var.f444665p = filterType;
        if (y0Var.f444659g && (!r26.n0.N(y0Var.f444660h))) {
            y0Var.T6(y0Var.f444660h, false);
        }
        return jz5.f0.f302826a;
    }
}
