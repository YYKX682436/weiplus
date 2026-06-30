package xj1;

/* loaded from: classes7.dex */
public final class f0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xj1.h0 f454786d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f454787e;

    public f0(xj1.h0 h0Var, android.view.View view, java.lang.String str) {
        this.f454786d = h0Var;
        this.f454787e = view;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo localUsageInfo;
        android.view.View view = this.f454787e;
        xj1.h0 h0Var = this.f454786d;
        if (i17 == 0) {
            h0Var.l(view, "?wechat_appbrand_test=1");
            return;
        }
        if (i17 == 1 && (localUsageInfo = h0Var.f454800m) != null) {
            kotlin.jvm.internal.o.d(view);
            android.content.Context context = view.getContext();
            java.lang.String str = localUsageInfo.f76361d;
            k91.z5 z5Var = new k91.z5();
            z5Var.f305863a = localUsageInfo.f76362e;
            z5Var.f305872j = 3;
            com.tencent.mm.plugin.appbrand.ui.AppBrandProfileUI.V6(context, str, 3, "", true, z5Var.a(), null, null);
        }
    }
}
