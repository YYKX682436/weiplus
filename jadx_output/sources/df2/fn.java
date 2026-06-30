package df2;

/* loaded from: classes10.dex */
public final class fn implements ym5.w1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.ln f230152d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f230153e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f230154f;

    public fn(df2.ln lnVar, kotlin.jvm.internal.c0 c0Var, kotlin.coroutines.Continuation continuation) {
        this.f230152d = lnVar;
        this.f230153e = c0Var;
        this.f230154f = continuation;
    }

    @Override // ym5.w1
    public void a(com.tencent.mm.view.MMPAGView mMPAGView) {
        df2.ln lnVar = this.f230152d;
        android.widget.FrameLayout frameLayout = lnVar.f230682s;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        com.tencent.mm.view.MMPAGView mMPAGView2 = lnVar.f230683t;
        if (mMPAGView2 != null) {
            mMPAGView2.i(this);
        }
        kotlin.jvm.internal.c0 c0Var = this.f230153e;
        if (c0Var.f310112d) {
            return;
        }
        c0Var.f310112d = true;
        this.f230154f.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.FALSE));
    }

    @Override // ym5.w1
    public void b(com.tencent.mm.view.MMPAGView mMPAGView) {
        android.widget.FrameLayout frameLayout = this.f230152d.f230682s;
        if (frameLayout == null) {
            return;
        }
        frameLayout.setVisibility(0);
    }

    @Override // ym5.w1
    public void c(com.tencent.mm.view.MMPAGView mMPAGView) {
        df2.ln lnVar = this.f230152d;
        android.widget.FrameLayout frameLayout = lnVar.f230682s;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        com.tencent.mm.view.MMPAGView mMPAGView2 = lnVar.f230683t;
        if (mMPAGView2 != null) {
            mMPAGView2.i(this);
        }
        kotlin.jvm.internal.c0 c0Var = this.f230153e;
        if (c0Var.f310112d) {
            return;
        }
        c0Var.f310112d = true;
        this.f230154f.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.TRUE));
    }

    @Override // ym5.w1
    public void e(com.tencent.mm.view.MMPAGView mMPAGView) {
    }
}
