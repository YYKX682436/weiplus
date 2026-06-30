package im2;

/* loaded from: classes3.dex */
public final class c5 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ im2.h6 f292277d;

    public c5(im2.h6 h6Var) {
        this.f292277d = h6Var;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        if (g4Var.z()) {
            im2.h6 h6Var = this.f292277d;
            g4Var.d(h6Var.Q, h6Var.f113668d.getContext().getResources().getColor(com.tencent.mm.R.color.f478532ac), h6Var.f113668d.getContext().getResources().getString(com.tencent.mm.R.string.f491290cn4));
        }
    }
}
