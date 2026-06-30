package n44;

/* loaded from: classes14.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n44.d f334907d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(n44.d dVar) {
        super(0);
        this.f334907d = dVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenDraggableHelper$headerArrow$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenDraggableHelper$headerArrow$2");
        android.view.View b17 = this.f334907d.b();
        kotlin.jvm.internal.o.d(b17);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) b17.findViewById(com.tencent.mm.R.id.gxz);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenDraggableHelper$headerArrow$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenDraggableHelper$headerArrow$2");
        return weImageView;
    }
}
