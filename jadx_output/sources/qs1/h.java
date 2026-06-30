package qs1;

/* loaded from: classes8.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qs1.m f366223d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(qs1.m mVar) {
        super(0);
        this.f366223d = mVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.Object systemService = this.f366223d.f366228a.getSystemService("window");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        ((android.view.WindowManager) systemService).getDefaultDisplay().getRealMetrics(displayMetrics);
        return java.lang.Integer.valueOf(java.lang.Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels));
    }
}
