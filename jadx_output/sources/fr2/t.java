package fr2;

/* loaded from: classes2.dex */
public final class t implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fr2.x f265756d;

    public t(fr2.x xVar) {
        this.f265756d = xVar;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        if (g4Var.z()) {
            fr2.x xVar = this.f265756d;
            g4Var.j(20002, xVar.getActivity().getString(com.tencent.mm.R.string.f490559yh), com.tencent.mm.R.raw.finder_icons_filled_share, xVar.getActivity().getResources().getColor(com.tencent.mm.R.color.f478502m), false);
            g4Var.j(20003, xVar.getActivity().getString(com.tencent.mm.R.string.f492075f54), com.tencent.mm.R.raw.bottomsheet_icon_moment, 0, false);
        }
    }
}
