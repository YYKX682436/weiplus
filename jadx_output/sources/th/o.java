package th;

/* loaded from: classes12.dex */
public final class o {

    /* renamed from: l, reason: collision with root package name */
    public static final th.o f419262l = new th.o();

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f419267e;

    /* renamed from: f, reason: collision with root package name */
    public qh.f0 f419268f;

    /* renamed from: g, reason: collision with root package name */
    public rh.o2 f419269g;

    /* renamed from: a, reason: collision with root package name */
    public final android.util.DisplayMetrics f419263a = new android.util.DisplayMetrics();

    /* renamed from: b, reason: collision with root package name */
    public final android.os.Handler f419264b = new android.os.Handler(android.os.Looper.getMainLooper());

    /* renamed from: c, reason: collision with root package name */
    public final android.util.SparseBooleanArray f419265c = new android.util.SparseBooleanArray();

    /* renamed from: d, reason: collision with root package name */
    public m3.d f419266d = new m3.d(java.lang.Integer.valueOf(android.os.Process.myPid()), c(wh.m.s()));

    /* renamed from: h, reason: collision with root package name */
    public boolean f419270h = false;

    /* renamed from: i, reason: collision with root package name */
    public wh.s f419271i = new wh.s();

    /* renamed from: j, reason: collision with root package name */
    public wh.t0 f419272j = new th.a(this);

    /* renamed from: k, reason: collision with root package name */
    public java.lang.Runnable f419273k = new th.b(this);

    public static void a(th.o oVar, android.widget.TextView textView, int i17) {
        oVar.getClass();
        textView.setTextColor(textView.getResources().getColor(i17 == 2 ? com.tencent.mm.R.color.alo : i17 == 1 ? com.tencent.mm.R.color.aln : com.tencent.mm.R.color.all));
    }

    public static java.lang.String c(java.lang.String str) {
        return str.contains(":") ? str.substring(str.lastIndexOf(":") + 1) : com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_MM;
    }

    public void b() {
        android.view.View view = this.f419267e;
        if (view != null) {
            ((android.view.WindowManager) view.getContext().getApplicationContext().getSystemService("window")).removeView(this.f419267e);
            this.f419267e = null;
        }
    }
}
