package ya2;

/* loaded from: classes.dex */
public final class n implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f460512d;

    public n(int i17, android.content.Context context) {
        this.f460512d = context;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        if (g4Var.z()) {
            android.content.Context context = this.f460512d;
            g4Var.d(1, context.getColor(com.tencent.mm.R.color.Red_100), context.getResources().getString(com.tencent.mm.R.string.mag));
        }
    }
}
