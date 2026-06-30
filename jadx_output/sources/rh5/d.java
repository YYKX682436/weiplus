package rh5;

/* loaded from: classes3.dex */
public final class d implements oc5.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.View f395816a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.media.base.image.BaseQRCodeScanComponent f395817b;

    public d(android.view.View view, com.tencent.mm.ui.media.base.image.BaseQRCodeScanComponent baseQRCodeScanComponent, java.lang.String str) {
        this.f395816a = view;
        this.f395817b = baseQRCodeScanComponent;
    }

    @Override // oc5.n
    public void a(com.tencent.mm.autogen.events.RecogQBarOfImageFileResultEvent event) {
        com.tencent.mm.ui.media.base.image.BaseQRCodeScanComponent baseQRCodeScanComponent;
        cg3.d V6;
        kotlin.jvm.internal.o.g(event, "event");
        java.lang.String str = event.f54661g.f6368a;
        if (this.f395816a == null || (V6 = com.tencent.mm.ui.media.base.image.BaseQRCodeScanComponent.V6((baseQRCodeScanComponent = this.f395817b), event)) == null) {
            return;
        }
        java.util.Map map = baseQRCodeScanComponent.f209127g;
        kotlin.jvm.internal.o.d(str);
        ((java.util.HashMap) map).put(str, V6);
        am.cq cqVar = V6.f41147a.f54661g;
        java.util.Objects.toString(cqVar != null ? cqVar.f6370c : null);
    }

    @Override // oc5.n
    public void b(com.tencent.mm.autogen.events.RecogQBarOfImageFileFailedEvent event) {
        kotlin.jvm.internal.o.g(event, "event");
    }

    @Override // oc5.n
    public void c(java.lang.String imagePath) {
        kotlin.jvm.internal.o.g(imagePath, "imagePath");
    }
}
