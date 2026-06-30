package wc5;

/* loaded from: classes10.dex */
public final class z0 implements kn5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wc5.k1 f444669a;

    public z0(wc5.k1 k1Var) {
        this.f444669a = k1Var;
    }

    @Override // kn5.a
    public void a(int i17, boolean z17) {
        wc5.k1 k1Var = this.f444669a;
        xm3.t0 b17 = xm3.u0.b(((com.tencent.mm.ui.chatting.history.MsgHistoryGalleryUI) k1Var.V6()).m7());
        if (b17 == null) {
            return;
        }
        java.lang.Object a07 = kz5.n0.a0(b17.getData(), i17);
        uc5.h0 h0Var = a07 instanceof uc5.h0 ? (uc5.h0) a07 : null;
        if (h0Var == null) {
            return;
        }
        if (k1Var.f444594g) {
            z17 = !z17;
        }
        uc5.d dVar = h0Var.f426494d;
        uc5.c cVar = dVar.f426476d;
        if ((cVar instanceof uc5.b) && ((uc5.b) cVar).f426471a == z17) {
            return;
        }
        k1Var.W6(dVar.v(), new uc5.b(z17));
        b17.notifyItemRangeChanged(i17, 1, "state_update");
    }

    @Override // kn5.a
    public boolean b(int i17) {
        xm3.t0 b17 = xm3.u0.b(((com.tencent.mm.ui.chatting.history.MsgHistoryGalleryUI) this.f444669a.V6()).m7());
        if (b17 == null) {
            return false;
        }
        return kz5.n0.a0(b17.getData(), i17) instanceof uc5.h0;
    }

    @Override // kn5.a
    public boolean c(int i17) {
        xm3.t0 b17 = xm3.u0.b(((com.tencent.mm.ui.chatting.history.MsgHistoryGalleryUI) this.f444669a.V6()).m7());
        if (b17 == null) {
            return false;
        }
        java.lang.Object a07 = kz5.n0.a0(b17.getData(), i17);
        uc5.h0 h0Var = a07 instanceof uc5.h0 ? (uc5.h0) a07 : null;
        if (h0Var == null) {
            return false;
        }
        uc5.c cVar = h0Var.f426494d.f426476d;
        return (cVar instanceof uc5.b) && ((uc5.b) cVar).f426471a;
    }
}
