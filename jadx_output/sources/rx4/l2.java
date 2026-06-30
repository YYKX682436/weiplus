package rx4;

/* loaded from: classes3.dex */
public final class l2 implements com.tencent.mm.ui.tools.c5 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rx4.n2 f401227d;

    public l2(rx4.n2 n2Var) {
        this.f401227d = n2Var;
    }

    @Override // com.tencent.mm.ui.tools.c5
    public final void w2(int i17, boolean z17) {
        com.tencent.mars.xlog.Log.i(pf5.o.TAG, "onKeyboardHeight height:" + i17 + " isResized:" + z17);
        j75.f Q6 = this.f401227d.Q6();
        if (Q6 != null) {
            Q6.B3(new wu4.a(i17, z17));
        }
    }
}
