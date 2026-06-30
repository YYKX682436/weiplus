package nh0;

@j95.b
/* loaded from: classes9.dex */
public final class i extends i95.w implements ph0.i {
    public wu5.b wi(n05.a options) {
        kotlin.jvm.internal.o.g(options, "options");
        if (!options.f333923a) {
            return null;
        }
        android.view.View view = options.f333925c;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(options.f333926d);
        java.lang.String viewId = options.f333927e.toString();
        com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity = options.f333928f;
        long j17 = options.f333924b;
        kotlin.jvm.internal.o.g(viewId, "viewId");
        if (j17 <= 0) {
            return null;
        }
        java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(view);
        java.lang.ref.WeakReference weakReference2 = new java.lang.ref.WeakReference(mMFragmentActivity);
        ((ku5.t0) ku5.t0.f312615d).l(new m05.h(weakReference2, weakReference, valueOf, viewId), j17, "wcpay_report_check_btn_no_response");
        return null;
    }
}
