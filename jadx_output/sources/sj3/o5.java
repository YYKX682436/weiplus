package sj3;

/* loaded from: classes14.dex */
public final /* synthetic */ class o5 extends kotlin.jvm.internal.m implements yz5.l {
    public o5(java.lang.Object obj) {
        super(1, obj, com.tencent.mm.plugin.multitalk.ui.widget.ScreenCastBigView.class, "showOriDialog", "showOriDialog(I)V", 0);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        com.tencent.mm.plugin.multitalk.ui.widget.ScreenCastBigView screenCastBigView = (com.tencent.mm.plugin.multitalk.ui.widget.ScreenCastBigView) this.receiver;
        int i17 = com.tencent.mm.plugin.multitalk.ui.widget.ScreenCastBigView.f150355m;
        screenCastBigView.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.MT.ScreenCastBigView", "showOriDialog: " + intValue);
        if (screenCastBigView.f150360h != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MT.ScreenCastBigView", "showOriDialog: already have showing view");
        } else {
            if (1 <= intValue && intValue < 6) {
                boolean z17 = intValue == 1 || intValue == 3;
                if (z17 != screenCastBigView.f150361i) {
                    screenCastBigView.f150361i = z17;
                    pm0.v.X(new sj3.m5(screenCastBigView));
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
