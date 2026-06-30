package of2;

/* loaded from: classes3.dex */
public final class o implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f345092d;

    public o(android.content.Context context) {
        this.f345092d = context;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        android.content.Context context = this.f345092d;
        g4Var.d(0, context.getResources().getColor(com.tencent.mm.R.color.ad8), context.getString(com.tencent.mm.R.string.osb));
        ((db5.h4) g4Var.d(1, context.getResources().getColor(com.tencent.mm.R.color.ad8), context.getString(com.tencent.mm.R.string.osc))).f228373q = context.getString(com.tencent.mm.R.string.osd);
    }
}
