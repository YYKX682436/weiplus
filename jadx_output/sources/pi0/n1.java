package pi0;

/* loaded from: classes11.dex */
public final class n1 implements pi0.o0, pi0.w0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.ViewGroup f354677d;

    /* renamed from: e, reason: collision with root package name */
    public final androidx.lifecycle.o f354678e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.flutter.ui.FlutterPageStyle f354679f;

    /* renamed from: g, reason: collision with root package name */
    public final androidx.appcompat.app.AppCompatActivity f354680g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.flutter.ui.FlutterPageInfo f354681h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.flutter.ui.FlutterViewEngine f354682i;

    public n1(pi0.l1 instance, android.view.ViewGroup parent, androidx.lifecycle.o flutterLifeCycle, com.tencent.mm.flutter.ui.FlutterPageStyle style, androidx.appcompat.app.AppCompatActivity appCompatActivity) {
        kotlin.jvm.internal.o.g(instance, "instance");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(flutterLifeCycle, "flutterLifeCycle");
        kotlin.jvm.internal.o.g(style, "style");
        this.f354677d = parent;
        this.f354678e = flutterLifeCycle;
        this.f354679f = style;
        this.f354680g = appCompatActivity;
        this.f354681h = new com.tencent.mm.flutter.ui.FlutterPageInfo(instance.f354647f, instance.f354642a.f354704h, instance.f354643b, "");
        com.tencent.mm.flutter.ui.FlutterViewEngine flutterViewEngine = new com.tencent.mm.flutter.ui.FlutterViewEngine(this);
        this.f354682i = flutterViewEngine;
        flutterViewEngine.f();
    }

    @Override // pi0.o0
    public com.tencent.mm.flutter.ui.FlutterPageInfo F5() {
        return this.f354681h;
    }

    @Override // pi0.o0
    public bj0.t P1() {
        return null;
    }

    @Override // pi0.o0
    public android.view.ViewGroup S2() {
        return this.f354677d;
    }

    @Override // pi0.o0
    public com.tencent.mm.flutter.ui.FlutterPageStyle S3() {
        return this.f354679f;
    }

    @Override // pi0.o0
    public void S5(boolean z17) {
    }

    public final void a() {
        this.f354682i.onDestroy();
    }

    @Override // pi0.o0
    public androidx.appcompat.app.AppCompatActivity getActivity() {
        return this.f354680g;
    }

    @Override // pi0.o0
    public void pop() {
    }

    @Override // pi0.w0
    public void u3(pi0.w0 host) {
        kotlin.jvm.internal.o.g(host, "host");
        this.f354682i.onDestroy();
    }

    @Override // pi0.o0
    public androidx.lifecycle.o y6() {
        return this.f354678e;
    }
}
