package n44;

/* loaded from: classes14.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n44.d f334909d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(n44.d dVar) {
        super(0);
        this.f334909d = dVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenDraggableHelper$headerLayout$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenDraggableHelper$headerLayout$2");
        android.view.View b17 = this.f334909d.b();
        kotlin.jvm.internal.o.d(b17);
        android.view.View findViewById = b17.findViewById(com.tencent.mm.R.id.gxy);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenDraggableHelper$headerLayout$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenDraggableHelper$headerLayout$2");
        return findViewById;
    }
}
