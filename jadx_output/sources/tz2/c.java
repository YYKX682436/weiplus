package tz2;

/* loaded from: classes14.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tz2.e f423260d;

    public c(tz2.e eVar) {
        this.f423260d = eVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        tz2.e eVar = this.f423260d;
        android.app.Activity activity = eVar.f423271p;
        if (activity != null) {
            com.tencent.youtu.ytcommon.YTCommonExInterface.setAppBrightness(activity, eVar.f423272q);
        }
    }
}
