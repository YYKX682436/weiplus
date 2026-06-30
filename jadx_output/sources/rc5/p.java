package rc5;

/* loaded from: classes9.dex */
public final /* synthetic */ class p extends kotlin.jvm.internal.m implements yz5.l {
    public p(java.lang.Object obj) {
        super(1, obj, rc5.x.class, "isListViewInBouncing", "isListViewInBouncing(Landroid/view/MotionEvent;)Z", 0);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.MotionEvent p07 = (android.view.MotionEvent) obj;
        kotlin.jvm.internal.o.g(p07, "p0");
        ul5.k bounceView = ((rc5.x) this.receiver).W6().getBounceView();
        return java.lang.Boolean.valueOf((bounceView != null ? bounceView.getOffset() : 0) != 0);
    }
}
