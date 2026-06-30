package hf2;

/* loaded from: classes5.dex */
public final class o0 implements com.tencent.mm.ui.tools.c5 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hf2.y0 f281129d;

    public o0(hf2.y0 y0Var) {
        this.f281129d = y0Var;
    }

    @Override // com.tencent.mm.ui.tools.c5
    public final void w2(int i17, boolean z17) {
        android.view.View view;
        hf2.y0 y0Var = this.f281129d;
        com.tencent.mars.xlog.Log.i(y0Var.f281201b, "onKeyboardHeightChanged, height:" + i17 + ", isResized:" + z17 + ",editing:" + y0Var.f281200a.F);
        hf2.x xVar = y0Var.f281200a;
        if (!xVar.F || (view = y0Var.f281204e) == null) {
            return;
        }
        int c17 = i17 + com.tencent.mm.ui.bl.c(xVar.N6());
        if (c17 < 0) {
            c17 = 0;
        }
        view.setPadding(0, 0, 0, c17);
    }
}
