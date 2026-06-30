package hb2;

/* loaded from: classes.dex */
public final class c0 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f280029d;

    public c0(android.content.Context context) {
        this.f280029d = context;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        if (g4Var.z()) {
            android.content.Context context = this.f280029d;
            g4Var.d(1, context.getResources().getColor(com.tencent.mm.R.color.f479482a31), context.getString(com.tencent.mm.R.string.a_6));
        }
    }
}
