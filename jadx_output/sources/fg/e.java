package fg;

/* loaded from: classes5.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f261749d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fg.f f261750e;

    public e(kotlin.jvm.internal.h0 h0Var, fg.f fVar) {
        this.f261749d = h0Var;
        this.f261750e = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Integer num = (java.lang.Integer) this.f261749d.f310123d;
        if (num != null) {
            int intValue = num.intValue();
            com.tencent.mars.xlog.Log.i("MicroMsg.DelegateEditText", "updateStyle, maxLength: " + intValue);
            com.tencent.mm.plugin.appbrand.widget.input.v1 g17 = com.tencent.mm.plugin.appbrand.widget.input.v1.g(this.f261750e);
            g17.f42561f = 0;
            g17.f42560e = intValue;
            g17.f42556a = false;
            g17.f42562g = com.tencent.mm.ui.tools.t4.MODE_CHINESE_AS_1;
            g17.d(null);
        }
    }
}
