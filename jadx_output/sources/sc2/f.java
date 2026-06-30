package sc2;

/* loaded from: classes.dex */
public final class f implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f405869d;

    public f(android.content.Context context) {
        this.f405869d = context;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        if (g4Var.z()) {
            android.content.Context context = this.f405869d;
            g4Var.d(2000, context.getResources().getColor(com.tencent.mm.R.color.f478532ac), context.getResources().getString(com.tencent.mm.R.string.cji));
        }
    }
}
