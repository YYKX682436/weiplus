package df2;

/* loaded from: classes3.dex */
public final class t implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f231392d;

    public t(android.content.Context context) {
        this.f231392d = context;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        android.content.Context context = this.f231392d;
        g4Var.o(1, context.getString(com.tencent.mm.R.string.osk), context.getString(com.tencent.mm.R.string.osj));
        g4Var.f(2, context.getString(com.tencent.mm.R.string.gdu));
    }
}
