package zd;

/* loaded from: classes7.dex */
public class e implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.e9 f471503d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int[] f471504e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean[] f471505f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f471506g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f471507h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ zd.d f471508i;

    public e(zd.d dVar, com.tencent.mm.plugin.appbrand.e9 e9Var, int[] iArr, boolean[] zArr, int i17, android.view.View view) {
        this.f471508i = dVar;
        this.f471503d = e9Var;
        this.f471504e = iArr;
        this.f471505f = zArr;
        this.f471506g = i17;
        this.f471507h = view;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        com.tencent.mm.plugin.appbrand.e9 e9Var = this.f471503d;
        int[] a17 = com.tencent.mm.plugin.appbrand.utils.f5.a(e9Var);
        int i17 = a17[0];
        int[] iArr = this.f471504e;
        if (i17 == iArr[0] || a17[1] == iArr[1]) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiSetDeviceOrientation", "setDeviceOrientation layout done width[%d]  height[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(a17[1]));
        this.f471505f[0] = true;
        e9Var.a(this.f471506g, this.f471508i.o("ok"));
        this.f471507h.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
