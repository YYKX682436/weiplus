package ia2;

/* loaded from: classes2.dex */
public final class e extends z80.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.location.model.LocationInfo f289916a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.activity.poi.flutter.FinderFlutterPOIActivity f289917b;

    public e(com.tencent.mm.plugin.finder.activity.poi.flutter.FinderFlutterPOIActivity finderFlutterPOIActivity) {
        this.f289917b = finderFlutterPOIActivity;
        com.tencent.mm.plugin.location.model.LocationInfo e76 = com.tencent.mm.plugin.finder.activity.poi.flutter.FinderFlutterPOIActivity.e7(finderFlutterPOIActivity);
        this.f289916a = e76 == null ? new com.tencent.mm.plugin.location.model.LocationInfo() : e76;
    }

    public final void a(java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("view_id", str);
        this.f289917b.n7("view_clk", hashMap);
    }
}
