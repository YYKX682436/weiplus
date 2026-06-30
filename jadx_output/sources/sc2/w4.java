package sc2;

/* loaded from: classes.dex */
public final class w4 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f406336d;

    public w4(android.view.View view) {
        this.f406336d = view;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        if (g4Var.z()) {
            android.view.View view = this.f406336d;
            g4Var.d(1, view.getContext().getResources().getColor(com.tencent.mm.R.color.f478532ac), view.getContext().getResources().getString(com.tencent.mm.R.string.nkk));
        }
    }
}
