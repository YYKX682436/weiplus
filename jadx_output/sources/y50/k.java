package y50;

/* loaded from: classes3.dex */
public final /* synthetic */ class k extends kotlin.jvm.internal.m implements yz5.l {
    public k(java.lang.Object obj) {
        super(1, obj, y50.m.class, "getStatusBarColorCompat", "getStatusBarColorCompat(Lcom/tencent/mm/ui/MMActivity;)I", 0);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int currentStatusBarColor;
        com.tencent.mm.ui.MMActivity p07 = (com.tencent.mm.ui.MMActivity) obj;
        kotlin.jvm.internal.o.g(p07, "p0");
        ((y50.m) this.receiver).getClass();
        if (p07 instanceof com.tencent.mm.ui.vas.VASActivity) {
            android.app.Activity containerActivity = ((com.tencent.mm.ui.vas.VASActivity) p07).getContainerActivity();
            kotlin.jvm.internal.o.e(containerActivity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            currentStatusBarColor = ((com.tencent.mm.ui.MMActivity) containerActivity).getCurrentStatusBarColor();
        } else {
            currentStatusBarColor = p07.getCurrentStatusBarColor();
        }
        return java.lang.Integer.valueOf(currentStatusBarColor);
    }
}
