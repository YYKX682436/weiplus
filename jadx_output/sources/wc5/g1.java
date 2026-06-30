package wc5;

/* loaded from: classes10.dex */
public final class g1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wc5.k1 f444573d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(wc5.k1 k1Var) {
        super(1);
        this.f444573d = k1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        em.d2 d2Var;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        wc5.k1 k1Var = this.f444573d;
        if (booleanValue) {
            com.tencent.mm.ui.chatting.history.chromes.MsgHistoryGallerySearchBarView i76 = ((com.tencent.mm.ui.chatting.history.MsgHistoryGalleryUI) k1Var.V6()).i7();
            if (i76 != null && (d2Var = i76.f201732f) != null) {
                d2Var.d().clearFocus();
                i76.b();
            }
            com.tencent.mm.ui.immersive.ImmersiveBaseActivity.g7((com.tencent.mm.ui.chatting.history.MsgHistoryGalleryUI) k1Var.V6(), kz5.c1.k(new jz5.l(com.tencent.mm.ui.chatting.history.chromes.MsgHistoryGallerySearchBarView.class, 8), new jz5.l(com.tencent.mm.ui.chatting.history.chromes.MsgHistoryGalleryFilterBarView.class, 8), new jz5.l(com.tencent.mm.ui.chatting.history.chromes.MsgHistoryGalleryToolBarView.class, 0)), false, null, 6, null);
        } else {
            com.tencent.mm.ui.immersive.ImmersiveBaseActivity.g7((com.tencent.mm.ui.chatting.history.MsgHistoryGalleryUI) k1Var.V6(), kz5.c1.k(new jz5.l(com.tencent.mm.ui.chatting.history.chromes.MsgHistoryGallerySearchBarView.class, 0), new jz5.l(com.tencent.mm.ui.chatting.history.chromes.MsgHistoryGalleryFilterBarView.class, java.lang.Integer.valueOf(((com.tencent.mm.ui.chatting.history.MsgHistoryGalleryUI) k1Var.V6()).y7())), new jz5.l(com.tencent.mm.ui.chatting.history.chromes.MsgHistoryGalleryToolBarView.class, 8)), false, null, 6, null);
        }
        xm3.t0 b17 = xm3.u0.b(((com.tencent.mm.ui.chatting.history.MsgHistoryGalleryUI) k1Var.V6()).m7());
        if (b17 != null) {
            ym3.f fVar = b17.I.f152057d;
            uc5.y yVar = fVar instanceof uc5.y ? (uc5.y) fVar : null;
            if (yVar == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MsgHistoryGallerySelectionUIC", "updateDataSourceSelectingState: dataSource is null");
            } else {
                yVar.f426560o = booleanValue;
            }
            wc5.k1.T6(k1Var, b17, booleanValue ? new uc5.b(false) : uc5.a.f426469a);
            if (!booleanValue && ((com.tencent.mm.ui.chatting.history.MsgHistoryGalleryUI) k1Var.V6()).q7()) {
                ((com.tencent.mm.ui.chatting.history.MsgHistoryGalleryUI) k1Var.V6()).n7().X6();
            }
            k1Var.f444592e = k1Var.U6().size();
            k1Var.X6();
        }
        return jz5.f0.f302826a;
    }
}
