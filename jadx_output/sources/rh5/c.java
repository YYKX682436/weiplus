package rh5;

/* loaded from: classes3.dex */
public final class c implements oc5.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f395814a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.media.base.image.BaseQRCodeScanComponent f395815b;

    public c(androidx.appcompat.app.AppCompatActivity appCompatActivity, com.tencent.mm.ui.media.base.image.BaseQRCodeScanComponent baseQRCodeScanComponent) {
        this.f395814a = appCompatActivity;
        this.f395815b = baseQRCodeScanComponent;
    }

    @Override // oc5.o
    public void a(com.tencent.mm.autogen.events.NotifyDealQBarStrResultEvent event) {
        kotlin.jvm.internal.o.g(event, "event");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleCode callback notifyEvent: ");
        am.kl klVar = event.f54539g;
        sb6.append(klVar.f7168c);
        com.tencent.mars.xlog.Log.i("MediaGallery.DefaultQRCodeScanComponent", sb6.toString());
        android.app.Activity activity = klVar.f7167b;
        androidx.appcompat.app.AppCompatActivity appCompatActivity = this.f395814a;
        if (activity == appCompatActivity) {
            java.lang.String str = klVar.f7166a;
            com.tencent.mm.ui.media.base.image.BaseQRCodeScanComponent baseQRCodeScanComponent = this.f395815b;
            if (kotlin.jvm.internal.o.b(str, baseQRCodeScanComponent.f209130m)) {
                if (klVar.f7168c != 3) {
                    return;
                }
                android.os.Bundle bundle = klVar.f7169d;
                if (bundle != null) {
                    bundle.getBoolean("key_scan_qr_code_result", true);
                }
                baseQRCodeScanComponent.f209130m = "";
                com.tencent.mm.ui.vas.VASActivity vASActivity = appCompatActivity instanceof com.tencent.mm.ui.vas.VASActivity ? (com.tencent.mm.ui.vas.VASActivity) appCompatActivity : null;
                if (vASActivity != null) {
                    vASActivity.finishAfterNewActivityStarted();
                    return;
                }
                return;
            }
        }
        com.tencent.mars.xlog.Log.e("MediaGallery.DefaultQRCodeScanComponent", "handleCode callback not the same");
    }
}
