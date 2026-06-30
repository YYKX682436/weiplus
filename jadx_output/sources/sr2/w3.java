package sr2;

/* loaded from: classes2.dex */
public final class w3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.post.PostMainUIC f411776d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w3(com.tencent.mm.plugin.finder.post.PostMainUIC postMainUIC) {
        super(0);
        this.f411776d = postMainUIC;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.app.Activity context = this.f411776d.getContext();
        kotlin.jvm.internal.o.g(context, "context");
        java.lang.Object systemService = context.getSystemService("window");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        android.view.Display defaultDisplay = ((android.view.WindowManager) systemService).getDefaultDisplay();
        if (defaultDisplay != null) {
            defaultDisplay.getMetrics(displayMetrics);
        }
        return java.lang.Float.valueOf((displayMetrics.density * 17.0f) / context.getResources().getDisplayMetrics().density);
    }
}
