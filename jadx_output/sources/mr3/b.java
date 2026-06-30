package mr3;

/* loaded from: classes8.dex */
public final class b implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f330848d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mr3.d f330849e;

    public b(android.app.Activity activity, mr3.d dVar) {
        this.f330848d = activity;
        this.f330849e = dVar;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        android.app.Activity activity = this.f330848d;
        g4Var.f(1, activity.getString(com.tencent.mm.R.string.jo8));
        g4Var.f(2, activity.getString(com.tencent.mm.R.string.igh));
        if (this.f330849e.f330854b) {
            g4Var.f(3, activity.getString(com.tencent.mm.R.string.p7k));
        }
    }
}
