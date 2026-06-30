package sp2;

/* loaded from: classes2.dex */
public final class u0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vp2.h0 f411227d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(vp2.h0 h0Var) {
        super(1);
        this.f411227d = h0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        dk2.hc selectedOption = (dk2.hc) obj;
        kotlin.jvm.internal.o.g(selectedOption, "selectedOption");
        com.tencent.mars.xlog.Log.i("Finder.LiveEntranceFragmentViewCallback", "onFirstResponseOptionSelected: " + selectedOption);
        try {
            dk2.dc dcVar = this.f411227d.f438926f;
            if (dcVar != null) {
                dcVar.c(selectedOption);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("Finder.LiveEntranceFragmentViewCallback", "onFirstResponseOptionSelected: " + e17);
        }
        return jz5.f0.f302826a;
    }
}
