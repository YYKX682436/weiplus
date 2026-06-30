package gi5;

/* loaded from: classes3.dex */
public final class p extends com.tencent.mm.ui.media.base.image.BaseQRCodeScanComponent {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.ui.media.base.image.BaseQRCodeScanComponent
    public oc5.l0 W6(cg3.d scanResult) {
        r45.gp0 gp0Var;
        kotlin.jvm.internal.o.g(scanResult, "scanResult");
        oc5.l0 W6 = super.W6(scanResult);
        W6.f344459i = 8;
        W6.f344456f = 30;
        W6.f344454d = true;
        android.content.Intent intent = getIntent();
        W6.f344460j = intent != null ? intent.getBundleExtra("_stat_obj") : null;
        mf3.k kVar = scanResult.f41152f;
        ai5.c cVar = kVar instanceof ai5.c ? (ai5.c) kVar : null;
        if (cVar != null && (gp0Var = cVar.f5207a) != null) {
            W6.f344462l = gp0Var.f375434s;
            W6.f344461k = gp0Var.f375438u;
            W6.f344463m = ((ai5.c) kVar).g();
        }
        android.os.Bundle bundle = W6.f344460j;
        if (bundle == null) {
            com.tencent.mars.xlog.Log.i("MediaGallery.RecordOCRComponent", "addStatInfo4AppBrand, statObj is null");
            bundle = new android.os.Bundle();
            W6.f344460j = bundle;
        }
        android.content.Intent intent2 = getActivity().getIntent();
        if (intent2 != null) {
            int intExtra = intent2.getIntExtra("chatTypeForAppbrand", -1);
            int intExtra2 = intent2.getIntExtra("from_scene", 0);
            com.tencent.mars.xlog.Log.i("MediaGallery.RecordOCRComponent", "addStatInfo4AppBrand, fromScene: %d, chatType: %d", java.lang.Integer.valueOf(intExtra2), java.lang.Integer.valueOf(intExtra));
            if (1 == intExtra2) {
                bundle.putInt("LaunchCodeScene_ScanScene", 4);
            } else {
                bundle.putInt("LaunchCodeScene_ScanScene", 1);
                bundle.putInt("LaunchCodeScene_ChatType", intExtra);
            }
        }
        android.os.Bundle bundle2 = W6.f344460j;
        if (bundle2 == null) {
            com.tencent.mars.xlog.Log.i("MediaGallery.RecordOCRComponent", "addStatInfo4GetA8Key, statObj is null");
            bundle2 = new android.os.Bundle();
            W6.f344460j = bundle2;
        }
        android.content.Intent intent3 = getActivity().getIntent();
        if (intent3 != null) {
            try {
                cl0.g gVar = new cl0.g(intent3.getStringExtra("params"));
                long optLong = gVar.optLong("msgSvrId");
                java.lang.String optString = gVar.optString("msgTalker");
                java.lang.String optString2 = gVar.optString("msgSender");
                bundle2.putLong("serverMsgID", optLong);
                bundle2.putString("geta8key_username", optString);
                bundle2.putString("msgUsername", optString2);
                bundle2.putInt("KMsgType", 49);
                bundle2.putInt("KAppMsgType", 19);
            } catch (java.lang.Exception unused) {
                com.tencent.mars.xlog.Log.e("MediaGallery.RecordOCRComponent", "addStatInfo4GetA8Key, parse params error");
            }
        }
        return W6;
    }
}
