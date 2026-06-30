package df2;

/* loaded from: classes10.dex */
public final class e9 implements ym5.w1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.k9 f230044d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f230045e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f230046f;

    public e9(df2.k9 k9Var, kotlin.jvm.internal.c0 c0Var, kotlinx.coroutines.q qVar) {
        this.f230044d = k9Var;
        this.f230045e = c0Var;
        this.f230046f = qVar;
    }

    @Override // ym5.w1
    public void a(com.tencent.mm.view.MMPAGView mMPAGView) {
        df2.k9 k9Var = this.f230044d;
        com.tencent.mars.xlog.Log.i(k9Var.f230559m, "start hot comment animation, onAnimationCancel");
        kotlin.jvm.internal.c0 c0Var = this.f230045e;
        if (c0Var.f310112d) {
            return;
        }
        c0Var.f310112d = true;
        com.tencent.mm.view.MMPAGView mMPAGView2 = k9Var.f230565s;
        if (mMPAGView2 != null) {
            mMPAGView2.i(this);
        }
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        this.f230046f.resumeWith(kotlin.Result.m521constructorimpl(jz5.f0.f302826a));
    }

    @Override // ym5.w1
    public void b(com.tencent.mm.view.MMPAGView mMPAGView) {
    }

    @Override // ym5.w1
    public void c(com.tencent.mm.view.MMPAGView mMPAGView) {
        df2.k9 k9Var = this.f230044d;
        com.tencent.mars.xlog.Log.i(k9Var.f230559m, "start hot comment animation, onAnimationEnd");
        kotlin.jvm.internal.c0 c0Var = this.f230045e;
        if (c0Var.f310112d) {
            return;
        }
        c0Var.f310112d = true;
        com.tencent.mm.view.MMPAGView mMPAGView2 = k9Var.f230565s;
        if (mMPAGView2 != null) {
            mMPAGView2.i(this);
        }
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        this.f230046f.resumeWith(kotlin.Result.m521constructorimpl(jz5.f0.f302826a));
    }

    @Override // ym5.w1
    public void e(com.tencent.mm.view.MMPAGView mMPAGView) {
    }
}
