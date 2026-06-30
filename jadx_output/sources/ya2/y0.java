package ya2;

/* loaded from: classes2.dex */
public final class y0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f460579d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f460580e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(android.content.Context context, android.content.Intent intent) {
        super(0);
        this.f460579d = context;
        this.f460580e = intent;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.ref.WeakReference k17;
        android.content.Context context = this.f460579d;
        android.app.Activity activity = context instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) context : null;
        if (activity == null && ((k17 = com.tencent.mm.app.w.k()) == null || (activity = (android.app.Activity) k17.get()) == null)) {
            java.lang.ref.WeakReference j17 = com.tencent.mm.app.w.INSTANCE.j();
            activity = j17 != null ? (android.app.Activity) j17.get() : null;
        }
        ya2.e1 e1Var = ya2.e1.f460472a;
        android.content.Intent intent = this.f460580e;
        if (activity == null || !(activity instanceof com.tencent.mm.ui.MMActivity)) {
            ya2.e1.h(e1Var, context, intent, "topActivity is null or not MMActivity");
        } else {
            com.tencent.mm.ui.MMActivity mMActivity = (com.tencent.mm.ui.MMActivity) activity;
            android.view.Window window = mMActivity.getWindow();
            android.view.KeyEvent.Callback decorView = window != null ? window.getDecorView() : null;
            android.view.ViewGroup viewGroup = decorView instanceof android.view.ViewGroup ? (android.view.ViewGroup) decorView : null;
            if (viewGroup == null) {
                ya2.e1.h(e1Var, context, intent, "decorView is null");
            } else {
                com.tencent.mm.plugin.finder.assist.m3.f102381a.b(mMActivity, this.f460580e, viewGroup, true, new ya2.x0(new java.lang.ref.WeakReference(activity)));
            }
        }
        return jz5.f0.f302826a;
    }
}
