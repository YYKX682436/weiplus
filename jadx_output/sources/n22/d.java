package n22;

/* loaded from: classes3.dex */
public final class d implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f334282d;

    public d(int i17, android.app.Activity activity, int i18) {
        this.f334282d = activity;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        android.app.Activity activity = this.f334282d;
        g4Var.g(1001, activity.getString(com.tencent.mm.R.string.f491108by5), com.tencent.mm.R.raw.bottomsheet_icon_transmit);
        g4Var.g(1000, activity.getString(com.tencent.mm.R.string.by6), com.tencent.mm.R.raw.bottomsheet_icon_moment);
    }
}
