package zk3;

/* loaded from: classes8.dex */
public final class o0 extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zk3.w0 f473486a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(zk3.w0 w0Var, android.os.Looper looper) {
        super(looper);
        this.f473486a = w0Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message msg) {
        kotlin.jvm.internal.o.g(msg, "msg");
        int i17 = msg.what;
        zk3.w0 w0Var = this.f473486a;
        if (i17 == w0Var.f473520g) {
            ((android.widget.ProgressBar) w0Var.getRootView().findViewById(com.tencent.mm.R.id.ui_)).setVisibility(0);
            return;
        }
        w0Var.getClass();
        if (i17 == 0) {
            w0Var.X6();
            w0Var.W6();
            android.content.Context context = w0Var.getRootView().getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            ((com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC.class)).T6(true);
        }
    }
}
