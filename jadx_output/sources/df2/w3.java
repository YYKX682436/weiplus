package df2;

/* loaded from: classes3.dex */
public final class w3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.d4 f231654d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f231655e;

    public w3(df2.d4 d4Var, android.view.View view) {
        this.f231654d = d4Var;
        this.f231655e = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.ViewGroup.LayoutParams layoutParams;
        df2.d4 d4Var = this.f231654d;
        android.view.View b76 = d4Var.b7();
        if (b76 == null) {
            return;
        }
        android.view.View b77 = d4Var.b7();
        if (b77 == null || (layoutParams = b77.getLayoutParams()) == null) {
            layoutParams = null;
        } else {
            layoutParams.width = this.f231655e.getWidth();
        }
        b76.setLayoutParams(layoutParams);
    }
}
