package mi1;

/* loaded from: classes7.dex */
public final class x extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.o6 f326722d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f326723e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f326724f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(com.tencent.mm.plugin.appbrand.o6 runtime) {
        super(runtime.r0());
        kotlin.jvm.internal.o.g(runtime, "runtime");
        this.f326722d = runtime;
        android.view.View inflate = android.view.View.inflate(getContext(), com.tencent.mm.R.layout.aln, this);
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.qtu);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        android.view.View findViewById2 = inflate.findViewById(com.tencent.mm.R.id.qts);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f326723e = findViewById2;
        android.view.View findViewById3 = inflate.findViewById(com.tencent.mm.R.id.qtt);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f326724f = findViewById3;
        ((android.widget.TextView) findViewById).setText(runtime.u0().L1.R);
        findViewById2.setOnClickListener(new mi1.w(this));
        com.tencent.mm.plugin.appbrand.config.WeAppHalfScreenHeaderTipsListener weAppHalfScreenHeaderTipsListener = runtime.u0().L1.S;
        if (weAppHalfScreenHeaderTipsListener != null) {
            weAppHalfScreenHeaderTipsListener.b();
        }
    }
}
