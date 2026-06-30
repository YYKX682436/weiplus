package mx5;

/* loaded from: classes8.dex */
public class a implements mx5.c {

    /* renamed from: a, reason: collision with root package name */
    public final mx5.b f332635a;

    /* renamed from: b, reason: collision with root package name */
    public final int f332636b;

    public a(mx5.b bVar, int i17) {
        this.f332635a = bVar;
        this.f332636b = i17;
    }

    public java.util.Map a() {
        java.util.HashMap hashMap = new java.util.HashMap();
        mx5.b bVar = this.f332635a;
        java.lang.String flutterViewId = bVar.getFlutterViewId();
        java.lang.String flutterViewName = bVar.getFlutterViewName();
        java.util.Map flutterViewParams = bVar.getFlutterViewParams();
        hashMap.put("activityId", flutterViewId);
        hashMap.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, flutterViewName);
        hashMap.put("params", flutterViewParams);
        return hashMap;
    }
}
