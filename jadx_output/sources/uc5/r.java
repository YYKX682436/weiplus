package uc5;

/* loaded from: classes10.dex */
public interface r extends zc5.p, zc5.o {
    @Override // zc5.p
    default long[] G() {
        java.util.List<uc5.l0> data;
        xm3.t0 b17 = xm3.u0.b(((com.tencent.mm.ui.chatting.history.MsgHistoryGalleryUI) this).m7());
        if (b17 == null || (data = b17.getData()) == null) {
            return new long[0];
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (uc5.l0 l0Var : data) {
            if (l0Var instanceof uc5.h0) {
                uc5.d dVar = ((uc5.h0) l0Var).f426494d;
                if ((dVar instanceof dd5.n1) || (dVar instanceof dd5.d3)) {
                    arrayList.add(java.lang.Long.valueOf(dVar.p().getMsgId()));
                }
            }
        }
        return kz5.n0.T0(arrayList);
    }
}
