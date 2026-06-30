package kv4;

/* loaded from: classes12.dex */
public final class x implements g75.s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rv4.i0 f312746a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f312747b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f312748c;

    public x(rv4.i0 i0Var, kotlin.jvm.internal.h0 h0Var, kotlin.jvm.internal.h0 h0Var2) {
        this.f312746a = i0Var;
        this.f312747b = h0Var;
        this.f312748c = h0Var2;
    }

    @Override // g75.s
    public void a(g75.x result) {
        kotlin.jvm.internal.o.g(result, "result");
        kotlin.jvm.internal.h0 h0Var = this.f312748c;
        kotlin.jvm.internal.h0 h0Var2 = this.f312747b;
        rv4.i0 i0Var = this.f312746a;
        int i17 = result.f269404a;
        if (i17 == -1) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FTSTeachHotSearchLineItem", "loading image %s failed !", i0Var.f400497h);
            ((android.widget.ImageView) h0Var2.f310123d).setVisibility(8);
            ((android.widget.FrameLayout) h0Var.f310123d).setVisibility(0);
        } else {
            if (i17 != 0) {
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.FTSTeachHotSearchLineItem", "successfully load image from url: %s", i0Var.f400497h);
            ((android.widget.ImageView) h0Var2.f310123d).setVisibility(0);
            ((android.widget.FrameLayout) h0Var.f310123d).setVisibility(8);
        }
    }
}
