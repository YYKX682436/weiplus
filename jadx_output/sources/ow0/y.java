package ow0;

/* loaded from: classes5.dex */
public final class y implements vu0.y {

    /* renamed from: a, reason: collision with root package name */
    public boolean f349357a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ow0.a0 f349358b;

    public y(ow0.a0 a0Var) {
        this.f349358b = a0Var;
    }

    @Override // vu0.y
    public void a() {
        ow0.a0 a0Var = this.f349358b;
        yy0.m7 m7Var = (yy0.m7) a0Var.R6().O6();
        kotlinx.coroutines.l.d(m7Var.Di(), null, null, new yy0.u4(m7Var, null), 3, null);
        com.tencent.mars.xlog.Log.i("ComposingTextPanelUIC", "videoSubtitleService onError: ");
        a0Var.P7(vw0.g.f440777f);
        ym5.a1.f(new ow0.v(a0Var));
    }

    @Override // vu0.y
    public void b() {
        com.tencent.mars.xlog.Log.i("ComposingTextPanelUIC", "videoSubtitleService onStartAutomatic: ");
        vw0.g gVar = vw0.g.f440776e;
        ow0.a0 a0Var = this.f349358b;
        a0Var.P7(gVar);
        ym5.a1.f(new ow0.x(a0Var));
    }

    @Override // vu0.y
    public void c(java.util.List list) {
        ow0.a0 a0Var = this.f349358b;
        yy0.m7 m7Var = (yy0.m7) a0Var.R6().O6();
        kotlinx.coroutines.l.d(m7Var.Di(), null, null, new yy0.t4(m7Var, null), 3, null);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("videoSubtitleService onResult: size: ");
        sb6.append(list != null ? java.lang.Integer.valueOf(list.size()) : null);
        com.tencent.mars.xlog.Log.i("ComposingTextPanelUIC", sb6.toString());
        this.f349357a = true;
        a0Var.H7(list);
    }

    @Override // vu0.y
    public void onCancel() {
        com.tencent.mars.xlog.Log.i("ComposingTextPanelUIC", "videoSubtitleService onCancel: " + this.f349357a);
        boolean z17 = this.f349357a;
        ow0.a0 a0Var = this.f349358b;
        if (z17) {
            a0Var.P7(vw0.g.f440777f);
        } else {
            a0Var.P7(vw0.g.f440775d);
        }
    }

    @Override // vu0.y
    public void onProgress(float f17) {
        ym5.a1.f(new ow0.w(this.f349358b, f17));
    }
}
