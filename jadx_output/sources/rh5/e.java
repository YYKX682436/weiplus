package rh5;

/* loaded from: classes3.dex */
public final class e implements oc5.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.View f395818a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.media.base.image.BaseQRCodeScanComponent f395819b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ sf3.g f395820c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f395821d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mf3.k f395822e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ cg3.h f395823f;

    public e(android.view.View view, com.tencent.mm.ui.media.base.image.BaseQRCodeScanComponent baseQRCodeScanComponent, sf3.g gVar, java.lang.String str, mf3.k kVar, cg3.h hVar) {
        this.f395818a = view;
        this.f395819b = baseQRCodeScanComponent;
        this.f395820c = gVar;
        this.f395821d = str;
        this.f395822e = kVar;
        this.f395823f = hVar;
    }

    @Override // oc5.n
    public void a(com.tencent.mm.autogen.events.RecogQBarOfImageFileResultEvent event) {
        kotlin.jvm.internal.o.g(event, "event");
        java.lang.String str = event.f54661g.f6368a;
        if (this.f395818a != null) {
            com.tencent.mm.ui.media.base.image.BaseQRCodeScanComponent baseQRCodeScanComponent = this.f395819b;
            cg3.d V6 = com.tencent.mm.ui.media.base.image.BaseQRCodeScanComponent.V6(baseQRCodeScanComponent, event);
            sf3.g gVar = this.f395820c;
            if (V6 == null) {
                com.tencent.mars.xlog.Log.e("MediaGallery.DefaultQRCodeScanComponent", "scan failed, mediaId: " + gVar.f407388b + " imgPath: " + this.f395821d);
                return;
            }
            V6.f41152f = this.f395822e;
            java.util.Map map = baseQRCodeScanComponent.f209127g;
            kotlin.jvm.internal.o.d(str);
            ((java.util.HashMap) map).put(str, V6);
            java.lang.String str2 = gVar.f407388b;
            cg3.h hVar = this.f395823f;
            if (hVar != null) {
                cg3.g gVar2 = (cg3.g) hVar;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (android.graphics.PointF pointF : V6.f41150d) {
                    float[] fArr = {pointF.x, pointF.y};
                    V6.f41151e.mapPoints(fArr);
                    arrayList.add(new android.graphics.PointF(fArr[0], fArr[1]));
                }
                gVar2.V6().a().setVisibility(0);
                gVar2.V6().a().setOnMultiCodeMaskViewListener(new cg3.e(gVar2, V6));
                gVar2.V6().a().c(0, new java.util.ArrayList(V6.f41148b), new java.util.ArrayList(arrayList), new java.util.ArrayList(V6.f41149c), gVar2.V6().f254700a.getHeight());
            }
        }
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
