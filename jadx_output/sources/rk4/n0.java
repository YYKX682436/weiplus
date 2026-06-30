package rk4;

/* loaded from: classes.dex */
public final class n0 implements com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rk4.p0 f396854d;

    public n0(rk4.p0 p0Var) {
        this.f396854d = p0Var;
    }

    @Override // com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a
    public void a(float f17) {
        com.tencent.pigeon.ting.TingInsertedContentCallBack tingInsertedContentCallBack = this.f396854d.f396890e;
        if (tingInsertedContentCallBack != null) {
            tingInsertedContentCallBack.onDialogChange(1 - f17, rk4.m0.f396836d);
        }
    }

    @Override // com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a
    public void b() {
        com.tencent.pigeon.ting.TingInsertedContentCallBack tingInsertedContentCallBack = this.f396854d.f396890e;
        if (tingInsertedContentCallBack != null) {
            tingInsertedContentCallBack.onDialogChange(0.0d, rk4.l0.f396811d);
        }
    }

    @Override // com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a
    public void c(boolean z17, boolean z18, int i17) {
    }
}
