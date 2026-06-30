package vq4;

/* loaded from: classes5.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f439321d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f439322e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f439323f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(java.lang.String str, int i17, float f17) {
        super(1);
        this.f439321d = str;
        this.f439322e = i17;
        this.f439323f = f17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        org.json.JSONObject subJson = (org.json.JSONObject) obj;
        kotlin.jvm.internal.o.g(subJson, "$this$subJson");
        subJson.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, this.f439321d);
        subJson.put("tid", this.f439322e);
        subJson.put("cpuLoad", java.lang.Float.valueOf(this.f439323f));
        return jz5.f0.f302826a;
    }
}
