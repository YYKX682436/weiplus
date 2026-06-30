package kn;

/* loaded from: classes.dex */
public class f0 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f309392d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f309393e;

    public f0(boolean z17, android.content.Context context) {
        this.f309392d = z17;
        this.f309393e = context;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        boolean z17 = this.f309392d;
        android.content.Context context = this.f309393e;
        if (z17) {
            g4Var.f(0, context.getString(com.tencent.mm.R.string.ayk));
        } else {
            g4Var.d(0, context.getResources().getColor(com.tencent.mm.R.color.f478532ac), context.getString(com.tencent.mm.R.string.ayj));
        }
    }
}
