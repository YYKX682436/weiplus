package j8;

/* loaded from: classes15.dex */
public class l extends android.view.OrientationEventListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j8.n f298119a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(j8.n nVar, android.content.Context context, int i17) {
        super(context, i17);
        this.f298119a = nVar;
    }

    @Override // android.view.OrientationEventListener
    public void onOrientationChanged(int i17) {
        j8.h hVar = j8.h.Unknown;
        j8.n nVar = this.f298119a;
        if (i17 == -1) {
            nVar.getClass();
        } else {
            int i18 = i17 + 45;
            android.content.Context context = nVar.f298124a;
            android.view.WindowManager windowManager = (android.view.WindowManager) context.getSystemService("window");
            android.content.res.Configuration configuration = context.getResources().getConfiguration();
            int rotation = windowManager.getDefaultDisplay().getRotation();
            if (((((rotation == 0 || rotation == 2) && configuration.orientation == 2) || ((rotation == 1 || rotation == 3) && configuration.orientation == 1)) ? (char) 2 : (char) 1) == 2) {
                i18 += 90;
            }
            int i19 = (i18 % com.tencent.wxmm.v2helper.VOIP_ENC_HEIGHT_LV1) / 90;
            if (i19 == 0) {
                hVar = j8.h.PortraitUp;
            } else if (i19 == 1) {
                hVar = j8.h.LandscapeRight;
            } else if (i19 == 2) {
                hVar = j8.h.PortraitDown;
            } else if (i19 == 3) {
                hVar = j8.h.LandscapeLeft;
            }
        }
        if (hVar.equals(nVar.f298128e)) {
            return;
        }
        nVar.f298128e = hVar;
        nVar.f298125b.a(hVar);
    }
}
