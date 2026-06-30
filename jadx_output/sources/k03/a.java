package k03;

/* loaded from: classes10.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f303103d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f303104e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ io.flutter.plugin.common.MethodChannel f303105f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f303106g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ k03.e f303107h;

    public a(kotlin.jvm.internal.h0 h0Var, kotlin.jvm.internal.h0 h0Var2, io.flutter.plugin.common.MethodChannel methodChannel, kotlin.jvm.internal.h0 h0Var3, k03.e eVar) {
        this.f303103d = h0Var;
        this.f303104e = h0Var2;
        this.f303105f = methodChannel;
        this.f303106g = h0Var3;
        this.f303107h = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.Map map = k03.e.f303116e;
        java.util.Map map2 = k03.e.f303116e;
        java.lang.Object obj = this.f303103d.f310123d;
        kotlin.jvm.internal.h0 h0Var = this.f303104e;
        map2.put(obj, h0Var.f310123d);
        io.flutter.plugin.common.MethodChannel methodChannel = this.f303105f;
        if (methodChannel != null) {
            methodChannel.invokeMethod("refresh", null);
        }
        com.tencent.mm.rfx.RfxPagFile Load = com.tencent.mm.rfx.RfxPagFile.Load((java.lang.String) h0Var.f310123d);
        kotlin.jvm.internal.h0 h0Var2 = this.f303106g;
        h0Var2.f310123d = Load;
        k03.e eVar = this.f303107h;
        com.tencent.mm.view.MMPAGView mMPAGView = eVar.f303117d;
        if (mMPAGView != null) {
            mMPAGView.setComposition((com.tencent.mm.rfx.RfxPagFile) h0Var2.f310123d);
        }
        com.tencent.mm.view.MMPAGView mMPAGView2 = eVar.f303117d;
        if (mMPAGView2 != null) {
            mMPAGView2.setRepeatCount(-1);
        }
        com.tencent.mm.view.MMPAGView mMPAGView3 = eVar.f303117d;
        if (mMPAGView3 != null) {
            mMPAGView3.g();
        }
    }
}
