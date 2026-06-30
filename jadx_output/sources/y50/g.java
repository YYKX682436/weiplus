package y50;

/* loaded from: classes3.dex */
public final /* synthetic */ class g extends kotlin.jvm.internal.m implements yz5.p {
    public g(java.lang.Object obj) {
        super(2, obj, y50.m.class, "setNavigationBarColorCompat", "setNavigationBarColorCompat(Lcom/tencent/mm/ui/MMActivity;I)V", 0);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.ui.MMActivity p07 = (com.tencent.mm.ui.MMActivity) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        kotlin.jvm.internal.o.g(p07, "p0");
        ((y50.m) this.receiver).getClass();
        if (p07 instanceof com.tencent.mm.ui.vas.VASActivity) {
            android.app.Activity containerActivity = ((com.tencent.mm.ui.vas.VASActivity) p07).getContainerActivity();
            kotlin.jvm.internal.o.e(containerActivity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            ((com.tencent.mm.ui.MMActivity) containerActivity).setNavigationbarColor(intValue);
        } else {
            p07.setNavigationbarColor(intValue);
        }
        return jz5.f0.f302826a;
    }
}
