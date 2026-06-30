package ef0;

/* loaded from: classes2.dex */
public final class p1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.fragment.app.Fragment f252296d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f252297e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(androidx.fragment.app.Fragment fragment, android.content.Context context) {
        super(0);
        this.f252296d = fragment;
        this.f252297e = context;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        androidx.fragment.app.Fragment fragment = this.f252296d;
        boolean z17 = fragment instanceof com.tencent.mm.ui.MMFragment;
        android.content.Context context = this.f252297e;
        if (z17) {
            com.tencent.mm.ui.MMFragment mMFragment = (com.tencent.mm.ui.MMFragment) fragment;
            mMFragment.getContentView();
            com.tencent.mm.ui.widget.snackbar.j.c(context.getResources().getString(com.tencent.mm.R.string.jyw), context.getResources().getString(com.tencent.mm.R.string.f490599zl), mMFragment.getContext(), new ef0.n1(context), null);
        } else if (context instanceof android.app.Activity) {
            android.app.Activity activity = (android.app.Activity) context;
            com.tencent.mm.ui.widget.snackbar.j.c(activity.getResources().getString(com.tencent.mm.R.string.jyw), activity.getResources().getString(com.tencent.mm.R.string.f490599zl), activity, new ef0.o1(context), null);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.TingAddToPlayListFeatureService", "showSuccessTips invalid context");
        }
        return jz5.f0.f302826a;
    }
}
